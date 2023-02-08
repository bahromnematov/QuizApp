package uz.gita.quizapp.model.implDramma;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;

public class PresenterImplDramma implements TestScreenContract.Presenter {

    private final TestScreenContract.View view;
    private final TestScreenContract.Repository repository;
    private int index;
    private int totalCount;
    private int selectedAnswer = -1;
    private int correctAnswers;

    public PresenterImplDramma(TestScreenContract.View view, TestScreenContract.Repository repository) {
        this.view = view;
        this.repository = repository;
        init();
    }

    private void init() {
        view.initViews();
        repository.initQuestions();
        repository.shuffle();
        view.defoltButton();
        totalCount = repository.totalCount();
        view.loadQuestion(repository.getQuestion(index));
        view.changeState(index + 1, totalCount);
    }

    @Override
    public void selectedAnswer(int position) {
        view.clickedButton();
        if (selectedAnswer > -1 && selectedAnswer != position) {
            view.clearCheck(selectedAnswer);
        }
        selectedAnswer = position;
    }

    @Override
    public void nextQuestion() {
        boolean isCompleted = isTestCompleted();

        if (isCompleted) {
            view.result(correctAnswers, totalCount);
            return;
        }

        index++;
        view.clearCheck(selectedAnswer);
        selectedAnswer = -1;
        view.defoltButton();

        TestData question = repository.getQuestion(index);
        view.loadQuestion(question);
        view.changeState(index + 1, totalCount);
    }

    @Override
    public void restart() {
        index = 0;
        correctAnswers = 0;
        view.clearCheck(selectedAnswer);
        TestData question = repository.getQuestion(index);
        view.loadQuestion(question);
        view.changeState(index + 1, totalCount);
    }

    private boolean isTestCompleted() {
        TestData testData = repository.getQuestion(index);
        String userAnswer;
        switch (selectedAnswer) {
            case 0:
                userAnswer = testData.getVariantA();
                break;
            case 1:
                userAnswer = testData.getVariantB();
                break;
            case 2:
                userAnswer = testData.getVariantC();
                break;
            default:
                userAnswer = testData.getVariantD();
        }

        if (testData.getAnswer().equals(userAnswer))
            correctAnswers++;

        return totalCount - 1 == index;
    }
}
