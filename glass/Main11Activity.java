

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main11Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] member;
    TypedArray pop;
    List<rowit> rowits;
    ListView listView;
    float c;
    float d;
    float area;
    int pos;
    float ar,ar1;
    float f,t,floor1,k1,k2,tot;
    String[] CLIMATE = {"Terrain 1 (Exposed Open Building Without Obstruction)","Terrain 2 (Open terrain with well scattered Obstruction)"
                         ,"Terrain 3(Terrain with numerous Closed Obstruction)","Terrain 4(Terrain with numerous large highly closed obstruction"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        c = getIntent().getFloatExtra("c",0);
        d = getIntent().getFloatExtra("d",0);
        f = getIntent().getFloatExtra("f",0);
        t = getIntent().getFloatExtra("t",0);
        area = getIntent().getFloatExtra("area",0);
        ar = getIntent().getFloatExtra("ar",0);
        floor1 = getIntent().getFloatExtra("floor1",0);
        tot = getIntent().getFloatExtra("tot",0);
        k1 = getIntent().getFloatExtra("k1",0);
        pos= getIntent().getIntExtra("pos",0);

        rowits=new ArrayList<rowit>();
        member = getResources().getStringArray(R.array.member);
        pop=getResources().obtainTypedArray(R.array.pop);

        for(int i=0;i<member.length;i++)
        {

            rowit item=new rowit(member[i],pop.getResourceId(i,-1));
            rowits.add(item);

        }
        listView=(ListView) findViewById(R.id.list);
        Customadapter adapter=new Customadapter(this,rowits);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);



    }
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        if (position == 0) {
            if(floor1<=10) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.05;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(floor1>10 && floor1<=15) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.09;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>15 && floor1<=20) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.12;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>20 && floor1<=30) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.15;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>30 && floor1<=50) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.20;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>50 && floor1<=100) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.26;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>100 && floor1<=150) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.30;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>150 && floor1<=200) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.32;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>200 && floor1<=250) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.34;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>250 && floor1<=300) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>300 && floor1<=350) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>350 && floor1<=400) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>400 && floor1<=450) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>450 && floor1<=500) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
        }


        if (position == 1) {


            if(floor1<=10) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(floor1>10 && floor1<=15) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.05;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>15 && floor1<=20) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.07;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>20 && floor1<=30) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.12;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>30 && floor1<=50) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.17;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>50 && floor1<=100) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.24;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>100 && floor1<=150) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.28;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>150 && floor1<=200) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.30;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>200 && floor1<=250) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.32;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>250 && floor1<=300) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.34;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>300 && floor1<=350) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>350 && floor1<=400) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>400 && floor1<=450) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>450 && floor1<=500) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

        }
        if (position == 2) {


            if(floor1<=10) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 0.91;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(floor1>10 && floor1<=15) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 0.97;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>15 && floor1<=20) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.01;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>20 && floor1<=30) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.06;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>30 && floor1<=50) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.12;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>50 && floor1<=100) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.20;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>100 && floor1<=150) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.24;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>150 && floor1<=200) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.27;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>200 && floor1<=250) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.29;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>250 && floor1<=300) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.31;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>300 && floor1<=350) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.32;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>350 && floor1<=400) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.34;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>400 && floor1<=450) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>450 && floor1<=500) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.35;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

        }
        if (position == 3) {


            if(floor1<=10) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 0.80;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(floor1>10 && floor1<=15) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 0.80;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>15 && floor1<=20) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 0.80;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>20 && floor1<=30) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 0.97;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>30 && floor1<=50) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.10;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>50 && floor1<=100) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.20;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>100 && floor1<=150) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.24;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>150 && floor1<=200) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.27;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>200 && floor1<=250) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.28;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>250 && floor1<=300) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.30;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>300 && floor1<=350) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.31;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>350 && floor1<=400) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.32;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>400 && floor1<=450) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.33;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(floor1>450 && floor1<=500) {
                Intent i = new Intent(Main11Activity.this, Main12Activity.class);
                k2= (float) 1.34;
                tot=tot*k2;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

        }
    }
}
