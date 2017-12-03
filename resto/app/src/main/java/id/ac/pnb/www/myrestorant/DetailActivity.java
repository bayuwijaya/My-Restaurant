package id.ac.pnb.www.myrestorant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tv_menu_name, tv_menu_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setupEnv();
        String nama = getIntent().getStringExtra("name");
        String price = getIntent().getStringExtra("price");
        setData(nama, price);

    }

    private void setupEnv() {
        tv_menu_name = (TextView) findViewById(R.id.tv_menu_name);
        tv_menu_price = (TextView) findViewById(R.id.tv_menu_price);

    }

    public void setData(String  name, String price) {
        tv_menu_name.setText(name);
        tv_menu_price.setText(price);
    }
}
