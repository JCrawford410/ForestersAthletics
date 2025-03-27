package org.forestpark.forestersathletics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);


        Button basketballButton = findViewById(R.id.button_basketball);
        Button soccerButton = findViewById(R.id.button_soccer);
        Button footballButton = findViewById(R.id.button_football);


        basketballButton.setOnClickListener(v -> openSecondActivity("Basketball"));

        soccerButton.setOnClickListener(v -> openSecondActivity("Soccer"));

        footballButton.setOnClickListener(v -> openSecondActivity("Football"));


    }
    private void openSecondActivity(String sport) {
        Intent intent = new Intent(SixthActivity.this, SecondActivity.class);
        intent.putExtra("selectedSport", sport); // Pass the sport name
        startActivity(intent);


    }
}