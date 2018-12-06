package com.base.lib;

import android.content.Context;

public class EmptyService implements IService {
    @Override
    public void launch(Context context, String targetClass) {

    }

    @Override
    public int getUserId() {
        return 0;
    }
}
