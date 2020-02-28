package com.e.retailwear;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView tvOutput;
    private Button btnShow;
    private EditText etFirst;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        String message = getIntent().getStringExtra("message");
        if (message == null){
            mTextView.setText("No message");
        }
        mTextView.setText(message);



        tvOutput = findViewById(R.id.tvOutput);
        btnShow = findViewById(R.id.btnShow);
        etFirst = findViewById(R.id.etFirst);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(etFirst.getText().toString());
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }


}



