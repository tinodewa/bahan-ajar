package illiyin.co.malang.i_study;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Teks_Strukturnya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teks__strukturnya);
        ButterKnife.bind(this);

        getSupportActionBar().setTitle("Teks & Strukturnya");

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

    @OnClick(R.id.teks_strukturnya_deskripsi)
    public void bhs_deskripsi(){
        Intent intent = new Intent(this,Teks_Strukturnya_Deskripsi.class);
        startActivity(intent);
    }

    @OnClick(R.id.teks_strukturnya_eksplanasi)
    public void bhs_eksplanasi(){
        Intent intent = new Intent(this,Teks_Strukturnya_Eksplanasi.class);
        startActivity(intent);
    }

    @OnClick(R.id.teks_strukturnya_eksposisi)
    public void bhs_eksposisi(){
        Intent intent = new Intent(this,Teks_Strukturnya_Eksposisi.class);
        startActivity(intent);
    }

    @OnClick(R.id.teks_strukturnya_narasi)
    public void bhs_narasi(){
        Intent intent = new Intent(this,Teks_Strukturnya_Narasi.class);
        startActivity(intent);
    }
}
