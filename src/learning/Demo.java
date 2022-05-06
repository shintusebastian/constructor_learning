package learning;

import learning.Calculator;
import learning.Employee;

public class Demo {
    private double balance;
    private int age;
    private String name;

    public Demo(double balance) {
        this.balance = balance;
    }

    public Demo(String name) {
        this.name = name;
    }

    // calling a constructor from another constructor using this pointer.
    public Demo() {
        this("Shintu");
        // while calling a constructor from another constructor, this() statement should be the first line.
    }

    // the below code creates a copy constructor
    public Demo(Demo obj) {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Demo{" +
                "balance=" + balance +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

//        Demo demo = new Demo();
//        System.out.println(demo);
//        Calculator calculator = new Calculator();
//        calculator.sum(1, 2.0);
//
// this will automatically select sum(double, double) even though we haven't assigned such a function.
        //it automatically converts integer to double and finds the sum. because integer is lesser than double.
        // this type of polymorphism(overloading) is called compile time polymorphism.
//        System.out.println();// this println is an example of polymorphism.

//        Employee emp1=new Employee();
//        System.out.println(emp1.calWages(16.35D, 40));
//        System.out.println(emp1.calWages(16.35D, 40, 5));
//        System.out.println(emp1.calWages(16.35D, 40, 5, 200));

//int count=0;
//        char[] chars = str.toCharArray();
//        for(int i=0; i<chars.length;i++){
//            if(chars[i]=='a'|| chars[i]=='A'){
//                count++;
//            }
        //  another way to find the number of A's using the for loop itself
//        char[] chars = str.toCharArray();
//        int charCount=0;
//        for(char a:chars){
//            if(a=='a' ||a=='A'){
//                charCount++;
//            }
//        }
//        System.out.println(charCount);

//
//        System.out.println(count);
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
        String[] splitString = str.split(" ");
        int wordCount=0;
        for (String st : splitString) {
if (st.length()>=5){
    wordCount++;
}
        }
        System.out.println("Total words >=5 is "+wordCount);

     String upperCase=str.toUpperCase();
     //I am a java lover
     int newCharCount=0;
     while(upperCase.indexOf("A")!=-1){
         newCharCount++;
         upperCase=upperCase.substring(upperCase.indexOf("A")+1);
     }
        System.out.println(newCharCount);

    }
}

