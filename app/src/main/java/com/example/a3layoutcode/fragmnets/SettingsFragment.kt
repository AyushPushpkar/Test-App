package com.example.a3layoutcode.fragmnets

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.a3layoutcode.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}