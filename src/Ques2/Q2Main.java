package Ques2;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public class Q2Main {
    public static void main(String[] args) {

        CricketData cricketData=new CricketData();
        CurrentScoreDisplay currentScoreDisplay=new CurrentScoreDisplay(cricketData);
        AverageScoreDisplay averageScoreDisplay=new AverageScoreDisplay(cricketData);
        cricketData.setData(10,7);
        cricketData.setData(100,77);

    }
}
