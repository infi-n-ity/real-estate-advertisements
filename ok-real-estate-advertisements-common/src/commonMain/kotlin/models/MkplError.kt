package ok.real.estate.advertisements.common.models

data class MkplError(
    val code: String = "",
    val group: String = "",
    val field: String = "",
    val message: String = "",
    val exception: Throwable? = null,
)
