package illiyin.co.malang.konsepdasarbahasa;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Komponen_Bahasa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen__bahasa);
        ButterKnife.bind(this);

        getSupportActionBar().setTitle("Komponen Bahasa");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @OnClick(R.id.komponen_bahasa_fonologi)
    public void bhs_fonologi(){
        Intent intent = new Intent(this,Komponen_Bahasa_Fonologi.class);
        startActivity(intent);
    }

    @OnClick(R.id.komponen_bahasa_morfologi)
    public void bhs_morfologi(){
        Intent intent = new Intent(this,Komponen_Bahasa_Morfologi.class);
        startActivity(intent);
    }

    @OnClick(R.id.komponen_bahasa_sintaksis)
    public void bhs_sintaksis(){
        Intent intent = new Intent(this,Komponen_Bahasa_Sintaksis.class);
        startActivity(intent);
    }

    @OnClick(R.id.komponen_bahasa_semantik)
    public void bhs_semantik(){
        Intent intent = new Intent(this,Komponen_Bahasa_Semantik.class);
        startActivity(intent);
    }
}
