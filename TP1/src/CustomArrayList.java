import java.lang.reflect.Array;
import java.io.*;
import java.util.*;
public class CustomArrayList {
    public int[] customarray;

    CustomArrayList() {
        customarray = new int[10];
    }

    CustomArrayList(int n) {
        customarray = new int[n];

    }

    void add(int obj) {
        int l = customarray.length;
        customarray[l - 1] = obj;
    }

    void add(int index, int obj) {
        customarray[index] = obj;
    }

    int get(int index) {
        return customarray[index];

    }

    public int Size() {
        int s = 0;
        for (int i = 0; i < customarray.length; i++) {
            if (customarray[i] != 0) s++;
        }
        return s;
    }

    boolean isEmpty() {
        int s = this.Size();
        if (s == 0) return true;
        else return false;
    }

    boolean isIn(int x) {
        for (int i = 0; i < customarray.length; i++) {
            if (customarray[i] == x) return true;
        }
        return false;
    }

    int find(int x) {
        int pos = 0;
        if (this.isIn(x) == false) return -1;
        else {
            for (int i = 0; i < customarray.length; i++) {
                if (customarray[i] == x) {
                    pos = i;
                    break;
                }
            }

        }
        return pos;
    }

    void remove(int x) {
        int pos = this.find(x);
        customarray[pos] = customarray[pos + 1];
    }

    public static void main(String args[])
    { CustomArrayList l=new CustomArrayList(5);
       l.add(0,1);
       l.add(1,2);
       l.add(2,3);
       l.add(3,4);
       l.add(4,5);
       for (int i=0;i<5;i++)
       {int e=l.get(i);

           System.out.println(e);
    }
       boolean f= l.isIn(6);
       if(f==true) System.out.println("Found");
       else System.out.println ("Not Found");
}}


