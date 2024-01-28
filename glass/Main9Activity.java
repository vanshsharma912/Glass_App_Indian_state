

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    float c;
    float d;
    float area;
    int pos;
    float ar, ar1;
    float f, t, floor1, k1, k2, tot, k3, k4, gla, tit;
    String[] CLIMATE = {"Annealed Glass", "Laminated Glass", "Tempered Glass", "Insulating Glass", "Heat Strengthened Glass"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, CLIMATE);
        ListView l1 = (ListView) findViewById(R.id.listView);
        l1.setAdapter((ListAdapter) adapter);
        l1.setOnItemClickListener(this);
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
        TextView t5 = (TextView) findViewById(R.id.textView5);
        String lumen1 = Float.toString(tot);
        t5.setText(lumen1);
    }

    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

        if (position == 0) {
            fun();
            fun1();
            fun2();
            fun3();
            fun4();
            fun5();
            fun6();
            fun7();
            fun8();
            fun9();


            if (tot > 1400 && tot <= 1450 && ar > 0.76 && ar <= 0.73) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("f",f);
                i.putExtra("t",t);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 0.73 && ar <= 1.33) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 1.33 && ar <= 2.08) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 2.08 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 2.98 && ar <= 4.50) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 4.50 && ar <= 6.04) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 6.04 && ar <= 7.63) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 7.63 && ar <= 10.41) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1400 && tot <= 1450 && ar > 10.41 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1450 && tot <= 1500 && ar > 0.73 && ar <= 0.71) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 0.71 && ar <= 1.33) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 1.33 && ar <= 2.08) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 2.08 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 2.98 && ar <= 4.50) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 4.50 && ar <= 6.04) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 6.04 && ar <= 7.63) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 7.63 && ar <= 10.41) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1450 && tot <= 1500 && ar > 10.41 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1500 && tot <= 1550 && ar > 0.69) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 2.98 && ar <= 4.21) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 4.21 && ar <= 5.65) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 5.65 && ar <= 7.14) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 7.14 && ar <= 9.74) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1500 && tot <= 1550 && ar > 9.74 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1550 && tot <= 1600 && ar > 0.69) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 2.98 && ar <= 4.21) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 4.21 && ar <= 5.65) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 5.65 && ar <= 7.14) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 7.14 && ar <= 9.74) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1550 && tot <= 1600 && ar > 9.74 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1600 && tot <= 1650 && ar > 0.69) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 2.98 && ar <= 4.21) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 4.21 && ar <= 5.65) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 5.65 && ar <= 7.14) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 7.14 && ar <= 9.74) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1600 && tot <= 1650 && ar > 9.74 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1650 && tot <= 1700 && ar > 0.69) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 2.98 && ar <= 4.21) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 4.21 && ar <= 5.65) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 5.65 && ar <= 7.14) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 7.14 && ar <= 9.74) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1650 && tot <= 1700 && ar > 9.74 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1700 && tot <= 1750 && ar <= 0.61) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1700 && tot <= 1750 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 2.98 && ar <= 3.73) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 3.73 && ar <= 5.01) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 5.01 && ar <= 6.32) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 6.32 && ar <= 8.63) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1700 && tot <= 1750 && ar > 8.63 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1750 && tot <= 1800 && ar <= 0.61) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1750 && tot <= 1800 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 2.98 && ar <= 3.63) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 3.63 && ar <= 4.87) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 4.87 && ar <= 6.14) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 6.14 && ar <= 8.39) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1750 && tot <= 1800 && ar > 8.39 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1800 && tot <= 1850 && ar <= 0.61) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1800 && tot <= 1850 && ar > 0.69 && ar <= 1.24) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 1.24 && ar <= 1.94) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 1.94 && ar <= 2.98) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 2.98 && ar <= 3.63) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 3.63 && ar <= 4.87) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 4.87 && ar <= 6.14) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 6.14 && ar <= 8.39) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1800 && tot <= 1850 && ar > 8.39 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1850 && tot <= 1900 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1850 && tot <= 1900 && ar > 0.56 && ar <= 1.01) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 1.01 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 1.59 && ar <= 2.27) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 2.27 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1850 && tot <= 1900 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1850 && tot <= 1900 && ar > 0.56 && ar <= 1.01) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 1.01 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 1.59 && ar <= 2.27) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 2.27 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1850 && tot <= 1900 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1900 && tot <= 1950 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1900 && tot <= 1950 && ar > 0.56 && ar <= 0.99) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 0.99 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 1.59 && ar <= 2.21) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 2.21 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1900 && tot <= 1950 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 1950 && tot <= 2000 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 1950 && tot <= 2000 && ar > 0.56 && ar <= 0.99) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 0.99 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 1.59 && ar <= 2.21) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 2.21 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 1950 && tot <= 2000 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2000 && tot <= 2050 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2000 && tot <= 2050 && ar > 0.56 && ar <= 0.99) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 0.99 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 1.59 && ar <= 2.21) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 2.21 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2000 && tot <= 2050 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2050 && tot <= 2100 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2050 && tot <= 2100 && ar > 0.56 && ar <= 0.99) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 0.99 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 1.59 && ar <= 2.21) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 2.21 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2050 && tot <= 2100 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2100 && tot <= 2150 && ar <= 0.56) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2100 && tot <= 2150 && ar > 0.56 && ar <= 0.99) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 0.99 && ar <= 1.59) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 1.59 && ar <= 2.21) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 2.21 && ar <= 3.44) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 3.44 && ar <= 4.61) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 4.61 && ar <= 5.82) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 5.82 && ar <= 7.95) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2100 && tot <= 2150 && ar > 7.95 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2150 && tot <= 2200 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2150 && tot <= 2200 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2150 && tot <= 2200 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2200 && tot <= 2250 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2200 && tot <= 2250 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2200 && tot <= 2250 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2250 && tot <= 2300 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2250 && tot <= 2300 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2250 && tot <= 2300 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2300 && tot <= 2350 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2300 && tot <= 2350 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2300 && tot <= 2350 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2350 && tot <= 2400 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2350 && tot <= 2400 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2350 && tot <= 2400 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2400 && tot <= 2450 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2400 && tot <= 2450 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2400 && tot <= 2450 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2450 && tot <= 2500 && ar <= 0.48) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2450 && tot <= 2500 && ar > 0.48 && ar <= 0.88) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 0.88 && ar <= 1.37) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 1.37 && ar <= 1.96) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 1.96 && ar <= 2.97) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 2.97 && ar <= 3.98) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 3.98 && ar <= 5.03) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 5.03 && ar <= 6.86) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2450 && tot <= 2500 && ar > 6.86 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2500 && tot <= 2550 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2500 && tot <= 2550 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2500 && tot <= 2550 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2550 && tot <= 2600 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2550 && tot <= 2600 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2550 && tot <= 2600 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2600 && tot <= 2650 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2600 && tot <= 2650 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2600 && tot <= 2650 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2650 && tot <= 2700 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2650 && tot <= 2700 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2650 && tot <= 2700 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2700 && tot <= 2750 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2700 && tot <= 2750 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2700 && tot <= 2750 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2750 && tot <= 2800 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2750 && tot <= 2800 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2750 && tot <= 2800 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2800 && tot <= 2850 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2800 && tot <= 2850 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2800 && tot <= 2850 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2850 && tot <= 2900 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2850 && tot <= 2900 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2850 && tot <= 2900 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2900 && tot <= 2950 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2900 && tot <= 2950 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2900 && tot <= 2950 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 2950 && tot <= 3000 && ar <= 0.42) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 2950 && tot <= 3000 && ar > 0.42 && ar <= 0.76) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 0.76 && ar <= 1.18) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 1.18 && ar <= 1.69) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 1.69 && ar <= 2.56) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 2950 && tot <= 3000 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


            if (tot > 3000 && tot <= 3050 && ar <= 0.35) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3000 && tot <= 3050 && ar > 0.35 && ar <= 0.63) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 0.63 && ar <= 0.99) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 0.99 && ar <= 1.42) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 1.42 && ar <= 2.14) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 2.56 && ar <= 3.44) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 3.44 && ar <= 4.34) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 4.34 && ar <= 5.92) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3000 && tot <= 3050 && ar > 5.92 && ar <= 15) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


        }


        if (position == 1) {

            tot= (float) (tot/0.8);
            fun10();
            fun11();
            fun12();
            fun13();
            fun14();
            fun15();
            fun16();
            fun17();
            fun18();
            fun19();
            fun20();




        }

    }
