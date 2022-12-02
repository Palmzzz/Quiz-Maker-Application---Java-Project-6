import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Milan Palmer
 * @version 1.0
 */
public class InputReaderTest
{
    /**
     * Default constructor for test class InputReaderTest
     */
    public InputReaderTest()
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
    public void constructorTest() {
        InputReader reader = new InputReader();
        assertNotNull(reader.getScanner());
    }
    
    @Test
    public void getNumberTest() {
        InputReader reader = new InputReader("testNumber.txt");
        int number = reader.getNumber("Enter a number");
        assertEquals(5, number);
        number = reader.getNumber("Enter a number");
        assertEquals(-1, number);
    }
    
    @Test
    public void getTextTest() {
        InputReader reader = new InputReader("testText.txt");
        String text = reader.getText("Enter some text");
        assertEquals("How many months in a year?", text);
        text = reader.getText("Enter some text");
        assertEquals("What is the capital of England?", text);
    }
    
    @Test
    public void getMixedInput() {
        InputReader reader = new InputReader("mixedInput.txt");
        int number = reader.getNumber("Enter a number");
        assertEquals(2, number);
        String text = reader.getText("Enter some text");
        assertEquals("my input", text);
        number = reader.getNumber("Enter a number");
        assertEquals(9, number);
        text = reader.getText("Enter some text");
        assertEquals("more input", text);
    }
}
