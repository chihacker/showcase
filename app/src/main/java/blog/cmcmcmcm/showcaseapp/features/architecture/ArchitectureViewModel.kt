package blog.cmcmcmcm.showcaseapp.features.architecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import blog.cmcmcmcm.showcaseapp.base.livedata.Event
import blog.cmcmcmcm.showcaseapp.features.architecture.domain.GetMoviesUseCase
import blog.cmcmcmcm.showcaseapp.features.architecture.model.Movie
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by daesoon.choi on 2019-12-23.
 */

class ArchitectureViewModel @Inject constructor(
    private val getMoviesUseCase: GetMoviesUseCase
) : ViewModel() {

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading

    private val _movies = MutableLiveData<List<Movie>>().apply { value = listOf() }
    val movies: LiveData<List<Movie>> = _movies

    private val _snackbarText = MutableLiveData<Event<String>>()
    val snackbarText: LiveData<Event<String>> = _snackbarText

    fun loadMovies() {

        viewModelScope.launch {

            _dataLoading.value = true

            getMoviesUseCase.invoke()
                .catch { throwable ->
                    _snackbarText.value = Event(throwable.message?: "")
                }
                .collect {
                    _movies.value = it
                }

            _dataLoading.value = false

        }

    }


}