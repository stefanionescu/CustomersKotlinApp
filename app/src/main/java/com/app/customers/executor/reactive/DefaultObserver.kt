package com.app.customers.executor.reactive

import io.reactivex.observers.DisposableObserver

/**
 * Default [DisposableObserver] base class to be used whenever you want default error handling.
 */
class DefaultObserver<T> : DisposableObserver<T>() {
    override fun onNext(t: T) {
        // no-op by default.
    }

    override fun onComplete() {
        // no-op by default.
    }

    override fun onError(exception: Throwable) {
        // no-op by default.
    }
}
