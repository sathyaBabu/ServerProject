package com.example.serverproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return (IBinder) mBinder;
    }
        // TODO: Return the communication channel to the service.
        private final IMyAidlInterface.Stub mBinder =  new IMyAidlInterface.Stub(){

            @Override
            public int addNumbers(int num1, int num2) throws RemoteException {
                return (num1+num2);
            }
        };

}
