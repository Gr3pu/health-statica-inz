package eu.codetown.healthstatica.core.mvi

import eu.codetown.healthstatica.core.mvi.additional.PartialViewState

open class ViewState {
    protected var state: MutableMap<String, PartialViewState> = mutableMapOf()

    open val properties: Map<String, PartialViewState>
        get() {
            return state
        }

    fun copyStateFrom(viewState: ViewState) {
        for ((key, value) in viewState.state){
            this.state[key] = value.snapshot()
        }
    }

    fun differences(other: ViewState): List<String>{
        val result = ArrayList<String>()

        for ((name, prevValue) in this.properties){
            val currentValue = other.properties[name]

            if(currentValue != prevValue){
                result.add(name)
            }
        }

        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ViewState) return false

        if (state != other.state) return false

        return true
    }

    override fun hashCode(): Int {
        return state.hashCode()
    }
}