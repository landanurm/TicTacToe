package com.gmail.landanurm.tictactoe.game.view_components_provider_android_impl;

import android.app.Activity;
import android.view.View;

import com.gmail.landanurm.tictactoe.R;
import com.gmail.landanurm.tictactoe.game.model_view.view.OnNeedToStartNewGameListener;
import com.gmail.landanurm.tictactoe.game.model_view.view.StartNewGameRequestor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by Leonid on 21.10.13.
 */
class StartNewGameRequestorImpl implements StartNewGameRequestor {

    private static class MapKeys {
        final static String requested = "StartNewGameRequestor.requested";
    }

    private final Collection<OnNeedToStartNewGameListener> onNeedToStartNewGameListeners;
    private final View startNewGameButton;

    private boolean requested;

    StartNewGameRequestorImpl(Activity activity) {
        onNeedToStartNewGameListeners = new ArrayList<OnNeedToStartNewGameListener>();
        startNewGameButton = activity.findViewById(R.id.startNewGameButton);
        startNewGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifyOnNeedToStartNewGameListeners();
            }
        });
        hideRequest();
    }

    private void notifyOnNeedToStartNewGameListeners() {
        for (OnNeedToStartNewGameListener each : onNeedToStartNewGameListeners) {
            each.onNeedToStartNewGame();
        }
    }

    StartNewGameRequestorImpl(Activity activity, Map<String, Serializable> savedState) {
        this(activity);
        Boolean needToRequest = (Boolean) savedState.get(MapKeys.requested);
        if (needToRequest) {
            requestToStartNewGame();
        }
    }

    void saveStateInto(Map<String,Serializable> outState) {
        outState.put(MapKeys.requested, requested);
    }

    @Override
    public void addOnNeedToStartNewGameListener(OnNeedToStartNewGameListener listener) {
        onNeedToStartNewGameListeners.add(listener);
    }

    @Override
    public void requestToStartNewGame() {
        requested = true;
        startNewGameButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideRequest() {
        requested = false;
        startNewGameButton.setVisibility(View.INVISIBLE);
    }
}
