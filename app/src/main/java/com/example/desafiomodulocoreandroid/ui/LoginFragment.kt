package com.example.desafiomodulocoreandroid.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.desafiomodulocoreandroid.R
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_login, container, false)
        view.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_cadastroFragment)
        }
        return view
    }


}