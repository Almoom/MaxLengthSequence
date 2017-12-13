package ASD;

import java.util.Arrays;

public class Main {
    /*Урок 4. Динамическое программирование. Поиск возвратом
    2. Решить задачу о нахождении длины максимальной последовательности с помощью матрицы.
    */
    public static void main(String[] args) {
	    String a = new String("geekbrainsrules");
	    String b = new String("versailles");
	    char[][] arr = new char[b.length()+2][a.length()+2];
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		int[][] count = new int[b.length()][a.length()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = '0';
			}
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i].length; j++) {
				count[i][j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			arr[i][0] = bb[i-2];
			for (int j = 2; j < arr[i].length; j++) {
				arr[0][j] = aa[j-2];
			}
		}
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j < arr[i].length; j++) {
				arr[i][j] = count[i-2][j-2];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j < arr[i].length; j++) {
				if (arr[i][0] == arr[0][j]){
					if (Character.getNumericValue(arr[i][j-1]) == 0){
						arr[i][j] = '1';
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
    }
}
