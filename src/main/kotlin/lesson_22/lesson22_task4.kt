package org.example.lesson_22

data class MainScreenState(
    var data: String = "Нет данных",
    var isLoading: Boolean = false,
)

fun loadData() {
    var currentState = MainScreenState()
    println("Состояние загрузки: ${currentState.isLoading}, переданные данные: ${currentState.data}")
    currentState = currentState.copy(isLoading = true)
    println("Состояние загрузки: ${currentState.isLoading}, переданные данные: ${currentState.data}")
    currentState = currentState.copy(data = "Пункт назначения - Магратея", isLoading = false)
    println("Состояние загрузки: ${currentState.isLoading}, переданные данные: ${currentState.data}")
}

fun main() {
    loadData()
}