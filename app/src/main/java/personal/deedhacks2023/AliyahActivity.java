package personal.deedhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.google.android.material.snackbar.Snackbar;

public class AliyahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliyah);

        Button btn = findViewById(R.id.button_a);
        SeekBar slider = findViewById(R.id.seekBar2);
        slider.setAlpha(0);

        ImageView balloon0 = findViewById(R.id.balloon0);
        ImageView balloon1 = findViewById(R.id.balloon1);
        ImageView balloon2 = findViewById(R.id.balloon2);
        ImageView balloon3 = findViewById(R.id.balloon3);
        ImageView balloon4 = findViewById(R.id.balloon4);
        ImageView balloon5 = findViewById(R.id.balloon5);
        ImageView balloon6 = findViewById(R.id.balloon6);
        ImageView[] balloons = {balloon0, balloon1, balloon2, balloon3, balloon4, balloon5, balloon6};
        for (int i = 0; i < 7; i++) {
            balloons[i].setVisibility(View.INVISIBLE);
        }
        //set onClick listener using anonymous class
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btn){
                //functionality for the button
                ImageView box = findViewById(R.id.imageView2);
                box.setImageAlpha(0);
                //SeekBar slider = findViewById(R.id.seekBar2);
                slider.setAlpha(1);
            }
        });
        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {

                for (int i = 0; i < progress; i++) {
                    balloons[i].setVisibility(View.VISIBLE);
                }
                for (int i = progress; i < 7; i++) {
                    balloons[i].setVisibility(View.INVISIBLE);
                }

                Snackbar.make(seekBar, "It's party time!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    public static Intent makeLaunchIntent(Context context) {
        Intent intent = new Intent(context, AliyahActivity.class);

        return intent;
    }



}