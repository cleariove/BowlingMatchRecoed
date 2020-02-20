package bowling.logic;

public class FinalMatch extends Match
{

    public FinalMatch()
    {

    }

    public FinalMatch(AllPlayers finalPlayers, RoundRecords[][] roundRecords, String event)
    {
        super(roundRecords, finalPlayers,event,2,10,1,2);
    }

}
