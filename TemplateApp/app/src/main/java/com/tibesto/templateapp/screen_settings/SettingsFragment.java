package com.tibesto.templateapp.screen_settings;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
import com.tibesto.templateapp.R;
public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}