package com.example.listvew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Christian", "Valentina", "Oscar", "Jesus", "Genesis", "Margarita",
    "David", "Mayra", "Dulce", "Monica"};
    private String edades [] = {"24", "18", "23", "32", "13", "25", "15", "18", "44", "31"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv_Seleccion);
        lv1 = (ListView) findViewById(R.id.lv_Menu);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item_lista, nombres);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(position).toString() + " es " + edades[position] + "años");
            }
        });
    }
}





