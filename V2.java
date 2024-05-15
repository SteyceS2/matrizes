package steyce;

import java.util.Scanner;

public class V2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int m[] [] = new int [3][3];
		
		 for (int i=0; i<3; i++) {
			 for (int j=0; j<3; j++) {
				 m[i] [j] = (int)Math.round(Math.random()*100);
			 }
		 }
		 for (int i=0; i<3; i++) {
			 for(int j=0; j<3; j++) {
				 System.out.println(" Os valores são " + m[i][j]);
			 }
		 }
		 ler.close();

	}
}
