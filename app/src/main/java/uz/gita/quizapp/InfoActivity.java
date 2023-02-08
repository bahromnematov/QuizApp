package uz.gita.quizapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import uz.gita.quizapps.R;


public class InfoActivity extends AppCompatActivity {
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        button=findViewById(R.id.aboutBack);
        button.setOnClickListener(view -> {
            finish();
        });
    }
}