package com.fischer.msu.photogallery.api

import com.squareup.moshi.Json

data class PhotoResponse (
        @Json(name = "photo") val galleryItems:List<GalleryItem>
        )