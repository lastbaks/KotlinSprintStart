package org.example.lesson_2

fun main() {
    var countOfEmployees: Int = 50
    var countOfTrainees: Int = 30
    var employeeSalary: Int = 30000
    var traineeSalary: Int = 20000

    var totalEmployeeSalary: Int = employeeSalary * countOfEmployees
    val totalTraineeSalary: Int = traineeSalary * countOfTrainees
    var totalSalaryExpenses: Int = totalEmployeeSalary + totalTraineeSalary
    var averagePersonSalary: Int = totalSalaryExpenses / (countOfEmployees + countOfTrainees)

    println("Расходы на зарплату постоянных сотрудников: $totalEmployeeSalary рублей")
    println("Общие расходы на зарплату: $totalSalaryExpenses рублей")
    println("Средняя зарплата: $averagePersonSalary рублей")
}