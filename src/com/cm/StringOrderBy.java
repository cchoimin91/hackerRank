package com.cm;

import java.util.Arrays;
import java.util.Comparator;

public class StringOrderBy {

    public StringOrderBy() {
        String[] v = {"d","a","bbb","c","zzzzzzzz"};

        //System.out.println(orderByAsc(v));
        System.out.println(orderByDesc(v));
    }

    public String[] orderByAsc(String[] v){
        Arrays.sort(v, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()) return 1;
                if(o1.length()<o2.length()) return -1;

                if(o1.compareTo(o2)>0) return 1;
                if(o1.compareTo(o2)<0) return -1;

                return 0;
            }
        });

        for(String str: v) System.out.println(str);

        return v;
    }

    public String[] orderByDesc(String[] v){

        Arrays.sort(v, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()) return -1;
                if(o1.length()<o2.length()) return 1;

                if(o1.compareTo(o2)>0) return -1;
                if(o1.compareTo(o2)<0) return 1;
                return 0;
            }
        });

        for(String str: v) System.out.println(str);

        return v;
    }
}
