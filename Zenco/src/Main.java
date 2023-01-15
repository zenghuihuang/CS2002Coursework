public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Quiz q = new Quiz();
        System.out.println(q.toString());

        User a = new User("giada","4567","giada@gmail.com");
        a.startNewQuiz(a.getID());

       a.selectResponse(0,0);
       a.selectResponse(1,2);
       a.selectResponse(2,0);
       a.selectResponse(3,2);
       a.selectResponse(4,3);
       a.selectResponse(5,1);
       a.selectResponse(6,2);
       a.selectResponse(7,1);
       a.selectResponse(8,0);
       a.selectResponse(9,2);
       a.selectResponse(10,2);
       a.selectResponse(11,3);
       a.selectResponse(12,3);
       a.selectResponse(13,3);
/**
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
**/
        System.out.println(a.getQuizList().get(0).toString());
        System.out.println("Quiz Result: ");
        System.out.println(a.getQuizResult());

        /**
        q.calcScores();
        System.out.println("Anxiety Score = "+q.getAnxietyScore());
        System.out.println("Depression Score = "+q.getDepressionScore());
        System.out.println(q.getAdvice());

**/







    }
}