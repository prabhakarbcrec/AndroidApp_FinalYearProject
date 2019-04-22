package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class sanjiv2Activity extends AppCompatActivity implements View.OnClickListener {
    CardView call15, sms15, mail15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjiv2);
        call15=  findViewById(R.id.sanjivcall);
        sms15 =  findViewById(R.id.sanjivsms);
        mail15 =  findViewById(R.id.sanjivmail);
        call15.setOnClickListener(this);
        sms15.setOnClickListener(this);
        mail15.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sanjivcall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9732144771"));
                startActivity(call);
                break;
            case R.id.sanjivsms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9732144771")));
                break;
            case R.id.sanjivmail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"sanjibsaha.6wa@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, " ");
                email.putExtra(Intent.EXTRA_TEXT, " ");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;
        }
    }
}
