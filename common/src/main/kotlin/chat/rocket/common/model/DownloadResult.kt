package chat.rocket.common.model

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class DownloadResult(
    val requested: Boolean,
    val status: String,
   val success: Boolean
)
