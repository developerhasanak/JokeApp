package com.hasan.jokeapp.model

data class Flags(
    val explicit: Boolean?,
    val nsfw: Boolean?,
    val political: Boolean?,
    val racist: Boolean?,
    val religious: Boolean?,
    val sexist: Boolean?
)