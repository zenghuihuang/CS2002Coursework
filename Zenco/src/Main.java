import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Questionnaire q = new Questionnaire(questions, user1);

        Question questionA1 = new Question('A',"I feel tense or 'wound up': ");

        //Responses for Anxiety Question 1
        ArrayList<Response> responseA1 = new ArrayList<Response>();
        responseA1.add(new Response("Most of the time",3));
        responseA1.add(new Response("A lot of the time",2));
        responseA1.add(new Response("From time to time, occasionally ",1));
        responseA1.add(new Response("Not at all",0));
        questionA1.setResponses(responseA1);
        questionA1.printQuestion();




    }
}