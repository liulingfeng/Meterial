package com.llf.meterial;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import com.llf.meterial.swip.SwipeLayout;

/**
 * Created by llf on 2016/7/8.
 */
public class SwipActivity extends Activity{
    private SwipeLayout mSwipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swip);

        mSwipeLayout = (SwipeLayout)findViewById(R.id.swipview);
        mSwipeLayout.setOnFinishScroll(new SwipeLayout.OnFinishScroll() {
            @Override
            public void complete() {
                finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
        }
        return super.onKeyDown(keyCode, event);
    }
}
