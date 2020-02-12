package blog.cmcmcmcm.showcaseapp.di

import blog.cmcmcmcm.showcaseapp.data.repository.DefaultMovieRepository
import blog.cmcmcmcm.showcaseapp.data.repository.MovieRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by daesoon.choi on 2020-02-04.
 */

@Module
interface DataSourceModule {

    @Singleton
    @Binds
    fun bindMovieRepository(repo: DefaultMovieRepository): MovieRepository
}