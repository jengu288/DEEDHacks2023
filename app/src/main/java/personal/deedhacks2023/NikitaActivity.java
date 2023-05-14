package personal.deedhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NikitaActivity extends AppCompatActivity {
    int FEEDcount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FEEDcount = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikita);

        ImageView fulldeedee=findViewById(R.id.imageView8);
        fulldeedee.setVisibility(View.INVISIBLE);
        ImageView crumbsdeedee=findViewById(R.id.imageView9);
        crumbsdeedee.setVisibility(View.INVISIBLE);

        Button btn=findViewById(R.id.button);
        ImageView slice1=findViewById(R.id.imageView3);
        ImageView slice2=findViewById(R.id.imageView4);
        ImageView slice3=findViewById(R.id.imageView5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (FEEDcount == 0){
                    slice1.setVisibility(View.INVISIBLE);
                }
                else if (FEEDcount == 1){
                    slice2.setVisibility(View.INVISIBLE);
                }
                else if (FEEDcount == 2) {
                    slice3.setVisibility(View.INVISIBLE);
                    fulldeedee.setVisibility(View.VISIBLE);
                    crumbsdeedee.setVisibility(View.VISIBLE);
                }
                FEEDcount++;
            }
        });



    }
    public static Intent makeLaunchIntent(Context context) {
        Intent intent = new Intent(context, NikitaActivity.class);

        return intent;
    }
}