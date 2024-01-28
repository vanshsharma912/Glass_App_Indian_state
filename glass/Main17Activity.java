

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main17Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    float c;
    float d;
    float area;
    int pos;
    float ar, ar1;
    float f, t, floor1, k1, k2, tot, k3, k4, gla, tit;
    String [] climate={"Calculated Wind Pressure","User Defined Wind Pressure"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, climate);
        ListView list = (ListView) findViewById(R.id.list2);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

        Intent i=getIntent();
        c = getIntent().getFloatExtra("c", 0);
    d = getIntent().getFloatExtra("d", 0);
    f = getIntent().getFloatExtra("f", 0);
    t = getIntent().getFloatExtra("t", 0);
    area = getIntent().getFloatExtra("area", 0);
    ar = getIntent().getFloatExtra("ar", 0);
    floor1 = getIntent().getFloatExtra("floor1", 0);
    tot = getIntent().getFloatExtra("tot", 0);
    gla = getIntent().getFloatExtra("gla", 0);
    k1 = getIntent().getFloatExtra("k1", 0);
    pos = getIntent().getIntExtra("pos", 0);
}

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if(position==0)
        {
            Intent i=new Intent(Main17Activity.this,Main20Activity.class);
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("f", f);
            i.putExtra("t", t);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);
            startActivity(i);
        }
        if(position==1)
        {
            Intent i=new Intent(Main17Activity.this,Main18Activity.class);
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("f", f);
            i.putExtra("t", t);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);
            startActivity(i);
        }
    }
}
