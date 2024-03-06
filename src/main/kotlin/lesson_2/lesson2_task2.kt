package lesson_2

/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который
будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в
виде целых чисел.*/

fun main() {
    val numberOfEmployees = 50
    val salaryOfEmployee = 30_000
    val numberOfTrainees = 30
    val salaryOfTrainees = 20_000

    // Расходы на выплату зарплаты постоянных сотрудников
    val employeeSalaryExpenses = numberOfEmployees * salaryOfEmployee

    // Расходы на выплату зарплаты стажёров
    val employeeSalaryTrainees = numberOfTrainees * salaryOfTrainees

    // Общие расходы по ЗП после прихода стажеров
    val totalPayrollExpenses = employeeSalaryExpenses + employeeSalaryTrainees

    // Средняя ЗП одного сотрудника после устройства стажеров
    val averageSalary = totalPayrollExpenses / (numberOfEmployees + numberOfTrainees)

    println(employeeSalaryExpenses)
    println(totalPayrollExpenses)
    println(averageSalary)
}