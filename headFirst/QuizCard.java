//The main Quiz Card class which others will use
package headFirst;
class QuizCard {
    private String question;
    private String answer;
    
    //Constructor to make a quiz card along with the Q&A
    QuizCard (String question,String answer){
        this.question = question;
        this.answer = answer;
    }
    
    //Getters for Q&A
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
}