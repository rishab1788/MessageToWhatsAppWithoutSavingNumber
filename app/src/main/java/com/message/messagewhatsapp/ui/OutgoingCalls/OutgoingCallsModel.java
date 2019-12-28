package com.message.messagewhatsapp.ui.OutgoingCalls;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OutgoingCallsModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OutgoingCallsModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is OutGoing Call Fragments");
    }

    public LiveData<String> getText() {
        return mText;
    }
}