//package uz.gita.myquizapp;
//
//import android.annotation.SuppressLint;
//import android.app.Dialog;
//import android.content.Intent;
//import android.graphics.Color;
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.AppCompatButton;
//import androidx.cardview.widget.CardView;
//
//public class MenuActivity extends AppCompatActivity {
//    CardView button_play;
//    CardView button_play_Geometriya;
//    CardView button_play_Fizika;
//    Button button_info;
//    Button quit;
//    Button savollar;
//    AppCompatButton btnNo, btnYes;
//
//    @Override
//    public void onBackPressed() {
//        Dialog view = new Dialog(this);
//        view.setContentView(R.layout.testdanchiqish);
//        btnNo = view.findViewById(R.id.btn_no);
//        btnYes = view.findViewById(R.id.btn_yes);
//
//
//        btnNo.setOnClickListener(x -> {
//            view.dismiss();
//        });
//        btnYes.setOnClickListener(x -> {
//            finish();
//        });
//        view.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        view.show();
//
//    }
//
//    @SuppressLint("WrongViewCast")
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activitiy_menu);
//        button_play = findViewById(R.id.btn_start);
//        button_play_Geometriya = findViewById(R.id.btn_start_GEOMETRIYA);
//        button_play_Fizika = findViewById(R.id.btn_start_Fizika);
//        savollar = findViewById(R.id.btnSavollar);
//        button_info = findViewById(R.id.btn_info);
//        quit = findViewById(R.id.btn_quit);
//
//
//        savollar.setOnClickListener(view -> {
//            Intent intent = new Intent(this, SavollarActivity.class);
//            startActivity(intent);
//        });
//
//
//        button_info.setOnClickListener(view -> {
//            Intent intent = new Intent(this, InfoActivity.class);
//            startActivity(intent);
//        });
//
//        quit.setOnClickListener(view1 -> {
//
//            Dialog view = new Dialog(this);
//            view.setContentView(R.layout.activity_dialogexit);
//            btnNo = view.findViewById(R.id.btn_no);
//            btnYes = view.findViewById(R.id.btn_yes);
//
//
//            btnNo.setOnClickListener(x -> {
//                view.dismiss();
//            });
//            btnYes.setOnClickListener(x -> {
//                finish();
//            });
//            view.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//            view.show();
//
//        });
//    }
//}
