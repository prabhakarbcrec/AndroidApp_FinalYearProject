package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class EduActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView CcardView,JcardView,AcardView,BcardView ,PcardView,WEBcardcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);
        CcardView=(CardView) findViewById(R.id.c);
        JcardView=(CardView)findViewById(R.id.java);
        AcardView=(CardView)findViewById(R.id.android);
        BcardView=(CardView)findViewById(R.id.bigdata);
        PcardView=(CardView)findViewById(R.id.python);
        WEBcardcard=(CardView)findViewById(R.id.web);
        CcardView.setOnClickListener(this);
        JcardView.setOnClickListener(this);
        AcardView.setOnClickListener(this);
        BcardView.setOnClickListener(this);
        PcardView.setOnClickListener(this);
        WEBcardcard.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.c:
                Intent i = new Intent(EduActivity.this, Main2Activity.class);
                startActivity(i);
                break;
            case R.id.java:
                Intent j=new Intent(EduActivity.this,Main3Activity.class);
                startActivity(j);
                break;

            case R.id.android:
                Intent k=new Intent(EduActivity.this,Main4Activity.class);
                startActivity(k);

                break;
            case R.id.bigdata:
                Intent l=new Intent(EduActivity.this,Main5Activity.class);
                startActivity(l);
                break;
            case R.id.python:
                Intent m=new Intent(EduActivity.this,Main6Activity.class);
                startActivity(m);
                break;
            case R.id.web:
                Intent n=new Intent(EduActivity.this,Main7Activity.class);
                startActivity(n);
                break;
        }
    }
}
