package com.withpet.withpet_android.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.withpet.withpet_android.R
import com.withpet.withpet_android.databinding.ActivityMyProfileBinding
import com.withpet.withpet_android.ui.dialog.CertificationBottomSheet

class MyProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_profile)

        setToolbar()
        setBtnClickListener()
    }

    private fun setToolbar() {
        binding.myProfileToolbar.setNavigationOnClickListener { clickHomeMenu() }
        binding.myProfileToolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.profileSaveMenu -> {
                    clickSaveMenu()
                    true
                }
                else -> false
            }
        }
    }

    private fun clickHomeMenu() {
        // TODO: check changes and then confirm whether changes save
        finish()
    }

    private fun clickSaveMenu() {
        // TODO: check changes and then save changes
        finish()
    }

    private fun setBtnClickListener() {
        binding.myProfileImageEditButton.setOnClickListener {

        }
        binding.myProfileTownEditButton.setOnClickListener {

        }
        binding.myProfileCertificateAddButton.setOnClickListener {
            val certificationBottomSheet = CertificationBottomSheet()
            certificationBottomSheet.show(supportFragmentManager, CertificationBottomSheet.TAG)
        }
    }
}