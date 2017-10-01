package com.app.customers.ui.utils

import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

/**
 * Created by Stefan
 */

class GetMD5Hash {

    fun emailHash(email: String): String {

        val md5Email = email.trim { it <= ' ' }.toLowerCase()

        var m: MessageDigest? = null

        try {

            m = MessageDigest.getInstance("MD5")

        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }

        m!!.reset()

        m.update(md5Email.toByteArray())

        val digest = m.digest()

        val bigInt = BigInteger(1, digest)

        return bigInt.toString(16)

    }

}
