package com.example.desafiotech.ui.deleta;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DeletarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DeletarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is deleta fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}