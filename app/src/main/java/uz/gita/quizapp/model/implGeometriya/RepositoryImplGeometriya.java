package uz.gita.quizapp.model.implGeometriya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;


public class RepositoryImplGeometriya implements TestScreenContract.Repository{

    private List<TestData> questions;

    @Override
    public void initQuestions() {
        questions = new ArrayList<>();

        questions.add(new TestData("Avstraliya qanday ma'noni anglatadi.", "Janubiy-Sharqiy", "Janubiy", "Shimoliy", "Materik orol", "Materik orol"));
        questions.add(new TestData("Yangi Gebrid qaysi orollar tarkibiga kiradi ?", "Meloneziya", "Mikroneziya", "Polineziya", "Materik oroli.", "Polineziya"));
        questions.add(new TestData("Avstraliyadagi eng uzun daryo qaysi? ", "Murrey ", "Darling ", "Marrambidji ", "Flay", "Flay"));
        questions.add(new TestData("Yer yuzi relyefining xilma- xil bo 'lishiga sabab nima? ", "Quyosh nuri.", "Ichki va tashqi kuchlar.", "Sayyoralarning harakati", "Zilzila va vulqonlar.", "Sayyoralarning harakati"));
        questions.add(new TestData("Quyidagi tog 'lar ichida eng balandini aniqlang", "Kavkaz", "Pomir", "Karpat", "Himolay", "Himolay"));
        questions.add(new TestData("Avstraliyaning  asosiy xususiyatlarini belgilang.:", "Eng past, eng mitti", "Eng quruq matenk", "O'rtasidan janubiy tropik chizig'i kesib o'tgan", "Barchasi to'g'ri", "Barchasi to'g'ri"));
        questions.add(new TestData("1959 - yilda ozodlikka erishgan davlat qaysi? ", "Gvatemala", "Kanada", "Kuba", "Nikaragua", "Nikaragua"));
        questions.add(new TestData("Materikning eng shimoliy chekka nuqtasi qaysi? ", "Uels Shaxzodasi burni", "Merchison burni", "Maryato burni", "Sent Charlz burni", "Uels Shaxzodasi burni"));
        questions.add(new TestData("1798 - yildan qaysi hudud \"Rus Amerikasi\" deb atalgan ?", "Kanada Afrika arxipelagi", "Labrador yarim oroli", "Alyaska yarim oroli", "Kaliforniya yarim oroli", "Alyaska yarim oroli"));
        questions.add(new TestData("Alyaska yarim oroli?", "Murrey ", "Darling ", "Marrambidji ", "Flay", "Murrey"));
    }

    @Override
    public TestData getQuestion(int index) {
        return questions.get(index);
    }

//    @Override
//    public TestData getQuestion(int index) {
//        return null;
//    }

//    @Override
//        return questions.get(index);
//    }

    @Override
    public void shuffle() {
        Collections.shuffle(questions);
    }

    @Override
    public int totalCount() {
        return questions.size();
    }
}
