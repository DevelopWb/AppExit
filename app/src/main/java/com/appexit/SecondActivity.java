package com.appexit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.appexit.util.ActivityManager;

public class SecondActivity extends BaseActivity implements View.OnClickListener {

    /**
     * 第一种方法退出：singleTask
     */
    private TextView mExitSingleTask;
    /**
     * 第二种方法退出：activity管理类
     */
    private TextView mExitActivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        mExitSingleTask = (TextView) findViewById(R.id.exit_singleTask);
        mExitSingleTask.setOnClickListener(this);
        mExitActivityManager = (TextView) findViewById(R.id.exit_activityManager);
        mExitActivityManager.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.exit_singleTask:
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("EXIT_TAG", "SINGLETASK");
                startActivity(intent);
                break;
            case R.id.exit_activityManager:
                ActivityManager.getInstance().finishActivitys();
                break;
        }
    }
}
