package uz.gita.quizapp.model.implGeografiya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;


public class RepositoryImplGeografiya implements TestScreenContract.Repository{

    private List<TestData> questions;

    @Override
    public void initQuestions() {
        questions = new ArrayList<>();

        questions.add(new TestData("Qaysi bir javob natural  sonlar qatorini tashkil qiladi?", "1,2,3,4,5;", "1,4,5,6,…;", "1,2,3,4,…;", "2,3,4:", "2,3,4:"));
        questions.add(new TestData("3 million 47 ming 750 sonini raqamlar bilan yozing?", "347 500", "3 047 750", "30 047 500", "47 500 ", "3 047 750"));
        questions.add(new TestData("a + 36 = 63 tenglamani yeching?", "97", "27", "39", "99", "27"));
        questions.add(new TestData("Qaysi misolda qo`shish to`g`ri bajarilgan?", "334+265=790", "876+385=1061", "217+323=540 ", "415+395=800", "415+395=800"));
        questions.add(new TestData("86694-(3999+30695)  ifodaning son qiymatini toping", "49000", "110390", "50000", "52000", "52000"));
        questions.add(new TestData("7  raqami  ishtirok etgan barcha ikki xonali sonlar nechta?", "10 ta", "19 ta", "9 ta", "18 ta", "18 ta"));
        questions.add(new TestData("220 394 sonini yozishda nechta turli raqamdan foydalanilgan?", "6 ta ", "5 ta", "4 ta", "3 ta", "5 ta"));
        questions.add(new TestData("Ifodani  soddalashtiring:   3a + 4b - a + 2b - c ", "4a+6b+c", "2a+6b-c", "2a+6b+c", "4a+6b-c", "2a+6b-c"));
        questions.add(new TestData("Hisoblang: 56 * 204 : 12 = ?", "952", "932", "820", "5992", "952"));
        questions.add(new TestData("Tenglamani  yecing: 94 - 2x = 14", "40", "45", "55", "54", "40"));
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
