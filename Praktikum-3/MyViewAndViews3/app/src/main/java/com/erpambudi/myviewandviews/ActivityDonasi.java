package com.erpambudi.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityDonasi extends AppCompatActivity implements View.OnClickListener {

    Button btnKirimDonasi;
    EditText etNama, etEmail, etTotalDonasi, etCatatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi");
        }

        etNama = findViewById(R.id.et_nama);
        etEmail = findViewById(R.id.et_email);
        etTotalDonasi = findViewById(R.id.et_total_donasi);
        etCatatan = findViewById(R.id.et_catatan);

        btnKirimDonasi = findViewById(R.id.btn_kirim_donasi);
        btnKirimDonasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_kirim_donasi) {
            String nama = etNama.getText().toString();
            String email = etEmail.getText().toString();
            String donasi = etTotalDonasi.getText().toString();
            String catatan = etCatatan.getText().toString();

            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(nama)) {
                isEmptyFields = true;
                etNama.setError("Nama tidak boleh kosong");
            }

            if (TextUtils.isEmpty(email)) {
                isEmptyFields = true;
                etEmail.setError("Email tidak boleh kosong");
            }

            if (TextUtils.isEmpty(donasi)) {
                isEmptyFields = true;
                etTotalDonasi.setError("Donasi tidak bisa 0");
            }

            if (!isEmptyFields) {
                User user = new User();
                user.setNama(nama);
                user.setEmail(email);
                user.setDonasi(donasi);
                user.setCatatan(catatan);

                Intent intent = new Intent(this, DataDonasiActivity.class);
                intent.putExtra(DataDonasiActivity.EXTRA_USER, user);
                startActivity(intent);
                finish();
            }
        }

    }
}
