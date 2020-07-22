package optionalbttimchuoilientiepcododailonnhat;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        //Find the maxium increasingly ordered subsequence
        for (int i =0; i < string.length();i++)
        {
            if (list.size() > 0 && string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            } else {
                list.clear();
                list.add(string.charAt(i));
            }

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max){
            System.out.print(ch);
        }
        System.out.println();
    }
}
