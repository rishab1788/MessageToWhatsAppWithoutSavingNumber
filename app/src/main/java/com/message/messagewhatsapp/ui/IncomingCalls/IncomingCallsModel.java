package com.message.messagewhatsapp.ui.IncomingCalls;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IncomingCallsModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IncomingCallsModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Incomming Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}