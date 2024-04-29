package com.sema.redbullproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityKategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kategori);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageView29 = findViewById(R.id.imageView29);
        imageView29.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivitySepet.class);
            startActivity(intent);
        });


        ImageView imageView26 = findViewById(R.id.imageView26);
        imageView26.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityBlue.class);
            startActivity(intent);
        });
        ImageView imageView24 = findViewById(R.id.imageView24);
        imageView24.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityPurple.class);
            startActivity(intent);
        });
        ImageView imageView28 = findViewById(R.id.imageView28);
        imageView28.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityOrange.class);
            startActivity(intent);
        });
        ImageView imageView25 = findViewById(R.id.imageView25);
        imageView25.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityYellow.class);
            startActivity(intent);
        });
        ImageView imageView27 = findViewById(R.id.imageView27);
        imageView27.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityRed.class);
            startActivity(intent);
        });
        ImageView imageView20 = findViewById(R.id.imageView20);
        imageView20.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityVoleybol.class);
            startActivity(intent);
        });
        ImageView imageView21 = findViewById(R.id.imageView21);
        imageView21.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivityMotoGP.class);
            startActivity(intent);
        });
        ImageView imageView23 = findViewById(R.id.imageView23);
        imageView23.setOnClickListener(view -> {
            // ImageView'e tıklandığında ActivityBlue sayfasını aç
            Intent intent = new Intent(ActivityKategori.this, ActivitySuperbike.class);
            startActivity(intent);
        });

    }


}
