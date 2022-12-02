import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Milan Palmer
 * @version 1.0
 */
public class QuizWizard 
{
    private Scanner scanner;
    private InputReader reader;
    private Quiz quiz;
    private String user;
    private String quizLabel;

    /**
     * Constructor for objects of class QuizWizard
     */
    public QuizWizard()
    {
        scanner = new Scanner(System.in);
        reader = new InputReader();
        quiz = new Quiz(quizLabel);
        user = new String();
        quizLabel = new String();
    }

    public Quiz getQuiz() {
        return quiz;
    }
    
    public void setUser (String newUser) {
        user = newUser;
    }
    
    public String getUser() {
        return user;
    }
    
    public void setQuizLabel (String newQuizLabel) {
        quizLabel = newQuizLabel;
    }

        public void addQuestionByClient () {
        String field3 = reader.getText("Please write your question here");
        int field4 = reader.getNumber("Please write the number of answers here");
        Question question = new Question(field3, field4);
        for (int index = 0; index < field4; index++) {
            String field5 = reader.getText("Please write your answer here");
            question.addAnswer(field5);
        }
        String field6 = reader.getText("Please provide the code for this question");
        quiz.addQuestion(field6, question);
        System.out.println("You have submitted this question, thanks");
    }

    
    public void createTheQuiz()
    {
        openingMessage();
        boolean run = true;
        while (run) {
            String field = reader.getText("Write your name to start the quiz");
            setUser(user);
            String field2 = reader.getText("Please write your module reference");
            setQuizLabel(quizLabel);
            boolean run2 = true;
            while (run2) {
                addQuestionByClient();
                String field7 = reader.getText("Do you have more questions to add?");
                if (field7.toLowerCase().equals("no")) {
                    run2 = false;
                }
            }
            String field8 = reader.getText("Do you want to print your quiz?");
            if (field8.toLowerCase().equals("yes")){
                printQuiz();
            }
            closingMessage();
        }
    }


    public String getLabel () {
        return quizLabel;
    }

    public void printQuiz() {
        for (String code: quiz.getQuiz().keySet()) {
            System.out.print(code + "\n");
            System.out.print(quiz.printQuestion(code));
        }
    }

    public void  openingMessage () {
        System.out.println("Hi there, this is a Quiz program where you can create your own quiz");
        System.out.println("Firstly, add your questions and then set the number of answers for each question");
    }

    public void closingMessage () {
        System.out.println("The quiz is now complete, thank you");
    }

}
