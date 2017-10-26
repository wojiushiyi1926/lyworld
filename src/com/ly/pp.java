package com.ly;

import java.util.ArrayList;

public class pp {
	int[] a = { 2, 3, 4, 4, 4, 4, 7, 8, 8, 8, 8, 9, 100, 130, 150, 160 };
    int[] b = { 4, 6, 7, 7, 7, 7, 8, 8, 9, 10, 100, 130, 130, 140, 150 };
    int i = 0, j = 0;
    ArrayList<Integer> al = new ArrayList<Integer>();
    while (i < a.length && (j < b.length)) {
      if (a[i] < b[j])
        i++;
      else if (a[i] > b[j])
        j++;
      else {
        al.add(a[i]); // 这里应该先加入，然后再加1
        i++;
        j++;
      }
    }
    System.out.println(al);
}
}
