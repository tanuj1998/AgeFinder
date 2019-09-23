package com.tanuj.findmyage;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etDOB;
    TextView tvShowAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDOB = findViewById(R.id.etDOB);
        tvShowAge = findViewById(R.id.tvShowAge);
    }

    public void buFindAge(View view) {
        int DOB = Integer.parseInt(etDOB.getText().toString());

        Calendar calendar = Calendar.getInstance(); //get device current time
        int year = calendar.get(Calendar.YEAR);
        int Age = year - DOB;
        tvShowAge.setText("Your age is:" + Age + "and in month" + Age*12 + ", in days" + Age*365);

    }
}
