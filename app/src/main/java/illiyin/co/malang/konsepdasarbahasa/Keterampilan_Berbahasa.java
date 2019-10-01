package illiyin.co.malang.konsepdasarbahasa;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Keterampilan_Berbahasa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keterampilan__berbahasa);
        ButterKnife.bind(this);

        getSupportActionBar().setTitle("Keterampilan Berbahasa");

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

    @OnClick(R.id.keterampilan_berbahasa_membaca)
    public void bhs_fonologi(){
        Intent intent = new Intent(this,Keterampilan_Berbahasa_Membaca.class);
        startActivity(intent);
    }

    @OnClick(R.id.keterampilan_berbahasa_menulis)
    public void bhs_morfologi(){
        Intent intent = new Intent(this,Keterampilan_Berbahasa_Menulis.class);
        startActivity(intent);
    }

    @OnClick(R.id.keterampilan_berbahasa_menyimak)
    public void bhs_sintaksis(){
        Intent intent = new Intent(this,Keterampilan_Berbahasa_Menyimak.class);
        startActivity(intent);
    }

    @OnClick(R.id.keterampilan_berbahasa_berbicara)
    public void bhs_semantik(){
        Intent intent = new Intent(this,Keterampilan_Berbahasa_Berbicara.class);
        startActivity(intent);
    }
}
