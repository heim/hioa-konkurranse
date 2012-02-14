package no.bekk;



import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzBananaFudgeTest
{
    FizzBuzzBananaFudge underTest;

    @Before
    public void setUp() {
        underTest = new FizzBuzzBananaFudge();
    }

    @Test
    public void returns1WhenGiven1() {
        checkResult(1, "1");
    }

    @Test
    public void returns2whenGiven2() {
        checkResult(2, "2");
    }

    @Test
    public void returnsFizzWhenGiven3() {
        checkResult(3, "fizz");
    }

    @Test
    public void returnsBuzzWhenGiven5() {
        checkResult(5, "buzz");
    }

    @Test
    public void returnsBuzzWhenGivenNumberDivisibleBy5() {
        checkResult(10, "buzz");
    }

    @Test
    public void returnsFizzWhenGivenNumberDivisibleBy3() {
        checkResult(9, "fizz");
    }

    @Test
    public void returnsBananaFudgeWhenGivenNumber15(){
        checkResult(15, "bananafudge");
    }


    @Test
    public void itBehavesAsExpected() {
        checkResult(4, "4");
        checkResult(7, "7");
        checkResult(100, "buzz");
        checkResult(90, "bananafudge");
        checkResult(63, "fizz");
        checkResult(55, "buzz");
        checkResult(53, "53");

    }

    private void checkResult(int value, String expected) {
        String result = underTest.process(value);
        assertThat(result, equalTo(expected));
    }

}
