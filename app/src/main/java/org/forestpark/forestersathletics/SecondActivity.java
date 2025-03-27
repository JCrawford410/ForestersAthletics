package org.forestpark.forestersathletics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String selectedSport = intent.getStringExtra("selectedSport");


        TextView selectedTextView = findViewById(R.id.selectedTextView);
        selectedTextView.setText(selectedSport);


        Button teamButton = findViewById(R.id.teamButton);
        Button statisticsButton = findViewById(R.id.statisticsButton);
        Button historyButton = findViewById(R.id.historyButton);


        teamButton.setOnClickListener(v -> openActivity(FourthActivity.class));

        statisticsButton.setOnClickListener(v -> openActivity(FifthActivity.class));

        historyButton.setOnClickListener(v -> openActivity(ThirdActivity.class));
    }

    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(SecondActivity.this, activityClass);
        startActivity(intent);
    }
}

