package com.wecansoar.ixmsxms;

import android.app.Activity;
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
	    setContentView(R.layout.splash);


        ImageView image = (ImageView) findViewById(R.id.appMark);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        //Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.tween);
        image.startAnimation(alphaAnim);

        TextView appName = (TextView) findViewById(R.id.appName);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/hunmakdaeyunpilR.otf");
        appName.setTypeface(customFont);

	    initialize();

        //ProgressDialog.show(SplashActivity.this, "", "Now Loading..");
	}

	private void initialize () {
		Handler handler = new Handler() {
			
	        public void handleMessage(Message msg) {
                Log.v("handler", "DDDD");
                finish();    // splash 액티비티 종료
            }
		};

        handler.sendEmptyMessageDelayed(0, LOADING_TIME);
	}

}
