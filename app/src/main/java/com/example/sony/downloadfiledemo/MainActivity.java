package com.example.sony.downloadfiledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.sony.downloadfileentitties.FileInfo;
import com.example.sony.downloadfileservice.downfileService;

public class MainActivity extends AppCompatActivity {
    private Button BTstartdl;
    private Button BTstopdl;
    private TextView tvtitle;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTstartdl= (Button) findViewById(R.id.startDL);
        BTstopdl= (Button) findViewById(R.id.stopDL);
        tvtitle=(TextView)findViewById(R.id.filename);
        progressBar= (ProgressBar) findViewById(R.id.dlprogressBar);

        BTstartdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileInfo fileInfo=new FileInfo(0,"QQ_358.apk","http://gdown.baidu.com/data/wisegame/57a788487345e938/QQ_358.apk",0,0);
                Intent i=new Intent(MainActivity.this, downfileService.class);
                i.setAction(downfileService.ACTION_START);
                i.putExtra("file",fileInfo);
                startService(i);
            }
        });
    }
}
