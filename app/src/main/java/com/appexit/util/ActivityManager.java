package com.appexit.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:wang_sir
 * Time:2018/6/7 20:15
 * Description:This is ActivityManager
 */
public class ActivityManager {

    private List<Activity> activityList = new ArrayList<>();

    private ActivityManager() {
    }

    public static ActivityManager getInstance() {

        return ActivityManagerHolder.Instantce;
    }

    /**
     * 静态内部类获取单例
     */
    static class ActivityManagerHolder {
        public static ActivityManager Instantce = new ActivityManager();

    }

    /**
     * 添加activity
     * @param activity
     */
    public void addActivity(Activity activity){
        if (!activityList.contains(activity)) {
            activityList.add(activity);
        }

    }

    /**
     * 移除activity
     * @param activity
     */
    public void removeActivity(Activity activity){
        if (activityList.contains(activity)) {
            activityList.remove(activity);
        }
    }

    /**
     * 关闭所有的activity，退出应用
     */
    public void finishActivitys(){
        if (activityList != null&&!activityList.isEmpty()) {
            for (Activity activity1 : activityList) {
                activity1.finish();
            }
            activityList.clear();
        }
    }

}
