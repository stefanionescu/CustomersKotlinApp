package com.app.customers.domain.getQudiniInfo

import android.content.Context

import com.app.customers.data.model.CustomersList
import com.app.customers.data.repository.CustomersRepository
import com.app.customers.domain.model.Customer
import com.app.customers.executor.PostExecutionThread
import com.app.customers.executor.ThreadExecutor
import com.app.customers.executor.UseCaseObservable

import io.reactivex.Observable

/**
 * Created by Stefan
 */

class GetCustomers(threadExecutor: ThreadExecutor,
                   postExecutionThread: PostExecutionThread,
                   private val context: Context?,
                   private val customersRepository: CustomersRepository)
    : UseCaseObservable<List<Customer>, Void?>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseObservable(params: Void?): Observable<List<Customer>> {

        val qudiniCustomers = customersRepository.customersList

        return Observable.just(ModelTransformer(qudiniCustomers
                .queueData!!
                .queue!!
                .customersToday!!)
                .getCustomers())

    }

}
