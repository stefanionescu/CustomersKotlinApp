package com.app.customers.executor


abstract class UseCaseVoid<Params>(private val threadExecutor: ThreadExecutor) {

    abstract fun buildUseCase(params: Params)

    fun execute(params: Params) {

        this.buildUseCase(params)

    }

}
