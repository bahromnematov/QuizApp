package uz.gita.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import uz.gita.quizapps.R;


public class dialogexit extends AppCompatActivity  {

    AppCompatButton btnPlay, btnAbout, btnQuit;
    MediaPlayer onClickBtnMusic;
    AppCompatButton btnNo, btnYes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogexit);
        Dialog view = new Dialog(this);
        view.setContentView(R.layout.activity_dialogexit);
        btnNo = view.findViewById(R.id.btn_no);
        btnYes = view.findViewById(R.id.btn_yes);


        btnNo.setOnClickListener(x -> {
            onClickBtnMusic.start();
            onClickBtnMusic.seekTo(60);
            view.dismiss();
        });
        btnYes.setOnClickListener(x -> {
            onClickBtnMusic.start();
            onClickBtnMusic.seekTo(60);
            finish();
        });
        view.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        view.show();
    }



}
