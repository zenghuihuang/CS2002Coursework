import java.util.ArrayList;
public class Question {
    private int ID;
    private Character type;
    private String content;
    private ArrayList<Response> responses;

    public Question(Character type, String content) {
        this.type = type;
        this.content = content;
        this.responses = new ArrayList<Response>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setResponses(ArrayList<Response> responses) {
        for(int i = 0; i < responses.size(); i++) {
            this.responses.add(responses.get(i));
        }
    }

    public void printQuestion(){
        System.out.println(" Question:  " + ID + "\n" +
                           "Type: " + type +"\n "+
                            content + "\n"+
                           "options: ");
        for(int i = 0; i < responses.size(); i++) {
            System.out.println(responses.get(i));
        }

    }
    }






