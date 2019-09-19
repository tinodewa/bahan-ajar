package illiyin.co.malang.i_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;

public class Pdf_View extends AppCompatActivity {

//    @BindView(R.id.pdfView)
//    PDFView book1;

    PDFView book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf__view);

        book1=(PDFView) findViewById(R.id.pdfView);

        book1.fromAsset("modul_01.pdf").load();
    }
}
