

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Milan Palmer
 * @version 1.0
 */
public class QuestionTest
{
    /**
     * Default constructor for test class QuestionTest
     */
    public QuestionTest()
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
    public void constructorQuestionTest() {
        Question question = new Question("Is this correct?", 2);
        assertEquals("Is this correct?", question.getQuestionField());
        assertEquals(2, question.getNumberOfAnswers());
    }
    
    @Test
    public void addAnswer() {
        Question question = new Question ("Another question", 3);
        question.addAnswer ("One more question");
        assertEquals("One more question", question.getAnswer(0));
    }
    
    @Test
    public void addTooManyAnswersTest() {
        Question question = new Question ("How many grams in a KG?", 4);
        question.addAnswer ("1");
        assertEquals(false, question.getExceedTheNumberOfAnswers());
        question.addAnswer ("2");
        assertEquals(false, question.getExceedTheNumberOfAnswers());
        question.addAnswer ("3");
        assertEquals(false, question.getExceedTheNumberOfAnswers());
        question.addAnswer ("4");
        assertEquals(false, question.getExceedTheNumberOfAnswers());
        question.addAnswer ("5");
        assertEquals(true, question.getExceedTheNumberOfAnswers());
    }
}
