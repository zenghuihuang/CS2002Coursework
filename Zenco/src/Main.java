import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Questionnaire q = new Questionnaire();
        System.out.println(q.toString());

        User a = new User("giada","4567","giada@gmail.com");

        q.select(0,0);
        q.select(1,2);
        q.select(2,0);
        q.select(3,2);
        q.select(4,3);
        q.select(5,1);
        q.select(6,2);
        q.select(7,1);
        q.select(8,0);
        q.select(9,2);
        q.select(10,2);
        q.select(11,3);
        q.select(12,3);
        q.select(13,3);

        System.out.println("user selected option 2");
        System.out.println(q.toString());
        q.calcScores();
        System.out.println("Anxiety Score = "+q.getAnxietyScore());
        System.out.println("Depression Score = "+q.getDepressionScore());









    }
}