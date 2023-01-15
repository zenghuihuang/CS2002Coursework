import java.util.ArrayList;

public class User {


    private int ID;

    private String username;
    private String password;
    private String email;
    private int quizAttempts;
    private ArrayList<Quiz> quizList;
    public ArrayList<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(ArrayList<Quiz> quizList) {
        this.quizList = quizList;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        quizList = new ArrayList<Quiz>();
        quizAttempts = 0;
    }

    public void startNewQuiz(int userID){
        ID = userID;
        quizList.add(new Quiz(userID));
        quizAttempts++;
        quizList.get(quizAttempts - 1).setDefaultQuiz();
    }

    public void selectResponse(int questionId, int responseId){
        quizList.get(quizAttempts - 1).select(questionId,responseId);

    }

    public String getQuizResult(){
        quizList.get(quizAttempts -1).calcScores();
        String result = quizList.get(quizAttempts -1).getAdvice() ;
        result = "Quiz Attempt: " + Integer.toString(quizAttempts)+ result;
        return result;
    }

    public String getQuizResultById(int quizId){
        quizList.get(quizId).calcScores();
        return quizList.get(quizId).getAdvice();

    }





}
