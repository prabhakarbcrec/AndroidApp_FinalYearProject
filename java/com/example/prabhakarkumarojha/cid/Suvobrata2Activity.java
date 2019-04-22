package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class Suvobrata2Activity extends AppCompatActivity implements View.OnClickListener{
    CardView call18, sms18, mail18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suvobrata2);
        call18=  findViewById(R.id.sucall);
        sms18 =  findViewById(R.id.susms);
        mail18 =  findViewById(R.id.sumail);
        call18.setOnClickListener(this);
        sms18.setOnClickListener(this);
        mail18.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sucall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9831114666"));
                startActivity(call);
                break;
            case R.id.susms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9831114666")));
                break;
            case R.id.sumail:
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
