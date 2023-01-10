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

            //TODO górny pasek mennu nie działa prawidłowo
            case R.id.settings_menu:
                Toast.makeText(context , "kliknięto Trybiki TODO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_menu:
                Toast.makeText(context , "kliknięto about TODO", Toast.LENGTH_SHORT).show();
               break;
            case R.id.home_menu:
                Toast.makeText(context , "kliknięto domek wejscie do ekranu glownego", Toast.LENGTH_SHORT).show();
                intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
                break;
            case R.id.finish_menu:
                Toast.makeText(context , "kliknięto finish to nie dziala TODO", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            default:
                break;
        }

        return true;
    }

}
