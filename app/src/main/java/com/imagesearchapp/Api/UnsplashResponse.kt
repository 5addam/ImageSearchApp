package com.imagesearchapp.Api

import com.imagesearchapp.Models.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)