package com.example.aplikacja_2022_11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // TODO: 05.12.2022

        switch(item.getItemId()){
            case R.id.settings_menu:
                Toast.makeText(this, "settings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about_menu:
                Toast.makeText(this, "about clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.home_menu:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.finish_menu:
                finish();
                break;
            default:
                break;
        }


        return super.onOptionsItemSelected(item);
    }


}