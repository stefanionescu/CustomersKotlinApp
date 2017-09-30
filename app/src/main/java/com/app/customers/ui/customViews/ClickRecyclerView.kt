package com.app.customers.ui.customViews

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.HapticFeedbackConstants
import android.view.SoundEffectConstants
import android.view.View

/**
 * Created by Stefan
 */

class ClickRecyclerView : RecyclerView {

    private var mTouchListener: TouchListener? = null

    private var mItemClickListener: OnItemClickListener? = null
    private var mItemLongClickListener: OnItemLongClickListener? = null


    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    private fun init() {
        mTouchListener = TouchListener(this)
        addOnItemTouchListener(mTouchListener)
    }

    /**
     * Register a callback to be invoked when an item in the
     * RecyclerView has been clicked.
     *
     * @param listener The callback that will be invoked.
     */
    fun setOnItemClickListener(listener: OnItemClickListener) {
        mItemClickListener = listener
    }

    /**
     * Register a callback to be invoked when an item in the
     * RecyclerView has been clicked and held.
     *
     * @param listener The callback that will be invoked.
     */
    fun setOnItemLongClickListener(listener: OnItemLongClickListener) {
        if (!isLongClickable) {
            isLongClickable = true
        }

        mItemLongClickListener = listener
    }

    /**
     * Interface definition for a callback to be invoked when an item in the
     * RecyclerView has been clicked.
     */
    interface OnItemClickListener {
        /**
         * Callback method to be invoked when an item in the RecyclerView
         * has been clicked.
         *
         * @param parent   The RecyclerView where the click happened.
         * @param view     The view within the RecyclerView that was clicked
         * @param position The position of the view in the adapter.
         * @param id       The row id of the item that was clicked.
         */
        fun onItemClick(parent: RecyclerView, view: View, position: Int, id: Long)
    }

    /**
     * Interface definition for a callback to be invoked when an item in the
     * RecyclerView has been clicked and held.
     */
    interface OnItemLongClickListener {
        /**
         * Callback method to be invoked when an item in the RecyclerView
         * has been clicked and held.
         *
         * @param parent   The RecyclerView where the click happened
         * @param view     The view within the RecyclerView that was clicked
         * @param position The position of the view in the list
         * @param id       The row id of the item that was clicked
         * @return true if the callback consumed the long click, false otherwise
         */
        fun onItemLongClick(parent: RecyclerView, view: View, position: Int, id: Long): Boolean
    }

    private inner class TouchListener internal constructor(recyclerView: RecyclerView) : ClickItemTouchListener(recyclerView) {

        override internal fun performItemClick(parent: RecyclerView, view: View, position: Int, id: Long): Boolean {
            if (mItemClickListener != null) {
                view.playSoundEffect(SoundEffectConstants.CLICK)
                mItemClickListener!!.onItemClick(parent, view, position, id)
                return true
            }

            return false

        }

       override internal fun performItemLongClick(parent: RecyclerView, view: View, position: Int, id: Long): Boolean {
            if (mItemLongClickListener != null) {
                view.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
                return mItemLongClickListener!!.onItemLongClick(parent, view, position, id)
            }

            return false

        }

        override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {

        }

    }
}