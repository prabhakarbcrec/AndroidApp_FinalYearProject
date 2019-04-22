package com.example.prabhakarkumarojha.cid;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener{
     private DrawerLayout myyDrawer;
     private ActionBarDrawerToggle mytoggol;
    private CardView EcardView1,McardView2,CcardView3,DcardView4 ,AcardView5;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myyDrawer=(DrawerLayout)findViewById(R.id.myyDrawer);
        EcardView1=(CardView) findViewById(R.id.edu);
        McardView2=(CardView)findViewById(R.id.mak);
        navigationView=(NavigationView)findViewById(R.id.nvgtn);


        CcardView3=(CardView)findViewById(R.id.bcr);
        DcardView4=(CardView)findViewById(R.id.dpt);
        AcardView5=(CardView)findViewById(R.id.intr);

        EcardView1.setOnClickListener(this);
        McardView2.setOnClickListener(this);
        CcardView3.setOnClickListener(this);
        DcardView4.setOnClickListener(this);
        AcardView5.setOnClickListener(this);
        navigationView.setNavigationItemSelectedListener(this);

        mytoggol=new ActionBarDrawerToggle(this,myyDrawer,R.string.open,R.string.close);
        myyDrawer.addDrawerListener(mytoggol);
        mytoggol.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mytoggol.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.edu:
                Intent i=new Intent(MainActivity.this,EduActivity.class);
                startActivity(i);
                break;
            case R.id.dpt:
                Intent k=new Intent(MainActivity.this,deptActivity.class);
                startActivity(k);
                break;
            case R.id.bcr:
                Intent j=new Intent(MainActivity.this,bcrecActivity.class);
                startActivity(j);
                break;
            case R.id.mak:
                Intent L=new Intent(MainActivity.this,MakautActivity.class);
                startActivity(L);
                break;
            case R.id.intr:
                Intent M=new Intent(MainActivity.this,InterviewActivity.class);
                startActivity(M);
                break;


        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this,"prabhakar",Toast.LENGTH_LONG).show();

        switch (item.getItemId()) {
            case R.id.smudf:

               Intent ko=new Intent(getApplicationContext(),Mitra2Activity.class);
               startActivity(ko);
                break;

            case R.id.gate_notes:

                Toast.makeText(this, "prahakar1", Toast.LENGTH_LONG).show();
                break;
            case R.id.hand:

                Toast.makeText(this, "prahakar2", Toast.LENGTH_LONG).show();
                break;

            case R.id.motivation:

                Toast.makeText(this, "prahakar3", Toast.LENGTH_LONG).show();
                break;

            case R.id.lab:

                Toast.makeText(this, "prahakar4", Toast.LENGTH_LONG).show();
                break;

            case R.id.coding:

                Toast.makeText(this, "prahakar4", Toast.LENGTH_LONG).show();
                break;

            case R.id.about_us:

            Toast.makeText(this, "prahakar5", Toast.LENGTH_LONG).show();
            break;
        }
        return true;
    }
}
