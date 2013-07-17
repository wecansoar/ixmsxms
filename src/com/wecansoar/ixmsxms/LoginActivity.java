package com.wecansoar.ixmsxms;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class LoginActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);


       // requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        setContentView(R.layout.user_login);

        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_base);
	}

}
