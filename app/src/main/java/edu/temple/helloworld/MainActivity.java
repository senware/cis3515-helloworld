package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.helloButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               TextView hText = (TextView) findViewById(R.id.helloText);
               hText.setText("You clicked the button.");
            }
        });


    }
}