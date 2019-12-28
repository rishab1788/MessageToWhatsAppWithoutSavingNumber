package com.message.messagewhatsapp.ui.CustomNumber;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomeNumberModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CustomeNumberModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}