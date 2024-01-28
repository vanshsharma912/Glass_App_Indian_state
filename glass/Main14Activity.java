

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main14Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    float c;
    float d;
    float area;
    int pos;
    float ar,ar1;
    float f,t,floor1,k1,k2,tot,k3,k4,gla,big;
    String[] CLIMATE = {"Single Glazing","Double glazing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
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
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, CLIMATE);
        ListView l1 = (ListView) findViewById(R.id.listView);
        l1.setAdapter((ListAdapter) adapter);
        l1.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        if (position == 0) {

            Intent i = new Intent(Main14Activity.this, Main9Activity.class);
            if(f>t)
            {

               big=f;
            }
            else if(t>f)
            {
                big=t;
            }
            else
                {
                     big=f;
            }
            gla=big*1000;
            gla=gla/125;
             tot= (float) (tot*tot*0.6);
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla",gla);
                startActivity(i);


        }


        if (position == 1) {


            Intent i = new Intent(Main14Activity.this, Main9Activity.class);
            if(f>t)
            {

                big=f;
            }
            else if(t>f)
            {
                big=t;
            }
            else
            {
                big=f;
            }
            gla=big*1000;
            gla=gla/175;
            tot= (float) (tot*tot*0.6);
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            startActivity(i);

        }



    }
}
