data class SoftwareProduct(
    val name: String,
    val developer: String,
    val version: String,
    val releaseDate: String,
    val distributionSize: Int,
    val architecture: String,
    val isCrossPlatform: Boolean,
    val modules: List<SoftwareModule>
): Comparable<SoftwareProduct> {

    override fun compareTo(other: SoftwareProduct): Int {
        return compareValuesBy(this, other, { it.releaseDate }, { it.distributionSize })
    }
}