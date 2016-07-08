package com.llf.meterial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump(View v){
        startActivity(new Intent(this,SwipActivity.class));
        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
    }
}
