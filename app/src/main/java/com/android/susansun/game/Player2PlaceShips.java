package com.android.susansun.game;

/**
 * Created by Totten on 6/10/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Player2PlaceShips extends Activity implements View.OnClickListener {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player2_place_ships);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    private void button2Click() {
        startActivity(new Intent("com.android.susansun.game.Player1Turn"));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                button2Click();
                break;
        }
    }

}