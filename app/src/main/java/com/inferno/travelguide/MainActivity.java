package com.inferno.travelguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.inferno.travelguide.slide.Main3Activity;

public class MainActivity extends AppCompatActivity {

    String search;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton imagebutton = (ImageButton) findViewById(R.id.search_button);

        imagebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText text=(EditText)findViewById(R.id.search_text);
               search=text.getText().toString().trim();


                if(search.equals("allahabad"))

                {Intent activity = new Intent(MainActivity.this, Main3Activity.class);
                            Bundle b=new Bundle();
                    b.putString("name",text.getText().toString());
                    activity.putExtras(b);
                startActivity(activity);}
                else
                {
                    Toast.makeText(MainActivity.this, "Result not Found", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    public void buttonClick(View view) {
        Intent songsIntent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(songsIntent);

    }



}


