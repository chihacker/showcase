package blog.cmcmcmcm.showcaseapp.di

import blog.cmcmcmcm.showcaseapp.features.architecture.di.ArchFeatureComponent
import dagger.Module

/**
 * Created by daesoon.choi on 2020-02-07.
 */
@Module(subcomponents = [ArchFeatureComponent::class])
interface AppSubComponent