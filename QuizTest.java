

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Milan Palmer
 * @version 1.0
 */
public class QuizTest
{
    /**
     * Default constructor for test class QuizTest
     */
    public QuizTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    

    
    @Test
    public void constructorQuizTest(){
        Quiz quiz = new Quiz("");
        assertEquals (0, quiz.getSizeOfTheQuiz());
        
    }
    
    @Test
    public void addQuestion(){
        Quiz quiz = new Quiz("");
        Question question= new Question("What is the smallest planet in our solar system?", 4);
        Question question1= new Question("What is the smallest planet in our solar system?", 4);
        Question question2= new Question("What is the smallest planet in our solar system?", 4);
        Question question3= new Question("What is the smallest planet in our solar system?", 4);
        
        quiz.addQuestion("q1", question);
        
        assertEquals (1, quiz.getSizeOfTheQuiz());
        
        quiz.addQuestion("q2", question1);
        quiz.addQuestion("q3", question2);
        quiz.addQuestion("q4", question3);
        assertEquals (4, quiz.getSizeOfTheQuiz());
    }
    
    @Test
    public void removeAQuestion(){
        Quiz quiz= new Quiz("");
        Question question = new Question("What is the smallest planet in our solar system?", 4);
        
        quiz.addQuestion("q1", question);
        assertEquals (1, quiz.getSizeOfTheQuiz());
        quiz.removeQuestion("q1");
        assertEquals (0,quiz.getSizeOfTheQuiz());
        
    }
    

    
}
