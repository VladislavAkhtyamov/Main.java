package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
	Reverse();
	OneHundred();
	Multiplication();
	Diagonal();
	LenAndInitial(3, 5);
    }
    static void Reverse (){
        int[] NullAndOne = {1, 1, 0, 0, 1, 0};
        for (int i = 0; i < NullAndOne.length; i++) {
            if (NullAndOne[i] == 1){
                System.out.println(NullAndOne[i] - 1);
            } else {
                System.out.println(NullAndOne[i] + 1);
            }
        }
    }

    static void OneHundred(){
        int[] numeral = new int[100];
        int number = 1;
        for (int i = 0; i < numeral.length; i++) {
            numeral[i] = number;
            System.out.println(numeral[i]);
            number++;
        }
    }

    static void Multiplication(){
        int[] number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6){
                System.out.println(number[i] * 2);
            } else {
                System.out.println(number[i]);
            }
        }
    }

    public static void Diagonal(){
        int [][] arr = new int [10][10];
        int one = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i > j){
                    System.out.print(arr[i][j]);
                } else if (i < j){
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(one);
                } System.out.print(" ");
            } System.out.println();
        }
    }

    static void LenAndInitial(int len, int InitialValue){
        int [] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = InitialValue;
            System.out.println(arr[i]);
        }
    }
}
