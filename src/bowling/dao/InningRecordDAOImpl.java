package bowling.dao;

import bowling.logic.InningRecord;
import java.sql.*;
import java.util.ArrayList;

public class InningRecordDAOImpl extends DBConnection implements InningRecordDAO
{

    @Override
    public boolean insertRecord(String event, String name, int teamNum, int inning, int firstScore1, int secondScore1, String scoreType1, int personRoundScore1, int firstScore2, int secondScore2, String scoreType2, int personRoundScore2, int firstScore3, int secondScore3, String scoreType3, int personRoundScore3, int firstScore4, int secondScore4, String scoreType4, int personRoundScore4, int firstScore5, int secondScore5, String scoreType5, int personRoundScore5, int firstScore6, int secondScore6, String scoreType6, int personRoundScore6, int firstScore7, int secondScore7, String scoreType7, int personRoundScore7, int firstScore8, int secondScore8, String scoreType8, int personRoundScore8, int firstScore9, int secondScore9, String scoreType9, int personRoundScore9, int firstScore10, int secondScore10, int thirdScore, String scoreType10, int personRoundScore10, int personInningScore, int teamInningScore) {

        String sql = "insert into inningrecord values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, event);
            pstmt.setString(2, name);
            pstmt.setInt(3, teamNum);
            pstmt.setInt(4, inning);
            pstmt.setInt(5, firstScore1);
            pstmt.setInt(6, secondScore1);
            pstmt.setString(7, scoreType1);
            pstmt.setInt(8, personRoundScore1);
            pstmt.setInt(9, firstScore2);
            pstmt.setInt(10, secondScore2);
            pstmt.setString(11, scoreType2);
            pstmt.setInt(12, personRoundScore2);
            pstmt.setInt(13, firstScore3);
            pstmt.setInt(14, secondScore3);
            pstmt.setString(15, scoreType3);
            pstmt.setInt(16, personRoundScore3);
            pstmt.setInt(17, firstScore4);
            pstmt.setInt(18, secondScore4);
            pstmt.setString(19, scoreType4);
            pstmt.setInt(20, personRoundScore4);
            pstmt.setInt(21, firstScore5);
            pstmt.setInt(22, secondScore5);
            pstmt.setString(23, scoreType5);
            pstmt.setInt(24, personRoundScore5);
            pstmt.setInt(25, firstScore6);
            pstmt.setInt(26, secondScore6);
            pstmt.setString(27, scoreType6);
            pstmt.setInt(28, personRoundScore6);
            pstmt.setInt(29, firstScore7);
            pstmt.setInt(30, secondScore7);
            pstmt.setString(31, scoreType7);
            pstmt.setInt(32, personRoundScore7);
            pstmt.setInt(33, firstScore8);
            pstmt.setInt(34, secondScore8);
            pstmt.setString(35, scoreType8);
            pstmt.setInt(36, personRoundScore8);
            pstmt.setInt(37, firstScore9);
            pstmt.setInt(38, secondScore9);
            pstmt.setString(39, scoreType9);
            pstmt.setInt(40, personRoundScore9);
            pstmt.setInt(41, firstScore10);
            pstmt.setInt(42, secondScore10);
            pstmt.setInt(43, thirdScore);
            pstmt.setString(44, scoreType10);
            pstmt.setInt(45, personRoundScore10);
            pstmt.setInt(46, personInningScore);
            pstmt.setInt(47, teamInningScore);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public ArrayList<InningRecord> getMatchScoreByInning(int inning, String event)
    {
        String sql = "select * from inningrecord where inning = ? and event = ? order by teamNum ";
        try (Connection conn = getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, inning);
            pstmt.setString(2, event);
            ResultSet rs = pstmt.executeQuery();
            ArrayList<InningRecord> inningRecords = new ArrayList<>();
            while (rs.next()) {
                InningRecord inningRecord = new InningRecord();
                setInningRecord(rs,inningRecord);
                inningRecords.add(inningRecord);
            }
            return inningRecords;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public InningRecord getInningScoreByName(String event, String name, int inning)
            //可以得到某比赛某人某局查询的结果
    {
        String sql ="select * from inningrecord where event = ? and name =? and inning = ?";
        try(Connection conn = getConnection())
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,event);
            pstmt.setString(2,name);
            pstmt.setInt(3,inning);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                InningRecord inningRecord = new InningRecord();
                setInningRecord(rs,inningRecord);
                return inningRecord;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public void setInningRecord(ResultSet rs,InningRecord inningRecord) throws SQLException
    {
        inningRecord.setName(rs.getString("name"));
        inningRecord.setEvent(rs.getString("event"));
        inningRecord.setInning(rs.getInt("inning"));
        inningRecord.setTeamNum(rs.getInt("teamNum"));
        inningRecord.setFirstScore1(rs.getInt("firstScore1"));
        inningRecord.setSecondScore1(rs.getInt("secondScore1"));
        inningRecord.setPersonRoundScore1(rs.getInt("personRoundScore1"));
        inningRecord.setScoreType1(rs.getString("scoreType1"));
        inningRecord.setFirstScore2(rs.getInt("firstScore2"));
        inningRecord.setSecondScore2(rs.getInt("secondScore2"));
        inningRecord.setPersonRoundScore2(rs.getInt("personRoundScore2"));
        inningRecord.setScoreType2(rs.getString("scoreType2"));
        inningRecord.setFirstScore3(rs.getInt("firstScore3"));
        inningRecord.setSecondScore3(rs.getInt("secondScore3"));
        inningRecord.setScoreType3(rs.getString("scoreType3"));
        inningRecord.setPersonRoundScore3(rs.getInt("personRoundScore3"));
        inningRecord.setFirstScore4(rs.getInt("firstScore4"));
        inningRecord.setSecondScore4(rs.getInt("secondScore4"));
        inningRecord.setPersonRoundScore4(rs.getInt("personRoundScore4"));
        inningRecord.setScoreType4(rs.getString("scoreType4"));
        inningRecord.setFirstScore5(rs.getInt("firstScore5"));
        inningRecord.setSecondScore5(rs.getInt("secondScore5"));
        inningRecord.setPersonRoundScore5(rs.getInt("personRoundScore5"));
        inningRecord.setScoreType5(rs.getString("scoreType5"));
        inningRecord.setFirstScore6(rs.getInt("firstScore6"));
        inningRecord.setSecondScore6(rs.getInt("secondScore6"));
        inningRecord.setScoreType6(rs.getString("scoreType6"));
        inningRecord.setPersonRoundScore6(rs.getInt("personRoundScore6"));
        inningRecord.setFirstScore7(rs.getInt("firstScore7"));
        inningRecord.setSecondScore7(rs.getInt("secondScore7"));
        inningRecord.setScoreType7(rs.getString("scoreType7"));
        inningRecord.setPersonRoundScore7(rs.getInt("personRoundScore7"));
        inningRecord.setFirstScore8(rs.getInt("firstScore8"));
        inningRecord.setSecondScore8(rs.getInt("secondScore8"));
        inningRecord.setScoreType8(rs.getString("scoreType8"));
        inningRecord.setPersonRoundScore8(rs.getInt("personRoundScore8"));
        inningRecord.setFirstScore9(rs.getInt("firstScore9"));
        inningRecord.setSecondScore9(rs.getInt("secondScore9"));
        inningRecord.setScoreType9(rs.getString("scoreType9"));
        inningRecord.setPersonRoundScore9(rs.getInt("personRoundScore9"));
        inningRecord.setFirstScore10(rs.getInt("firstScore10"));
        inningRecord.setSecondScore10(rs.getInt("secondScore10"));
        inningRecord.setThirdScore(rs.getInt("thirdScore"));
        inningRecord.setScoreType10(rs.getString("scoreType10"));
        inningRecord.setPersonRoundScore10(rs.getInt("personRoundScore10"));
        inningRecord.setPersonInningScore(rs.getInt("personInningScore"));
        inningRecord.setTeamInningScore(rs.getInt("teamInningScore"));
    }


}
