package com.sema.redbullproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import Services.AuthService;
import Services.RetrofitClient;
import models.LoginRequest;
import models.LoginResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ActivityLogin extends AppCompatActivity {

    private Button buttonSignup;
    private Button buttonLogin;
    private EditText editTextTextEmailAddress2;
    private EditText editTextTextName;
    private ImageView imageView8; // ImageView nesnesi tanımlanıyor
    private ImageView imageView7;
    private ImageView imageView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Butonları, giriş alanlarını ve ImageView'i tanımla
        buttonSignup = findViewById(R.id.buttonSignUp);
        buttonLogin = findViewById(R.id.buttonSignup);
        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2);
        editTextTextName = findViewById(R.id.editTextTextName);
        imageView8 = findViewById(R.id.imageView8); // ImageView nesnesi bağlantısı yapılıyor
        imageView7 = findViewById(R.id.imageView7); // ImageView nesnesi bağlantısı yapılıyor
        imageView9 = findViewById(R.id.imageView9);
        // ImageView'e tıklanınca bağlantıya yönlendirme işlemi
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Yönlendirme yapılacak web sayfasının URL'sini belirleyin
                String url = "https://www.linkedin.com/company/red-bull";

                // Intent'i oluşturun ve web sayfasına yönlendirme yapmak için ACTION_VIEW kullanın
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Intent'i başlatın
                startActivity(intent);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Yönlendirme yapılacak web sayfasının URL'sini belirleyin
                String url = "https://www.instagram.com/redbull/";

                // Intent'i oluşturun ve web sayfasına yönlendirme yapmak için ACTION_VIEW kullanın
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Intent'i başlatın
                startActivity(intent);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Yönlendirme yapılacak web sayfasının URL'sini belirleyin
                String url = "https://tr-tr.facebook.com/RedBull/";

                // Intent'i oluşturun ve web sayfasına yönlendirme yapmak için ACTION_VIEW kullanın
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Intent'i başlatın
                startActivity(intent);
            }
        });

        // Retrofit ile AuthService oluştur
        AuthService authService = RetrofitClient.getRetrofitInstance().create(AuthService.class);

        // Kayıt butonu tıklama olayı
        buttonSignup.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityLogin.this, ActivitySignup.class);
            startActivity(intent);
        });

        // Login butonu tıklama olayı
        buttonLogin.setOnClickListener(v -> {
            String username = editTextTextEmailAddress2.getText().toString();
            String password = editTextTextName.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(ActivityLogin.this, "Username and password are required", Toast.LENGTH_SHORT).show();
                return;
            }
            // Kullanıcı adı ve şifre alanları doluysa ve geçerli bir giriş yapılırsa ActivityKategori sınıfına geçiş yap
            Intent intent = new Intent(ActivityLogin.this, ActivityKategori.class);
            startActivity(intent);
            finish(); // Aktiviteyi kapat

          /* LoginRequest request = new LoginRequest(username, password);

            authService.login(request).enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if (response.isSuccessful()) {
                        // Başarılı giriş sonrası yeni bir aktiviteye geçiş
                        Intent intent = new Intent(ActivityLogin.this, ActivityKategori.class);
                        startActivity(intent);
                        finish(); // Aktiviteyi kapat
                    } else {
                        Toast.makeText(ActivityLogin.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    Toast.makeText(ActivityLogin.this, "Network error", Toast.LENGTH_SHORT).show();
                }
            });*/
        });
    }
}

