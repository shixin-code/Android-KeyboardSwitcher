package com.kunzisoft.keyboard.switcher;

import android.service.quicksettings.TileService;

import com.kunzisoft.keyboard.switcher.utils.Utilities;

public class ChooseKeyboardTileService extends TileService {
    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        Utilities.chooseAKeyboard(this.getApplicationContext());
    }
}
