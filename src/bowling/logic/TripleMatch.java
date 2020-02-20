package bowling.logic;

public class TripleMatch extends Match
{
    public TripleMatch()
    {
    }

    public TripleMatch(AllPlayers triplePlayers, RoundRecords[][] roundRecords)
    {
        super(roundRecords, triplePlayers,"三人赛",6,10,3,60);
    }


}