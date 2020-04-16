package com.example.gradproject.base

import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.view.View
import androidx.fragment.app.Fragment


open class BaseFragment : Fragment() {

    lateinit var activity: BaseActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as BaseActivity
    }

    fun showMessage(
        title: String?,
        message: String?,
        posActionName: String?,
        posAction: DialogInterface.OnClickListener?,
        negativeActionName: String?,
        negativeAction: DialogInterface.OnClickListener?,
        isCancellable: Boolean
    ) {
        activity.showMessage(
            title,
            message,
            posActionName,
            posAction,
            negativeActionName,
            negativeAction,
            isCancellable
        )
    }


    fun showMessage(
        title: Int?,
        message: Int,
        posActionName: Int?,
        posAction: DialogInterface.OnClickListener?,
        negativeActionName: Int?,
        negativeAction: DialogInterface.OnClickListener?,
        isCancellable: Boolean
    ) {
        activity.showMessage(
            title,
            message,
            posActionName,
            posAction,
            negativeActionName,
            negativeAction,
            isCancellable
        )
    }

    fun isPermissionGranted(permission: String): Boolean {
        return isPermissionGranted(permission)
    }

    fun showLoadingDialog(loadingMessage: String): ProgressDialog? {
        return showLoadingDialog(loadingMessage)
    }

    fun hideLoadingDialog() {
        activity.hideLoadingDialog()
    }

    fun ButtonEffect(button: View) {
        return ButtonEffect(button)
    }
}