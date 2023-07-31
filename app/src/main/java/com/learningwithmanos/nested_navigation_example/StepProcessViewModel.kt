package com.learningwithmanos.nested_navigation_example

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class StepProcessViewModel: ViewModel() {

    val actionStateFlow: StateFlow<Action>
        get() = _actionStateFlow.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = Action.Still
        )

    private val _actionStateFlow: MutableStateFlow<Action> = MutableStateFlow(Action.Still)

    fun exitNestedNavHostFragment(){
        _actionStateFlow.value = Action.ExitNestedNavFragment
    }

    sealed interface Action {
        object Still: Action
        object ExitNestedNavFragment: Action
    }
}