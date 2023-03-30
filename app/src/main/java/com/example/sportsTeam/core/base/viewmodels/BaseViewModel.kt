package com.example.sportsTeam.core.base.viewmodels

import androidx.lifecycle.ViewModel
import com.example.sportsTeam.core.base.models.BaseRepo

open class BaseViewModel(private val baseRepo: BaseRepo) : ViewModel() {}