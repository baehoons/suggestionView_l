package com.baehoons.suggestionsearchview.rx

import com.baehoons.suggestionsearchview.OnTextChangeListener

internal class TextChangeEventStream : RxEventStream<String>(), OnTextChangeListener {

    override fun onTextChange(changedText: String) {
        publishEvent(changedText)
    }
}