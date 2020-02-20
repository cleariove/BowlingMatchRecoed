package bowling.controller;

import bowling.dao.InningRecordDAO;
import bowling.dao.InningRecordDAOImpl;
import bowling.logic.RoundRecords;

public class Pratical {
    static InningRecordDAO DAO = new InningRecordDAOImpl();

    public static void insertRecord(int i, int j, RoundRecords[][] roundRecords)
    {
        for (int p = 0; p < i; p++)
            for (int k = 0; k < j; k++) {
                DAO.insertRecord(roundRecords[p][0].get(k).getEvent(), roundRecords[p][0].get(k).getName(),
                        roundRecords[p][0].get(k).getTeamNum(), roundRecords[p][0].get(k).getInning(),
                        roundRecords[p][0].get(k).getFirstScore(), roundRecords[p][0].get(k).getSecondScore(),
                        roundRecords[p][0].get(k).getScoreType(), roundRecords[p][0].get(k).getPersonRoundScore(),
                        roundRecords[p][1].get(k).getFirstScore(), roundRecords[p][1].get(k).getSecondScore(),
                        roundRecords[p][1].get(k).getScoreType(), roundRecords[p][1].get(k).getPersonRoundScore(),
                        roundRecords[p][2].get(k).getFirstScore(), roundRecords[p][2].get(k).getSecondScore(),
                        roundRecords[p][2].get(k).getScoreType(), roundRecords[p][2].get(k).getPersonRoundScore(),
                        roundRecords[p][3].get(k).getFirstScore(), roundRecords[p][3].get(k).getSecondScore(),
                        roundRecords[p][3].get(k).getScoreType(), roundRecords[p][3].get(k).getPersonRoundScore(),
                        roundRecords[p][4].get(k).getFirstScore(), roundRecords[p][4].get(k).getSecondScore(),
                        roundRecords[p][4].get(k).getScoreType(), roundRecords[p][4].get(k).getPersonRoundScore(),
                        roundRecords[p][5].get(k).getFirstScore(), roundRecords[p][5].get(k).getSecondScore(),
                        roundRecords[p][5].get(k).getScoreType(), roundRecords[p][5].get(k).getPersonRoundScore(),
                        roundRecords[p][6].get(k).getFirstScore(), roundRecords[p][6].get(k).getSecondScore(),
                        roundRecords[p][6].get(k).getScoreType(), roundRecords[p][6].get(k).getPersonRoundScore(),
                        roundRecords[p][7].get(k).getFirstScore(), roundRecords[p][7].get(k).getSecondScore(),
                        roundRecords[p][7].get(k).getScoreType(), roundRecords[p][7].get(k).getPersonRoundScore(),
                        roundRecords[p][8].get(k).getFirstScore(), roundRecords[p][8].get(k).getSecondScore(),
                        roundRecords[p][8].get(k).getScoreType(), roundRecords[p][8].get(k).getPersonRoundScore(),
                        roundRecords[p][9].get(k).getFirstScore(), roundRecords[p][9].get(k).getSecondScore(),
                        roundRecords[p][9].get(k).getThirdScore(), roundRecords[p][9].get(k).getScoreType(),
                        roundRecords[p][9].get(k).getPersonRoundScore(), roundRecords[p][9].get(k).getPersonInningScore(),
                        roundRecords[p][9].get(k).getTeamInningScore());
            }
    }

}
