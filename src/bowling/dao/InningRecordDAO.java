package bowling.dao ;

import bowling.logic.InningRecord;

import java.util.ArrayList;
import java.util.List;

public interface InningRecordDAO
{
    boolean insertRecord(String event , String name , int teamNum , int inning , int firstScore1 , int secondScore1 ,
              String scoreType1 , int personRoundScore1 ,int firstScore2 , int secondScore2 , String scoreType2 ,
              int personRoundScore2 ,int firstScore3 , int secondScore3 , String scoreType3 ,int personRoundScore3 , int firstScore4 ,
              int secondScore4 , String scoreType4 , int personRoundScore4 ,int firstScore5 , int secondScore5 , String scoreType5 ,
              int personRoundScore5 , int firstScore6 , int secondScore6 , String scoreType6 ,int personRoundScore6 ,int firstScore7 , int secondScore7 ,
              String scoreType7 , int personRoundScore7 ,int firstScore8 , int secondScore8 , String scoreType8 ,int personRoundScore8 ,
              int firstScore9 , int secondScore9 , String scoreType9 , int personRoundScore9 ,int firstScore10 ,
              int secondScore10 , int thirdScore , String scoreType10 ,int personRoundScore10 , int personInningScore , int teamInningScore);

    ArrayList<InningRecord> getMatchScoreByInning(int inning,String event);

    InningRecord getInningScoreByName(String event,String name,int inning);

}
