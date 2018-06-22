package com.example.aleksander.helloworld51;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
//    Button mAboutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mAboutButton = findViewById(R.id.button_about);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }


}
