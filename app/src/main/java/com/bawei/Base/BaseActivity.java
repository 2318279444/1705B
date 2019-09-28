package com.bawei.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*
 *@auther:邓先超
 *@Date: 2019/9/28
 *@Time:13:44
 *@Description:${DESCRIPTION}
 **/
public abstract class BaseActivity<P extends BasePsersenter> extends AppCompatActivity implements IBaseView {
    //p层的对象
    P p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(inilayout());
        providerPresenter();
        //实例化p层对象
        p=providerPresenter();
        p.acttchView(this);
    }

    protected abstract P providerPresenter();

    protected abstract int inilayout();


}
