package blog.cmcmcmcm.showcaseapp.features.architecture.di

import blog.cmcmcmcm.showcaseapp.di.ActivityScope
import blog.cmcmcmcm.showcaseapp.di.ViewModelBuilder
import blog.cmcmcmcm.showcaseapp.features.architecture.ArchitectureFragment
import dagger.Subcomponent

/**
 * Created by daesoon.choi on 2019-12-21.
 */

@ActivityScope
@Subcomponent(
    modules = [
        ViewModelBuilder::class,
        ArchitectureModule::class
    ]
)
interface ArchFeatureComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ArchFeatureComponent
    }

    fun inject(architectureFragment: ArchitectureFragment)
}