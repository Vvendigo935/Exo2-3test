package example.exo3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class DiceScoreTEST {

    private DiceScore diceScore;

    private InterfaceDice interfaceDice = Mockito.mock(InterfaceDice.class);

    @Test
    public void whenBothDiceScoreAreEqual() {
        // arrange
        diceScore = new DiceScore(interfaceDice);
        Mockito.when(interfaceDice.getRoll()).thenReturn(10).thenReturn(10);

        // act
        List<DiceScore> scores = new ArrayList<>();
        boolean result = scores.equals();

        // assert
        Assert.assertTrue(result);

    }

}
