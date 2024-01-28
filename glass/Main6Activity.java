

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main6Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    float c;
    float d;
    float area;
    int pos;
    float ar,ar1;
    float f,t;
    String[] CLIMATE = {"Window on Shorter Side of Room","Window on Longer Side of Room"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, CLIMATE);
        ListView l1 = (ListView) findViewById(R.id.listView);
        l1.setAdapter((ListAdapter) adapter);
        l1.setOnItemClickListener(this);
        c = getIntent().getFloatExtra("c",0);
        d = getIntent().getFloatExtra("c",0);
        f = getIntent().getFloatExtra("f",0);
        t = getIntent().getFloatExtra("t",0);
        area = getIntent().getFloatExtra("area",0);
        pos= getIntent().getIntExtra("pos",0);
    }
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        if (position == 0) {

            Intent i = new Intent(Main6Activity.this, Main8Activity.class);
            ar1=c*d*t;
            ar=(ar1/100);
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);


            startActivity(i);


        }


        if (position == 1) {


            Intent i = new Intent(Main6Activity.this, Main8Activity.class);
            ar1=c*d*f;
            ar=(ar1/100);
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            //i.putExtra("num", num);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            // i.putExtra("watt",watt);

            startActivity(i);

        }
    }
}
