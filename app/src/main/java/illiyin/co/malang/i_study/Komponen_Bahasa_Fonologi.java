package illiyin.co.malang.i_study;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class Komponen_Bahasa_Fonologi extends AppCompatActivity {

    PDFView fonologi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen__bahasa__fonologi);

        getSupportActionBar().setTitle("Fonologi");

        fonologi=(PDFView) findViewById(R.id.komponen_bahasa_fonologi_pdf);

        fonologi.fromAsset("FONOLOGI BAHASA INDONESIA.pdf").load();

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
