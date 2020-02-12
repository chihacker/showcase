package blog.cmcmcmcm.showcaseapp.di

import android.content.Context
import blog.cmcmcmcm.showcaseapp.features.architecture.di.ArchFeatureComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by daesoon.choi on 2019-12-21.
 */

@Singleton
@Component(
    modules = [
        AppSubComponent::class,
        NetworkModule::class,
        DataSourceModule::class
    ]
)
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }

    fun archFeatureComponent(): ArchFeatureComponent.Factory



}