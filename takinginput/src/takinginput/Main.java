package takinginput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<n;i++) {
            al.add(sc.next());
        }

        Collections.sort(al,new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        
        sc.close();
    }
}