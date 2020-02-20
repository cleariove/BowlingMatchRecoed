package bowling.logic;

public class DoubleMatch extends Match
{
    public DoubleMatch()
    {

    }

    public DoubleMatch(AllPlayers doublePlayers, RoundRecords[][] roundRecords)
    {
        super(roundRecords, doublePlayers,"双人赛",6,10,2,60);
    }

}
