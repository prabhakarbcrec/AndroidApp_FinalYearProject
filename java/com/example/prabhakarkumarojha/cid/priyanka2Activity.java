package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class priyanka2Activity extends AppCompatActivity implements View.OnClickListener {
    CardView call10, sms10, mail10;

    TextView textView;
    String[] detailsofchandan;
    int index;
    Button buttonp,buttons;
    TextToSpeech ttsoobject;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priyanka2);

        index=0;
        detailsofchandan=getResources().getStringArray(R.array.chandan);
        textView=findViewById(R.id.tv);
        buttonp=findViewById(R.id.play);
        buttons=findViewById(R.id.stop);


        call10=  findViewById(R.id.priyankcallcall);
        sms10 =  findViewById(R.id.priyankasms);
        mail10 =  findViewById(R.id.priyankamail);
        call10.setOnClickListener(this);
        sms10.setOnClickListener(this);
        mail10.setOnClickListener(this);
        buttonp.setOnClickListener(this);
        buttons.setOnClickListener(this);

        textView.setText(detailsofchandan[index]);
        ttsoobject=new TextToSpeech(priyanka2Activity.this, new TextToSpeech.OnInitListener() {
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
        switch (view.getId()) {
            case R.id.priyankcallcall:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Intent call = callIntent.setData(Uri.parse("tel:9831114666"));
                startActivity(call);
                break;
            case R.id.priyankasms:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:9831114666")));
                break;
            case R.id.priyankamail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"prabhakarkumarojha@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "subject");
                email.putExtra(Intent.EXTRA_TEXT, "message");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;

            case R.id.play:
                if (result==TextToSpeech.LANG_NOT_SUPPORTED||result==TextToSpeech.LANG_MISSING_DATA){
                    Toast.makeText(getApplicationContext(),"this feature not found in your device",Toast.LENGTH_SHORT).show();
                }
                else {
                    ttsoobject.speak(detailsofchandan[index],TextToSpeech.QUEUE_FLUSH,null);

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
