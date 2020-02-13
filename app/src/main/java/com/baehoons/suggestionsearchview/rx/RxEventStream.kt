package com.baehoons.suggestionsearchview.rx

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

internal open class RxEventStream <T> {

    private val _events = PublishSubject.create<T>()
    val events: Observable<T> = _events

    protected fun publishEvent(event: T) {
        _events.onNext(event)
    }
}