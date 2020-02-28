package com.e.androidretailapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class CheckAllActivity extends AppCompatActivity {

    TextView tvCheckAll;
    SensorManager sensorManager;
    List<Sensor> sensorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_all);

        tvCheckAll = findViewById(R.id.tvChekAll);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        displaySensor();


    }

    private void displaySensor() {
        for(int i=0;i<sensorList.size();i++){
            String sensors = "";
            sensors += sensorList.get(i).getName() + "\n";
            tvCheckAll.append(sensors);
        }
    }
}
