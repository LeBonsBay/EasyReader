package com.example.easyreader;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        //1. von hausaus immer unter einem super den code pasten.
        //2. das bottom_nav_menu.xml tue ich bereits mit einer id ja bei der activity_main.xml ja verlinken, siehe code bei der bottomnavigationview

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(item -> { //lambda ist verkürzte schreibweise von diesem komischen code da wenn du auf lambda gehst; machen wir noch genauer
            if (item.getItemId() == R.id.nav_add) {
                Intent in = new Intent(this.getApplicationContext(), AddActivity.class);
                //hier wird der Befehl ausgeführt, dass das Fenster der SettingsActivity geöffnet wird und bei der Class ist durch setContentView ja das xml schon festgelegt, deshalb nicht hier extra machen
                this.startActivity(in);

                return true;

            } else if (item.getItemId() == R.id.nav_home) {

                return false;
            } else if (item.getItemId() == R.id.nav_settings) {
                Intent in = new Intent(this.getApplicationContext(), SettingsActivity.class);
                //hier wird der Befehl ausgeführt, dass das Fenster der SettingsActivity geöffnet wird und bei der Class ist durch setContentView ja das xml schon festgelegt, deshalb nicht hier extra machen
                this.startActivity(in);

                return true;
            }
            return false;

        });
    }

    public void onClickSettings() {


        //OnClickListener


    }

}