package com.bawei.Presensor;

import com.bawei.Base.BasePsersenter;
import com.bawei.Base.IBaseView;

/*
 *@auther:邓先超
 *@Date: 2019/9/28
 *@Time:14:14
 *@Description:${DESCRIPTION}
 **/
public class LoginPersenter extends BasePsersenter<IBaseView> {
    IBaseView view;
    @Override
    public void acttchView(IBaseView iBaseView) {
        this.view=iBaseView;
    }
}
