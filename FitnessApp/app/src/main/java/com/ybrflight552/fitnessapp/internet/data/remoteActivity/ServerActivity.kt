package com.ybrflight552.fitnessapp.internet.data.remoteActivity

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerActivity(
    val resource_state: Int? = null,
    val name: String? = null,
    val distance: Float? = null,
    val moving_time: Int? = null,
    val elapsed_time: Long? = null,
    val total_elevation_gain: Int? = null,
    val type: String? = null,
    val workout_type: String? = null,
    val id: Long? = null,
    val external_id: Int? = null,
    val upload_id: Long? = null,
    val start_date: String? = null,
    val start_date_local: String? = null,
    val timezone: String? = null,
    val utc_offset: Int? = null,
    val start_latlng: List<String>? = null,
    val end_latlng: List<String>? = null,
    val location_city: String? = null,
    val location_state: String? = null,
    val location_country: String? = null,
    val achievement_count: Int? = null,
    val kudos_count: Int? = null,
    val comment_count: Int? = null,
    val athlete_count: Int? = null,
    val photo_count: Int? = null,
    val map: Map? = null,
    val trainer: Boolean? = null,
    val commute: Boolean? = null,
    val manual: Boolean? = null,
    val private: Boolean? = null,
    val flagged: Boolean? = null,
    val gear_id: String? = null,
    val from_accepted_tag: Boolean? = null,
    val average_speed: Float? = null,
    val max_speed: Float? = null,
    val average_cadence: Float? = null,
    val average_watts: Float? = null,
    val weighted_average_watts: Int? = null,
    val kilojoules: Float? = null,
    val device_watts: Boolean? = null,
    val has_heartrate: Boolean? = null,
    val average_heartrate: Float? = null,
    val max_heartrate: Int? = null,
    val max_watts: Int? = null,
    val pr_count: Int? = null,
    val total_photo_count: Int?  = null,
    val has_kudoed: Boolean?  = null,
    val suffer_score: Int? = null,
)