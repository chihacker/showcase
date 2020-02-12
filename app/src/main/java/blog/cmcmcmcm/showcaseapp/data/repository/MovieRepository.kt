package blog.cmcmcmcm.showcaseapp.data.repository

import blog.cmcmcmcm.showcaseapp.data.source.model.MovieDto
import kotlinx.coroutines.flow.Flow

/**
 * Created by daesoon.choi on 2019-12-23.
 */
interface MovieRepository {
    suspend fun getMovies(index: Int, num: Int): Flow<List<MovieDto>>
}