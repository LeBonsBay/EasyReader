package com.example.easyreader;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_add), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnItemSelectedListener(item -> { //lambda ist verkürzte schreibweise von diesem komischen code da wenn du auf lambda gehst; machen wir noch genauer
            if (item.getItemId() == R.id.nav_add) {

                return false;

            } else if (item.getItemId() == R.id.nav_home) {
                Intent in = new Intent(this.getApplicationContext(), MainActivity.class);
                //hier wird der Befehl ausgeführt, dass das Fenster der SettingsActivity geöffnet wird und bei der Class ist durch setContentView ja das xml schon festgelegt, deshalb nicht hier extra machen
                this.startActivity(in);

                return true;
            } else if (item.getItemId() == R.id.nav_settings) {
                Intent in = new Intent(this.getApplicationContext(), SettingsActivity.class);
                //hier wird der Befehl ausgeführt, dass das Fenster der SettingsActivity geöffnet wird und bei der Class ist durch setContentView ja das xml schon festgelegt, deshalb nicht hier extra machen
                this.startActivity(in);

                return true;
            }
            return false;

        });


    }
}