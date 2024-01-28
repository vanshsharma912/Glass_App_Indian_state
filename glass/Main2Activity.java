

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    float c;
    float d;
    float area;
    int num,pos;
    String[] CLIMATE = {"Agra Wind Zone(IV)","Ahemdabad Wind Zone(II)","Ajmer Wind Zone(IV)","Almora Wind Zone(IV)",
            "Amritsar Wind Zone(IV)", "Asansol Wind Zone(IV)","Aurangabad Wind Zone(II)",
            "Bahraich Wind Zone(IV)","Bangalore Wind Zone(I)","Barauni Wind Zone(IV)",
            "Bareilly Wind Zone(IV)","Bhatinda Wind Zone(IV)","Bhilai Wind Zone(II)",
            "Bhopal Wind Zone(II)","Bhubneshwar Wind Zone(V)", "Bhuj","Bikaner Wind Zone(IV)",
            "Bokaro Wind Zone(IV)","Bombay Wind Zone(III)","Calcutta Wind Zone(V)","Calicut Wind Zone(II)",
            "Chandigarh Wind Zone(IV)","Coimbatore Wind Zone(II)","Cuttack Wind Zone(V)","Derbhanga Wind Zone(VI)",
            "Darjleeing Wind Zone(IV)", "Dehradun Wind Zone(IV)","Delhi Wind Zone(IV)","Durgapur Wind Zone(IV)",
            "Gangtok Wind Zone(IV)","Gauhali Wind Zone(V)","Gaya Wind Zone(II)","Gorakhpur Wind Zone(IV)",
            "Hyderabad Wind Zone(III)","Imphal Wind Zone(III)","Jabalpur Wind Zone(IV)","Jaipur Wind Zone(IV)","Jamshedpur Wind Zone(IV)",
            "Jhasi Wind Zone(IV)", "Jodhpur Wind Zone(IV)","Kanpur Wind Zone(IV)","Kohima Wind Zone(III)","Karnool Wind Zone(II)","Lakshadweep Wind Zone(II)",
            "Lucknow Wind Zone(IV)","Ludhiyana Wind Zone(IV)","Chennai Wind Zone(V)","Madurai Wind Zone(II)","Mandi Wind Zone(II)",
            "Mangalore Wind Zone(II)","Moradabad Wind Zone(IV)","Mysore Wind Zone(I)","Nagpur Wind Zone(III)","Nanital Wind Zone(IV)",
            "Nasik Wind Zone(II)", "Nellore Wind Zone(V)","Panjim Wind Zone(II)","Patiyala Wind Zone(IV)","Patna Wind Zone(IV)",
            "Pondicherry Wind Zone(V)","Port Blair Wind Zone(III)","Pune Wind Zone(II)","Rajkot Wind Zone(II)",
            "Raipur Wind Zone(II)","Ranchi Wind Zone(II)", "Roorkee Wind Zone(II)","Rourkela Wind Zone(II)",
            "Simla Wind Zone(II)", "Srinagar","Surat Wind Zone(III)","Tiruchchirrappalli Wind Zone(IV)",
            "Trivandrum Wind Zone(II)", "Udaipur Wind Zone(IV)", "Vadodara Wind Zone(III)",
            "Varanasi Wind Zone(IV)","Vijayawada Wind Zone(V)","Vishakapatnam Wind Zone(V)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, CLIMATE);
        ListView l1 = (ListView) findViewById(R.id.listView);
        l1.setAdapter((ListAdapter) adapter);
        l1.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        if (position == 0) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);


        }


        if (position == 1) {


            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);
            // i.putExtra("watt",watt);

            startActivity(i);

        }
        if (position == 2)

        {
            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            //   i.putExtra("p",p);
            startActivity(i);


        }
        if (position == 3)

        {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }

        if (position == 4) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 5) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 6) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 7) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 33;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 8) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 33;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 9) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        } if (position == 10) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 11) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 12) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 13) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 14) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 15) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 16) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 17) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 18) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 19) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 20) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 21) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 22) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 23) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 55;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 24) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 25) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 26) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 27) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 28) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 29) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 30) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 31) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 32) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 33) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 34) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 35) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 36) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 37) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 38) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 39) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 40) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 41) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 42) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 43) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 44) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 45) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 46) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            d=35;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 47) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 48) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 49) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 33;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 50) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 51) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 52) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 53) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 54) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 55) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 56) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 57) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 58) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 59) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 60) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 61) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 62) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 63) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 64) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            c= 45;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 65) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 66) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 67) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 68) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 69) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 70) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 39;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 71) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 72) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 44;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 73) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 47;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 74) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }
        if (position == 75) {

            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            pos = 50;
            i.putExtra("c", c);
            i.putExtra("d", d);
            i.putExtra("area", area);
            i.putExtra("num", num);
            i.putExtra("pos", pos);

            startActivity(i);

        }


    }
}

