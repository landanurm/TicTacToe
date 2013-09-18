package com.gmail.leonidandand.tictactoe.game.view.android_impl;

import android.app.Activity;
import android.widget.TextView;

import com.gmail.leonidandand.tictactoe.R;
import com.gmail.leonidandand.tictactoe.game.model.Score;
import com.gmail.leonidandand.tictactoe.game.view.ScoreDisplay;

/**
 * Created by Leonid on 04.08.13.
 */
class ScoreDisplayAndroidImpl implements ScoreDisplay {
    private final TextView scoreOfPlayer1;
    private final TextView scoreOfPlayer2;

    ScoreDisplayAndroidImpl(Activity activity, Score score) {
        scoreOfPlayer1 = (TextView) activity.findViewById(R.id.scoreOfPlayer1);
        scoreOfPlayer2 = (TextView) activity.findViewById(R.id.scoreOfPlayer2);
        showScore(score);
    }

    @Override
    public void showScore(Score score) {
        scoreOfPlayer1.setText(String.valueOf(score.getScoreOfPlayer1()));
        scoreOfPlayer2.setText(String.valueOf(score.getScoreOfPlayer2()));
    }
}
