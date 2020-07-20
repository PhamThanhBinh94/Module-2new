package btdemsolanxuathiencuamoitutrongmotchuoisudungmmap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String string = "Toi la Pham Thanh Binh toi la Binh";
        String [] ArrStr = string.split(" ");

        Map<String, Integer> map = new TreeMap<String, Integer>();

        for (String str : ArrStr){
            str = str.toLowerCase();
            int countKey = 0;

            if (map.containsKey(str)){
                countKey ++;
                map.put(str,countKey);
            } else
                map.put(str,countKey);
        }
        for (Map.Entry<String,Integer> entry: map.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
