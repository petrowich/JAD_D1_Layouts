package su.petrowich.jad_d1_layouts;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnLayout1, btnLayout2, btnLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayout1 = findViewById(R.id.btnLayout1);
        btnLayout2 = findViewById(R.id.btnLayout2);
        btnLayout3 = findViewById(R.id.btnLayout3);

    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.btnLayout1:
                intent = new Intent(this, layout_1.class);
                startActivity(intent);
                break;
            case R.id.btnLayout2:
                intent = new Intent(this, layout_2.class);
                startActivity(intent);
                break;
            case R.id.btnLayout3:
                intent = new Intent(this, layout_3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
