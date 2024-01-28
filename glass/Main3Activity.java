

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    float c;
    float d;
    float area;
    int num,pos;
    String[] CLIMATE = {"Recommended Window Area","User Defined Window Area"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, CLIMATE);
        ListView l1 = (ListView) findViewById(R.id.listView);
        l1.setAdapter((ListAdapter) adapter);
        l1.setOnItemClickListener(this);
        c = getIntent().getFloatExtra("c",0);

        //area = getIntent().getFloatExtra("area",0);
        pos= getIntent().getIntExtra("pos",0);
    }
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        if (position == 0) {

            Intent i = new Intent(Main3Activity.this, Main4Activity.class);
             d= (float) 3.3;
            i.putExtra("c", c);
            i.putExtra("d", d);
            //i.putExtra("area", area);
            //i.putExtra("num", num);
            i.putExtra("pos", pos);


            startActivity(i);


        }


        if (position == 1) {


            Intent i = new Intent(Main3Activity.this, Main5Activity.class);
            d= (float) 3.3;
            i.putExtra("c", c);
            i.putExtra("d", d);
            //i.putExtra("area", area);
            //i.putExtra("num", num);
            i.putExtra("pos", pos);
            // i.putExtra("watt",watt);

            startActivity(i);

        }
    }
}
