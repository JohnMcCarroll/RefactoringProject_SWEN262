package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSecondStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        scoreBoard.setState(new TenthFrameEnd());
    }
}
