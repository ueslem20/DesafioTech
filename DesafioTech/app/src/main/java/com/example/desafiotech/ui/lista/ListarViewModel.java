package com.example.desafiotech.ui.lista;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ListarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ListarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is lista fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}