//Annealed glass
    public void fun() {

        if (tot <= 500 && ar <= 2.13) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 2.13 && ar <= 3.86) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 3.86 && ar <= 6.03) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 6.03 && ar <= 8.63) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 8.63 && ar <= 13.06) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 13.06 && ar <= 15.00) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar <= 1.93) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 1.93 && ar <= 3.51) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 3.51 && ar <= 5.48) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 5.48 && ar <= 7.85) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 7.85 && ar <= 11.88) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 11.88 && ar <= 15) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 550 && tot <= 600 && ar <= 1.77) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 1.77 && ar <= 3.21) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 3.21 && ar <= 5.02) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 5.02 && ar <= 7.19) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 7.19 && ar <= 10.89) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 10.89 && ar <= 14.61) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 14.61 && ar <= 15) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar <= 1.64) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 1.64 && ar <= 2.97) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 2.97 && ar <= 4.64) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 4.64 && ar <= 6.64) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 6.64 && ar <= 10.05) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 10.05 && ar <= 13.48) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 13.48 && ar <= 15) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar <= 1.6) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 1.6 && ar <= 2.75) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 2.75 && ar <= 4.31) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 4.31 && ar <= 6.17) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 6.17 && ar <= 9.33) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 9.33 && ar <= 12.52) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 12.52 && ar <= 15) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


    }


    public void fun1() {
        if (tot > 700 && tot <= 750 && ar <= 1.42) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 1.42 && ar <= 2.57) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 2.57 && ar <= 4.02) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 4.02 && ar <= 5.76) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 5.76 && ar <= 8.71) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 8.71 && ar <= 11.69) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 11.69 && ar <= 14.75) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 14.75 && ar <= 15) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar <= 1.33) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 1.33 && ar <= 2.41) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 2.41 && ar <= 3.77) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 3.77 && ar <= 5.40) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 5.40 && ar <= 8.16) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 8.16 && ar <= 10.96) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 10.96 && ar <= 13.83) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 13.83 && ar <= 15) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar <= 1.25) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 1.25 && ar <= 2.27) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 2.27 && ar <= 3.55) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 3.55 && ar <= 5.08) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 5.08 && ar <= 7.68) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 7.68 && ar <= 10.31) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 10.31 && ar <= 13.01) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 13.01 && ar <= 15) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar <= 1.18) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 1.18 && ar <= 2.14) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 2.14 && ar <= 3.35) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 3.35 && ar <= 4.80) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 4.80 && ar <= 7.26) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 7.26 && ar <= 9.74) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 9.74 && ar <= 12.29) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 12.29 && ar <= 15) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
    }

    public void fun2()
    {

        if (tot > 900 && tot <= 950 && ar <= 1.12) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 1.12 && ar <= 2.03) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 2.03 && ar <= 3.17) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 3.17 && ar <= 4.54) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 4.54 && ar <= 6.88) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 6.88 && ar <= 9.23) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 9.23 && ar <= 11.64) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 11.64 && ar <= 15) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 950 && tot <= 1000 && ar <= 1.06) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 1.06 && ar <= 1.93) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 1.93 && ar <= 3.01) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 3.01 && ar <= 4.32) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 4.32 && ar <= 6.53) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 6.53 && ar <= 8.76) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 8.76 && ar <= 11.06) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 11.06 && ar <= 15) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 14.45 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar <= 1.01) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 1.01 && ar <= 1.84) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 1.84 && ar <= 2.87) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 2.87 && ar <= 4.11) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 4.11 && ar <= 6.22) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 6.22 && ar <= 8.35) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 8.35 && ar <= 10.53) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 10.53 && ar <= 14.38) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 14.38 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar <= 0.97) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 0.97 && ar <= 1.75) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 1.75 && ar <= 2.74) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 2.74 && ar <= 3.92) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 3.92 && ar <= 5.94) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 5.94 && ar <= 7.97) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 7.97 && ar <= 10.06) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 10.06 && ar <= 13.73) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 13.73 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
    }

    public void fun3()
    {
        if (tot > 1100 && tot <= 1150 && ar <= 0.93) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 0.93 && ar <= 1.68) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 1.68 && ar <= 2.62) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 2.62 && ar <= 3.75) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 3.75 && ar <= 5.68) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 5.68 && ar <= 7.62) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 7.62 && ar <= 9.62) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 9.62 && ar <= 13.13) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 13.13 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar <= 0.89) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 0.89 && ar <= 1.61) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 1.61 && ar <= 2.51) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 2.51 && ar <= 3.60) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 3.60 && ar <= 5.44) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 5.44 && ar <= 7.30) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 7.30 && ar <= 9.22) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 9.22 && ar <= 12.58) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 12.58 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar <= 0.85) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 0.85 && ar <= 1.54) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 1.54 && ar <= 2.41) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 2.41 && ar <= 3.45) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 3.45 && ar <= 5.23) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 5.23 && ar <= 7.01) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 7.01 && ar <= 8.85) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 8.85 && ar <= 12.08) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 12.08 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
    }
    public void fun4 ()
    {
        if (tot > 1250 && tot <= 1300 && ar <= 0.82) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 0.82 && ar <= 1.48) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 1.48 && ar <= 2.32) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 2.32 && ar <= 3.32) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 3.32 && ar <= 5.02) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 5.02 && ar <= 6.74) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 6.74 && ar <= 8.51) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 8.51 && ar <= 11.61) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 11.61 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 1300 && tot <= 1350 && ar > 0.82 && ar <= 0.79) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 0.79 && ar <= 1.48) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 1.48 && ar <= 2.32) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 2.32 && ar <= 3.32) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 3.32 && ar <= 5.02) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 5.02 && ar <= 6.74) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 6.74 && ar <= 8.51) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 8.51 && ar <= 11.61) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 11.61 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 1350 && tot <= 1400 && ar > 0.82 && ar <= 0.76) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 0.76 && ar <= 1.38) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 1.38 && ar <= 2.15) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 2.15 && ar <= 3.08) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 3.08 && ar <= 4.67) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 4.67 && ar <= 6.26) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 6.26 && ar <= 7.90) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 7.90 && ar <= 10.78) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 10.78 && ar <= 15) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
    }
    public void fun5() {

        if (tot > 3050 && tot <= 3100 && ar < 0.35) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 0.35 && ar <= 0.62) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 0.62 && ar <= 0.97) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 0.97 && ar <= 1.39) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 1.39 && ar <= 2.11) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 2.11 && ar <= 2.83) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 2.83 && ar <= 3.51) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 3.51 && ar <= 4.79) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 4.79 && ar <= 10) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 3100 && tot <= 3150 && ar < 0.35) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 0.35 && ar <= 0.62) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 0.62 && ar <= 0.97) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 0.97 && ar <= 1.39) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 1.39 && ar <= 2.11) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 2.11 && ar <= 2.83) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 2.83 && ar <= 3.51) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 3.51 && ar <= 4.79) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 4.79 && ar <= 10) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);
        }
        if (tot > 3150 && tot <= 3200 && ar < 0.35) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 0.35 && ar <= 0.62) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 0.62 && ar <= 0.97) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 0.97 && ar <= 1.39) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 1.39 && ar <= 2.11) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 2.11 && ar <= 2.83) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 2.83 && ar <= 3.51) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 3.51 && ar <= 4.79) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 4.79 && ar <= 10) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);
        }

        if (tot > 3200 && tot <= 3250 && ar < 0.35) {
            tit = 3;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 0.35 && ar <= 0.62) {
            tit = 4;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 0.62 && ar <= 0.97) {
            tit = 5;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 0.97 && ar <= 1.39) {
            tit = 6;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 1.39 && ar <= 2.11) {
            tit = 8;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 2.11 && ar <= 2.83) {
            tit = 10;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 2.83 && ar <= 3.51) {
            tit = 12;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 3.51 && ar <= 4.79) {
            tit = 15;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 4.79 && ar <= 10) {
            tit = 19;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);
        }
    }
        public void fun6()
        {

            if (tot > 3250 && tot <= 3300 && ar <=0.33) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 0.33 && ar <= 0.58) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 0.58 && ar <= 0.93) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 0.93 && ar <= 1.33) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 1.33 && ar <= 2.01) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 2.01 && ar <= 2.70) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 2.70 && ar <= 3.40) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 3.40 && ar <= 4.65) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3250 && tot <= 3300 && ar > 4.65 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3300 && tot <= 3350 && ar <=0.33) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 0.33 && ar <= 0.58) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 0.58 && ar <= 0.93) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 0.93 && ar <= 1.33) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 1.33 && ar <= 2.01) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 2.01 && ar <= 2.70) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 2.70 && ar <= 3.40) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 3.40 && ar <= 4.65) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3300 && tot <= 3350 && ar > 4.65 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

                        }
            if (tot > 3350 && tot <= 3400 && ar <=0.33) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 0.33 && ar <= 0.58) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 0.58 && ar <= 0.93) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 0.93 && ar <= 1.33) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 1.33 && ar <= 2.01) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 2.01 && ar <= 2.70) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 2.70 && ar <= 3.40) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 3.40 && ar <= 4.65) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3350 && tot <= 3400 && ar > 4.65 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3450 && tot <= 3500 && ar <=0.33) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 0.33 && ar <= 0.58) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 0.58 && ar <= 0.93) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 0.93 && ar <= 1.33) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 1.33 && ar <= 2.01) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 2.01 && ar <= 2.70) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 2.70 && ar <= 3.40) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 3.40 && ar <= 4.65) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3450 && tot <= 3500 && ar > 4.65 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3400 && tot <= 3450 && ar <=0.33) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 0.33 && ar <= 0.58) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 0.58 && ar <= 0.93) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 0.93 && ar <= 1.33) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 1.33 && ar <= 2.01) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 2.01 && ar <= 2.70) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 2.70 && ar <= 3.40) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 3.40 && ar <= 4.65) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3400 && tot <= 3450 && ar > 4.65 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }


        }

        public void fun7()
        {
            if (tot > 3500 && tot <= 3550 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3500 && tot <= 3550 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3550 && tot <= 3600 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3550 && tot <= 3600 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3600 && tot <= 3650 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3600 && tot <= 3650 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3650 && tot <= 3700 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3650 && tot <= 3700 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3700 && tot <= 3750 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3700 && tot <= 3750 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3750 && tot <= 3800 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3750 && tot <= 3800 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3800 && tot <= 3850 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3800 && tot <= 3850 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3850 && tot <= 3900 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3850 && tot <= 3900 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 3900 && tot <= 3950 && ar <=0.30) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 0.33 && ar <= 0.54) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 0.54 && ar <= 0.85) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 0.85 && ar <= 1.22) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 1.22 && ar <= 1.84) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 1.84 && ar <= 2.47) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 2.47 && ar <= 3.12) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 3.12 && ar <= 4.25) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3900 && tot <= 3950 && ar > 4.25 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

        }
        public void fun8()
        {

            if (tot > 3950 && tot <= 4000 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 3950 && tot <= 4000 && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 4000 && tot <= 4050 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4000 && tot <= 4050 && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 4050 && tot <= 4100 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4050 && tot <= 4100 && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 4100 && tot <= 4150 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4100 && tot <= 4150 && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 4150 && tot <= 4200 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4150 && tot <= 4200 && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 4200 && tot <= 4250 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4200 && tot <= 4250 && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }

            if (tot > 4250 && tot <= 4300 && ar <=0.27) {
                tit = 3;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 0.27 && ar <= 0.48) {
                tit = 4;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 0.48 && ar <= 0.74) {
                tit = 5;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 0.74 && ar <= 1.07) {
                tit = 6;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 1.07 && ar <= 1.61) {
                tit = 8;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 1.61 && ar <= 2.25) {
                tit = 10;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 2.25 && ar <= 2.84) {
                tit = 12;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300 && ar > 2.84 && ar <= 3.87) {
                tit = 15;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
            if (tot > 4250 && tot <= 4300  && ar > 3.84 && ar <= 10) {
                tit = 19;
                Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);

            }
                  }

        public void fun9()
             {
                 if (tot > 4300 && tot <= 4350 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350 && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4300 && tot <= 4350  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4350 && tot <= 4400  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4400 && tot <= 4450 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450   && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450   && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450   && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450   && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450   && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450  && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4400 && tot <= 4450   && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4450 && tot <= 4500  && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4450 && tot <= 4500  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4500 && tot <= 4550 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550   && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550   && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550   && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550   && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550   && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550  && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4500 && tot <= 4550   && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4550 && tot <= 4600  && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4550 && tot <= 4600  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4600 && tot <= 4650 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650 && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4600 && tot <= 4650  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4650 && tot <= 4700 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4650 && tot <= 4700  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4700 && tot <= 4750 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4700 && tot <= 4750  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4750 && tot <= 4800 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4750 && tot <= 4800  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4800 && tot <= 4850 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4800 && tot <= 4850  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4850 && tot <= 4900 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4850 && tot <= 4900  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                 if (tot > 4900 && tot <= 4950 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4900 && tot <= 4950  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }


                 if (tot > 4950 && tot <= 5000 && ar <=0.24) {
                     tit = 3;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 0.24 && ar <= 0.44) {
                     tit = 4;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 0.44 && ar <= 0.69) {
                     tit = 5;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 0.69 && ar <= 0.99) {
                     tit = 6;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 0.99 && ar <= 1.50) {
                     tit = 8;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 1.50 && ar <= 2.01) {
                     tit = 10;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 2.01 && ar <= 2.54) {
                     tit = 12;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000 && ar > 2.54 && ar <= 3.47) {
                     tit = 15;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }
                 if (tot > 4950 && tot <= 5000  && ar > 3.47 && ar <= 8) {
                     tit = 19;
                     Intent i = new Intent(Main9Activity.this, Main15Activity.class);

                     i.putExtra("c", c);
                     i.putExtra("d", d);
                     i.putExtra("area", area);
                     i.putExtra("ar", ar);
                     i.putExtra("pos", pos);
                     i.putExtra("tot", tot);
                     i.putExtra("gla", gla);
                     i.putExtra("tit", tit);

                     startActivity(i);

                 }

                     }



//laminated Glass
    public void fun10() {

        if (tot <= 500 && ar <= 4.47) {
            tit = (float) 5.28;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 4.47 && ar <= 6.28) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 6.28 && ar <= 10.45) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 10.45 && ar <=14.02) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot <= 500 && ar > 14.02 && ar <= 15) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 500 && tot <= 550 && ar <= 4.06) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 4.06 && ar <= 5.71) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 5.71 && ar <= 9.50) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 9.50 && ar <= 12.75) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 12.75 && ar <= 15) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 500 && tot <= 550 && ar > 15 ) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 550 && tot <= 600 && ar <= 3.72) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 3.72 && ar <= 5.23) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 5.23 && ar <= 8.71) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 8.71 && ar <= 11.69) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 11.69 && ar <= 15.00) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 550 && tot <= 600 && ar > 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 600 && tot <= 650 && ar <= 3.44) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 3.44 && ar <= 4.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 4.83 && ar <= 8.04) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 8.04 && ar <= 10.79) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 10.79 && ar <= 13.93) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 600 && tot <= 650 && ar > 13.93 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 650 && tot <= 700 && ar <= 3.19) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 3.19 && ar <= 4.48) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 4.48 && ar <= 7.46) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 7.46 && ar <= 10.02) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 10.02 && ar <= 12.94) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 650 && tot <= 700 && ar > 12.94 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }



    }


    public void fun11() {
        if (tot > 700 && tot <= 750 && ar <= 2.98) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 2.98 && ar <= 4.19) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 4.19 && ar <= 6.97) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 6.97 && ar <= 9.35) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 9.35 && ar <= 12.08) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 700 && tot <= 750 && ar > 12.08 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 750 && tot <= 800 && ar <= 2.98) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 2.98 && ar <= 4.19) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 4.19 && ar <= 6.97) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 6.97 && ar <= 9.35) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 9.35 && ar <= 12.08) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 750 && tot <= 800 && ar > 12.08 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

