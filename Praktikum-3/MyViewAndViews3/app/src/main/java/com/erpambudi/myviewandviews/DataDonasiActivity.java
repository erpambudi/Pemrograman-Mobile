package com.erpambudi.myviewandviews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DataDonasiActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_USER = "extra_user";
    TextView tvNama, tvEmail, tvDonasi, tvCatatan;
    String nama, email, donasi, catatan;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_donasi);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi");
        }

        tvNama = findViewById(R.id.tv_nama_user);
        tvEmail = findViewById(R.id.tv_email_user);
        tvDonasi = findViewById(R.id.tv_donasi_user);
        tvCatatan = findViewById(R.id.tv_catatan_user);

        User user = getIntent().getParcelableExtra(EXTRA_USER);
        nama = ": "+user.getNama();
        email = ": "+user.getEmail();
        donasi = ": "+user.getDonasi();
        catatan = ": "+user.getCatatan();

        tvNama.setText(nama);
        tvEmail.setText(email);
        tvDonasi.setText(donasi);
        tvCatatan.setText(catatan);

        btnKirim = findViewById(R.id.btn_kirim);
        btnKirim.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_kirim){
            Toast.makeText(getApplicationContext(), "Donasi telah di kirim", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
