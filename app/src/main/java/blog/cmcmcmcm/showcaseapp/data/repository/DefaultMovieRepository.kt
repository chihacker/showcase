package blog.cmcmcmcm.showcaseapp.data.repository

import blog.cmcmcmcm.showcaseapp.data.source.model.MovieDto
import blog.cmcmcmcm.showcaseapp.data.source.remote.MovieApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by daesoon.choi on 2019-12-23.
 */
class DefaultMovieRepository @Inject constructor(
    private val movieApiService: MovieApiService
) : MovieRepository {

    override suspend fun getMovies(index: Int, num: Int): Flow<List<MovieDto>> = flow {
        movieApiService.getMovies(index, num)
    }
}