////start
        if (tot > 800 && tot <= 850 && ar <= 2.63) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 2.63 && ar <= 3.69) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 3.69 && ar <= 6.15) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 6.15 && ar <= 8.25) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 8.25 && ar <= 10.50) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 800 && tot <= 850 && ar > 10.50 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 850 && tot <= 900 && ar <= 2.63) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 2.63 && ar <= 3.69) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 3.69 && ar <= 6.15) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 6.15 && ar <= 8.25) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 8.25 && ar <= 10.50) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 850 && tot <= 900 && ar > 10.50 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

    }

    public void fun12()
    {

        if (tot > 900 && tot <= 950 && ar <= 2.50) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 2.50 && ar <= 3.50) {
            tit = (float) 6.35;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 3.50 && ar <= 5.90) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 5.90 && ar <= 7.80) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 7.80 && ar <= 10.10) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 900 && tot <= 950 && ar > 10.10 && ar <= 15.00) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 950 && tot <= 1000 && ar <= 2.23) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 2.23 && ar <= 3.15) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 3.15 && ar <= 5.25) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 5.25 && ar <= 7.05) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 7.05 && ar <= 9.10) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 950 && tot <= 1000 && ar > 9.10 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 1000 && tot <= 1050 && ar <= 2.15) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 2.15 && ar <= 3.00) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 3.00 && ar <= 5.00) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 5.00 && ar <= 6.70) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 6.70 && ar <= 8.65) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1000 && tot <= 1050 && ar > 8.65 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 1050 && tot <= 1100 && ar <= 2.13) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 2.13 && ar <= 2.99) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 2.99 && ar <= 4.98) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 4.98 && ar <= 6.68) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 6.68 && ar <= 8.63) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1050 && tot <= 1100 && ar > 8.63 && ar <= 12.18) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

    }

    public void fun13()
    {
        if (tot > 1100 && tot <= 1150 && ar <= 1.94) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 1.94 && ar <= 2.73) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 2.73 && ar <= 4.54) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 4.54 && ar <= 6.10) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 6.10 && ar <= 7.88) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1100 && tot <= 1150 && ar > 7.88 && ar <= 12.00) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 1150 && tot <= 1200 && ar <= 1.86) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 1.86 && ar <= 2.62) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 2.62 && ar <= 4.35) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 4.35 && ar <= 5.84) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 5.84 && ar <= 7.55) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1150 && tot <= 1200 && ar > 7.55 && ar <= 10.66) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 1200 && tot <= 1250 && ar <= 1.79) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 1.79 && ar <= 2.51) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 2.51 && ar <= 4.18) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 4.18 && ar <= 5.61) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 5.61 && ar <= 7.25) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1200 && tot <= 1250 && ar > 7.25 && ar <= 15.00) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

    }
    public void fun14 ()
    {
        if (tot > 1250 && tot <= 1300 && ar <= 1.72) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 1.72 && ar <= 2.41) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 2.41 && ar <= 4.02) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 4.02 && ar <= 5.39) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 5.39 && ar <= 6.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1250 && tot <= 1300 && ar > 6.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 1300 && tot <= 1350 && ar <= 1.66 ) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 1.66 && ar <= 2.33) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 2.33 && ar <= 3.87) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 3.87 && ar <= 5.19) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 5.19 && ar <= 6.71) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1300 && tot <= 1350 && ar > 6.71 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 1350 && tot <= 1400 && ar <= 1.66 ) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 1.66 && ar <= 2.33) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 2.33 && ar <= 3.87) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 3.87 && ar <= 5.19) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 5.19 && ar <= 6.71) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 1350 && tot <= 1400 && ar > 6.71 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

    }
    public void fun15() {


        if (tot > 3050 && tot <= 3100 && ar <= 0.78) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 3050 && tot <= 3100 && ar > 0.78 && ar <= 1.10) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 1.10 && ar <= 1.83) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 1.83 && ar <= 2.46) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 2.46 && ar <= 3.18) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3050 && tot <= 3100 && ar > 3.18 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3100 && tot <= 3150 && ar <= 0.78) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 3100 && tot <= 3150 && ar > 0.78 && ar <= 1.10) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 1.10 && ar <= 1.83) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 1.83 && ar <= 2.46) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 2.46 && ar <= 3.18) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3100 && tot <= 3150 && ar > 3.18 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 3150 && tot <= 3200 && ar <= 0.78) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 3150 && tot <= 3200 && ar > 0.78 && ar <= 1.10) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 1.10 && ar <= 1.83) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 1.83 && ar <= 2.46) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200&& ar > 2.46 && ar <= 3.18) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3150 && tot <= 3200 && ar > 3.18 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3200 && tot <= 3250 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3200 && tot <= 3250 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

    }
    public void fun16()
    {

        if (tot > 3250 && tot <= 3300 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3250 && tot <= 3300 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3250 && tot <= 3300 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3250 && tot <= 3300 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3250 && tot <= 3300 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3250 && tot <= 3300 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3300 && tot <= 3350 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3300 && tot <= 3350 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3300 && tot <= 3350 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3300 && tot <= 3350 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3300 && tot <= 3350 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3300 && tot <= 3350 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 3350 && tot <= 3400&& ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3350 && tot <= 3400 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3350 && tot <= 3400 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3350 && tot <= 3400 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3350 && tot <= 3400 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3350 && tot <= 3400 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3400 && tot <= 3450 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3400 && tot <= 3450 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3400 && tot <= 3450&& ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3400 && tot <= 3450 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3400 && tot <= 3450 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3400 && tot <= 3450 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3450 && tot <= 3500 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3450 && tot <= 3500 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3450 && tot <= 3500 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3450 && tot <= 3500 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3450 && tot <= 3500 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3450 && tot <= 3500 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }



    }

    public void fun17()
    {
        if (tot > 3500 && tot <= 3550 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3500 && tot <= 3550 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3500 && tot <= 3550 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3500 && tot <= 3550 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3500 && tot <= 3550 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3500 && tot <= 3550 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3550 && tot <= 3600 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3550 && tot <= 3600 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3550 && tot <= 3600 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3550 && tot <= 3600 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3550 && tot <= 3600 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3550 && tot <= 3600 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3600 && tot <= 3650 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3600 && tot <= 3650 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3600 && tot <= 3650 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3600 && tot <= 3650 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3600 && tot <= 3650 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3600 && tot <= 3650 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3650 && tot <= 3700 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3650 && tot <= 3700 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3650 && tot <= 3700 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3650 && tot <= 3700 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3650 && tot <= 3700 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3650 && tot <= 3700 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3700 && tot <= 3750 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3700 && tot <= 3750 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3700 && tot <= 3750 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3700 && tot <= 3750 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3700 && tot <= 3750 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3700 && tot <= 3750 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3750 && tot <= 3800 && ar < 0.69) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3750 && tot <= 3800 && ar > 0.69 && ar <= 0.97) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3750 && tot <= 3800 && ar > 0.97 && ar <= 1.61) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3750 && tot <= 3800 && ar > 1.61 && ar <= 2.16) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3750 && tot <= 3800 && ar > 2.16 && ar <= 2.79) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3750 && tot <= 3800 && ar > 2.79 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3800 && tot <= 3850 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3800 && tot <= 3850 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3800 && tot <= 3850 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3800 && tot <= 3850 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3800 && tot <= 3850 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3800 && tot <= 3850  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3850 && tot <= 3900 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3850 && tot <= 3900 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3850 && tot <= 3900 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3850 && tot <= 3900 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3850 && tot <= 3900 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3850 && tot <= 3900  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 3900 && tot <= 3950 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3900 && tot <= 3950 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3900 && tot <= 3950 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3900 && tot <= 3950 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3900 && tot <= 3950 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3900 && tot <= 3950  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


    }
    public void fun18()
    {

        if (tot > 3950 && tot <= 4000 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3950 && tot <= 4000 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3950 && tot <= 4000 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3950 && tot <= 4000 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3950 && tot <= 4000 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 3950 && tot <= 4000  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4000 && tot <= 4050 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4000 && tot <= 4050 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4000 && tot <= 4050 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4000 && tot <= 4050 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4000 && tot <= 4050 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4000 && tot <= 4050  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4050 && tot <= 4100 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4050 && tot <= 4100 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4050 && tot <= 4100 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4050 && tot <= 4100 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4050 && tot <= 4100 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4050 && tot <= 4100  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4100 && tot <= 4150 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4100 && tot <= 4150 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4100 && tot <= 4150 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4100 && tot <= 4150 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4100 && tot <= 4150 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4100 && tot <= 4150  && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4150 && tot <= 4200&& ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4150 && tot <= 4200 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4150 && tot <= 4200 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4150 && tot <= 4200 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4150 && tot <= 4200 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4150 && tot <= 4200 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4200 && tot <= 4250 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4200 && tot <= 4250 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4200 && tot <= 4250 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4200 && tot <= 4250 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4200 && tot <= 4250 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4200 && tot <= 4250 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 4250 && tot <= 4300 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4250 && tot <= 4300 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4250 && tot <= 4300 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4250 && tot <= 4300 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4250 && tot <= 4300 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4250 && tot <= 4300 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

    }

    public void fun19()
    {
        if (tot > 4300 && tot <= 4350 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4300 && tot <= 4350 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4300 && tot <= 4350 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4300 && tot <= 4350 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4300 && tot <= 4350 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4300 && tot <= 4350 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

         if (tot > 4350 && tot <= 4400 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4350 && tot <= 4400 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4350 && tot <= 4400 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4350 && tot <= 4400 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4350 && tot <= 4400 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4350 && tot <= 4400 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

         if (tot > 4400 && tot <= 4450 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4400 && tot <= 4450 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4400 && tot <= 4450 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4400 && tot <= 4450 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4400 && tot <= 4450 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4400 && tot <= 4450 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4450 && tot <= 4500 && ar < 0.59) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4450 && tot <= 4500 && ar > 0.59 && ar <= 0.83) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4450 && tot <= 4500 && ar > 0.83 && ar <= 1.38) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4450 && tot <= 4500 && ar > 1.38 && ar <= 1.85) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4450 && tot <= 4500 && ar > 1.85 && ar <= 2.38) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4450 && tot <= 4500 && ar > 2.38 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4500 && tot <= 4550 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4500 && tot <= 4550  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4500 && tot <= 4550   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4500 && tot <= 4550   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4500 && tot <= 4550   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4500 && tot <= 4550   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4550 && tot <= 4600 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4550 && tot <= 4600  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4550 && tot <= 4600   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4550 && tot <= 4600   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4550 && tot <= 4600   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4550 && tot <= 4600   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 4600 && tot <= 4650 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4600 && tot <= 4650  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4600 && tot <= 4650   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4600 && tot <= 4650   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4600 && tot <= 4650   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4600 && tot <= 4650   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }

        if (tot > 4650 && tot <= 4700 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4650 && tot <= 4700  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4650 && tot <= 4700   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4650 && tot <= 4700   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4650 && tot <= 4700   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4650 && tot <= 4700   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4700 && tot <= 4750 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4700 && tot <= 4750  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4700 && tot <= 4750   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4700 && tot <= 4750   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4700 && tot <= 4750   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4700 && tot <= 4750   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4750 && tot <= 4800 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4750 && tot <= 4800  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4750 && tot <= 4800   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4750 && tot <= 4800   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4750 && tot <= 4800   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4750 && tot <= 4800   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4800 && tot <= 4850 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4800 && tot <= 4850  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4800 && tot <= 4850   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4800 && tot <= 4850   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4800 && tot <= 4850   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4800 && tot <= 4850   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4850 && tot <= 4900 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4850 && tot <= 4900  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4850 && tot <= 4900   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4850 && tot <= 4900   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4850 && tot <= 4900   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4850 && tot <= 4900   && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


        if (tot > 4900 && tot <= 4950 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4900 && tot <= 4950  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4900 && tot <= 4950   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4900 && tot <= 4950   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4900 && tot <= 4950   && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4900 && tot <= 4950  && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }



        if (tot > 4950 && tot <= 5000 && ar <=0.49) {
            tit = (float) 5.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4950 && tot <= 5000  && ar > 0.49 && ar <= 0.68) {
            tit = (float) 6.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4950 && tot <= 5000   && ar > 0.68 && ar <= 1.12) {
            tit = (float) 8.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4950 && tot <= 5000   && ar > 1.12 && ar <= 1.52) {
            tit = (float) 10.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4950 && tot <= 5000  && ar > 1.52 && ar <= 1.97) {
            tit = (float) 12.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }
        if (tot > 4950 && tot <= 5000  && ar > 1.97 && ar <= 15) {
            tit = (float) 16.38;
            Intent i = new Intent(Main9Activity.this, Main15Activity.class);

            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("ar", ar);
            i.putExtra("pos", pos);
            i.putExtra("tot", tot);
            i.putExtra("gla", gla);
            i.putExtra("tit", tit);

            startActivity(i);

        }


    }

