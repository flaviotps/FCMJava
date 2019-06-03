package com.flaviotps.fcmjava;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;

public class AutoStartManager {



    public enum Manufacture {
        ALL,
        ASUS
    }

    public static Intent getAutoStartIntent(Manufacture manufacture){

        Intent intent = null;
        switch (manufacture){
            case ALL:
                break;
            case ASUS:
                intent = new Intent().setComponent(new ComponentName("com.asus.mobilemanager",
                        "com.asus.mobilemanager.entry.FunctionActivity"))
                        .setData(Uri.parse("mobilemanager://function/entry/AutoStart"));
        }

        return intent;
    }


}
