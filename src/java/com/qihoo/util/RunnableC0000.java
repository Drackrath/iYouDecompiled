package com.qihoo.util;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Looper;

/* renamed from: com.qihoo.util.ᵢˋ  reason: contains not printable characters */
final class RunnableC0000 implements Runnable {

    /* renamed from: ᵢˋ  reason: contains not printable characters */
    private /* synthetic */ Context f0;

    /* renamed from: ᵢˎ  reason: contains not printable characters */
    private /* synthetic */ String f1;

    RunnableC0000(Context context, String str) {
        this.f0 = context;
        this.f1 = str;
    }

    public final void run() {
        Looper.prepare();
        AlertDialog create = new AlertDialog.Builder(this.f0).setMessage(this.f1).setCancelable(false).setPositiveButton("确定", new DialogInterface$OnClickListenerC0001(this)).create();
        create.getWindow().setType(2005);
        create.show();
        Looper.loop();
    }
}
