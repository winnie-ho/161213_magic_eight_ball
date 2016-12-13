package com.example.user.eightball;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class AnswerTest {
    Answer answer;

    @Before
    public void Before() {
        answer = new Answer();
    }

    @Test
    public void getAnswersTest(){
        assertNotNull(answer.getAnswers());
    }

    @Test
    public void getAnswerCountTest(){
        assertEquals(2, answer.getAnswerCount());
    }

    @Test
    public void getAnswerAtIndexTest(){
        assertEquals("yes!",answer.getAnswerAtIndex(0));
    }

    @Test
    public void addTest(){
        int initialCount = answer.getAnswerCount();
        answer.add("No!");
        int newCount = answer.getAnswerCount();
        assertEquals("No!", answer.getAnswerAtIndex(2));
        assertEquals(1, newCount - initialCount);
    }

    @Test
    public void getAnswerTest(){

        assertNotNull(answer.getAnswer());
    }

}
