package com.example.aplikacja_2023_04_alarm_clock;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TimePicker;

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
        final Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(), RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM));

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(currentTime.getText().toString().equals(AlarmTime())){
                    ringtone.play();
                }else{
                    ringtone.stop();
                }
            }
        },0,1000);

    }

    private String AlarmTime() {

        Integer alarmHours = alarmTime.getHour();
        Integer alarmMinutes = alarmTime.getMinute();

        String stringAlarmTime = "Napis";
//        if (alarmHours > 12){
//            alarmHours =- 12;
//            stringAlarmTime = alarmHours.toString().concat(":").concat(alarmMinutes.toString()).concat(" PM");
//        }else{
//            stringAlarmTime = alarmHours.toString().concat(":").concat(alarmMinutes.toString()).concat(" AM");
//        }

//        String sHours;
//        String sMinutes;
//        if(alarmHours < 10){
//            sHours = "0".concat(alarmHours.toString());
//        }else{
//            sHours = alarmHours.toString();
//        }
//
//        if(alarmMinutes < 10){
//            sMinutes = "0".concat(alarmMinutes.toString());
//        }else{
//            sMinutes = alarmMinutes.toString();
//        }


        if(alarmHours < 10){
            stringAlarmTime = "0".concat(alarmHours.toString().concat(":"));
        }else{
            stringAlarmTime = alarmHours.toString().concat(":");
        }

        if(alarmMinutes < 10){
            stringAlarmTime = stringAlarmTime.concat("0").concat(alarmMinutes.toString());
        }else{
            stringAlarmTime = stringAlarmTime.concat(alarmMinutes.toString());
        }

        return stringAlarmTime;
    }


}