package com.android.susansun.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Player1PlaceShips extends Activity implements View.OnClickListener {

    Button button1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player1_place_ships);
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    private void button1Click() {
        startActivity(new Intent("com.android.susansun.game.Player2PlaceShips"));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                button1Click();
                break;
        }
    }
}