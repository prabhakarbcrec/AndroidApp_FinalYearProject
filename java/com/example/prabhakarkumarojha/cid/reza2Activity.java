package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class reza2Activity extends AppCompatActivity implements View.OnClickListener{
    CardView call11, sms11, mail11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reza2);
        call11=  findViewById(R.id.rezacall);
        sms11 =  findViewById(R.id.regasms);
        mail11 =  findViewById(R.id.rezamail);
        call11.setOnClickListener(this);
        sms11.setOnClickListener(this);
        mail11.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rezacall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9831114666"));
                startActivity(call);
                break;
            case R.id.regasms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9831114666")));
                break;
            case R.id.rezamail:
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
