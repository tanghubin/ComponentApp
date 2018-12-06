package com.component.app;

import android.app.Application;

import android.util.Log;
import com.base.lib.AppConfig;
import com.base.lib.IAppComponent;

public class App extends Application implements IAppComponent {
    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        try {
            for (String componentName : AppConfig.COMPONENTS) {
                Log.d("tang", componentName);
                Class<?> clazz = Class.forName(componentName);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent) object).initializa(app);
                }
            }
        } catch (Exception e) {
            if (BuildConfig.DEBUG)
                e.printStackTrace();
        }
    }
}
