package com.example.androidpemula;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ActivityDetail extends AppCompatActivity {

    ImageView imageView;
    TextView txt_name, txt_desc;
    Button btn_back;
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_DESCRIPTION = "extra_description";
    public static String EXTRA_PHOTO = "extra_photo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_detail);
        super.onCreate(savedInstanceState);

        imageView = findViewById(R.id.img_android);
        txt_name = findViewById(R.id.name_tv);
        txt_desc = findViewById(R.id.desc_tv);
        btn_back = findViewById(R.id.back_btn);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        txt_name.setText(name);

        String description = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        txt_desc.setText(description);

        String imgPath = getIntent().getStringExtra(EXTRA_PHOTO);

        Glide.with(this).
                load(imgPath).
                into(imageView);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}