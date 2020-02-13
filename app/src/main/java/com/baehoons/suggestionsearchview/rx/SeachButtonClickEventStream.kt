package com.baehoons.suggestionsearchview.rx

import com.baehoons.suggestionsearchview.OnSearchButtonClickListener

internal class SearchButtonClickEventStream : RxEventStream<String>(), OnSearchButtonClickListener {

    override fun onClick(inputtedText: String) {
        publishEvent(inputtedText)
    }
}