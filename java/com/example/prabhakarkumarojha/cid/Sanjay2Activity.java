package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class Sanjay2Activity extends AppCompatActivity implements View.OnClickListener{
    CardView call14, sms14, mail14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjay2);
        call14=  findViewById(R.id.snajaycall);
        sms14 =  findViewById(R.id.sanjaysms);
        mail14 =  findViewById(R.id.sanjaymail);
        call14.setOnClickListener(this);
        sms14.setOnClickListener(this);
        mail14.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.snajaycall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9831114666"));
                startActivity(call);
                break;
            case R.id.sanjaysms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9831114666")));
                break;
            case R.id.sanjaymail:
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
