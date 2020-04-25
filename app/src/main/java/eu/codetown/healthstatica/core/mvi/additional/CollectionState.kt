package eu.codetown.healthstatica.core.mvi.additional

import java.util.*

data class CollectionState<T>(val collection: MutableCollection<T>, private var version: UUID = UUID.randomUUID())
    : PartialViewState {

    fun clear(){
        version = UUID.randomUUID()
        this.collection.clear()
    }

    fun set(collection: Collection<T>){
        version = UUID.randomUUID()
        this.collection.clear()
        this.collection.addAll(collection)
    }

    fun add(vararg item: T){
        version = UUID.randomUUID()
        this.collection.addAll(item)
    }

    fun add(collection: Collection<T>){
        version = UUID.randomUUID()
        this.collection.addAll(collection)
    }

    override fun snapshot(): PartialViewState {
        return this.copy()
    }

    override fun hashCode(): Int {
        return version.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true

        if (other == null)
            return false

        if (javaClass != other.javaClass)
            return false

        val collection = other as CollectionState<*>

        return collection.version == version
    }
}

