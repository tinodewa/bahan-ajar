package illiyin.co.malang.i_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.button_ipa_inner_1)
    Button btn_ipa_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_ipa_inner_1)
    public void ipa_1(){
        Intent intent = new Intent(this,Pdf_View.class);
        startActivity(intent);
    }
}
