package com.fischer.msu.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "53e8a80425050d0ba95b183369236de6"

interface FlickrApi {
    //@GET("/")

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )




    //suspend fun fetchContents():String
    suspend fun fetchPhotos():FlickrResponse

}