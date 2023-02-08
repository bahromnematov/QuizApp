package uz.gita.quizapp.model.implFizika;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;


public class RepositoryImplFizika implements TestScreenContract.Repository{

    private List<TestData> questions;

    @Override
    public void initQuestions() {
        questions = new ArrayList<>();

        questions.add(new TestData("Hisoblash texnikasi tarixi nechaga bo`linadi?", "3", "2", "4", "5", "4"));
        questions.add(new TestData("Mexanik mashinalar davri qachon boshlandi ?", "1642", "1452", "1822", "1623", "1623"));
        questions.add(new TestData("Kibernetika maktabining asoschisi kim ?", "Vasil Qobilov ", "Vasil Ahmedov", "Jordan", "Fleming ", "Vasil Qobilov"));
        questions.add(new TestData("Qachon 1-kompyuter yaratildi ?", "1977", "1973", "1968", "1912 ", "1973"));
        questions.add(new TestData("Mantiqiy amallar necha xil bo`ladi?", "2", "4", "6", "3", "3"));
        questions.add(new TestData("Operatsion sistema tarkibi necha guruhdan iborat?", "3", "4", "5", "2", "3"));
        questions.add(new TestData("Diskda joylashgan sistema nomini ayting ?", "OS", "DOS", "BiOS", "EHM", "BiOS"));
        questions.add(new TestData("Operatsiya so`zining manosi?", "kompyuter", "sistema", "amal", "dastur", "amal"));
        questions.add(new TestData("Interfeys so`zining ma`nosi ?", "ta`sir, aloqa", "matn", "rafik", "uyali telefon", "ta`sir, aloqa"));
        questions.add(new TestData("Teskor xotira qurilmasi nimadan tashkil topgan ?", "registr", "adres", "razryd", "plata", "registr"));
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
