package mx.org.totalapp.ui.login;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import mx.org.totalapp.utils.Util;

public class LoginViewModel extends ViewModel {

    private final MutableLiveData<String> token;

    public LoginViewModel() {
        this.token = new MutableLiveData<>();
    }

    public LiveData<String> getToken(Context con, String user, String pass) {
        Util.requestToken(con,user,pass,token);
        return token;
    }
}