package com.gmail.landanurm.tictactoe.game.model_view.model.judge;


import com.gmail.landanurm.matrix.Position;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leonid on 15.09.13.
 */
class LineCellsPositionsProvider implements Serializable {
    private final int gameBoardDimension;

    LineCellsPositionsProvider(int gameBoardDimension) {
        this.gameBoardDimension = gameBoardDimension;
    }

    List<Position> onRow(final int row) {
        return positions(new PositionByIndexProvider() {
            @Override
            public Position getPositionByIndex(int index) {
                return new Position(row, index);
            }
        });
    }

    private List<Position> positions(PositionByIndexProvider positionByIndexProvider) {
        List<Position> positions = new ArrayList<Position>();
        for (int index = 0; index < gameBoardDimension; ++index) {
            positions.add(positionByIndexProvider.getPositionByIndex(index));
        }
        return positions;
    }

    private static interface PositionByIndexProvider {
        Position getPositionByIndex(int index);
    }

    List<Position> onColumn(final int column) {
        return positions(new PositionByIndexProvider() {
            @Override
            public Position getPositionByIndex(int index) {
                return new Position(index, column);
            }
        });
    }

    List<Position> onLeftUpperDiagonal() {
        return positions(new PositionByIndexProvider() {
            @Override
            public Position getPositionByIndex(int index) {
                return new Position(index, index);
            }
        });
    }

    List<Position> onRightUpperDiagonal() {
        final int indexOfLastColumn = gameBoardDimension - 1;
        return positions(new PositionByIndexProvider() {
            @Override
            public Position getPositionByIndex(int index) {
                return new Position(index, indexOfLastColumn - index);
            }
        });
    }
}
