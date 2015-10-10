package com.example.tisan.savingkey_valuesets;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get a Hadnle to shared preferences
//        Context context = getActivity();
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);


        // Write to preference file
        sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(getString(R.string.saved_high_score), 100);
        editor.commit();


        // Read from preference file
        sharedPref = getPreferences(Context.MODE_PRIVATE);
//        int defaultValue = getResources().getString(R.string.saved_high_score);
        final long highScore = sharedPref.getInt(getString(R.string.saved_high_score),1000);



        // Testing purpose
        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView)findViewById(R.id.textView);
                String str = String.valueOf(highScore);
                tv.setText(str);
            }
        });



    }
}
