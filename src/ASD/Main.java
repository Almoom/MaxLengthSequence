package ASD;

import java.util.Arrays;

public class Main {
    /*Урок 4. Динамическое программирование. Поиск возвратом
    2. Решить задачу о нахождении длины максимальной последовательности с помощью матрицы.
    */
    public static void main(String[] args) {
	    String a = new String("geekbrainsrules");
	    String b = new String("versailles");
	    b = "0"+b;
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		int[][] count = new int[b.length()+1][a.length()+1];
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i].length; j++) {
				count[i][j] = 0;
			}
		}
		System.out.print("0 0 ");
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < bb.length; i++) {
			System.out.print(bb[i]+" ");
			for (int j = 0; j < count[i].length; j++) {
				System.out.print(count[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < bb.length; i++) {
			for (int j = 0; j < aa.length; j++) {
				if (bb[i] == aa[j] && count[i-1][j+1] == 0){
					count[i][j+1] = count[i][j] + 1;
				}
				if (bb[i] == aa[j] && count[i-1][j+1] > 0){
					count[i][j+1] = count[i-1][j+1] + 1;
				}
				if (count[i][j+1] == 0 && count[i][j] > count[i][j+1]){
					count[i][j+1] = count[i][j];
				}
			}
		}
		System.out.print("0 0 ");
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < bb.length; i++) {
			System.out.print(bb[i]+" ");
			for (int j = 0; j < count[i].length; j++) {
				System.out.print(count[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
    }
}
