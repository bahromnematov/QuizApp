package uz.gita.quizapp.model.implFizika2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;

public class RepositoryImplFizika2 implements TestScreenContract.Repository {

    private List<TestData> questions;

    @Override
    public void initQuestions() {
        questions = new ArrayList<>();
        questions.add(new TestData("Fizika so 'zi ilk bor qaysi olimning asarlarida paydo bo 'ladi?", "Aristotel ", "Nyuton", "Arximed", "G.Galiley", "Aristotel"));
        questions.add(new TestData("Qaysi harakat turida jism tezligining kattaligi o’zgaradi yo’nalishi o’zgarmaydi.", "To’gri chiziqli notekis harakat", "Aylanma harakat ", "Tekis harakat", "Ilgarilanma harakta ", "To’gri chiziqli notekis harakat"));
        questions.add(new TestData("To’gri chiziqli notekis harakat", "Tezlanuvchan ", " Sekinlanuvchan", "To’g’ri chiziqli ", "Aylanma harakat ", "Tezlanuvchan"));
        questions.add(new TestData("1s ichidagi aylanishlar soniga ……… deyiladi", "Davr", "Chastota", "Chiziqli tezlik", "Burilish burchagi ", "Davr"));
        questions.add(new TestData("Jism aylanma harakatda 2s da 120 marta aylandi . Uning aylanish davrini toping.", "0,016", "125", "0,14", "14.2", "0,016"));
        questions.add(new TestData("Chiziqli tezlik , burchak tezlik aylanish davi va chastota qaysi harakatni xarakterlaydi", "Ilgarilanma", "Aylanam ", "Tekis ", "notekis", "Aylanam "));
        questions.add(new TestData("Bir modda molekulalarining ikkinchi modda molekulalari orasiga kirishuvi...........deyiladi", "issiqlikdan kengayish", "diffuziya", "..molekulalar kuchi", "Broun harakati", "diffuziya"));
        questions.add(new TestData("Markazga intilma tezlanish qanday formula yordamida xisoblanadi?", "a=v*v/r", "a=s/t", "a=v-v0/t", "a=v/t", "a=v*v/r"));
        questions.add(new TestData("4N kuch ta’sirida 2 sm uzaygan prujinaning bikrligini toping (N/m) ?", "4", "8", "200 ", "0,5 ", "200 "));
        questions.add(new TestData("Ikki idishdagi 270 C Temperaturadagi gazni Kelvin shkalasida ifodalang ?", "123K", "290K  ", "300k", "23K", "300k"));
    }

    @Override
    public TestData getQuestion(int index) {
        return questions.get(index);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(questions);
    }

    @Override
    public int totalCount() {
        return questions.size();
    }
}
