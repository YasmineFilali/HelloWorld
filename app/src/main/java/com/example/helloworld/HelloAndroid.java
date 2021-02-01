package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
public class HelloAndroid extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /* TextView tv= new TextView(this);
        tv.setText("Hello, Android");

        EditText et = new EditText(this);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.addView(tv);
        ll.addView(et);
        setContentView(ll);*/


        setContentView(R.layout.layout_file_name);
        //Exercice2: decommenter la ligne suivante 27 et commenter la précedente 25:
        //setContentView(R.layout.layout_file_name1);
        //Exercice3: pour chaque layout decommenter la ligne correspondante et commenter la précedente 27
        //layout1:
        //setContentView(R.layout.layout1);
        //layout2:
        //setContentView(R.layout.layout2);
        //layout3:
        //setContentView(R.layout.layout3);



    }
}