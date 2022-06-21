package com.example.prak6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_dashboard extends AppCompatActivity {

    String EmailHolder;
    TextView Email;
    Button LogOUT ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Email = (TextView)findViewById(R.id.textEmail);
        LogOUT = (Button)findViewById(R.id.buttonLogOut);
        Intent intent = getIntent();
        // Receiving User Email Send By MainActivity.
        EmailHolder =
                intent.getStringExtra(MainActivity.UserEmail);
        // Setting up received email to TextView.
        Email.setText(Email.getText().toString()+
                EmailHolder);
        // Adding click listener to Log Out button.
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Finishing current DashBoard activity onbutton click.
                finish();
            }
        });
    }
}