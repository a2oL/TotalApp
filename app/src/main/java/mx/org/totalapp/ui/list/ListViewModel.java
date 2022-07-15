package mx.org.totalapp.ui.list;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import mx.org.totalapp.utils.Util;

public class ListViewModel extends ViewModel {
    private final MutableLiveData<String> bancos;

    public ListViewModel() {
        this.bancos = new MutableLiveData<>();
    }

    public LiveData<String> getBancos(Context con, String token) {
        Util.requestBancos(con, token, bancos);
        return bancos;
    }

}