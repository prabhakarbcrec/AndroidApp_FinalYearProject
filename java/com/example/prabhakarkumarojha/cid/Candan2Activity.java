package com.example.prabhakarkumarojha.cid;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Candan2Activity extends AppCompatActivity implements View.OnClickListener {
CardView call,sms,mail;


TextView textView;
String[]chandan;
int index;
Button buttonp,buttons;
TextToSpeech ttsoobject;
int result;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candan2);


        index=0;
        chandan=getResources().getStringArray(R.array.chandan);
        textView=findViewById(R.id.tv);
        buttonp=findViewById(R.id.play);
        buttons=findViewById(R.id.stop);


        call=findViewById(R.id.imageButtonphn);
        sms=findViewById(R.id.imageButtonmsg);
        mail=findViewById(R.id.imageButtonmsgmail);
        call.setOnClickListener(this);
        sms.setOnClickListener(this);
        mail.setOnClickListener(this);
        buttonp.setOnClickListener(this);
        buttons.setOnClickListener(this);

      textView.setText(chandan[index]);


        ttsoobject=new TextToSpeech(Candan2Activity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS)
                {
                   result= ttsoobject.setLanguage(Locale.US);
                   ttsoobject.setSpeechRate(1.12f);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"this feature not found in your device",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.imageButtonphn:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9434535556"));
                startActivity(call);
                break;
            case R.id.imageButtonmsg:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9434535556")));
                break;
            case R.id.imageButtonmsgmail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "chandan.koner@bcrec.ac.in"});
                email.putExtra(Intent.EXTRA_SUBJECT, " ");
                email.putExtra(Intent.EXTRA_TEXT, " ");

//need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;
            case R.id.play:
                       if (result==TextToSpeech.LANG_NOT_SUPPORTED||result==TextToSpeech.LANG_MISSING_DATA){
                           Toast.makeText(getApplicationContext(),"this feature not found in your device",Toast.LENGTH_SHORT).show();
                       }
                       else {
                           ttsoobject.speak(chandan[index],TextToSpeech.QUEUE_FLUSH,null);

                       }
                break;
            case R.id.stop:
                if (ttsoobject!=null)
                {
                    ttsoobject.stop();
                }
                break;
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (ttsoobject!=null) {
            ttsoobject.stop();

            ttsoobject.shutdown();
        }
    }
}
