package aknrdlt.locationdescription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LandActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private TextView descriptionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.land_xml);

        textView = findViewById(R.id.textView);
        descriptionView = findViewById(R.id.tv_description);

        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT)){
            textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }

        imageView = findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();

        int h = 1;
        int resId  = 1;
        boolean b = true;
        while(b){
            if(intent.hasExtra(Integer.toString(h)) && intent.hasExtra(Integer.toString(10 + h)) ){
                resId = bundle.getInt(Integer.toString(h));
                imageView.setImageResource(resId);
                descriptionView.setText(intent.getStringExtra(Integer.toString(10 + h)));
                b = false;
            }
            h++;
        }
    }
}