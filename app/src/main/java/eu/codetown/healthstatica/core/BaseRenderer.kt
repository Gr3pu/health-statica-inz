package eu.codetown.healthstatica.core

import eu.codetown.healthstatica.core.mvi.ViewState
import kotlin.reflect.KMutableProperty1

abstract class BaseRenderer<TViewState : ViewState> {
    private val renderProperties = hashMapOf<String, (viewState: TViewState) -> Unit>()
    private var prevViewState: TViewState? = null
    protected var shouldRenderAll: () -> Boolean = { false }

    infix fun KMutableProperty1<*, *>.renderWith(renderAction: (viewState: TViewState) -> Unit) {
        renderProperties.put(this.name, renderAction)
    }

    fun KMutableProperty1<*, *>.ignore() {
        renderProperties.put(this.name, value = {})
    }

    fun render(currentViewState: TViewState) {
        val prev = prevViewState
        if (prev != null && shouldRenderAll() == false) {
            renderDifferences(prev, currentViewState)
        } else {
            renderAll(currentViewState)
        }

        prevViewState = currentViewState
    }

    private fun renderAll(currentViewState: TViewState) {
        val currentProperties = currentViewState.properties
        for (property in currentProperties) {
            renderProperty(property.key, currentViewState)
        }
    }

    private fun renderDifferences(prevViewState: TViewState, currentViewState: TViewState) {
        val differences = prevViewState.differences(currentViewState)
        for (property in differences) {
            renderProperty(property, currentViewState)
        }
    }

    private fun renderProperty(name: String, currentViewState: TViewState){
        val propertyRenderer = this.renderProperties[name]

        if (propertyRenderer == null){
            throw RendererException("No renderer defined for state ${name} of ${currentViewState.javaClass.simpleName}")
        }

        propertyRenderer.invoke(currentViewState)
    }

    class RendererException(message: String): Exception(message)
}