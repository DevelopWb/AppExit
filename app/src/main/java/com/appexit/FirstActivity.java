package com.appexit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends BaseActivity implements View.OnClickListener {

    /**
     * 我是FirstActivity，点击进入到SecondActivity
     */
    private TextView mFirstActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initView();
    }

    private void initView() {
        mFirstActivity = (TextView) findViewById(R.id.first_activity);
        mFirstActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.first_activity:
                startActivity(new Intent(this,SecondActivity.class));

                break;
        }
    }
}
