package com.example.aplikacja_2022_10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mainButton;
    private TextView mainText;
    private CheckBox checkboxHarry, checkboxMatrix, checkboxJoker;
    private RadioGroup rgMaritalStatus;
    private ProgressBar pbProgress;
    private Intent intent;
    private Button btLeft;
    private Button btRight;
    private Button btSrodek;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.mainButton);
        mainText = findViewById(R.id.mainText);
        checkboxHarry = findViewById(R.id.checkboxHarry);
        checkboxMatrix = findViewById(R.id.checkboxMatrix);
        checkboxJoker = findViewById(R.id.checkboxJoker);
        rgMaritalStatus = findViewById(R.id.rgMaritalStatus);
        pbProgress = findViewById(R.id.pbProgress);
        btLeft = findViewById(R.id.btLeft);
        btRight = findViewById(R.id.btRight);
        btSrodek =findViewById(R.id.btSrodek);
        fab = findViewById(R.id.fab);

        btLeft.setOnClickListener(this);
        btRight.setOnClickListener(this);
        btSrodek.setOnClickListener(this);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0;i<16;i++){
                    pbProgress.incrementProgressBy(10);
                    SystemClock.sleep(700);
                }
            }
        });
        thread.start();



        int checkButton = rgMaritalStatus.getCheckedRadioButtonId();
        switch (checkButton){
            case R.id.rbMarried:
                Toast.makeText(MainActivity.this, "You are married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "U r single", Toast.LENGTH_SHORT).show();
               // pbProgress.setVisibility(View.VISIBLE);
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity.this, "U are in relatioshipment", Toast.LENGTH_SHORT).show();
                // pbProgress.setVisibility(View.GONE);
                break;
            default:
                break;
        }

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "You are married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "U r single", Toast.LENGTH_SHORT).show();
                        //pbProgress.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "U are in relatioshipment", Toast.LENGTH_SHORT).show();
                      //  pbProgress.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }
            }
        });

        mainButton.setOnClickListener(this);
        mainButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this, "Długo kliknięto ten klawisz", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        mainButton.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View view, MotionEvent motionEvent) {
                mainText.setText("BubaBuba");
                return false;
            }
        });

        checkboxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this, "Spoko że oglądałeś", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "powinieneś obejrzeć", Toast.LENGTH_SHORT).show();
            }
        });







    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.mainButton:
                Toast.makeText(this, "Kliknięto krótko", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btLeft:
                intent = new Intent(this,LeftActivity.class);
                startActivity(intent);
                break;
            case R.id.btRight:
                intent = new Intent(this, RightActivity.class);
                startActivity(intent);
                break;
            case R.id.btSrodek:
                intent = new Intent(this, SrodekActivity.class);
                startActivity(intent);
                break;
            case R.id.fab:
                Toast.makeText(this, "Kliknięto floating action button", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings_menu:
                Toast.makeText(this, "U selected settings_menu", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.alarm_menu:
                Toast.makeText(this, "U selected alarm_menu", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}