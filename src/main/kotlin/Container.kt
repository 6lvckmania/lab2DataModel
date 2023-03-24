import org.springframework.stereotype.Component

interface EntityContainer<SoftwareProduct> {
    fun add(entity: SoftwareProduct)
    fun remove(index: Int)
    fun update(index: Int, entity: SoftwareProduct)
    fun get(index: Int): SoftwareProduct
    fun getAll(): List<SoftwareProduct>
}

@Component
class EntityList<T> : EntityContainer<SoftwareProduct> {
    private val list: MutableList<SoftwareProduct> = mutableListOf()

    /**
     * Adds an entity to the internal list
     * @param entity The entity to be added
     */
    override fun add(entity: SoftwareProduct) {
        list.add(entity)
    }

    /**
     * Removes an entity from the internal list by its index
     * @param index The index of the entity to be removed
     */
    override fun remove(index: Int) {
        list.removeAt(index)
    }

    /**
     * Updates an entity in the internal list by its index
     * @param index The index of the entity to be updated
     * @param entity The new entity
     */
    override fun update(index: Int, entity: SoftwareProduct) {
        list[index] = entity
    }

    /**
     * Returns an entity from the internal list by its index
     * @param index The index of the entity to be retrieved
     * @return The entity at the specified index
     */
    override fun get(index: Int): SoftwareProduct {
        return list[index]
    }

    /**
     * Returns all entities from the internal list
     * @return The list of all entities
     */
    override fun getAll(): List<SoftwareProduct> {
        return list.toList()
    }
}
