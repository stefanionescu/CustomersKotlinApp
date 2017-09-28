package com.app.customers.executor

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Decorated [ThreadPoolExecutor]
 */

class JobExecutor @Inject
internal constructor() : ThreadExecutor {
    private val threadPoolExecutor: ThreadPoolExecutor

    init {
        this.threadPoolExecutor = ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS,
                WORK_QUEUE, JobThreadFactory())
    }

    override fun execute(runnable: Runnable) {
        this.threadPoolExecutor.execute(runnable)
    }

    private class JobThreadFactory : ThreadFactory {
        private var counter = 0

        override fun newThread(runnable: Runnable): Thread {
            return Thread(runnable, "android_" + counter++)
        }
    }

    companion object {

        private val WORK_QUEUE = LinkedBlockingQueue<Runnable>()
    }
}
