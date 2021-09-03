package com.dev_tarkeshwar_ujn.runtracker.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dev_tarkeshwar_ujn.runtracker.R
import com.dev_tarkeshwar_ujn.runtracker.ui.viewmodels.MainViewModel
import com.dev_tarkeshwar_ujn.runtracker.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment:Fragment(R.layout.fragment_run) {

    private val viewModel: StatisticsViewModel by viewModels()

}