package com.baehoons.suggestionsearchview.extention

import android.content.res.Resources

internal fun Float.toDP(): Float = this / Resources.getSystem().displayMetrics.density