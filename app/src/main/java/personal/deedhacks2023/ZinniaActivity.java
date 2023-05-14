package personal.deedhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ZinniaActivity extends AppCompatActivity {
boolean hatOne = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zinnia);

        Button btn=findViewById(R.id.button2);

        ImageView hat1 =findViewById(R.id.imageView8);
        ImageView hat2 =findViewById(R.id.imageView9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (hatOne == false){
                    hat1.setVisibility(View.INVISIBLE);
                    hat2.setVisibility(View.VISIBLE);
                }
                else{
                    hat1.setVisibility(View.VISIBLE);
                    hat2.setVisibility(View.INVISIBLE);                }

                hatOne = !hatOne;
            }
        });
    }

    public static Intent makeLaunchIntent(Context context) {
        Intent intent = new Intent(context, ZinniaActivity.class);

        return intent;
    }
}