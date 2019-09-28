package com.bawei.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.bawei.Base.BaseActivity;
import com.bawei.Base.BasePsersenter;
import com.bawei.Presensor.LoginPersenter;

public class MainActivity extends BaseActivity {


    @Override
    protected BasePsersenter providerPresenter() {
        return new LoginPersenter();
    }

    @Override
    protected int inilayout() {
        return R.layout.activity_main;
    }

    @Override
    public Context getContext() {
        return null;
    }
}
