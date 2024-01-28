

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main10Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] member1;
    TypedArray pop1;
    List<rowit1> rowit1;
    ListView listView;

    float c;
    float d;
    float area;
    int pos;
    float ar,ar1;
    float f,t,floor1,k1,tot;
    String[] CLIMATE = {"All General Building and Structures","Temporary Shed Structures","Building presenting Low Degree of hazards to Life","Important Building and Structures"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        c = getIntent().getFloatExtra("c",0);
        d = getIntent().getFloatExtra("d",0);
        f = getIntent().getFloatExtra("f",0);
        t = getIntent().getFloatExtra("t",0);
        area = getIntent().getFloatExtra("area",0);
        ar = getIntent().getFloatExtra("ar",0);
        floor1 = getIntent().getFloatExtra("floor1",0);
        pos= getIntent().getIntExtra("pos",0);
        rowit1=new ArrayList<rowit1>();
        member1 = getResources().getStringArray(R.array.member1);
        pop1=getResources().obtainTypedArray(R.array.pop1);

        for(int i=0;i<member1.length;i++)
        {

            rowit1 item=new rowit1(member1[i],pop1.getResourceId(i,-1));
            rowit1.add(item);

        }
        listView=(ListView) findViewById(R.id.list);
        Customadapter1 adapter=new Customadapter1(this,rowit1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        if (position == 0) {
                         if(pos<=33) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1=1;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("floor1",floor1);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(pos>33 && pos<=39) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1=1;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>39 && pos<=44) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1=1;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>44 && pos<=47) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1=1;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>47 && pos<=50) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1=1;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>50 && pos<=55) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1=1;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
        }


        if (position == 1) {


            if(pos<=33) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.82;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(pos>33 && pos<=39) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.76;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>39 && pos<=44) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.73;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>44 && pos<=47) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.71;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>47 && pos<=50) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.70;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>50 && pos<=55) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.67;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

        }
        if (position == 2) {


            if(pos<=33) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.94;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(pos>33 && pos<=39) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.92;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>39 && pos<=44) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.91;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>44 && pos<=47) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.90;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>47 && pos<=50) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.90;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("floor1",floor1);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>50 && pos<=55) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 0.89;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

        }
        if (position == 3) {


            if(pos<=33) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 1.05;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

            if(pos>33 && pos<=39) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 1.06;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>39 && pos<=44) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 1.07;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>44 && pos<=47) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 1.07;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>47 && pos<=50) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 1.08;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }
            if(pos>50 && pos<=55) {
                Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                k1= (float) 1.08;
                tot=pos*k1;
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("floor1",floor1);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);

                startActivity(i);

            }

        }
    }
}
