package com.malyalapraneeth.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button changeButton;
    EditText responseText;
    TextView displayText;
    String[] planets;
    Map<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.submitButton);
        changeButton=findViewById(R.id.changeButton);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        map = new HashMap<String, String>();
        map.put("farthest planet from the sun?", "neptune");
        map.put("iphone or samsung?", "iphone");
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom");
                Log.i("testButton","Hi dad! "+responseText.getText());
                displayText.setText(displayText.getText()+" "+responseText.getText());
            }
        });

    }



    int x = 0;
    public void clickCount(View view) {

        if(map.get(map.keySet().toArray()[x]).equals((displayText.getText()+"").toLowerCase())) {
            x++;
        }
    }
}