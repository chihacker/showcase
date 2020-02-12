package blog.cmcmcmcm.showcaseapp.features.architecture.di

import androidx.lifecycle.ViewModel
import blog.cmcmcmcm.showcaseapp.base.model.Mapper
import blog.cmcmcmcm.showcaseapp.data.source.model.MovieDto
import blog.cmcmcmcm.showcaseapp.di.ViewModelKey
import blog.cmcmcmcm.showcaseapp.features.architecture.ArchitectureViewModel
import blog.cmcmcmcm.showcaseapp.features.architecture.domain.MovieMapper
import blog.cmcmcmcm.showcaseapp.features.architecture.model.Movie
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by daesoon.choi on 2020-02-04.
 */
@Module
interface ArchitectureModule {

    @Binds
    @IntoMap
    @ViewModelKey(ArchitectureViewModel::class)
    fun bindViewModel(viewmodel: ArchitectureViewModel): ViewModel

    @Binds
    fun bindMovieMapper(mapper: MovieMapper): Mapper<Movie, MovieDto>

}