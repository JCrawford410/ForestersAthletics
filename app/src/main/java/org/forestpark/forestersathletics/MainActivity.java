package org.forestpark.forestersathletics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageButtons
        ImageButton home_button = findViewById(R.id.home_button);
        ImageButton search_button = findViewById(R.id.search_button);
        ImageButton player_button = findViewById(R.id.player_Button);

        home_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        search_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SixthActivity.class);
            startActivity(intent);
        });

        player_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FifthActivity.class);
            startActivity(intent);
        });
    }
}
