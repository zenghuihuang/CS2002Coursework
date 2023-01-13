public class Response {
    private int ID;
    private String content;
    private int score;

    private int option;
    private Boolean selected;

    public Boolean getSelected() {
        return selected;
    }



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

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void isSelected(Boolean selected){
        this.selected = selected;
    }
    @Override
    public String toString() {
        return content +"  score : " +score+" selected: " + selected;

    }
}

