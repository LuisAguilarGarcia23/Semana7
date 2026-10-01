package com.example.semana7

import org.junit.Assert.assertEquals
import org.junit.Test

class CounterViewModelTest {

    @Test
    fun `initial count is zero`() {
        val viewModel = CounterViewModel()
        assertEquals(0, viewModel.count.value)
    }

    @Test
    fun `increment increases count by one`() {
        val viewModel = CounterViewModel()
        viewModel.increment()
        assertEquals(1, viewModel.count.value)
        viewModel.increment()
        assertEquals(2, viewModel.count.value)
    }
}
