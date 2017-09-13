package com.example.mymsi.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textView);//上下文菜单文本
        registerForContextMenu(textView);//注册上下文菜单
    }
    //选择菜单
        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_main, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            //noinspection SimplifiableIfStatement
            switch (id) {
                case R.id.item1:
                    Toast.makeText(this, "选择了Settings键", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.item2:
                    Toast.makeText(this, "选择了Help键", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.item3:
                    Toast.makeText(this, "选择了Cancle键", Toast.LENGTH_SHORT).show();
                    break;
            }
            return super.onOptionsItemSelected(item);
            }
            //上下文菜单
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_content, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.contentMenuHelp:
                Toast.makeText(this, "选择Help键",
            Toast.LENGTH_SHORT).show();
                break;
            case R.id.contentMenuOk:
                Toast.makeText(this, "选择Ok键",
            Toast.LENGTH_SHORT).show();
                break;
            case R.id.contentMenuCancel:
                Toast.makeText(this, "选择Cancel键",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);}


}

