package com.base.lib;

public class ServiceFactory {
    private static final ServiceFactory ourInstance = new ServiceFactory();

    static ServiceFactory getInstance() {
        return ourInstance;
    }

    private ServiceFactory() {
    }

    public static IService getmService() {
        if (mService == null) {
            mService = new EmptyService();
        }
        return mService;
    }

    public static void setService(IService service) {
        mService = service;
    }

    public static IService mService;
}
