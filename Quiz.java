import java.util.HashMap;

/**
 *
 * @author Milan Palmer
 * @version 1.0
 */
public class Quiz
{
    private HashMap <String, Question> questions;
    private Question question;

    /**
     * Constructor for objects of class Quiz
     */
    public Quiz(String quizNumber)
    {
        questions = new HashMap <String, Question>();
    }

    public void addQuestion (String code, Question question){
        questions.put(code, question);
    }
    
    public int getSizeOfTheQuiz()
    {
        return questions.size();
    }

    public void removeQuestion (String code) {
        questions.remove(code);
    }

    public void replaceQuestion (String code, Question newQuestion) {
        questions.replace(code, newQuestion);
        question = newQuestion;
    }

    public HashMap<String, Question> getQuiz(){
        return questions;
    }

    public String printQuestion(String code) {
        return questions.get(code).getFormattedQuestions();
    }

}
