package bowling.dao;

import bowling.logic.Player;
import java.sql.*;
import java.util.ArrayList;

public class PlayerDAOImpl extends DBConnection implements PlayerDAO
{
    @Override
    public boolean insertPlayer(String name, String id, String sex)
    {
        String sql ="insert into player(name,id,sex) values(?,?,?)";
        try(Connection conn = getConnection())
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,id);
            pstmt.setString(3,sex);
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateScore(String name, int score)
    {
        String sql = "update player set score=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateSingleScore(String name, int score)
    {
        String sql = "update player set singleScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateDoubleScore(String name, int score)
    {
        String sql = "update player set doubleScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateTripleScore(String name, int score)
    {
        String sql = "update player set tripleScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updatePentaScore(String name, int score)
    {
        String sql = "update player set pentaScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateClassicScore(String name, int score)
    {
        String sql = "update player set classicScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateTopFourScore(String name, int score)
    {
        String sql = "update player set topFourScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateTopThreeScore(String name, int score)
    {
        String sql = "update player set topThreeScore=? where name = ?";
        return update(name,score,sql);
    }

    @Override
    public boolean updateFinalScore(String name, int score)
    {
        String sql = "update player set finalScore=? where name = ?";
        return update(name,score,sql);
    }

    public boolean update(String name,int score,String sql)
    {
        try(Connection conn = getConnection())
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,score);
            pstmt.setString(2,name);
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Player getOnePlayerByName(String name)
    {
        String sql = "select * from player where name = ?";
        try(Connection conn = getConnection())
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                Player player = new Player(rs.getString("name"), rs.getString("sex"),
                        rs.getString("id"));
                setPlayer(player,rs);
                return player;
            }
            return null;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Player> getAllPlayer()
    {
        return getPlayerByTotalRank(60);
    }

    @Override
    public ArrayList<Player> getPlayerByTotalRank(int rank)
    {
        String sql = "select * from player order by score desc limit ?";
        return getPlayer(sql,rank);
    }

    @Override
    public ArrayList<Player> getPlayerBySingleMatchRank(int rank)
    {
        String sql = "select * from player order by singleScore desc limit ?";
        return getPlayer(sql,rank);
    }

    @Override
    public ArrayList<Player> getPlayerByDoubleMatchRank(int rank)
    {
        String sql = "select * from player order by doubleScore desc limit ?";
        return getPlayer(sql,rank * 2);
    }

    @Override
    public ArrayList<Player> getPlayerByTripleMatchRank(int rank)
    {
        String sql = "select * from player order by tripleScore desc limit ?";
        return getPlayer(sql,rank * 3);
    }

    @Override
    public ArrayList<Player> getPlayerByPentaMatchRank(int rank)
    {
        String sql = "select * from player order by pentaScore desc limit ?";
        return getPlayer(sql,rank * 5);
    }

    @Override
    public ArrayList<Player> getPlayerByClassicMatchRank(int rank)
    {
        String sql = "select * from player order by classicScore desc limit ?";
        return getPlayer(sql,rank);
    }

    @Override
    public ArrayList<Player> getPlayerByTopFourMatchRank(int rank)
    {
        String sql = "select * from player order by topFourScore desc limit ?";
        return getPlayer(sql,rank);
    }

    @Override
    public ArrayList<Player> getPlayerByTopThreeMatchRank(int rank)
    {
        String sql = "select * from player order by topThreeScore desc limit ?";
        return getPlayer(sql,rank);
    }

    @Override
    public ArrayList<Player> getPlayerByFinalMatchRank(int rank)
    {
        String sql = "select * from player order by finalScore desc limit ?";
        return getPlayer(sql,rank);
    }

    public ArrayList<Player> getPlayer(String sql,int rank)
    {
        try(Connection conn = getConnection())
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,rank);
            ResultSet rs = pstmt.executeQuery();
            ArrayList<Player> players = new ArrayList<>();
            while(rs.next())
            {
                Player player = new Player(rs.getString("name"), rs.getString("sex"), rs.getString("id"));
                setPlayer(player,rs);
                players.add(player);
            }
            return players;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void setPlayer(Player player,ResultSet rs) throws SQLException
    {
        player.setScore(rs.getInt("score"));
        player.setSingleScore(rs.getInt("singleScore"));
        player.setDoubleScore(rs.getInt("doubleScore"));
        player.setTripleScore(rs.getInt("tripleScore"));
        player.setPentaScore(rs.getInt("pentaScore"));
        player.setClassicScore(rs.getInt("classicScore"));
        player.setTopFourScore(rs.getInt("topFourScore"));
        player.setTopThreeScore(rs.getInt("topThreeScore"));
        player.setClassicScore(rs.getInt("classicScore"));
    }
}
