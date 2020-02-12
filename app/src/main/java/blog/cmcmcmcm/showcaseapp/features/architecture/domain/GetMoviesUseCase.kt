package blog.cmcmcmcm.showcaseapp.features.architecture.domain

import blog.cmcmcmcm.showcaseapp.base.model.Mapper
import blog.cmcmcmcm.showcaseapp.data.repository.MovieRepository
import blog.cmcmcmcm.showcaseapp.data.source.model.MovieDto
import blog.cmcmcmcm.showcaseapp.features.architecture.model.Movie
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * Created by daesoon.choi on 2020-01-30.
 */
class GetMoviesUseCase @Inject constructor(
    private val movieRepository: MovieRepository,
    private val movieMapper: Mapper<Movie, MovieDto>
) {

    companion object {
        private const val ALL = -1
    }

    suspend operator fun invoke(): Flow<List<Movie>>  {
        return movieRepository.getMovies(ALL,ALL)
            .flowOn(Dispatchers.Default)
            .map {
                movieMapper.mapping(it)
            }
    }

}