public void fun20()
{
    if (tot > 1400 && tot <= 1450 &&  ar <= 1.54) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("f",f);
        i.putExtra("t",t);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1400 && tot <= 1450 && ar > 1.54 && ar <= 2.16) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1400 && tot <= 1450 && ar > 2.16 && ar <= 3.60) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1400 && tot <= 1450 && ar > 3.60 && ar <= 4.84) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1400 && tot <= 1450 && ar > 4.84 && ar <= 6.25) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1400 && tot <= 1450 && ar > 6.25 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    


    if (tot > 1450 && tot <= 1500 && ar <= 1.49) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1450 && tot <= 1500 && ar > 1.49 && ar <=2.09) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1450 && tot <= 1500 && ar > 2.09 && ar <= 3.48) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1450 && tot <= 1500 && ar > 3.48 && ar <= 4.67) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1450 && tot <= 1500 && ar > 4.67 && ar <= 6.04) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1450 && tot <= 1500 && ar > 6.04 && ar <= 15.00) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 1500 && tot <= 1550 && ar <= 1.49) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1500 && tot <= 1550 && ar > 1.49 && ar <=2.09) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1500 && tot <= 1550 && ar > 2.09 && ar <= 3.48) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1500 && tot <= 1550 && ar > 3.48 && ar <= 4.67) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1500 && tot <= 1550 && ar > 4.67 && ar <= 6.04) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1500 && tot <= 1550 && ar > 6.04 && ar <= 15.00) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 1550 && tot <= 1600 && ar <= 1.49) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1550 && tot <= 1600 && ar > 1.49 && ar <=2.09) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1550 && tot <= 1600 && ar > 2.09 && ar <= 3.48) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1550 && tot <= 1600 && ar > 3.48 && ar <= 4.67) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1550 && tot <= 1600 && ar > 4.67 && ar <= 6.04) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1550 && tot <= 1600 && ar > 6.04 && ar <= 15.00) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 1600 && tot <= 1650 && ar > 1.35) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 1600 && tot <= 1650 && ar > 1.35 && ar <= 1.90) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1600 && tot <= 1650 && ar > 1.90 && ar <= 3.17) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1600 && tot <= 1650 && ar > 3.17 && ar <= 4.25) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1600 && tot <= 1650 && ar > 4.25 && ar <= 5.66) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1600 && tot <= 1650 && ar > 5.66 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 1650 && tot <= 1700 && ar > 1.35) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 1650 && tot <= 1700 && ar > 1.35 && ar <= 1.90) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1650 && tot <= 1700 && ar > 1.90 && ar <= 3.17) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1650 && tot <= 1700 && ar > 3.17 && ar <= 4.25) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1650 && tot <= 1700 && ar > 4.25 && ar <= 5.66) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1650 && tot <= 1700 && ar > 5.66 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 1700 && tot <= 1750 && ar > 1.28 ) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1700 && tot <= 1750 && ar > 1.28 && ar <= 1.79) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1700 && tot <= 1750 && ar > 1.79 && ar <= 2.99) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1700 && tot <= 1750 && ar > 2.99 && ar <= 4.01) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1700 && tot <= 1750 && ar > 4.01 && ar <= 5.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1700 && tot <= 1750 && ar > 5.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }




    if (tot > 1750 && tot <= 1800 && ar > 1.28 ) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1750 && tot <= 1800 && ar > 1.28 && ar <= 1.79) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1750 && tot <= 1800 && ar > 1.79 && ar <= 2.99) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1750 && tot <= 1800 && ar > 2.99 && ar <= 4.01) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1750 && tot <= 1800 && ar > 4.01 && ar <= 5.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1750 && tot <= 1800 && ar > 5.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }




    if (tot > 1800 && tot <= 1850 && ar > 1.28 ) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1800 && tot <= 1850 && ar > 1.28 && ar <= 1.79) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1800 && tot <= 1850 && ar > 1.79 && ar <= 2.99) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1800 && tot <= 1850 && ar > 2.99 && ar <= 4.01) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1800 && tot <= 1850 && ar > 4.01 && ar <= 5.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1800 && tot <= 1850 && ar > 5.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 1850 && tot <= 1900 &&  ar <= 1.18) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1850 && tot <= 1900 && ar > 1.18 && ar <= 1.65) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1850 && tot <= 1900 && ar > 1.65 && ar <= 2.75) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1850 && tot <= 1900 && ar > 2.75 && ar <= 3.69) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1850 && tot <= 1900 && ar > 3.69 && ar <=4.77 ) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1850 && tot <= 1900 && ar > 4.77 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 1900 && tot <= 1950 &&  ar <= 1.18) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1900 && tot <= 1950 && ar > 1.18 && ar <= 1.65) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1900 && tot <= 1950 && ar > 1.65 && ar <= 2.75) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1900 && tot <= 1950 && ar > 2.75 && ar <= 3.69) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1900 && tot <= 1950 && ar > 3.69 && ar <=4.77 ) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1900 && tot <= 1950 && ar > 4.77 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }





    if (tot > 1950 && tot <= 2000 &&  ar <= 1.18) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1950 && tot <= 2000 && ar > 1.18 && ar <= 1.65) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1950 && tot <= 2000 && ar > 1.65 && ar <= 2.75) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1950 && tot <= 2000 && ar > 2.75 && ar <= 3.69) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1950 && tot <= 2000 && ar > 3.69 && ar <=4.77 ) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 1950 && tot <= 2000 && ar > 4.77 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }




    if (tot > 2000 && tot <= 2050 && ar <= 1.09) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2000 && tot <= 2050 && ar > 1.09 && ar <=1.53) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2000 && tot <= 2050 && ar > 1.53 && ar <= 2.55) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2000 && tot <= 2050 && ar > 2.55 && ar <= 3.42) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2000 && tot <= 2050 && ar > 3.42 && ar <= 4.42) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2000 && tot <= 2050 && ar > 4.42 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2050 && tot <= 2100 && ar <= 1.09) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2050 && tot <= 2100 && ar > 1.09 && ar <=1.53) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2050 && tot <= 2100 && ar > 1.53 && ar <= 2.55) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2050 && tot <= 2100 && ar > 2.55 && ar <= 3.42) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2050 && tot <= 2100 && ar > 3.42 && ar <= 4.42) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2050 && tot <= 2100 && ar > 4.42 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2100 && tot <= 2150 && ar <= 1.09) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2100 && tot <= 2150 && ar > 1.09 && ar <=1.53) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2100 && tot <= 2150 && ar > 1.53 && ar <= 2.55) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2100 && tot <= 2150 && ar > 2.55 && ar <= 3.42) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2100 && tot <= 2150 && ar > 3.42 && ar <= 4.42) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2100 && tot <= 2150 && ar > 4.42 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2150 && tot <= 2200 && ar <= 1.09) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2150 && tot <= 2200 && ar > 1.09 && ar <=1.53) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2150 && tot <= 2200 && ar > 1.53 && ar <= 2.55) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2150 && tot <= 2200 && ar > 2.55 && ar <= 3.42) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2150 && tot <= 2200 && ar > 3.42 && ar <= 4.42) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2150 && tot <= 2200 && ar > 4.42 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2200 && tot <= 2250 && ar <= 0.99) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2200 && tot <= 2250 && ar > 0.99 && ar <= 1.40) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2200 && tot <= 2250 && ar > 1.37 && ar <= 2.32) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2200 && tot <= 2250 && ar > 2.32 && ar <= 3.12) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2200 && tot <= 2250 && ar > 3.12 && ar <= 4.03) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2200 && tot <= 2250 && ar > 4.03 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2250 && tot <= 2300 && ar <= 0.99) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2250 && tot <= 2300 && ar > 0.99 && ar <= 1.40) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2250 && tot <= 2300 && ar > 1.37 && ar <= 2.32) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2250 && tot <= 2300 && ar > 2.32 && ar <= 3.12) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2250 && tot <= 2300 && ar > 3.12 && ar <= 4.03) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2250 && tot <= 2300 && ar > 4.03 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2300 && tot <= 2350 && ar <= 0.99) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2300 && tot <= 2350 && ar > 0.99 && ar <= 1.40) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2300 && tot <= 2350 && ar > 1.37 && ar <= 2.32) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2300 && tot <= 2350 && ar > 2.32 && ar <= 3.12) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2300 && tot <= 2350 && ar > 3.12 && ar <= 4.03) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2300 && tot <= 2350 && ar > 4.03 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2350 && tot <= 2400 && ar <= 0.99) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2350 && tot <= 2400 && ar > 0.99 && ar <= 1.40) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2350 && tot <= 2400 && ar > 1.37 && ar <= 2.32) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2350 && tot <= 2400 && ar > 2.32 && ar <= 3.12) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2350 && tot <= 2400 && ar > 3.12 && ar <= 4.03) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2350 && tot <= 2400 && ar > 4.03 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2400 && tot <= 2450 && ar <= 0.99) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2400 && tot <= 2450 && ar > 0.99 && ar <= 1.40) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2400 && tot <= 2450 && ar > 1.37 && ar <= 2.32) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2400 && tot <= 2450 && ar > 2.32 && ar <= 3.12) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2400 && tot <= 2450 && ar > 3.12 && ar <= 4.03) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2400 && tot <= 2450 && ar > 4.03 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2450 && tot <= 2500 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2450 && tot <= 2500 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2450 && tot <= 2500 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2450 && tot <= 2500 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2450 && tot <= 2500 && ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2450 && tot <= 2500 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2500 && tot <= 2550 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2500 && tot <= 2550 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2500 && tot <= 2550 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2500 && tot <= 2550 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2500 && tot <= 2550 && ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2500 && tot <= 2550 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2550 && tot <= 2600 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2550 && tot <= 2600 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2550 && tot <= 2600 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2550 && tot <= 2600 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2550 && tot <= 2600&& ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2550 && tot <= 2600 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2600 && tot <= 2650 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2600 && tot <= 2650 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2600 && tot <= 2650 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2600 && tot <= 2650 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2600 && tot <= 2650&& ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2600 && tot <= 2650 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2650 && tot <= 2700 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2650 && tot <= 2700 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2650 && tot <= 2700 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2650 && tot <= 2700 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2650 && tot <= 2700&& ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2650 && tot <= 2700 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2700 && tot <= 2750 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2700 && tot <= 2750 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2700 && tot <= 2750 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2700 && tot <= 2750 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2700 && tot <= 2750 && ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2700 && tot <= 2750 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2750 && tot <= 2800 && ar <= 0.89) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2750 && tot <= 2800 && ar > 0.89 && ar <= 1.26) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2750 && tot <= 2800 && ar > 1.26 && ar <= 2.09) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2750 && tot <= 2800 && ar > 2.09 && ar <= 2.80) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2750 && tot <= 2800 && ar > 2.80 && ar <= 3.62) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2750 && tot <= 2800 && ar > 3.62 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2800 && tot <= 2850 && ar <= 0.78) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2800 && tot <= 2850 && ar > 0.78 && ar <= 1.10) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2800 && tot <= 2850 && ar > 1.10 && ar <= 1.83) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2800 && tot <= 2850 && ar > 1.83 && ar <= 2.46) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2800 && tot <= 2850 && ar > 2.46 && ar <= 3.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2800 && tot <= 2850 && ar > 3.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2850 && tot <= 2900 && ar <= 0.78) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2850 && tot <= 2900 && ar > 0.78 && ar <= 1.10) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2850 && tot <= 2900 && ar > 1.10 && ar <= 1.83) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2850 && tot <= 2900 && ar > 1.83 && ar <= 2.46) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2850 && tot <= 2900 && ar > 2.46 && ar <= 3.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2850 && tot <= 2900 && ar > 3.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }



    if (tot > 2900 && tot <= 2950 && ar <= 0.78) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2900 && tot <= 2950 && ar > 0.78 && ar <= 1.10) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2900 && tot <= 2950 && ar > 1.10 && ar <= 1.83) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2900 && tot <= 2950 && ar > 1.83 && ar <= 2.46) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2900 && tot <= 2950 && ar > 2.46 && ar <= 3.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2900 && tot <= 2950 && ar > 3.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }


    if (tot > 2950 && tot <= 3000 && ar <= 0.78) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 2950 && tot <= 3000 && ar > 0.78 && ar <= 1.10) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2950 && tot <= 3000 && ar > 1.10 && ar <= 1.83) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2950 && tot <= 3000 && ar > 1.83 && ar <= 2.46) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2900 && tot <= 2950 && ar > 2.46 && ar <= 3.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 2950 && tot <= 3000 && ar > 3.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }




    if (tot > 3000 && tot <= 3050 && ar <= 0.78) {
        tit = (float) 5.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }

    if (tot > 3000 && tot <= 3050 && ar > 0.78 && ar <= 1.10) {
        tit = (float) 6.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 3000 && tot <= 3050 && ar > 1.10 && ar <= 1.83) {
        tit = (float) 8.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 3000 && tot <= 3050 && ar > 1.83 && ar <= 2.46) {
        tit = (float) 10.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 3000 && tot <= 3050 && ar > 2.46 && ar <= 3.18) {
        tit = (float) 12.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
        i.putExtra("area", area);
        i.putExtra("ar", ar);
        i.putExtra("pos", pos);
        i.putExtra("tot", tot);
        i.putExtra("gla", gla);
        i.putExtra("tit", tit);

        startActivity(i);

    }
    if (tot > 3000 && tot <= 3050 && ar > 3.18 && ar <= 15) {
        tit = (float) 16.38;
        Intent i = new Intent(Main9Activity.this, Main15Activity.class);

        i.putExtra("c", c);
        i.putExtra("d", d);
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