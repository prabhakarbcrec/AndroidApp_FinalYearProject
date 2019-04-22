package com.example.prabhakarkumarojha.cid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class deptActivity extends AppCompatActivity {
    String[] tname={"DR.CHANDAN KONAR","DR.G.S.MITRA THAKUR","AMITABHA MANDAL","BAPPADITYA DAS"
            ,"DR.R.SAMANTA","HIRANMAY SAMADDAR","SAINDHAB CHATTARAJ","SUVOBRATA SARKAR",
            "SANJAY BISWAS","MS. KALPNA ROY", "S.REZA TARAFDAR","DR. SUJIT DAS","D.N.GHOSH","ARINDAM GHOSE","SANJIB SAHA","POULOMI TIWARI",
            "ARUN K SADHU","SAIKAT MAITY","PRABAL K SAHU","DINESH KR. PRADHAN","PRIYANKA ROY","DR. D MUKHARJEE","B GOSWAMI","BISWAJIT MANDAL",
    "BISWAJIT SAHA","PARAMITA MANNA","B PRASAD TIWARI","MANAS K ROY","MD. K H MONDAL","MOUMITA SASMAL","AVIJIT BHOWMICK","SHAON BANDYOPADHYAY","RUMA GHOSH","S. ZAHIR HASAN","RAJIB K MONDAL","ANANDPURVA MAJUMDER"};

    String[] dept={"CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","CSE","IT",
            "IT","IT","IT","IT","CSE","CSE","CSE","IT","CSE","IT","IT","IT","IT","CSE","CSE","CSE","CSE","CSE",};

    Integer[] imgid={R.drawable.chandan,R.drawable.nitra,R.drawable.ami,R.drawable.bappa,R.drawable.samanta,
    R.drawable.hiranmay,R.drawable.sindhaw,R.drawable.sarkar,R.drawable.sanjay,R.drawable.kalpna,R.drawable.reja,R.drawable.sujit,R.drawable.dipendra,R.drawable.arindam,
    R.drawable.sanjib,R.drawable.poulami,R.drawable.arun,R.drawable.saikat,R.drawable.prabal,R.drawable.dinesh,R.drawable.priyanka,R.drawable.dp
   ,R.drawable.biswadev,R.drawable.biswajit,R.drawable.biswajitt,R.drawable.paramita,R.drawable.babul,R.drawable.manas,R.drawable.md,R.drawable.moumita,
    R.drawable.avijit,R.drawable.shaon,R.drawable.ruma,R.drawable.zahir,R.drawable.rajib,R.drawable.anandpurva};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);
        listView=(ListView)findViewById(R.id.listview);
        costmize cs = new costmize(this, tname, dept, imgid);
        listView.setAdapter(cs);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                       Intent ll=new Intent(deptActivity.this,Candan2Activity.class);
                       startActivity(ll);
                        break;

                    case 1:
                        Intent ll1=new Intent(deptActivity.this,Mitra2Activity.class);
                        startActivity(ll1);
                        break;
                    case 2:
                        Intent l2=new Intent(deptActivity.this,saikat2Activity.class);
                        startActivity(l2);

                        break;
                    case 3:
                        Intent o3=new Intent(deptActivity.this,bppa2Activity.class);
                        startActivity(o3);
                        break;
                    case 4:
                        Intent o4=new Intent(deptActivity.this,Sumanta2Activity.class);
                        startActivity(o4);

                        break;
                    case 5:
                        Intent o5=new Intent(deptActivity.this,Hiranmay2Activity.class);
                        startActivity(o5);

                        break;
                    case 6:
                        Intent o6=new Intent(deptActivity.this,Saindhaab2Activity.class);
                        startActivity(o6);

                        break;
                    case 7:
                        Intent o7=new Intent(deptActivity.this,Suvobrata2Activity.class);
                        startActivity(o7);

                        break;
                    case 8:
                        Intent o8=new Intent(deptActivity.this,Sanjay2Activity.class);
                        startActivity(o8);

                        break;
                    case 9:
                        Intent o9=new Intent(deptActivity.this,kalpna2Activity.class);
                        startActivity(o9);

                        break;
                    case 10:
                        Intent o10=new Intent(deptActivity.this,reza2Activity.class);
                        startActivity(o10);

                        break;
                    case 11:
                        Intent ol1=new Intent(deptActivity.this,sujit2Activity.class);
                        startActivity(ol1);

                        break;
                    case 12:
                        Intent ol2=new Intent(deptActivity.this,dnghosh2Activity.class);
                        startActivity(ol2);

                        break;
                    case 13:
                        Intent o=new Intent(deptActivity.this,arindam2Activity.class);
                        startActivity(o);

                        break;
                    case 14:
                        Intent o14=new Intent(deptActivity.this,sanjiv2Activity.class);
                        startActivity(o14);

                        break;
                    case 15:
                        Intent o15=new Intent(deptActivity.this,poulmi2Activity.class);
                        startActivity(o15);

                        break;
                    case 16:
                        Intent o16=new Intent(deptActivity.this,bppa2Activity.class);
                        startActivity(o16);

                        break;
                    case 17:
                        Intent o17=new Intent(deptActivity.this,saikat2Activity.class);
                        startActivity(o17);

                        break;
                    case 18:
                        Intent o18=new Intent(deptActivity.this,bppa2Activity.class);
                        startActivity(o18);

                        break;
                    case 19:
                        Intent o19=new Intent(deptActivity.this,dinesh2Activity.class);
                        startActivity(o19);

                        break;
                    case 20:
                        Intent o20=new Intent(deptActivity.this,priyanka2Activity.class);
                        startActivity(o20);
                        break;
                        case 21:
                        Intent o21=new Intent(deptActivity.this,dewaprasad2Activity.class);
                        startActivity(o21);
                        break;

                }
            }
        });
    }
}
