import java.util.ArrayList;

public class Questionnaire {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private User respondent;
    private int anxietyScore;
    private int depressionScore;

    public Questionnaire(ArrayList<Question> questions, User respondent) {
        this.questions = questions;
        this.respondent = respondent;
    }

    public void addQuestion(Question q){


    }
}
