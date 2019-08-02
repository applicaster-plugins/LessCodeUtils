package com.applicaster.lesscodeutils.player

import android.util.Log
import java.lang.ClassCastException

class PlayerControllerManager {

    fun getPlayerController(): PlayerController? {
        try {
            Class.forName("com.applicaster.mobile.player.AndroidMobilePlayerAdaptor")?.let {
                return it.newInstance() as PlayerController
            }
        } catch (e: ClassCastException) {
            Log.e(this.javaClass.simpleName, e.message)
        }

        return null
    }
}