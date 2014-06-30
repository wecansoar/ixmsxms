package com.wecansoar.ixmsxms;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity implements View.OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);


       // requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);


        setContentView(R.layout.activity_login);


//        TextView appName = (TextView) findViewById(R.id.appName);
//        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/hunchungchunR.ttf");
//        appName.setTypeface(customFont);



        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);

        TextView btFindPw = (TextView) findViewById(R.id.btPw);
        btFindPw.setOnClickListener(this);
        TextView btJoin = (TextView) findViewById(R.id.btJoin);
        btJoin.setOnClickListener(this);
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_base);
	}

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btLogin:
                Intent home = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(home);
                break;
            case R.id.btPw:
             //   Intent findpw = new Intent()
                break;
            case R.id.btJoin:
                Intent join = new Intent(LoginActivity.this, JoinActivity.class);
                startActivity(join);
                break;
        }
    }

}
