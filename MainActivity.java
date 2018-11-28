package com.example.soyeonlee.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdapter myListAdapter;
    ArrayList<list_item> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.listview);
        list_itemArrayList = new ArrayList<list_item>();

        list_itemArrayList.add(
                new list_item(R.drawable.iu,"보라돌이","2018.11.27","오늘 날씨가 좋네요",
                        "좋아요 2", "댓글 3")
        );

        list_itemArrayList.add(
                new list_item(R.drawable.mh,"뚜비","2018.11.25","히히히히히히",
                        "좋아요 3", "댓글 5")
        );

        list_itemArrayList.add(
                new list_item(R.drawable.pk,"나나","2018.11.20","쿠크다스 냠",
                        "좋아요 10", "댓글 2")
        );

        list_itemArrayList.add(
                new list_item(R.drawable.ap,"뽀","2018.11.10","집에 가구 싶",
                        "좋아요 5", "댓글 4")
        );

        myListAdapter = new MyListAdapter(MainActivity.this,list_itemArrayList);
        listView.setAdapter(myListAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SubActivity1.class);
                startActivity(intent);
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
