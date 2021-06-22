package com.qihoo.util;

import android.content.DialogInterface;
import android.os.Build;

/* renamed from: com.qihoo.util.ᵢˎ  reason: contains not printable characters */
final class DialogInterface$OnClickListenerC0001 implements DialogInterface.OnClickListener {
    DialogInterface$OnClickListenerC0001(RunnableC0000 r1) {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Thread currentThread = Thread.currentThread();
        synchronized (currentThread) {
            if (Build.VERSION.SDK_INT >= 19) {
                currentThread.notify();
            }
        }
    }
}
