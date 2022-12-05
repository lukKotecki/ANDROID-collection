package com.example.aplikacja_2022_11;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPopulateClass extends AppCompatActivity {

    private Intent intent;

    public MenuPopulateClass() {
    }

    public boolean menuPopulate(MenuItem item, Context context){
        switch(item.getItemId()){
            case R.id.settings_menu:
                Toast.makeText(context , "kliknięto settings menu funkcja do roboty", Toast.LENGTH_SHORT).show();
                intent = new Intent(context, BuildActivity.class);
                break;
            case R.id.about_menu:
                Toast.makeText(context , "kliknięto about menu funkcja do roboty", Toast.LENGTH_SHORT).show();
                intent = new Intent(context, HistoryActivity.class);
                break;
            case R.id.home_menu:
                intent = new Intent(context, MainActivity.class);
                break;
            case R.id.finish_menu:
                finish();
                return false;
            default:
                break;
        }
        startActivity(intent);
        return true;
    }

}
