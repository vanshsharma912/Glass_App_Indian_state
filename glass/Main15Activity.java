

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main15Activity extends AppCompatActivity {
    float c;
    float d;
    float area;
    int pos;
    float ar, ar1;
    float f, t, floor1, k1, k2, tot, k3, k4, gla, tit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        c = getIntent().getFloatExtra("c", 0);
        d = getIntent().getFloatExtra("d", 0);
        f = getIntent().getFloatExtra("f", 0);
        t = getIntent().getFloatExtra("t", 0);
        area = getIntent().getFloatExtra("area", 0);
        ar = getIntent().getFloatExtra("ar", 0);
        floor1 = getIntent().getFloatExtra("floor1", 0);
        tot = getIntent().getFloatExtra("tot", 0);
        tit = getIntent().getFloatExtra("tit", 0);
        gla = getIntent().getFloatExtra("gla", 0);
        k1 = getIntent().getFloatExtra("k1", 0);
        pos = getIntent().getIntExtra("pos", 0);
        TextView t14 = (TextView) findViewById(R.id.textView14);
        TextView t16 = (TextView) findViewById(R.id.textView16);
        TextView t166 = (TextView) findViewById(R.id.textView166);
        String lumen1 = Float.toString(ar);
        t14.setText(lumen1);
        String lumen2 = Float.toString(tit);
        t16.setText(lumen2);
        String lumen3 = Float.toString(tot);
        t166.setText(lumen3);
        init();

    }

    public void init()
    {
        Button b1=(Button)findViewById(R.id.button8);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(Main15Activity.this,Main19Activity.class);
                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("pos", pos);
                i.putExtra("tot", tot);
                i.putExtra("gla", gla);
                i.putExtra("tit", tit);

                startActivity(i);
            }
        });

    }
}
