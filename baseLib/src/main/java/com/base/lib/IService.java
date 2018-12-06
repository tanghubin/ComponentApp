package com.base.lib;

import android.content.Context;

public interface IService {
    void launch(Context context, String targetClass);

    int getUserId();
}
