package uz.gita.quizapp;


import uz.gita.quizapp.contracts.TestData;

public interface TestScreenContract {


    interface View{
        void initViews();

        void loadQuestion(TestData testData);

//        void loadQuestion(TestData testData);

        void clearCheck(int position);

        void result(int correctAnswersCount, int totalQuestionCount);

        void changeState(int currentQuestionIndex, int totalQuestionCount);

        void nextButtonState(boolean state);

        void  defoltButton();

        void clickedButton();
    }

    interface Repository{
        void initQuestions();

        TestData getQuestion(int index);

        void shuffle();

        int totalCount();
    }

    interface Presenter{

        void selectedAnswer(int position);

        void nextQuestion();

        void restart();
    }

}
