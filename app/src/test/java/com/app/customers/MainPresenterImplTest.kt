package com.app.customers

import com.app.customers.ui.presenters.MainPresenterImp
import com.app.customers.ui.utils.GetMD5Hash

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock

import org.junit.Assert.assertEquals

/**
 * Created by Stefan
 */

@RunWith(JUnit4::class)
class MainPresenterImplTest {

    private var getHash: GetMD5Hash? = null

    @Before
    fun setUp() {

        getHash = GetMD5Hash()

    }

    @Test
    fun testEmailHash() {

        assertEquals("f70ad961b3f587e125845cb3cb2f01ca", getHash!!.emailHash("codrinionescu@yahoo.com"))
        assertEquals("651cb71d4ab482b132aaa7ac79912f88", getHash!!.emailHash("someone@yahoo.com"))

        assertEquals("d41d8cd98f00b204e9800998ecf8427e", getHash!!.emailHash(""))

    }

}
