package illiyin.co.malang.i_study;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class Teks_Strukturnya_Deskripsi extends AppCompatActivity {

    PDFView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teks__strukturnya__deskripsi);

        getSupportActionBar().setTitle("Deskripsi");

        deskripsi=(PDFView) findViewById(R.id.teks_strukturnya_deskripsi_pdf);

        deskripsi.fromAsset("TEKS DESKRIPSI.pdf").load();

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
}
