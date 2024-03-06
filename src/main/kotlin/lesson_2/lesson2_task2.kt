package lesson_2

/*
������ 2 � ����� 2

� �������� �������� 50 ������� � ��������� �� 30000 ������. ����� � �������� ���������� 30 ��������,
������� ��������� �������� � 20000 ������ �������. ����� ����� ��������������� ����� ��� �����������, �������
����� �������:

� ������� �� ������� �������� ���������� �����������;
� ����� ������� �� �� ����� ������� ��������;
� ������� �� ������ ���������� ����� ���������� ��������.

������ ����� ��������� � ��������� � ���������� � ��������������� ���������. ��� �������� ���������� ������� �
���� ����� �����.*/

fun main() {
    val numberOfEmployees = 50
    val salaryOfEmployee = 30_000
    val numberOfTrainees = 30
    val salaryOfTrainees = 20_000

    // ������� �� ������� �������� ���������� �����������
    val employeeSalaryExpenses = numberOfEmployees * salaryOfEmployee

    // ������� �� ������� �������� �������
    val employeeSalaryTrainees = numberOfTrainees * salaryOfTrainees

    // ����� ������� �� �� ����� ������� ��������
    val totalPayrollExpenses = employeeSalaryExpenses + employeeSalaryTrainees

    // ������� �� ������ ���������� ����� ���������� ��������
    val averageSalary = totalPayrollExpenses / (numberOfEmployees + numberOfTrainees)

    println(employeeSalaryExpenses)
    println(totalPayrollExpenses)
    println(averageSalary)
}