package lesson_2

/*
������ 1 � ����� 2

������ �� ������� ��������������. � ������ � ����������� ��������� ����������� ����� ������ 4 ��������.
� ��� ��������� ����� �� ����������� �������� 3, 4, 3, 5. ����� ����� ��������� �����, ������� ��������� ������� ����
�� ����������� ��� ����� ������.

� �������� ���������, ������� ����������� ������� ����;
� ����������� ��������� � �������;
� � ������� ������ ���� �������� ������� ����� � 2 ������� ����� �������.*/

fun main() {
    val ratingStudent1 = 3
    val ratingStudent2 = 4
    val ratingStudent3 = 3
    val ratingStudent4 = 5

    val averageRating = ((ratingStudent1 + ratingStudent2 + ratingStudent3 + ratingStudent4).toFloat() / 4)
    println(averageRating)
}