package personal.deedhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AliyahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliyah);
    }

    public static Intent makeLaunchIntent(Context context) {
        Intent intent = new Intent(context, AliyahActivity.class);

        return intent;
    }
}