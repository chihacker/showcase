package blog.cmcmcmcm.showcaseapp.base.model

/**
 * Created by daesoon.choi on 2020-01-30.
 */
interface Mapper<out T, R> {
    fun mapping(from: R): T
    fun mapping(from: List<R>): List<T> {
        return from.map { mapping(it) }
    }
}