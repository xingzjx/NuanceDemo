package com.nuance.speechkitsample;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import com.tbruyelle.rxpermissions2.RxPermissions;


public class SplashActivity extends FragmentActivity {
    final RxPermissions rxPermissions = new RxPermissions(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        requestPermissionList();
    }

    private void requestPermissionList() {
// Must be done during an initialization phase like onCreate
        rxPermissions
                .request(//Manifest.permission.CAMERA,
                        //Manifest.permission.CALL_PHONE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.RECORD_AUDIO
                        //Manifest.permission.READ_PHONE_STATE,
                        //Manifest.permission.PROCESS_OUTGOING_CALLS,
                        // Manifest.permission.SEND_SMS

                )
                .subscribe(granted -> {
                    if (granted) { // Always true pre-M
                        // I can control the camera now
                        Toast.makeText(SplashActivity.this, "success", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        // Oups permission denied
                        Toast.makeText(SplashActivity.this, "permission denied", Toast.LENGTH_LONG).show();
                    }
                });
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
