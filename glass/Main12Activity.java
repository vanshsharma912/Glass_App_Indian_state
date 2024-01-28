

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main12Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
        float c;
        float d;
        float area;
        int pos;
        float ar,ar1;
        float f,t,floor1,k1,k2,tot,k3;
    String[] CLIMATE = {"Plains"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
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

            Intent i = new Intent(Main12Activity.this, Main13Activity.class);
            k3=1;
            tot=tot*k3;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);

            startActivity(i);


        }


        if (position == 1) {


            Intent i = new Intent(Main12Activity.this, Main13Activity.class);
            k3=1;
            tot=tot*k3;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            startActivity(i);

        }
        if (position == 2) {


            Intent i = new Intent(Main12Activity.this, Main13Activity.class);
            k3=1;
            tot=tot*k3;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);

            startActivity(i);

        }
        if (position == 3) {


            Intent i = new Intent(Main12Activity.this, Main13Activity.class);
            k3=1;
            tot=tot*k3;
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
