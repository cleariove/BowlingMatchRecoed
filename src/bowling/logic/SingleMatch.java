package bowling.logic;

public class SingleMatch extends Match
{

    public SingleMatch()
    {

    }

    public SingleMatch(AllPlayers singlePlayers, RoundRecords[][] roundRecords)
    {
        super(roundRecords, singlePlayers,"单人赛",6,10,1,60);
    }


}
