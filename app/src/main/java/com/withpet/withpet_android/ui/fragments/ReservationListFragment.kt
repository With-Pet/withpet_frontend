package com.withpet.withpet_android.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.withpet.withpet_android.R
import com.withpet.withpet_android.adapter.ReservationListAdapter
import com.withpet.withpet_android.databinding.FragmentReservationListBinding
import com.withpet.withpet_android.ui.activities.OthersProfileActivity
import com.withpet.withpet_android.ui.activities.ReservationDetailActivity

class ReservationListFragment : Fragment(R.layout.fragment_reservation_list) {
    private lateinit var binding: FragmentReservationListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_reservation_list,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        binding.reservationRecyclerView.adapter = ReservationListAdapter().apply {
            setClickListener(object : ReservationListAdapter.ReservationClickListener {
                override fun itemClickListener() {
                    startActivity(Intent(activity, ReservationDetailActivity::class.java))
                }

                override fun profileButtonClickListener() {
                    startActivity(Intent(activity, OthersProfileActivity::class.java))
                }

                override fun chatButtonClickListener() {
                    // TODO("Not yet implemented")
                }
            })
        }
        binding.reservationRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}