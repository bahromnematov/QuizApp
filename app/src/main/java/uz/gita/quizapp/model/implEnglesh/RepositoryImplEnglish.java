package uz.gita.quizapp.model.implEnglesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.TestScreenContract;
import uz.gita.quizapp.contracts.TestData;

public class RepositoryImplEnglish implements TestScreenContract.Repository {

    private List<TestData> questions;

    @Override
    public void initQuestions() {

        questions = new ArrayList<>();

        questions.add(new TestData("_____ they coming over for dinner?", "Is", "Are", "Am", "Our", "Are"));
        questions.add(new TestData("MMaxwell _____ not sleeping on our sofa.?", "are", " is", "am", "her", " is\n"));
        questions.add(new TestData("My mother-in-law is _____ at our house this week.", " stay ", "staying", "be staying", "Staed ", "staying"));
        questions.add(new TestData("I _____ my dinner right now.", "eat", "eating", "am eating", "Ate ", "am eating"));
        questions.add(new TestData("My sister _____ Spanish.", "learn", "is learning", "learning", "learned", "is learning"));
        questions.add(new TestData(" I _____ at the hair salon until September.", "work", "be working", "am working", "Are", "am working"));
        questions.add(new TestData("We _____ at a fancy restaurant tonight. Jason decided this yesterday.", "eat", "are eating", " eats", "ate", "are eating"));
        questions.add(new TestData("Why ________ playing football tomorrow?", "he not is", "isn't he", " he isn't", "he is", " he isn't"));
        questions.add(new TestData("They are _____ a new shopping mall downtown.", "opening", "openning", "oppening", "oppen", "opening"));
        questions.add(new TestData("Melissa is _____ down on her bed. ?", " lieing", "liying", "lying", "lyied", "lying"));

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
