package uz.gita.quizapp.model.implDramma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;

public class RepositoryImplDramma implements TestScreenContract.Repository {
    private List<TestData> questions;

    @Override
    public void initQuestions() {
        questions = new ArrayList<>();

        questions.add(new TestData("Kichkina, kulranggina, filga o’xshaydi.", "Fil", "Filning Bolasi", "Jerafa", "Sher", "Filning Bolasi"));
        questions.add(new TestData("Nok osilib turibdi, lekin uni yeb bo’lmaydi. Lampochka emas?", "Olma", "Begonaning noki", "Tug'ri javob yuq", "Pomidor", "Begonaning noki"));
        questions.add(new TestData("Qaysi yegulikni pishirishda qancha tuz solsa ham, u sho’r bo’lib ketmaydi?", "Kartoshka ", "Sabzi", "Qaynatilgan Tuxum", "Nuxat", "Vasil Qobilov"));
        questions.add(new TestData("Bir shox, bir ko’z, ammo karkidon emas.", "Sigir burchakdan boshining yarimini chiqarib poylamoqda.", "Karkidon Bolasi", "Echki", "Sigir bolasi ", "Sigir burchakdan boshining yarimini chiqarib poylamoqda."));
        questions.add(new TestData("Choyni qaysi qo’l bilan aralashtirish kerak?", "Qoshiq bn", "O'ng qul", "Chap qul", "Choy aralashtirmaslik kere", "O'ng qul"));
        questions.add(new TestData("Kim o’tirgan holda yuradi?", "Basketbolchi", "Valebolchi", "Shaxmatchi.", "barcha javob tugri", "Shaxmatchi."));
        questions.add(new TestData("Kibernetika maktabining asoschisi kim ?", "Vasil Qobilov", "Vasil Ahmedov", "Jordan", "Fleming", "Vasil Qobilov"));
        questions.add(new TestData("Interfeys so`zining ma`nosi ?", "ta`sir, aloqa", "matn", "rafik", "uyali telefon", "ta`sir, aloqa"));
        questions.add(new TestData("4N kuch ta’sirida 2 sm uzaygan prujinaning bikrligini toping (N/m) ?", "4", "200", "21", "8", "200"));
        questions.add(new TestData("Avstraliyadagi eng uzun daryo qaysi ?", "Murrey", "Darling", "Marrambidji", "Flay", "Flay"));
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
