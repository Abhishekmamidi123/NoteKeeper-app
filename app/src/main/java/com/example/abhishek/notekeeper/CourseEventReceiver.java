package com.example.abhishek.notekeeper;
// Used for receiving broadcasts.
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CourseEventReceiver extends BroadcastReceiver {

    public static final String ACTION_COURSE_EVENT = "com.example.abhishek.notekeeper.action.COURSE_EVENT";

    public static final String EXTRA_COURSE_ID = "com.example.abhishek.notekeeper.extra.COURSE_ID";
    public static final String EXTRA_COURSE_MESSAGE = "com.example.abhishek.notekeeper.extra.COURSE_MESSAGE";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (ACTION_COURSE_EVENT.equals(intent.getAction())) {
            String courseId = intent.getStringExtra(EXTRA_COURSE_ID);
            String courseMessage = intent.getStringExtra(EXTRA_COURSE_MESSAGE);
        }
    }
}
