package com.example.gradproject.ui.fragments.signUpFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.gradproject.R
import kotlinx.android.synthetic.main.fragment_personal_decuments.*

/**
 * A simple [Fragment] subclass.
 */
class PersonalDecumentsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal_decuments, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        personal_decoument_nex_button.setOnClickListener {
            val fragment = SubscriptionPlanFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, fragment)
            fragmentTransaction.addToBackStack("")
            fragmentTransaction.commit()

        }
    }

}
