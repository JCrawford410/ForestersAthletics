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

        Button badmintonButton = findViewById(R.id.button_badminton);
        Button baseballButton = findViewById(R.id.button_baseball);
        Button basketballButton = findViewById(R.id.button_basketball);
        Button footballButton = findViewById(R.id.button_football);
        Button lacrosseButton = findViewById(R.id.button_lacrosse);
        Button soccerButton = findViewById(R.id.button_soccer);
        Button softballButton = findViewById(R.id.button_softball);
        Button swimmingButton = findViewById(R.id.button_swimming);
        Button tennisButton = findViewById(R.id.button_tennis);
        Button trackButton = findViewById(R.id.button_track);
        Button volleyballButton = findViewById(R.id.button_volleyball);
        Button wrestlingButton = findViewById(R.id.button_wrestling);

        badmintonButton.setOnClickListener(v -> openSecondActivity("Badminton"));

        baseballButton.setOnClickListener(v -> openSecondActivity("Baseball"));

        basketballButton.setOnClickListener(v -> openSecondActivity("Basketball"));

        lacrosseButton.setOnClickListener(v -> openSecondActivity("Lacrosse"));

        footballButton.setOnClickListener(v -> openSecondActivity("Football"));

        soccerButton.setOnClickListener(v -> openSecondActivity("Soccer"));

        softballButton.setOnClickListener(v -> openSecondActivity("Softball"));

        swimmingButton.setOnClickListener(v -> openSecondActivity("Swimming"));

        tennisButton.setOnClickListener(v -> openSecondActivity("Tennis"));

        trackButton.setOnClickListener(v -> openSecondActivity("Track"));

        volleyballButton.setOnClickListener(v -> openSecondActivity("Volleyball"));

        wrestlingButton.setOnClickListener(v -> openSecondActivity("Wrestling"));
    }
    private void openSecondActivity(String sport) {
        Intent intent = new Intent(SixthActivity.this, SecondActivity.class);
        intent.putExtra("selectedSport", sport); // Pass the sport name
        startActivity(intent);


    }
}