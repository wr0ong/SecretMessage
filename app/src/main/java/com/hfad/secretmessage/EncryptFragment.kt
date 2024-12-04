package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class EncryptFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val finishButton = view.findViewById<Button>(R.id.finish)
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        val encryptedText = view.findViewById<TextView>(R.id.encrypted_message)
        encryptedText.text = message.reversed()


        finishButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_encryptFragment_to_welcomeFragment)
        }
        return view
    }
}