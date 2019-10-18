package com.erpam.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveData, btnMove, btnCall, btnBrowser, btnInputData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btn_move);
        btnMove.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        btnCall = findViewById(R.id.btn_call);
        btnCall.setOnClickListener(this);

        btnBrowser = findViewById(R.id.btn_browser);
        btnBrowser.setOnClickListener(this);

        btnInputData = findViewById(R.id.btn_input_data);
        btnInputData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //isi getId() adalah .setOnClickListener(this), di nge get variabel id yang di klik
        switch (v.getId()){
            case R.id.btn_move:
                Intent intent = new Intent(this, MoveActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_move_data:
                Intent intentWithData = new Intent(this, ActivityWithData.class);
                intentWithData.putExtra(ActivityWithData.EXTRA_NAME, "Rizki Pambudi");
                intentWithData.putExtra(ActivityWithData.EXTRA_AGE, 21);
                startActivity(intentWithData);
                break;

            case R.id.btn_call:
                String phoneNumber = "08994636544";
                Intent intentImplicitPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(intentImplicitPhone);
                break;

            case R.id.btn_browser:
                String url = "http://ittelkom-pwt.ac.id/";
                Intent intentImplicitWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intentImplicitWeb);
                break;

            case R.id.btn_input_data:
                Intent intentInputData = new Intent(this, ActivityData1.class);
                startActivity(intentInputData);
                break;
        }

    }

}
