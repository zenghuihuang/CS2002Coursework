import java.util.ArrayList;

public class Questionnaire {
    private ArrayList<Question> questions;
    private User respondent;
    private int anxietyScore;
    private int depressionScore;

    public Questionnaire(){
        questions = new ArrayList<Question>();
        anxietyScore = 0;
        depressionScore = 0;
        ArrayList<Response> responseA1 = new ArrayList<Response>();
        responseA1.add(new Response("Most of the time",3));
        responseA1.add(new Response("A lot of the time",2));
        responseA1.add(new Response("From time to time, occasionally ",1));
        responseA1.add(new Response("Not at all",0));
        questions.add(new Question(1,'A',"I feel tense or 'wound up':  ",responseA1));

        ArrayList<Response> responseD1 = new ArrayList<Response>();
        responseD1.add(new Response("Definitely as much ",0));
        responseD1.add(new Response("Not quite so much ",1));
        responseD1.add(new Response("Only a little  ",2));
        responseD1.add(new Response("Hardly at all",3));
        questions.add(new Question(2,'D',"I still enjoy the things I used to enjoy: ",responseD1));

        ArrayList<Response> responseA2 = new ArrayList<Response>();
        responseA2.add(new Response("Very definitely and quite badly ",3));
        responseA2.add(new Response("Yes, but not too badly",2));
        responseA2.add(new Response("A little, but it doesn't worry me ",1));
        responseA2.add(new Response("Not at all",0));
        questions.add(new Question(3,'A',"I get a sort of frightened feeling as if " +
                "something awful is about to happen:\n ",responseA2));

        ArrayList<Response> responseD2 = new ArrayList<Response>();
        responseD2.add(new Response("As much as I always could  ",0));
        responseD2.add(new Response("Not quite so much now ",1));
        responseD2.add(new Response("Definitely not so much now ",2));
        responseD2.add(new Response("Not at all",3));
        questions.add(new Question(4,'D',"I can laugh and see the funny side of things:\n",responseD2));

        ArrayList<Response> responseA3 = new ArrayList<Response>();
        responseA3.add(new Response("A great deal of the time  ",3));
        responseA3.add(new Response("A lot of the time",2));
        responseA3.add(new Response("From time to time, but not too often ",1));
        responseA3.add(new Response("Only occasionally ",0));
        questions.add(new Question(5,'A',"Worrying thoughts go through my mind : ",responseA3));

        ArrayList<Response> responseD3 = new ArrayList<Response>();
        responseD3.add(new Response("Not at all  ",0));
        responseD3.add(new Response("Not often",1));
        responseD3.add(new Response("Sometimes ",2));
        responseD3.add(new Response("Most of the time ",3));
        questions.add(new Question(6,'D',"I feel cheerful:  ",responseD3));


        ArrayList<Response> responseA4 = new ArrayList<Response>();
        responseA4.add(new Response("Definitely  ",3));
        responseA4.add(new Response("Usually ",2));
        responseA4.add(new Response("Not Often ",1));
        responseA4.add(new Response("Not at all ",0));
        questions.add(new Question(7,'A',"I can sit at ease and feel relaxed: ",responseA4));

        ArrayList<Response> responseD4 = new ArrayList<Response>();
        responseD4.add(new Response("Nearly all the time ",0));
        responseD4.add(new Response("Very often",1));
        responseD4.add(new Response("Sometimes ",2));
        responseD4.add(new Response("Not at all ",3));
        questions.add(new Question(8,'D',"I feel as if I am slowed down: ",responseD4));

        ArrayList<Response> responseA5 = new ArrayList<Response>();
        responseA5.add(new Response("Definitely  ",3));
        responseA5.add(new Response("Usually ",2));
        responseA5.add(new Response("Not Often ",1));
        responseA5.add(new Response("Not at all ",0));
        questions.add(new Question(9,'A',"I get a sort of frightened feeling like \n" +
                "'butterflies' in the stomach: ",responseA5));

        ArrayList<Response> responseD5 = new ArrayList<Response>();
        responseD5.add(new Response("Definitely  ",0));
        responseD5.add(new Response("I don't take as much care as I should ",1));
        responseD5.add(new Response("I may not take quite as much care ",2));
        responseD5.add(new Response("I take just as much care as ever",3));
        questions.add(new Question(10,'D',"I have lost interest in my appearance:\n ",responseD5));


        ArrayList<Response> responseA6 = new ArrayList<Response>();
        responseA6.add(new Response("Not at all   ",3));
        responseA6.add(new Response("Occasionally  ",2));
        responseA6.add(new Response("Quite Often ",1));
        responseA6.add(new Response("Very Often ",0));
        questions.add(new Question(11,'A',"I feel restless as I have to be on the \n" +
                "move:\n",responseA6));

        ArrayList<Response> responseD6 = new ArrayList<Response>();
        responseD6.add(new Response("As much as I ever did    ",0));
        responseD6.add(new Response("Rather less than I used to  ",1));
        responseD6.add(new Response("Definitely less than I used to  ",2));
        responseD6.add(new Response("Hardly at all",3));
        questions.add(new Question(12,'D',"I look forward with enjoyment to things:\n",responseD6));

        ArrayList<Response> responseA7 = new ArrayList<Response>();
        responseA7.add(new Response("Very often indeed   ",3));
        responseA7.add(new Response("Quite often ",2));
        responseA7.add(new Response("Not very often  ",1));
        responseA7.add(new Response("Not at all ",0));
        questions.add(new Question(13,'A',"I get sudden feelings of panic:",responseA7));

        ArrayList<Response> responseD7 = new ArrayList<Response>();
        responseD7.add(new Response("Often   ",0));
        responseD7.add(new Response("Sometimes ",1));
        responseD7.add(new Response("Not often  ",2));
        responseD7.add(new Response("NVery seldom ",3));
        questions.add(new Question(14,'D',"I can enjoy a good book or radio or TV program:\n",responseD7));

    }

    public Questionnaire(User respondent) {
        this.respondent = respondent;
    }

    /**
     * This method allows the user to select one of the four options available for each question
     * @param question_ID of type int indicates the ID of the question
     * @param option_ID of type int indicates the ID of the four options which can be either 0,1,2 or 3.
     */
    public void select(int question_ID, int option_ID){
        questions.get(question_ID).setResponseById(option_ID);
    }

    public void calcScores(){

        for (Question q: questions){
            for (Response response: q.getResponses())
                if (response.getSelected()){
                    if(q.getType() =='A')
                        anxietyScore = anxietyScore + response.getScore();
                    else
                        depressionScore = depressionScore + response.getScore();

                }
            }
    }//calcScore

    public int getAnxietyScore(){
        return anxietyScore;
    }

    public  int getDepressionScore(){
        return depressionScore;
    }

    @Override
    public String toString() {
        String outcome="";
        for (Question q : questions){
            outcome = outcome + q.toString();
        }

        return outcome;
    }
}
