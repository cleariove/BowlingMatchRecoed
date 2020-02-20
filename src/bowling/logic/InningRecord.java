package bowling.logic;

public class InningRecord
{
    private String event;//比赛类型
    private String name;//选手姓名
    private int teamNum;//选手所在队伍编号
    private int inning;//局数
    private int firstScore1;//第一次扔球得分
    private int secondScore1;//第二次扔球得分
    private int personRoundScore1;//选手该轮总得分，
    private String scoreType1;//得分类型是全中,补中还是失误
    private int firstScore2;//第一次扔球得分
    private int secondScore2;//第二次扔球得分
    private int personRoundScore2;//选手该轮总得分，
    private String scoreType2;//得分类型是全中,补中还是失误
    private int firstScore3;//第一次扔球得分
    private int secondScore3;//第二次扔球得分
    private int personRoundScore3;//选手该轮总得分，
    private String scoreType3;//得分类型是全中,补中还是失误
    private int firstScore4;//第一次扔球得分
    private int secondScore4;//第二次扔球得分
    private int personRoundScore4;//选手该轮总得分，
    private String scoreType4;//得分类型是全中,补中还是失误
    private int firstScore5;//第一次扔球得分
    private int secondScore5;//第二次扔球得分
    private int personRoundScore5;//选手该轮总得分，
    private String scoreType5;//得分类型是全中,补中还是失误
    private int firstScore6;//第一次扔球得分
    private int secondScore6;//第二次扔球得分
    private int personRoundScore6;//选手该轮总得分，
    private String scoreType6;//得分类型是全中,补中还是失误
    private int firstScore7;//第一次扔球得分
    private int secondScore7;//第二次扔球得分
    private int personRoundScore7;//选手该轮总得分，
    private String scoreType7;//得分类型是全中,补中还是失误
    private int firstScore8;//第一次扔球得分
    private int secondScore8;//第二次扔球得分
    private int personRoundScore8;//选手该轮总得分，
    private String scoreType8;//得分类型是全中,补中还是失误
    private int firstScore9;//第一次扔球得分
    private int secondScore9;//第二次扔球得分
    private int personRoundScore9;//选手该轮总得分，
    private String scoreType9;//得分类型是全中,补中还是失误
    private int firstScore10;//第一次扔球得分
    private int secondScore10;//第二次扔球得分
    private int thirdScore;//第三次扔球得分
    private int personRoundScore10;//选手该轮总得分
    private String scoreType10;//得分类型是全中,补中还是失误
    private int personInningScore;//选手该局总分
    private int teamInningScore;//该局队伍总分

    public InningRecord()
    {
    }

