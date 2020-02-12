package blog.cmcmcmcm.showcaseapp.features.architecture.domain

import blog.cmcmcmcm.showcaseapp.base.model.Mapper
import blog.cmcmcmcm.showcaseapp.data.source.model.MovieDto
import blog.cmcmcmcm.showcaseapp.di.ActivityScope
import blog.cmcmcmcm.showcaseapp.features.architecture.model.Movie
import javax.inject.Inject

/**
 * Created by daesoon.choi on 2020-01-30.
 */
@ActivityScope
class MovieMapper @Inject constructor() : Mapper<Movie, MovieDto> {

    override fun mapping(from: MovieDto): Movie {
        return Movie(
            id = from.id,
            title = from.title,
            release = from.release
        )
    }

}