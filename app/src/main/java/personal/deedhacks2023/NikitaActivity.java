package personal.deedhacks2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class NikitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikita);
    }

    public static Intent makeLaunchIntent(Context context) {
        Intent intent = new Intent(context, NikitaActivity.class);

        return intent;
    }
}