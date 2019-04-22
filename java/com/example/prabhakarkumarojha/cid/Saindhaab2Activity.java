package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class Saindhaab2Activity extends AppCompatActivity implements View.OnClickListener{
CardView call13, sms13, mail13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saindhaab2);
        call13=  findViewById(R.id.sandhabcall);
        sms13 =  findViewById(R.id.sandhabsms);
        mail13 =  findViewById(R.id.sandhabmail);
        call13.setOnClickListener(this);
        sms13.setOnClickListener(this);
        mail13.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sandhabcall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9475744761"));
                startActivity(call);
                break;
            case R.id.sandhabsms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9475744761")));
                break;
            case R.id.sandhabmail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"saindhab@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, " ");
                email.putExtra(Intent.EXTRA_TEXT, " ");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;
        }
    }
}
