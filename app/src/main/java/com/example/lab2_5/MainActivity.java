package com.example.lab2_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.engBtn).setOnClickListener(this);
        findViewById(R.id.finBtn).setOnClickListener(this);
        findViewById(R.id.sweBtn).setOnClickListener(this);
        findViewById(R.id.surpriseBtn).setOnClickListener(this);
        // Testi testi test
        //TextView nimiUI = findViewById(R.id.heippaLaatikko);



    }

    private String getTextFieldText(){
        EditText editor = findViewById(R.id.seppoLaatikko);
        String text = editor.getText().toString();
        return text;
    }

    private void setHeippa(String kieli){
       // TextView nimiUi = findViewById(R.id.heippaLaatikko);
    }

    @Override
    public void onClick(View v) {

        //if (nimi != null && nimi.length() > 0) {
            if (v.getId() == R.id.engBtn) {
                String nimi = getTextFieldText();
                nimi = "Testi Seppo";
                TextView nimiUi = findViewById(R.id.heippaLaatikko);
                nimiUi.setText("Hello "+nimi);
            } else if (v.getId() == R.id.finBtn) {
                String nimi = getTextFieldText();
                nimi = "Testi Seppo";
                TextView nimiUi = findViewById(R.id.heippaLaatikko);
                nimiUi.setText("Tere "+nimi);
            } else if (v.getId() == R.id.sweBtn) {
                String nimi = getTextFieldText();
                nimi = "Testi Seppo";
                TextView nimiUi = findViewById(R.id.heippaLaatikko);
                nimiUi.setText("Hejsan "+nimi);
            } else if (v.getId() == R.id.surpriseBtn) {
                String nimi = getTextFieldText();
                nimi = "Testi Seppo";
                TextView nimiUi = findViewById(R.id.heippaLaatikko);
                nimiUi.setText("Aloha "+nimi);
            }
        //}

    }
}
