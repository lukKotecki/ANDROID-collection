package com.example.aplikacja_2022_11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.internal.ManufacturerUtils;

public class BuildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);
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


        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuItem ustawienia = menu.add("Ustawienia");
//        MenuItem kontakt = menu.add("kontakt");
//        MenuItem informacje = menu.add("informacje");
//
//        ustawienia.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                Toast.makeText(BuildActivity.this, "kliknieto ustawienia"+ menuItem.getItemId(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
//        kontakt.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                Toast.makeText(BuildActivity.this, "kliknieto kontakt"+ menuItem.getItemId(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
//        informacje.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                Toast.makeText(BuildActivity.this, "kliknieto informacje"+ menuItem.getItemId(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
//        return true;
//    }
//

}