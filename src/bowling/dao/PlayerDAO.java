package bowling.dao;

import bowling.logic.Player;
import java.util.ArrayList;

public interface PlayerDAO
{
    boolean insertPlayer(String name,String id,String sex);
    boolean updateScore(String name,int score);
    boolean updateSingleScore(String name,int score);
    boolean updateDoubleScore(String name,int score);
    boolean updateTripleScore(String name,int score);
    boolean updatePentaScore(String name,int score);
    boolean updateClassicScore(String name,int score);
    boolean updateTopFourScore(String name,int score);
    boolean updateTopThreeScore(String name,int score);
    boolean updateFinalScore(String name,int score);
    ArrayList<Player> getAllPlayer();
    Player getOnePlayerByName(String name);
    ArrayList<Player> getPlayerByTotalRank(int rank);
    ArrayList<Player> getPlayerBySingleMatchRank(int rank);
    ArrayList<Player> getPlayerByDoubleMatchRank(int rank);
    ArrayList<Player> getPlayerByTripleMatchRank(int rank);
    ArrayList<Player> getPlayerByPentaMatchRank(int rank);
    ArrayList<Player> getPlayerByClassicMatchRank(int rank);
    ArrayList<Player> getPlayerByTopFourMatchRank(int rank);
    ArrayList<Player> getPlayerByTopThreeMatchRank(int rank);
    ArrayList<Player> getPlayerByFinalMatchRank(int rank);
}
