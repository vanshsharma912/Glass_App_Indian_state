

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    float c;
    float d;
    float area;
    int pos;
    float ar, ar1;
    float f, t, floor1, k1, k2, tot, k3, k4, gla, tit,hig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        c = getIntent().getFloatExtra("c", 0);
        d = getIntent().getFloatExtra("d", 0);
        f = getIntent().getFloatExtra("f", 0);
        hig= getIntent().getFloatExtra("hig", 0);
        t = getIntent().getFloatExtra("t", 0);
        area = getIntent().getFloatExtra("area", 0);
        ar = getIntent().getFloatExtra("ar", 0);
        floor1 = getIntent().getFloatExtra("floor1", 0);
        tot = getIntent().getFloatExtra("tot", 0);
        gla = getIntent().getFloatExtra("gla", 0);
        k1 = getIntent().getFloatExtra("k1", 0);
        pos = getIntent().getIntExtra("pos", 0);
        Button b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText e4=(EditText)findViewById(R.id.editText4);
                String floor= e4.getText().toString();
                floor1 = Float.parseFloat(floor);
                floor1=floor1*hig;

                if(floor.length()==0){


                    Toast.makeText(Main8Activity.this,"Edit Text Empty",Toast.LENGTH_SHORT).show();

                }


                    Intent i= new Intent(Main8Activity.this, Main10Activity.class);

                i.putExtra("c", c);
                i.putExtra("d", d);
                i.putExtra("f", f);
                i.putExtra("t", t);
                i.putExtra("area", area);
                i.putExtra("ar", ar);
                i.putExtra("floor1",floor1);
                i.putExtra("pos", pos);
                    startActivity(i);

            }


        });
    }
}
