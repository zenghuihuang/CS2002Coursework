public class Response {
    private int ID;
    private String content;
    private int score;

    private Boolean selected;

    Response(String content, int score){
        this.content = content;
        this.score = score;
        selected = false;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}

