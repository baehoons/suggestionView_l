package com.baehoons.suggestionsearchview.extention

import com.baehoons.suggestionsearchview.SuggestionSearchView
import com.baehoons.suggestionsearchview.rx.SearchButtonClickEventStream
import com.baehoons.suggestionsearchview.rx.StateChangeEventStream
import com.baehoons.suggestionsearchview.rx.TextChangeEventStream
import io.reactivex.Observable

fun SuggestionSearchView.searchButtonClicks(): Observable<String> {
    return SearchButtonClickEventStream().run {
        onSearchButtonClickListener = this
        events
    }
}

fun SuggestionSearchView.stateChanges(): Observable<SuggestionSearchView.State> {
    return StateChangeEventStream().run {
        onStateChangeListener = this
        events
    }
}

fun SuggestionSearchView.textChanges(): Observable<String> {
    return TextChangeEventStream().run {
        onTextChangeListener = this
        events
    }
}