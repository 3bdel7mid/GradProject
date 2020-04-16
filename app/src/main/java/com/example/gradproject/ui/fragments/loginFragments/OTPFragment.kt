package com.example.gradproject.ui.fragments.loginFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.gradproject.R
import com.example.gradproject.base.DataHandler

/**
 * A simple [Fragment] subclass.
 */
class OTPFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_o_t_p, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mobileNumber: Int? = DataHandler.getInt("the mobile number", 0)

        val mobileNumberView: TextView =
            view.findViewById(R.id.mobilePhone_Number_fourDigits)

        mobileNumberView.text = mobileNumber.toString()

        val editMobileNumber: TextView = view.findViewById(R.id.edit_mobile_number)

        val submitFourDigitsNumber: Button =
            view.findViewById(R.id.submit_four_digits_button) as Button

        editMobileNumber.setOnClickListener {
            val fragment = MobileNumberFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, fragment)
            fragmentTransaction.remove(MobileNumberFragment())
            fragmentTransaction.commit()

        }

        submitFourDigitsNumber.setOnClickListener {
            val fragment = ResetPasswordFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, fragment)
            fragmentTransaction.commit()
        }
    }

}
