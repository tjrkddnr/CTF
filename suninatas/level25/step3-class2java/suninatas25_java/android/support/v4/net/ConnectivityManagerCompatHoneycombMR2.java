// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompatHoneycombMR2
{

    ConnectivityManagerCompatHoneycombMR2()
    {
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
    {
        connectivitymanager = connectivitymanager.getActiveNetworkInfo();
        if(connectivitymanager != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        switch(connectivitymanager.getType())
        {
        case 8: // '\b'
        default:
            return true;

        case 1: // '\001'
        case 7: // '\007'
        case 9: // '\t'
            return false;

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            break;
        }
        if(true) goto _L1; else goto _L3
_L3:
    }
}
