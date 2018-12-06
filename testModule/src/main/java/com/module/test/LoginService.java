package com.module.test;

import android.content.Context;
import android.content.Intent;
import com.base.lib.Constant;
import com.base.lib.IService;

public class LoginService implements IService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(Constant.TARGET_CLASS,targetClass);
        context.startActivity(intent);
    }

    @Override
    public int getUserId() {
        return 10010;
    }
}
