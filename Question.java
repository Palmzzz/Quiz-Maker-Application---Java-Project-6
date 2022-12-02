import java.util.ArrayList;

/**
 *
 * @author Milan Palmer
 * @version 1.0
 */
public class Question
{
    private String questionField;
    private String questionText;
    private ArrayList<String> answers;
    private int numberOfAnswers;
    private char letter;
    private boolean exceedTheNumberOfAnswers;
    private String formatAnswers;

    /**
     * Constructor for objects of class Question
     */
    public Question(String questionField, int numberOfAnswers)
    {
        answers = new ArrayList<String>();
        this.questionField = questionField;
        this.numberOfAnswers = numberOfAnswers;
        resetLetter();
        exceedTheNumberOfAnswers = false;
    }

    public String getQuestionField() {
        return questionField;
    }
    
    public String getAnswer(int index) {
        return answers.get(index);
    }
   
    public int getNumberOfAnswers() {
        return numberOfAnswers;
    }
    
    public boolean getExceedTheNumberOfAnswers () {
        return exceedTheNumberOfAnswers;
    }
    
    public void addAnswer(String answer) {
        if (numberOfAnswers <= answers.size()) {
            exceedTheNumberOfAnswers = true;
            System.out.println("You have exceeded the parameters for another answer");
        } else {
            answers.add(answer);
            
        }
        }
    
        public String formatAnswers (int index, String answer) {
            char letter = 'a';
            String formattedAnswers;
            String letters = "abcdefghijklmnopqrstuvwxyz";
            formattedAnswers = letters.toCharArray()[index]+ ")" + answer;
            System.out.println(index);
            return formatAnswers;
        }
    
    
    public String getFormattedQuestions()
    {
        resetLetter();
        String formatted = questionField;
        formatted += "\n";
        for (int index = 0; index <answers.size(); index ++) {
            formatted += letter;
            letter += 1;
            formatted += ")";
            formatted += answers.get(index);
            formatted += "\n";
        }
        return formatted;
    }
    
    private void resetLetter(){
        letter = 'a';
    }
}
