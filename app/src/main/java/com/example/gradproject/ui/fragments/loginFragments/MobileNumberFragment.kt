package com.example.gradproject.ui.fragments.loginFragments

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.gradproject.R
import com.example.gradproject.base.BaseFragment
import com.example.gradproject.base.DataHandler
import com.example.gradproject.base.DataHandlerBase

/**
 * A simple [Fragment] subclass.
 */
class MobileNumberFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mobile_number, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mobileNumber: Int = R.id.Mobile_Number
        DataHandler.saveInt("The mobile number",mobileNumber)
        val mobileNumberContinueButton: Button =
            view.findViewById(R.id.MobilePhone_Continue_Button) as Button
        mobileNumberContinueButton.setOnClickListener {
            showMessage(R.string.Confirm,
                R.string.verificationMessage, R.string.Send_OTP,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    val fragment = OTPFragment()
                    val fragmentManager = activity.supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.fragment_container, fragment)
                    fragmentTransaction.addToBackStack("")
                    fragmentTransaction.commit()
                }, R.string.Cancel, DialogInterface.OnClickListener { dialogInterface, i ->
                    dialogInterface.dismiss()
                }, true
            )
        }
    }

}
