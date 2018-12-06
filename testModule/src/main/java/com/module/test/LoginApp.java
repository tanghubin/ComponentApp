package com.module.test;

import android.app.Application;
import com.base.lib.IAppComponent;
import com.base.lib.ServiceFactory;

public class LoginApp extends Application implements IAppComponent {
    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        ServiceFactory.setService(new LoginService());
    }
}
