

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main5Activity extends AppCompatActivity {
    float c;
    float d;
    float area;
    int num,pos;
    float f,t,ar;
    public void init()
    {
        Button b4=(Button)findViewById(R.id.button4);
        final RadioGroup rg=(RadioGroup)findViewById(R.id.radio);



        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int sel=rg.getCheckedRadioButtonId();
                RadioButton radioButton=(RadioButton)findViewById(sel);
                RadioButton r1=(RadioButton)findViewById(R.id.radioButton);
                RadioButton r2=(RadioButton) findViewById(R.id.radioButton2);
                if(radioButton==r1) {

                    EditText e1 = (EditText) findViewById(R.id.editText);
                    EditText e2 = (EditText) findViewById(R.id.editText2);
                    String a = e1.getText().toString();
                    String b = e2.getText().toString();
                    f = Float.parseFloat(a);
                    t = Float.parseFloat(b);
                    c=f;
                    d=t;
                    ar = f * t;
                    Intent i = new Intent(Main5Activity.this, Main17Activity.class);
                    i.putExtra("c", c);
                    i.putExtra("d", d);
                    i.putExtra("ar", ar);
                    i.putExtra("pos", pos);
                    i.putExtra("f", f);
                    i.putExtra("t", t);
                    i.putExtra("num", num);


                    startActivity(i);
                }
                if(radioButton==r2) {

                    EditText e1 = (EditText) findViewById(R.id.editText);
                    EditText e2 = (EditText) findViewById(R.id.editText2);
                    String a = e1.getText().toString();
                    String b = e2.getText().toString();
                    float c = Float.parseFloat(a);
                    f= (float) (c*0.3048);
                    float d = Float.parseFloat(b);
                    t=(float) (d*0.3048);
                    ar = f * t;
                    Intent i = new Intent(Main5Activity.this, Main17Activity.class);
                    i.putExtra("c", c);
                    i.putExtra("d", d);
                    i.putExtra("pos", pos);
                    i.putExtra("f", f);
                    i.putExtra("t", t);
                    i.putExtra("ar", ar);
                    i.putExtra("num", num);


                    startActivity(i);
                }
            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        c = getIntent().getFloatExtra("c",0);
        d = getIntent().getFloatExtra("d",0);
        //area = getIntent().getFloatExtra("area",0);
        pos= getIntent().getIntExtra("pos",0);
        init();
    }
}
