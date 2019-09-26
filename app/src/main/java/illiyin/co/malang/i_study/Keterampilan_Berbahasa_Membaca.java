package illiyin.co.malang.i_study;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class Keterampilan_Berbahasa_Membaca extends AppCompatActivity {

    PDFView membaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keterampilan__berbahasa__membaca);

        getSupportActionBar().setTitle("Membaca");

        membaca=(PDFView) findViewById(R.id.keterampilan_berbahasa_membaca_pdf);

        membaca.fromAsset("KETERAMPILAN MEMBACA.pdf").load();

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
