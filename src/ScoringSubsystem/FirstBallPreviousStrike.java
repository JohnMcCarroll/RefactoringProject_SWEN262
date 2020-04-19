package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBallPreviousStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {

        int currScore = scoreCard.get(currBowler)[frame][0];

        if(frame >= 9)
        {
            if (currScore == 10){
                scoreBoard.setState(new TenthFrameStrikeNinthStrike());
            }
            else{
                scoreBoard.setState(new TenthFrameSecondBallNinthStrike());
            }
        }
        else{
            if (currScore == 10){
                scoreBoard.setState(new FirstBallPreviousDoubleStrike());
            }
            else{
                scoreBoard.setState(new SecondBallPreviousStrike());
            }
        }
    }
}
