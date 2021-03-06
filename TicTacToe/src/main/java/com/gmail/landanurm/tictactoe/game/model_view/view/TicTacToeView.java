package com.gmail.landanurm.tictactoe.game.model_view.view;


public interface TicTacToeView {
    void addOnCellClickListener(OnCellClickListener listener);

    public static interface ComponentsProvider {
        GameBoardView getGameBoardView();
        NeedToRestartGameRequestor getNeedToRestartGameRequestor();
        NextMoveProgressBar getNextMoveProgressBar();
        ResultDisplay getResultDisplay();
        ScoreDisplay getScoreDisplay();
    }
}
