package com.hfad.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;


public class Dashboard extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(getApplicationContext(), MainMenu.class));
            }
        }, 5000);


    }


}
