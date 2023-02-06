package com.example.aplikacja2023_01v3_budzik;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TimePicker;

import com.example.aplikacja2023_01v3.R;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    TimePicker alarmTime;
    TextClock currentTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmTime = findViewById(R.id.timePicker);
        currentTime = findViewById(R.id.textClock);
        final Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(currentTime.getText().toString().equals(AlarmTime())){
                    r.play();
                }else
                    r.stop();

            }
        }, 0, 1000);


    }

    private String AlarmTime() {
        Integer alarmHours = alarmTime.getCurrentHour();
        Integer alarmMinutes = alarmTime.getCurrentMinute();

        String s;
        String minutes;

        if(alarmMinutes<10){
            minutes = "0";
            minutes.concat(alarmMinutes.toString());
        }else
            minutes = alarmMinutes.toString();

        if(alarmHours<10){
            s = "0"; // nie jestem pewien tej lini
            s = alarmHours.toString().concat(":").concat(minutes);
        }else
            s = alarmHours.toString().concat(":").concat(minutes);



        return s;
    }
}