package com.example.aplikacja_2023_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActivityCompat.requestPermissions(this,
                new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);


    }



    public void buttonCreateFle(View view){
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
//            intent = new Intent(Intent.ACTION_CREATE_DOCUMENT, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
//        }
        //intent.setType("application/pdf");
        intent.setType("*/*");
        this.startActivity(intent);

    }


    public void buttonOpenFile(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
//            intent = new Intent(Intent.ACTION_VIEW, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
//        }
        intent.setType("*/*");
        this.startActivity(intent);

    }











//    // Request code for selecting a PDF document.
//    private static final int PICK_PDF_FILE = 2;
//
//    private void openFile(Uri pickerInitialUri) {
//        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
//        intent.addCategory(Intent.CATEGORY_OPENABLE);
//        intent.setType("application/pdf");
//
//        // Optionally, specify a URI for the file that should appear in the
//        // system file picker when it loads.
//        intent.putExtra(DocumentsContract.EXTRA_INITIAL_URI, pickerInitialUri);
//
//        startActivityForResult(intent, PICK_PDF_FILE);
//    }





}