package ug.blogspot.boubandroid.alc40phase1androidchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void startMyProfile(View view) {
        Intent startProfile = new Intent(ActivityA.this, ActivityC.class);
        startActivity(startProfile);
    }

    public void startAboutALC(View view) {
        Intent startAbtALC = new Intent(ActivityA.this, ActivityB.class);
        startActivity(startAbtALC);
    }
}
