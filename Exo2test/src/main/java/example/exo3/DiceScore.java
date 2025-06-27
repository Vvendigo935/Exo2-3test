package example.exo3;

public class DiceScore {

    private InterfaceDice dice;

    public int getScore (){
        int scoreFirst = dice.getRoll();
        int scoreSecond = dice.getRoll();

        if(scoreFirst == scoreSecond){
            if(scoreFirst == 6){
                return 30;
            }
            return scoreFirst*2 + 10;
        }else{
            return scoreFirst < scoreSecond ? scoreSecond : scoreFirst;
        }
    }
}