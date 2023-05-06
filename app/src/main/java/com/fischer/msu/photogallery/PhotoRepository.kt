package com.fischer.msu.photogallery

import com.fischer.msu.photogallery.api.FlickrApi
import com.fischer.msu.photogallery.api.GalleryItem
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
//import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create


class PhotoRepository {

    private val flickrApi:FlickrApi

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.flickr.com/")
            //.addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())

            .build()

        flickrApi = retrofit.create<FlickrApi>()

    }

    //suspend fun fetchContents() = flickrApi.fetchContents()
    //suspend fun fetchPhotos() = flickrApi.fetchPhotos()
    suspend fun fetchPhotos():List<GalleryItem> = flickrApi.fetchPhotos().photos.galleryItems

}