package com.rk.gv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView GV_1_IDJAVA;
    ArrayAdapter<String> ArrayPencocok;
    String[] ItemItem = {"TextView",
            "EditText",
            "Button",
            "Toggle",
            "Switch",
            "Image",
            "CheckBox",
            "Custom",
            "Radio",
            "Spinner",
            "RatingBar",
            "SeekBar", "Progress",
            "TextView",
            "Image",
            "Text",
            "ScrollView",
            "AlertDialog"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GV_1_IDJAVA = findViewById(R.id.GV_1_IDXML);

        ArrayPencocok = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ItemItem);
        GV_1_IDJAVA.setAdapter(ArrayPencocok);
        GV_1_IDJAVA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Pilihan = ArrayPencocok.getItem(position);
                Toast.makeText(getApplicationContext(), "Anda Memijit Item: " + Pilihan, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
