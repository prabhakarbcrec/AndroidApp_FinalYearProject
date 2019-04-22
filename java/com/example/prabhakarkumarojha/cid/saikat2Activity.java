package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class saikat2Activity extends AppCompatActivity  implements View.OnClickListener{
    CardView call12, sms12, mail12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saikat2);
        call12=  findViewById(R.id.maitycall);
        sms12 = findViewById(R.id.maitysms);
        mail12 =  findViewById(R.id.maitymail);
        call12.setOnClickListener(this);
        sms12.setOnClickListener(this);
        mail12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.maitycall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9614962733"));
                startActivity(call);
                break;
            case R.id.maitysms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9614962733")));
                break;
            case R.id.maitymail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"prabhakarkumarojha@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "subject");
                email.putExtra(Intent.EXTRA_TEXT, "message");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;
        }
    }
}
