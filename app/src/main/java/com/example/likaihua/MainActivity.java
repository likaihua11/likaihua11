package com.example.likaihua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.example.likaihua.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding bina = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Users users = new Users("小明", -1, "男");
        List<String> list=new ArrayList<>();
        list.add("李");
        list.add("凯");
        bina.setUsers(users);
        bina.setList(list);
        bina.setIndex(1);


    }
}