    public InningRecord(String event, String name, int teamNum, int inning, int firstScore1, int secondScore1, int personRoundScore1, String scoreType1, int firstScore2, int secondScore2, int personRoundScore2, String scoreType2, int firstScore3, int secondScore3, int personRoundScore3, String scoreType3, int firstScore4, int secondScore4, int personRoundScore4, String scoreType4, int firstScore5, int secondScore5, int personRoundScore5, String scoreType5, int firstScore6, int secondScore6, int personRoundScore6, String scoreType6, int firstScore7, int secondScore7, int personRoundScore7, String scoreType7, int firstScore8, int secondScore8, int personRoundScore8, String scoreType8, int firstScore9, int secondScore9, int personRoundScore9, String scoreType9, int firstScore10, int secondScore10, int thirdScore, int personRoundScore10, String scoreType10, int personInningScore, int teamInningScore)
    {
        this.event = event;
        this.name = name;
        this.teamNum = teamNum;
        this.inning = inning;
        this.firstScore1 = firstScore1;
        this.secondScore1 = secondScore1;
        this.personRoundScore1 = personRoundScore1;
        this.scoreType1 = scoreType1;
        this.firstScore2 = firstScore2;
        this.secondScore2 = secondScore2;
        this.personRoundScore2 = personRoundScore2;
        this.scoreType2 = scoreType2;
        this.firstScore3 = firstScore3;
        this.secondScore3 = secondScore3;
        this.personRoundScore3 = personRoundScore3;
        this.scoreType3 = scoreType3;
        this.firstScore4 = firstScore4;
        this.secondScore4 = secondScore4;
        this.personRoundScore4 = personRoundScore4;
        this.scoreType4 = scoreType4;
        this.firstScore5 = firstScore5;
        this.secondScore5 = secondScore5;
        this.personRoundScore5 = personRoundScore5;
        this.scoreType5 = scoreType5;
        this.firstScore6 = firstScore6;
        this.secondScore6 = secondScore6;
        this.personRoundScore6 = personRoundScore6;
        this.scoreType6 = scoreType6;
        this.firstScore7 = firstScore7;
        this.secondScore7 = secondScore7;
        this.personRoundScore7 = personRoundScore7;
        this.scoreType7 = scoreType7;
        this.firstScore8 = firstScore8;
        this.secondScore8 = secondScore8;
        this.personRoundScore8 = personRoundScore8;
        this.scoreType8 = scoreType8;
        this.firstScore9 = firstScore9;
        this.secondScore9 = secondScore9;
        this.personRoundScore9 = personRoundScore9;
        this.scoreType9 = scoreType9;
        this.firstScore10 = firstScore10;
        this.secondScore10 = secondScore10;
        this.thirdScore = thirdScore;
        this.personRoundScore10 = personRoundScore10;
        this.scoreType10 = scoreType10;
        this.personInningScore = personInningScore;
        this.teamInningScore = teamInningScore;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(int teamNum) {
        this.teamNum = teamNum;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public int getFirstScore1() {
        return firstScore1;
    }

    public void setFirstScore1(int firstScore1) {
        this.firstScore1 = firstScore1;
    }

    public int getSecondScore1() {
        return secondScore1;
    }

    public void setSecondScore1(int secondScore1) {
        this.secondScore1 = secondScore1;
    }

    public int getPersonRoundScore1() {
        return personRoundScore1;
    }

    public void setPersonRoundScore1(int personRoundScore1) {
        this.personRoundScore1 = personRoundScore1;
    }

    public String getScoreType1() {
        return scoreType1;
    }

    public void setScoreType1(String scoreType1) {
        this.scoreType1 = scoreType1;
    }

    public int getFirstScore2() {
        return firstScore2;
    }

    public void setFirstScore2(int firstScore2) {
        this.firstScore2 = firstScore2;
    }

    public int getSecondScore2() {
        return secondScore2;
    }

    public void setSecondScore2(int secondScore2) {
        this.secondScore2 = secondScore2;
    }

    public int getPersonRoundScore2() {
        return personRoundScore2;
    }

    public void setPersonRoundScore2(int personRoundScore2) {
        this.personRoundScore2 = personRoundScore2;
    }

    public String getScoreType2() {
        return scoreType2;
    }

    public void setScoreType2(String scoreType2) {
        this.scoreType2 = scoreType2;
    }

    public int getFirstScore3() {
        return firstScore3;
    }

    public void setFirstScore3(int firstScore3) {
        this.firstScore3 = firstScore3;
    }

    public int getSecondScore3() {
        return secondScore3;
    }

    public void setSecondScore3(int secondScore3) {
        this.secondScore3 = secondScore3;
    }

    public int getPersonRoundScore3() {
        return personRoundScore3;
    }

    public void setPersonRoundScore3(int personRoundScore3) {
        this.personRoundScore3 = personRoundScore3;
    }

    public String getScoreType3() {
        return scoreType3;
    }

    public void setScoreType3(String scoreType3) {
        this.scoreType3 = scoreType3;
    }

    public int getFirstScore4() {
        return firstScore4;
    }

    public void setFirstScore4(int firstScore4) {
        this.firstScore4 = firstScore4;
    }

    public int getSecondScore4() {
        return secondScore4;
    }

    public void setSecondScore4(int secondScore4) {
        this.secondScore4 = secondScore4;
    }

    public int getPersonRoundScore4() {
        return personRoundScore4;
    }

    public void setPersonRoundScore4(int personRoundScore4) {
        this.personRoundScore4 = personRoundScore4;
    }

    public String getScoreType4() {
        return scoreType4;
    }

    public void setScoreType4(String scoreType4) {
        this.scoreType4 = scoreType4;
    }

    public int getFirstScore5() {
        return firstScore5;
    }

    public void setFirstScore5(int firstScore5) {
        this.firstScore5 = firstScore5;
    }

    public int getSecondScore5() {
        return secondScore5;
    }

    public void setSecondScore5(int secondScore5) {
        this.secondScore5 = secondScore5;
    }

    public int getPersonRoundScore5() {
        return personRoundScore5;
    }

    public void setPersonRoundScore5(int personRoundScore5) {
        this.personRoundScore5 = personRoundScore5;
    }

    public String getScoreType5() {
        return scoreType5;
    }

    public void setScoreType5(String scoreType5) {
        this.scoreType5 = scoreType5;
    }

    public int getFirstScore6() {
        return firstScore6;
    }

    public void setFirstScore6(int firstScore6) {
        this.firstScore6 = firstScore6;
    }

    public int getSecondScore6() {
        return secondScore6;
    }

    public void setSecondScore6(int secondScore6) {
        this.secondScore6 = secondScore6;
    }

    public int getPersonRoundScore6() {
        return personRoundScore6;
    }

    public void setPersonRoundScore6(int personRoundScore6) {
        this.personRoundScore6 = personRoundScore6;
    }

    public String getScoreType6() {
        return scoreType6;
    }

    public void setScoreType6(String scoreType6) {
        this.scoreType6 = scoreType6;
    }

    public int getFirstScore7() {
        return firstScore7;
    }

    public void setFirstScore7(int firstScore7) {
        this.firstScore7 = firstScore7;
    }

    public int getSecondScore7() {
        return secondScore7;
    }

    public void setSecondScore7(int secondScore7) {
        this.secondScore7 = secondScore7;
    }

    public int getPersonRoundScore7() {
        return personRoundScore7;
    }

    public void setPersonRoundScore7(int personRoundScore7) {
        this.personRoundScore7 = personRoundScore7;
    }

    public String getScoreType7() {
        return scoreType7;
    }

    public void setScoreType7(String scoreType7) {
        this.scoreType7 = scoreType7;
    }

    public int getFirstScore8() {
        return firstScore8;
    }

    public void setFirstScore8(int firstScore8) {
        this.firstScore8 = firstScore8;
    }

    public int getSecondScore8() {
        return secondScore8;
    }

    public void setSecondScore8(int secondScore8) {
        this.secondScore8 = secondScore8;
    }

    public int getPersonRoundScore8() {
        return personRoundScore8;
    }

    public void setPersonRoundScore8(int personRoundScore8) {
        this.personRoundScore8 = personRoundScore8;
    }

    public String getScoreType8() {
        return scoreType8;
    }

    public void setScoreType8(String scoreType8) {
        this.scoreType8 = scoreType8;
    }

    public int getFirstScore9() {
        return firstScore9;
    }

    public void setFirstScore9(int firstScore9) {
        this.firstScore9 = firstScore9;
    }

    public int getSecondScore9() {
        return secondScore9;
    }

    public void setSecondScore9(int secondScore9) {
        this.secondScore9 = secondScore9;
    }

    public int getPersonRoundScore9() {
        return personRoundScore9;
    }

    public void setPersonRoundScore9(int personRoundScore9) {
        this.personRoundScore9 = personRoundScore9;
    }

    public String getScoreType9() {
        return scoreType9;
    }

    public void setScoreType9(String scoreType9) {
        this.scoreType9 = scoreType9;
    }

    public int getFirstScore10() {
        return firstScore10;
    }

    public void setFirstScore10(int firstScore10) {
        this.firstScore10 = firstScore10;
    }

    public int getSecondScore10() {
        return secondScore10;
    }

    public void setSecondScore10(int secondScore10) {
        this.secondScore10 = secondScore10;
    }

    public int getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(int thirdScore) {
        this.thirdScore = thirdScore;
    }

    public int getPersonRoundScore10() {
        return personRoundScore10;
    }

    public void setPersonRoundScore10(int personRoundScore10) {
        this.personRoundScore10 = personRoundScore10;
    }

    public String getScoreType10() {
        return scoreType10;
    }

    public void setScoreType10(String scoreType10) {
        this.scoreType10 = scoreType10;
    }

    public int getPersonInningScore() {
        return personInningScore;
    }

    public void setPersonInningScore(int personInningScore) {
        this.personInningScore = personInningScore;
    }

    public int getTeamInningScore() {
        return teamInningScore;
    }

    public void setTeamInningScore(int teamInningScore) {
        this.teamInningScore = teamInningScore;
    }
}
