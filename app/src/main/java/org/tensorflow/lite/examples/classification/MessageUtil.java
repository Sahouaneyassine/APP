package org.tensorflow.lite.examples.classification;

import android.content.Context;
import com.google.android.material.snackbar.Snackbar;
import androidx.annotation.StringRes;
import android.view.View;
import android.widget.Toast;

public class MessageUtil {
    static void toast(Context ctx, String msg) {
        Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show();
    }
    static void toast(Context ctx,@StringRes int stringResId) {
        Toast.makeText(ctx, ctx.getString(stringResId), Toast.LENGTH_LONG).show();
    }
    static void snack(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }
}
