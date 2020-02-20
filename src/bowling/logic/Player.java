package bowling.logic;

public class Player
{
    private String name;
    private String sex;
    private String id;
    private int score;//当前总分
    private int singleScore;
    private int doubleScore;
    private int tripleScore;
    private int pentaScore;
    private int classicScore;
    private int topFourScore;
    private int topThreeScore;
    private int finalScore;
    private int teamNum;//选手某一场比赛当前的组别号

    public Player()
    {

    }

    public Player(String name, String sex, String id)
    {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    @Override
    public String toString()
    {
        String string =
                "Player{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                ", singleScore=" + singleScore +
                ", doubleScore=" + doubleScore +
                ", tripleScore=" + tripleScore +
                ", pentaScore=" + pentaScore
                ;
        if(classicScore != 0)
            string.concat(", classicScore=" + classicScore);
        if(topFourScore != 0)
            string.concat(", topFourScore=" + topFourScore);
        if(topThreeScore != 0)
            string.concat(", topThreeScore=" + topThreeScore);
        if(finalScore != 0)
            string.concat(", finalScore=" + finalScore);
        string.concat("}");
        return string;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getName()
    {
        return name;
    }

    public String getSex()
    {
        return sex;
    }

    public String getId()
    {
        return id;
    }

    public int getScore()
    {
        return score;
    }

    public int getTeamNum()
    {
        return teamNum;
    }

    public void setTeamNum(int teamNum)
    {
        this.teamNum = teamNum;
    }

    public int getSingleScore()
    {
        return singleScore;
    }

    public int getDoubleScore()
    {
        return doubleScore;
    }

    public int getTripleScore()
    {
        return tripleScore;
    }

    public int getPentaScore()
    {
        return pentaScore;
    }

    public int getClassicScore()
    {
        return classicScore;
    }

    public int getTopFourScore()
    {
        return topFourScore;
    }

    public int getTopThreeScore()
    {
        return topThreeScore;
    }

    public int getFinalScore()
    {
        return finalScore;
    }

    public void setSingleScore(int singleScore)
    {
        this.singleScore = singleScore;
    }

    public void setDoubleScore(int doubleScore)
    {
        this.doubleScore = doubleScore;
    }

    public void setTripleScore(int tripleScore)
    {
        this.tripleScore = tripleScore;
    }

    public void setPentaScore(int pentaScore)
    {
        this.pentaScore = pentaScore;
    }

    public void setClassicScore(int classicScore)
    {
        this.classicScore = classicScore;
    }

    public void setTopFourScore(int topFourScore)
    {
        this.topFourScore = topFourScore;
    }

    public void setTopThreeScore(int topThreeScore)
    {
        this.topThreeScore = topThreeScore;
    }

    public void setFinalScore(int finalScore)
    {
        this.finalScore = finalScore;
    }
}
