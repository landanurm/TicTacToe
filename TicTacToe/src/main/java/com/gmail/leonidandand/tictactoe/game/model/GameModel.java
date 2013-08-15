package com.gmail.leonidandand.tictactoe.game.model;

import com.gmail.leonidandand.matrix.Position;
import com.gmail.leonidandand.tictactoe.game.model.listeners.OnGameFinishedListener;
import com.gmail.leonidandand.tictactoe.game.model.listeners.OnOpponentMoveListener;
import com.gmail.leonidandand.tictactoe.game.model.listeners.OnScoreChangedListener;
import com.gmail.leonidandand.tictactoe.game.model.opponent.Opponent;

/**
 * Created by Leonid on 18.07.13.
 */
public interface GameModel {
    boolean emptyCell(Position pos);
    int getGameBoardDimension();
    Score getScore();
    void setOpponent(Opponent opponent);
    void onPlayerMove(Position movePosition);
    void onViewIsReadyToStartGame();

    void addOnOpponentMoveListener(OnOpponentMoveListener listener);
    void addOnGameFinishedListener(OnGameFinishedListener listener);
    void addOnScoreChangedListener(OnScoreChangedListener listener);
    void removeOnOpponentMoveListener(OnOpponentMoveListener listener);
    void removeOnGameFinishedListener(OnGameFinishedListener listener);
    void removeOnScoreChangedListener(OnScoreChangedListener listener);
}
