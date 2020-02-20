package bowling.logic;


public class PentaMatch extends Match
{
    public PentaMatch()
    {

    }

    public PentaMatch(AllPlayers pentaPlayers, RoundRecords[][] roundRecords)
    {
        super(roundRecords, pentaPlayers,"五人赛",6,10,5,60);
    }

}
