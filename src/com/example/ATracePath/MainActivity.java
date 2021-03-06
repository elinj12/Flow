package com.example.ATracePath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void buttonClick( View view ) {
        Button button = (Button) view;
        int id = button.getId();
        if ( id == R.id.button_play ) {
            startActivity( new Intent( this, PlayActivity.class ) );
        }
        else if ( id == R.id.about ) {
            startActivity( new Intent( this, HelpActivity.class ) );
        }
    }
}
