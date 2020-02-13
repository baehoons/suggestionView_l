package com.baehoons.suggestionsearchview.rx

import com.baehoons.suggestionsearchview.OnStateChangeListener
import com.baehoons.suggestionsearchview.SuggestionSearchView

internal class StateChangeEventStream : RxEventStream<SuggestionSearchView.State>(),
    OnStateChangeListener {

    override fun onChange(state: SuggestionSearchView.State) {
        publishEvent(state)
    }
}