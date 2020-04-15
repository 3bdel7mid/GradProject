package com.example.gradproject.ui.fragments.loginFragments

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.gradproject.MainActivity
import com.example.gradproject.R
import com.example.gradproject.base.BaseFragment
import com.example.gradproject.base.DataHandler
import kotlinx.android.synthetic.main.fragment_mobile_number.*

/**
 * A simple [Fragment] subclass.
 */
class MobileNumberFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v :View = inflater.inflate(R.layout.fragment_mobile_number, container, false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val mobileNumberContinueButton: Button =
            view.findViewById(R.id.MobilePhone_Continue_Button) as Button
        mobileNumberContinueButton.setOnClickListener {
            var mobileNumber  = Mobile_Number.text.toString()

            val otpFragment = OTPFragment()

            val bundle = Bundle()
            bundle.putString("number","mobilenumber")
            otpFragment.setArguments(bundle)

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
