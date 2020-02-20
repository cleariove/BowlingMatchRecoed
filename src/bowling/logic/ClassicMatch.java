package bowling.logic;

public class ClassicMatch extends Match
{
    public ClassicMatch()
    {

    }

    public ClassicMatch(AllPlayers classicPlayers, RoundRecords[][] roundRecords)
    {
        super(roundRecords, classicPlayers,"精英赛",15,10,1,16);
}


}
