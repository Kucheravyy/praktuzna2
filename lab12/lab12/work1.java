package lab12;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println ("Введіть 2 будь-яких цілих числа: ");
		int number1 = k.nextInt();//зчитує перше число і присвоює значення в number1
		int number2 = k.nextInt();//зчитує друге число і присвоює значення в number2
		int a=number1 + number2;
		System.out.print   (a);//виводить суму number1 + number2
	}

}
