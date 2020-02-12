package blog.cmcmcmcm.showcaseapp.data.source.remote

import androidx.annotation.WorkerThread
import blog.cmcmcmcm.showcaseapp.data.source.model.MovieDto
import retrofit2.http.GET

/**
 * Created by daesoon.choi on 2019-12-23.
 */
interface MovieApiService {

    @WorkerThread
    @GET("movies")
    suspend fun getMovies(
        index: Int,
        num: Int
    ): List<MovieDto>
}