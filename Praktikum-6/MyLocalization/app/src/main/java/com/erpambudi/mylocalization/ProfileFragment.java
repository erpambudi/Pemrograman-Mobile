package com.erpambudi.mylocalization;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_profile, container, false);

        ViewGroup root = (ViewGroup)
                inflater.inflate(R.layout.fragment_profile, null);

        CircleImageView ciProfile;
        TextView tvNama = root.findViewById(R.id.tv_detail_name);
        TextView tvAlamat = root.findViewById(R.id.tv_detail_alamat);
        TextView tvHobi = root.findViewById(R.id.tv_detail_hobi);
        TextView tvQuote = root.findViewById(R.id.tv_detail_quote);

        tvNama.setText(getResources().getString(R.string.detail_name));
        tvAlamat.setText(getResources().getString(R.string.detail_address));
        tvHobi.setText(getResources().getString(R.string.detail_hobby));
        tvQuote.setText(getResources().getString(R.string.detail_quote));

        return root;

    }

}
