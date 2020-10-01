/* Problem link: https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/print-first-occurence/description/ 
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      while(t-->0)
      {
      String a=s.next();
      int []a1=new int[26];
      for(int i=0;i<a.length();i++)
      {
          int in=a.charAt(i)-'a';
          a1[in]++;
      }
      String y="";
      for(int i=0;i<a.length();i++)
      {
          char x=a.charAt(i);
          int in=x-'a';
          if(a1[in]>0)
          {
          y=y+x;
          a1[in]=0;
          }
       }
                System.out.println(y);
      }
 
    }
}
