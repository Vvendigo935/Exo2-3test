package example.exo2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class FibTEST {

private Fib fib;

    @Test
    public void whenResultIsNotNull() {
        // arrange
        fib = new Fib(1);


        // act
        List<Integer> result = fib.getFibSeries();

        // assert
       // Assert.assertFalse(result.isEmpty());
        Assert.assertNotNull(result);
    }
    @Test
    public void whenResultHasZero() {
        // arrange
        fib = new Fib(1);


        // act
        List<Integer> result = fib.getFibSeries();

        // assert
         Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void whenResultContainThree() {
        // arrange
        fib = new Fib(6);


        // act
        List<Integer> result = fib.getFibSeries();

        // assert
        Assert.assertFalse(result != null && result.size() == 3);
    } // a mon avis c'est pas ça

    @Test
    public void whenResultContainsSixElements() {
        // arrange
        fib = new Fib(6);


        // act
        List<Integer> result = fib.getFibSeries();

        // assert
        Assert.assertFalse(result.contains(6));
    }

    @Test
    public void whenResultDoesNotHaveTheNumberFour() {
        // arrange
        fib = new Fib(6);


        // act
        List<Integer> result = fib.getFibSeries();

        // assert
        Assert.assertFalse(4 == result.size());
    }


}
