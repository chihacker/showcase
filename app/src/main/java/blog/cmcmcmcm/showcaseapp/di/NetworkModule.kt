package blog.cmcmcmcm.showcaseapp.di

import blog.cmcmcmcm.showcaseapp.data.source.remote.MovieApiService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by daesoon.choi on 2020-02-04.
 */
@Module
object NetworkModule {

    private const val BASE_URL = "https://cmcmcmcm.com/"

    @JvmStatic
    @Singleton
    @Provides
    fun provideMovieApiService(): MovieApiService {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(
                OkHttpClient.Builder().build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApiService::class.java)

    }
}