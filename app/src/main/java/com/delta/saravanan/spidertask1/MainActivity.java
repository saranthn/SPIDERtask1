package com.delta.saravanan.spidertask1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static android.support.constraint.R.id.parent;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<String>();
    ArrayAdapter<String> itemAdapter;
    private ListView listitems;
    private EditText etNewItem;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.btnAddItem);
        listitems = (ListView) findViewById(R.id.listView);
        etNewItem = (EditText) findViewById(R.id.editText);
        itemAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listitems.setAdapter(itemAdapter);

        listitems.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id){

                Intent nextActivity = new Intent(MainActivity.this,Main2Activity.class);
                String data = items.get(position);
                nextActivity.putExtra("data",data);
                startActivity(nextActivity);
            }

        });
    }



    public void addItem(View view) {
        etNewItem = (EditText) findViewById(R.id.editText);
        String itemText = etNewItem.getText().toString();
        if(itemText.length()>0){
            itemAdapter.add(itemText);
            etNewItem.setText(" ");
        }

    }

}
