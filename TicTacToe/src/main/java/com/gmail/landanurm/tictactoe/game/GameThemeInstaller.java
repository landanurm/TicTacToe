package com.gmail.landanurm.tictactoe.game;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gmail.landanurm.tictactoe.R;
import com.gmail.landanurm.tictactoe.theme.game_theme.GameTheme;
import com.gmail.landanurm.tictactoe.theme.game_theme.ScorePanelTheme;

/**
 * Created by Leonid on 18.10.13.
 */
class GameThemeInstaller {
    private final FrameLayout gameBoard;
    private final ImageView firstPlayerFace;
    private final ImageView secondPlayerFace;
    private final ImageView versusIcon;
    private final RelativeLayout mainLayout;
    private final RelativeLayout scorePanel;
    private final TextView firstPlayerScore;
    private final TextView secondPlayerScore;

    GameThemeInstaller(Activity activity) {
        mainLayout = (RelativeLayout) activity.findViewById(R.id.tic_tac_toe_game_activity_layout);
        scorePanel = (RelativeLayout) activity.findViewById(R.id.scorePanelLayout);
        firstPlayerFace = (ImageView) activity.findViewById(R.id.firstPlayerFaceImageView);
        secondPlayerFace = (ImageView) activity.findViewById(R.id.secondPlayerFaceImageView);
        versusIcon = (ImageView) activity.findViewById(R.id.versusImageView);
        firstPlayerScore = (TextView) activity.findViewById(R.id.firstPlayerScore);
        secondPlayerScore = (TextView) activity.findViewById(R.id.secondPlayerScore);
        gameBoard = (FrameLayout) activity.findViewById(R.id.gameBoardLayout);
    }

    void install(GameTheme gameTheme) {
        mainLayout.setBackgroundResource(gameTheme.getScreenBackgroundIconId());
        gameBoard.setBackgroundResource(gameTheme.getGameBoardTheme().getBackgroundIconId());

        ScorePanelTheme scorePanelTheme = gameTheme.getScorePanelTheme();
        scorePanel.setBackgroundResource(scorePanelTheme.getBackgroundIconId());
        firstPlayerFace.setImageResource(scorePanelTheme.getFirstPlayerFaceIconId());
        secondPlayerFace.setImageResource(scorePanelTheme.getSecondPlayerFaceIconId());
        versusIcon.setImageResource(scorePanelTheme.getVersusIconId());
        firstPlayerScore.setTextColor(scorePanelTheme.getFirstPlayerScoreColor());
        secondPlayerScore.setTextColor(scorePanelTheme.getSecondPlayerScoreColor());
    }
}
