package blog.cmcmcmcm.showcaseapp

import android.app.Application
import blog.cmcmcmcm.showcaseapp.di.ApplicationComponent
import blog.cmcmcmcm.showcaseapp.di.DaggerApplicationComponent

/**
 * Created by daesoon.choi on 2019-12-21.
 */
class ShowcaseApp : Application() {

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }

}