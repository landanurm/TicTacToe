package com.gmail.landanurm.tictactoe.game.model_view.model.judge;

import java.util.Collection;

/**
 * Created by Leonid on 07.09.13.
 */
public class TicTacToeResult {
    private final GameState gameState;
    private final Collection<FireLine> fireLines;

    TicTacToeResult(GameState gameState, Collection<FireLine> fireLines) {
        this.gameState = gameState;
        this.fireLines = fireLines;
    }

    public boolean isKnown() {
        return gameState != GameState.UNKNOWN;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Collection<FireLine> getFireLines() {
        return fireLines;
    }
}
