package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class Sumanta2Activity extends AppCompatActivity implements View.OnClickListener{
    CardView call17, sms17, mail17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumanta2);
        call17=  findViewById(R.id.sumantacall);
        sms17 =  findViewById(R.id.sumantasms);
        mail17 =  findViewById(R.id.sumantamail);
        call17.setOnClickListener(this);
        sms17.setOnClickListener(this);
        mail17.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sumantacall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9333336958"));
                startActivity(call);
                break;
            case R.id.sumantasms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9333336958")));
                break;
            case R.id.sumantamail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajkumar.samanta@bcrec.ac.in"});
                email.putExtra(Intent.EXTRA_SUBJECT, "subject");
                email.putExtra(Intent.EXTRA_TEXT, "message");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;
        }
    }
}
