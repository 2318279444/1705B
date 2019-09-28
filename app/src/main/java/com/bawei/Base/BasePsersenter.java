package com.bawei.Base;

/*
 *@auther:邓先超
 *@Date: 2019/9/28
 *@Time:14:10
 *@Description:${DESCRIPTION}
 **/
public abstract class BasePsersenter<T extends IBaseView> {
    public abstract void acttchView(T t);
}
