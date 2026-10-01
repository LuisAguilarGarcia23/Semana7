package com.example.semana7

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

/**
 * ViewModel encargado de gestionar el estado del contador.
 * Cumple con la arquitectura recomendada de Jetpack Compose al separar
 * la lógica de negocio y el estado de la interfaz de usuario.
 */
class CounterViewModel : ViewModel() {

    // Estado interno mutable inicializado en 0
    private val _count = mutableIntStateOf(0)

    // Estado público de solo lectura expuesto a la UI
    val count: State<Int> = _count

    /**
     * Incrementa el valor del contador en un uno (1).
     */
    fun increment() {
        _count.intValue++
    }
}
