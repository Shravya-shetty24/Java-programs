// class calculator{
// public int add(int n1,int n2){
// return n1+n2;
// }
// }

// public class Main{
// public static void main(String args[]){
// calculator calc=new calculator();
// int num1=5;
// int num2=8;

// int result=calc.add(num1,num2);
// System.out.println(result);
// }
// }
// class phone{
// public void message(){
// System.out.println("messaging");
// }
// public String getapen (int cost){
// if(cost>=10){
// return "pen";
// }
// return "nothing";

// }
// }
// class Main{
// public static void main(String args[]){
// phone obj=new phone();
// obj.message();
// String str= obj.getapen(1);
// System.out.println(str);
// }
// }
//method overloading
// class calculator{
//     public int add(int n1,int n2){
//         return n1+n2;

//     }
//     public int add(int n1,int n2,int n3){
//         return n1+n2+n3;
//     }
//     public double add(double n1,int n2,double n3,double n4){
//         return n1+n2+n3+n4;
//     }
// }
// public class Main{
// public static void main(String args[]){
// calculator calc=new calculator();
// int num1=5;
// int num2=8;
// int num3=9;
// int num4=10;

// double result=calc.add(num1,num2,num3,num4);
// System.out.println(result);
// }
// }
// class student{
//     int rollno;
//     String name;
//     int marks;
// }
// public class Main{
//     public static void main(String args[]){
//         student s1=new student();
//         s1.rollno=5;
//         s1.marks=50;
//         s1.name="shravya";
//         student s2=new student();
//         s2.rollno=10;
//         s2.marks=56;
//         s2.name="shra";
//         student s3=new student();
//         s3.rollno=59;
//         s3.marks=19;
//         s3.name="shrav";
//         student students[]=new student[3];
//         students[0]=s1;
//         students[1]=s2;
//         students[2]=s3;
//         for(int i=0;i<3;i++){
//             System.out.println(students[i].rollno+" "+students[i].name);
//         }
//     }
// }
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();int b=sc.nextInt();
//         int c=sc.nextInt();
//        int max=a;
//         if(b>max){
//             b=max;
//         }
//         if(c>max){
//             c=max;
//         }
//     }
// }
// class mobile{
//     String brand;
//     int price;
//     static String name;
//     public void show(){
//         System.out.println(brand +":" +price +name);
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         mobile obj=new mobile();
//         mobile obj1=new mobile();
//         obj.brand="vivo";
//         obj.price=5000;
//         obj1.name="smartphone";
//         obj1.brand="vievo";
//         obj1.price=50000;
//         obj.show();
//         obj1.show();

//     }
// } 
//inheritance
// class calc{
//     public int add(int n1,int n2){
//         return n1+n2;
//     }
// }
// class advcalc extends calc{
//         public int sub(int n1,int n2){
//             return n1-n2;
//         }
//     }

// public class Main{
//     public static void main(String args[]){
//         advcalc obj=new advcalc();
//         int r=obj.add(3,4);
//         System.out.println(r);
//     }
// }

// class calc{
//     public int add(int n1,int n2){
//         return n1+n2;
//     }
// }

// class advcalc extends calc{
//         public int sub(int n1,int n2){
//             return n1-n2;
//         }
//     }

