package com.example.animalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView1;

     List<Item> itemList;
     MyAdapter myAdapter;

     ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
        recyclerView1 = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();

        Item item1 = new Item(R.drawable.cat, "Cat", "Domestic");
        Item item2 = new Item(R.drawable.dog, "Dog", "Domestic");
        Item item3 = new Item(R.drawable.camel, "Camel", "Wild");
        Item item4 = new Item(R.drawable.lion, "Lion", "Wild");
        Item item5 = new Item(R.drawable.cheetah, "Cheetah", "Wild");
        Item item6 = new Item(R.drawable.zebra, "Zebra", "Wild");
        Item item7 = new Item(R.drawable.giraffe, "Giraffe", "Wild");
        Item item8 = new Item(R.drawable.monkey, "Monkey", "Wild");
        Item item9 = new Item(R.drawable.elephant, "Elephant", "Wild");
        Item item10 = new Item(R.drawable.tiger, "Tiger", "Wild");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);
        itemList.add(item10);



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(linearLayoutManager);

        myAdapter = new MyAdapter(itemList);
        recyclerView1.setAdapter(myAdapter);




    }
}