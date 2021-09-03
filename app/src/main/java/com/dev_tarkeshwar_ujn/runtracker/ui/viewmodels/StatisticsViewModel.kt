package com.dev_tarkeshwar_ujn.runtracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.dev_tarkeshwar_ujn.runtracker.repository.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
): ViewModel() {
}