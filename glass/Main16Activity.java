

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main16Activity extends AppCompatActivity {
    public static final String DATABASE_NAME = "glass";
    SQLiteDatabase mDatabase;
    float c;
    float d;
    float area;
    int pos;
    float ar,ar1;
    float f,t,floor1,k1,k2,tot,k3,k4,gla,tit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        mDatabase = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);
        c = getIntent().getFloatExtra("c",0);
        d = getIntent().getFloatExtra("c",0);
        f = getIntent().getFloatExtra("f",0);
        t = getIntent().getFloatExtra("t",0);
        area = getIntent().getFloatExtra("area",0);
        ar = getIntent().getFloatExtra("ar",0);
        floor1 = getIntent().getFloatExtra("floor1",0);
        tot = getIntent().getFloatExtra("tot",0);
        gla = getIntent().getFloatExtra("gla",0);
        k1 = getIntent().getFloatExtra("k1",0);
        pos= getIntent().getIntExtra("pos",0);

        resultFromDatabase();
    }

    private void resultFromDatabase() {

    }
}
