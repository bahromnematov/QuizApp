package uz.gita.quizapp;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.radiobutton.MaterialRadioButton;

import java.util.ArrayList;
import java.util.List;

import uz.gita.quizapp.contracts.TestData;
import uz.gita.quizapp.model.implEnglesh.PresenterImplEnglish;
import uz.gita.quizapp.model.implEnglesh.RepositoryImplEnglish;
import uz.gita.quizapps.R;


public class EnglishActivity extends AppCompatActivity implements TestScreenContract.View {

    private Button btnNext;
    private TextView textQuestion;
    private TextView textTestState;
    Button btnNo, btnYes;
    private List<MaterialRadioButton> radioButtons;
    TestScreenContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_english);

        presenter = new PresenterImplEnglish(this, new RepositoryImplEnglish());

    }


    @Override
    public void initViews() {
        radioButtons = new ArrayList<>();
        radioButtons.add(findViewById(R.id.radioA));
        radioButtons.add(findViewById(R.id.radioB));
        radioButtons.add(findViewById(R.id.radioC));
        radioButtons.add(findViewById(R.id.radioD));
        btnNext = findViewById(R.id.btnNext);
        findViewById(R.id.homeButton).setOnClickListener(view1 -> {

            Dialog view = new Dialog(this);
            view.setContentView(R.layout.testdanchiqish);
            btnNo = view.findViewById(R.id.btn_no);
            btnYes = view.findViewById(R.id.btn_yes);


            btnNo.setOnClickListener(x -> {
                view.dismiss();
            });
            btnYes.setOnClickListener(x -> {
                finish();
            });
            view.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            view.show();

        });
        btnNext.setEnabled(false);
        btnNext.setOnClickListener(v -> presenter.nextQuestion());
        textQuestion = findViewById(R.id.textQuestion);
        textTestState = findViewById(R.id.textState);
        initCheckersListener();
    }

    @Override
    public void onBackPressed() {
        Dialog view = new Dialog(this);
        view.setContentView(R.layout.testdanchiqish);
        btnNo = view.findViewById(R.id.btn_no);
        btnYes = view.findViewById(R.id.btn_yes);


        btnNo.setOnClickListener(x -> {
            view.dismiss();
        });
        btnYes.setOnClickListener(x -> {
            finish();
        });
        view.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        view.show();

    }

    @Override
    public void loadQuestion(TestData testData) {
        textQuestion.setText(testData.getQuestion());
        radioButtons.get(0).setText(testData.getVariantA());
        radioButtons.get(1).setText(testData.getVariantB());
        radioButtons.get(2).setText(testData.getVariantC());
        radioButtons.get(3).setText(testData.getVariantD());
    }

    @Override
    public void clearCheck(int position) {
        Log.d("TTT", "Position " + position);
        radioButtons.get(position).setChecked(false);
    }

    @Override
    public void result(int correctAnswersCount, int totalQuestionCount) {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        View dialogView = LayoutInflater.from(this).inflate(R.layout.activity_customdialog, null);
        dialog.setCancelable(false);
        TextView scoreResult = dialogView.findViewById(R.id.textResult);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        scoreResult.setText("Score:\t" + correctAnswersCount + "/" + totalQuestionCount);
        dialogView.findViewById(R.id.btnFinish).setOnClickListener(v -> {
            finish();
        });

        dialogView.findViewById(R.id.btnRestart).setOnClickListener(v -> {
            presenter.restart();
            dialog.cancel();
        });

        dialog.setView(dialogView);
        dialog.show();
    }


    @Override
    public void changeState(int currentQuestionIndex, int totalQuestionCount) {
        textTestState.setText(currentQuestionIndex + " / " + totalQuestionCount);
    }

    @Override
    public void nextButtonState(boolean state) {
        btnNext.setEnabled(state);
    }

    @Override
    public void defoltButton() {
        btnNext.setBackgroundResource(R.drawable.btn_click2);
        nextButtonState(false);
    }

    @Override
    public void clickedButton() {
        btnNext.setBackgroundResource(R.drawable.btn_click_next);
        nextButtonState(true);
    }

    void initCheckersListener() {

        for (int i = 0; i < radioButtons.size(); i++) {
            MaterialRadioButton radioButton = radioButtons.get(i);
            radioButton.setTag(i);
            radioButton.setOnClickListener(v -> presenter.selectedAnswer((Integer) v.getTag()));
        }
    }


}