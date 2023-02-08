package uz.gita.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

import uz.gita.quizapps.R;


public class SavollarActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    AppCompatImageView button_play;
    AppCompatImageView button_play_Geometriya;
    AppCompatImageView button_play_Fizika;
    AppCompatImageView button_play_Fizika2;
    AppCompatImageView button_play_English;
    AppCompatImageView button_play_Drama;
    ImageView inner;
    NavigationView navigationView;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savollar);
        button_play = findViewById(R.id.btn_start);
        button_play_Fizika2 = findViewById(R.id.fizika);
        button_play_English = findViewById(R.id.english);
//        button_play = findViewById(R.id.btn_start);
        button_play_Geometriya = findViewById(R.id.btn_start_GEOMETRIYA);
        button_play_Fizika = findViewById(R.id.btn_start_Fizika);
        button_play_Drama = findViewById(R.id.drama);
        inner = findViewById(R.id.inner);
//        navigationView = findViewById(R.id.navigationView);
//        navigationView.setNavigationItemSelectedListener(this);

//        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,d1,drawable,R.string.about,R.string.english);


        button_play_Geometriya.setOnClickListener(view -> {
            Intent intent = new Intent(this, GeometryActivity.class);
            startActivity(intent);
        });

        button_play.setOnClickListener(view -> {
            Intent intent = new Intent(this, GeogrophyActivity.class);
            startActivity(intent);
        });


        button_play_Fizika.setOnClickListener(view -> {
            Intent intent = new Intent(this, PhyisicActivity.class);
            startActivity(intent);
        });

        button_play_Fizika2.setOnClickListener(view -> {
            Intent intent = new Intent(this, Fizika2Activity.class);
            startActivity(intent);
        });
        button_play_English.setOnClickListener(view -> {
            Intent intent = new Intent(this, EnglishActivity.class);
            startActivity(intent);
        });
        button_play_Drama.setOnClickListener(view -> {
            Intent intent = new Intent(this, DrammaActivity.class);
            startActivity(intent);
        });

//        drawable.setOnClickListener(view -> {
//            d1.openDrawer(GravityCompat.START);
//        });
//        navigationView.setNavigationItemSelectedListener(view -> {
//
//            return false;
//        });
//        quit.setOnClickListener(view -> {
//            finish();
//        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}