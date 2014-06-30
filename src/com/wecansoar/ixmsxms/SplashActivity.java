package com.wecansoar.ixmsxms;

import android.app.Activity;
import android.content.*;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

    private static final int LOADING_TIME = 3000;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_splash);


        ImageView image = (ImageView) findViewById(R.id.appMark);
        //Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.tween);
        image.startAnimation(alphaAnim);

        TextView appName = (TextView) findViewById(R.id.msg);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/hunchungchunR.ttf");
        appName.setTypeface(customFont);


        Handler handler = new Handler();
        handler.postDelayed(new splashHandler(), LOADING_TIME);

        //ProgressDialog.show(SplashActivity.this, "", "Now Loading..");
	}


    private class splashHandler implements Runnable {
        @Override
        public void run() {
            startActivity(new android.content.Intent(getApplication(), LoginActivity.class));
            SplashActivity.this.finish();   // 로딩페이지 Activity Stack에서 제거
        }
    }


}
