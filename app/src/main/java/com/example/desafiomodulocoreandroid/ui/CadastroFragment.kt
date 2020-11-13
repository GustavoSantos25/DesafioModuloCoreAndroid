package com.example.desafiomodulocoreandroid.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.navigation.fragment.findNavController
import com.example.desafiomodulocoreandroid.R
import kotlinx.android.synthetic.main.fragment_cadastro.view.*


class CadastroFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_cadastro, container, false)
        view.btnLoginRegister.setOnClickListener {
            findNavController().navigate(R.id.action_cadastroFragment_to_homeFragment)
        }
        return view
    }


}