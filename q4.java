import java.util.Scanner;
class q4{
     static Scanner sc=new Scanner(System.in);
     static void seqn(String str1,String str2){
      if(str2.length()<0)
      return;

      System.out.println(str1);
      for(int i=0;i<str2.length();i++)
       seqn(str1+str2.charAt(i),str2.substring(i+1,str2.length()));
  }


       public static void main (String args[]){
        String st=sc.nextLine();
          seqn("",st);
          }
        }