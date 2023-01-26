package com.example.dz_7_5_internet.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dz_7_5_internet.data.models.Photo
import com.example.dz_7_5_internet.data.repositories.PhotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PhotoViewModel @Inject constructor(private val repository: PhotoRepository) : ViewModel() {

    private val _photoLiveData = MutableLiveData<List<Photo>>()
    val photoLiveData: LiveData<List<Photo>> = _photoLiveData

    private val _errorPhotoLiveData = MutableLiveData<String>()
    val errorPhotoLiveData: LiveData<String> = _errorPhotoLiveData

    var localPhotosLiveData: LiveData<List<Photo>>? = null

    init {
        getPhoto()
        getLocalPhoto()
    }

    private fun getPhoto() {
        return repository.getPhoto(
            onSuccess = {
                _photoLiveData.value = it
            },
            onFailure = {
                _errorPhotoLiveData.value = it
            }
        )
    }
    private fun getLocalPhoto() {
        localPhotosLiveData = repository.getLocalPhotos()
    }
}