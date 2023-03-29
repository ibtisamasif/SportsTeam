package com.example.sportsteam2.core.base.viewmodels

import androidx.lifecycle.ViewModel
import com.example.sportsteam2.core.base.models.BaseRepo

open class BaseViewModel(private val baseRepo: BaseRepo) : ViewModel() {}