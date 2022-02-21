package com.withpet.withpet_android.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.withpet.withpet_android.R
import com.withpet.withpet_android.adapter.ConfirmImageListAdapter
import com.withpet.withpet_android.adapter.RegisterImageListAdapter
import com.withpet.withpet_android.databinding.FragmentConfirmBinding

class ConfirmFragment : Fragment(R.layout.fragment_confirm) {

    private lateinit var binding: FragmentConfirmBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_confirm,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonListener()
        setRecyclerView()
    }

    private fun setButtonListener() {
        binding.confirmPrevButton.setOnClickListener {
            findNavController().navigate(R.id.action_confirmFragment_to_detailRegisterFragment)
        }
    }

    private fun setRecyclerView() {
        binding.confirmRecyclerView.adapter = ConfirmImageListAdapter()
        binding.confirmRecyclerView.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }
}