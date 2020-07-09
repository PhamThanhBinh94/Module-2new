import java.util.Scanner;

public class ReadNumberIntoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Chương trình đọc số");
        int number = sc.nextInt();
        int num = [3,4,5,6,7,8,9];
        String eval = "third, four,fif,six,seven,eight,nine";
        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    System.out.printf("one");
                    break;
                case 2:
                    System.out.printf("two");
                    break;
                case 3:
                    System.out.printf("three");
                    break;
                case 4:
                    System.out.printf("four");
                    break;
                case 5:
                    System.out.printf("five");
                    break;
                case 6:
                    System.out.printf("six");
                    break;
                case 7:
                    System.out.printf("seven");
                    break;
                case 8:
                    System.out.printf("eight");
                    break;
                case 9:
                    System.out.printf("nine");
                    break;
            }
        }

        if (number <20 && number >=10){
            switch (number){
                case 10:
                    System.out.printf("ten");
                    break;
                case 11:
                    System.out.printf("eleven");
                    break;
                case 12:
                    System.out.printf("twelve");
                    break;
                case 13:
                    System.out.printf("thirteen");
                    break;
                case 14:
                    System.out.printf("fourteen");
                    break;
                case 15:
                    System.out.printf("fifteen");
                    break;
                case 16:
                    System.out.printf("sixteen");
                    break;
                case 17:
                    System.out.printf("seventeen");
                    break;
                case 18:
                    System.out.printf("eighteen");
                    break;
                case 19:
                    System.out.printf("nineteen");
                    break;
            }
        }

    }
}

