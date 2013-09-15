package com.gmail.leonidandand.tictactoe.game.model;

import com.gmail.leonidandand.matrix.Position;
import com.gmail.leonidandand.tictactoe.game.player.Player;

/**
 * Created by Leonid on 07.09.13.
 */
public interface OnNeedToShowMoveListener {
    void onNeedToShowMove(Position pos, Player.Id playerId);
}
