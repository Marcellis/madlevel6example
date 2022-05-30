package nl.hva.level6example.model

import com.google.gson.annotations.SerializedName

data class Trivia(
 @SerializedName("text") val text: String,
 @SerializedName("number") val number: Long,
 @SerializedName("found") val found: Boolean,
 @SerializedName("type") val type: String
)
