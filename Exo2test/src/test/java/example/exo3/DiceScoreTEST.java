package example.exo3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DiceScoreTEST {

    private DiceScore diceScore;

    private InterfaceDice interfaceDice = Mockito.mock(InterfaceDice.class);

    @Test
    public void whenBothDiceScoreAreEqual() {
        // arrange
        diceScore = new DiceScore();
        Mockito.when(diceScore.getScore()thenReturn(6));

        // act
        boolean result = diceScore.getScore().scoreFirst.equals(scoreSecond);

        // assert
        Assert.assertTrue(result);

    }

}
