package com.example.sony.downloadfileservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.sony.downloadfileentitties.FileInfo;

/**
 * Created by sony on 2016/5/4.
 */
public class downfileService extends Service {
    public static final String ACTION_START="ACTION_START";
    public static final String ACTION_STOP="ACTION_STOP";

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
            if(ACTION_START.equals(intent.getAction())){
                FileInfo fileInfo= (FileInfo) intent.getSerializableExtra("file");
            }else if(ACTION_START.equals(intent.getAction())){
                FileInfo fileInfo= (FileInfo) intent.getSerializableExtra("file");

            }
        return super.onStartCommand(intent,flags,startId);
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
