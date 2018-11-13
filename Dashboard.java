package com.hfad.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Dashboard extends Activity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
