package com.android.susansun.game;

import android.content.ClipData;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button drag;
    LinearLayout drop;
    TextView text,sucess;
    int total , failure = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player1_place_ships);
        drag = (Button)findViewById(R.id.one);
        drop = (LinearLayout)findViewById(R.id.bottomlinear1);
        text = (TextView)findViewById(R.id.Total);
        sucess = (TextView)findViewById(R.id.Sucess);

        drop.setOnDragListener(new View.OnDragListener() {

            @Override
            public boolean onDrag(View v, DragEvent event) {
                // TODO Auto-generated method stub
                final int action = event.getAction();
                switch(action) {

                    case DragEvent.ACTION_DRAG_STARTED:
                        break;

                    case DragEvent.ACTION_DRAG_EXITED:
                        break;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;

                    case DragEvent.ACTION_DROP:{
                        failure = failure+1;
                        return(true);
                    }

                    case DragEvent.ACTION_DRAG_ENDED:{
                        total = total +1;
                        int suc = total - failure;
                        sucess.setText("Sucessful Drops :" + suc);
                        text.setText("Total Drops: " + total);
                        return(true);

                    }

                    default:
                        break;
                }
                return true;
            }});
        drag.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent arg1) {
                // TODO Auto-generated method stub
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(drag);
                v.startDrag(data, shadow, null, 0);
                return false;
            }
        });
    }
}