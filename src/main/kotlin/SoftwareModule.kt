data class SoftwareModule(
    val description: String,
    val author: String,
    val language: String,
    val lastEditDate: String,
    val size: Int,
    val linesOfCode: Int,
    val isCrossPlatform: Boolean
): Comparable<SoftwareModule> {

    override fun compareTo(other: SoftwareModule): Int {
        return compareValuesBy(this, other, { it.lastEditDate }, { it.size })
    }
}