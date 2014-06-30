package com.wecansoar.ixmsxms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, SplashActivity.class));

        //setContentView(R.layout.user_login);

    }



}




/*
TODO: github
http://ezsnote.tistory.com/entry/intelliJ-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EB%A5%BC-gitHub%EB%A1%9C
*/
