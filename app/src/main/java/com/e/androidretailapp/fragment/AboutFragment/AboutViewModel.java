package com.e.androidretailapp.fragment.AboutFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is AboutUs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
