package com.example.myapplicationassign_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListner{

    private ArrayList<Animal> animalList;
    private RecyclerView simple_RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simple_RecyclerView = findViewById(R.id.simple_RecyclerView);
        buildRecyclerView();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        simple_RecyclerView.setLayoutManager(gridLayoutManager);
        simple_RecyclerView.setAdapter(animalAdapter);
    }

    private void buildRecyclerView() {
        animalList = new ArrayList<>();
        animalList.add(new Animal("Animals",R.drawable.cat,"Cat","Meows"));
        animalList.add(new Animal("Animals",R.drawable.dog,"Dog","Bark"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Jaguar","Roar"));
        animalList.add(new Animal("Animals",R.drawable.lion,"Lion","Roar"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Leopard","Growl"));
        animalList.add(new Animal("Animals",R.drawable.cat,"Cat","Meows"));
        animalList.add(new Animal("Animals",R.drawable.dog,"Dog","Bark"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Jaguar","Roar"));
        animalList.add(new Animal("Animals",R.drawable.lion,"Lion","Roar"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Leopard","Growl"));
        animalList.add(new Animal("Animals",R.drawable.cat,"Cat","Meows"));
        animalList.add(new Animal("Animals",R.drawable.dog,"Dog","Bark"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Jaguar","Roar"));
        animalList.add(new Animal("Animals",R.drawable.lion,"Lion","Roar"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Leopard","Growl"));
        animalList.add(new Animal("Animals",R.drawable.cat,"Cat","Meows"));
        animalList.add(new Animal("Animals",R.drawable.dog,"Dog","Bark"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Jaguar","Roar"));
        animalList.add(new Animal("Animals",R.drawable.lion,"Lion","Roar"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Leopard","Growl"));
        animalList.add(new Animal("Animals",R.drawable.cat,"Cat","Meows"));
        animalList.add(new Animal("Animals",R.drawable.dog,"Dog","Bark"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Jaguar","Roar"));
        animalList.add(new Animal("Animals",R.drawable.lion,"Lion","Roar"));
        animalList.add(new Animal("Animals",R.drawable.leopard,"Leopard","Growl"));
    }
    @Override
    public void onItemClicked(int position,Animal animal){
        Toast.makeText(MainActivity.this,"Animal name is " + animal.getAnimalName(),Toast.LENGTH_SHORT).show();
    }

}