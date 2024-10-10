package com.example.actividad_moviles2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.actividad_moviles2.Producto;
import com.example.actividad_moviles2.Producto2;
import com.example.actividad_moviles2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Producto2 adaptado;
    private List<Producto> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        productList.add(new Producto("Jeans", "$45", R.drawable.jeans));
        productList.add(new Producto("Chaqueta", "$85", R.drawable.chaqueta));
        productList.add(new Producto("Zapatos", "$60", R.drawable.zapatos));
        productList.add(new Producto("Sombrero", "$20", R.drawable.sombrero));
        productList.add(new Producto("Camiseta", "$25", R.drawable.camiseta));

        adaptado = new Producto2(productList);
        recyclerView.setAdapter(adaptado);
    }
}
