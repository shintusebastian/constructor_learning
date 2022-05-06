package learning;

import java.util.Arrays;


public class Demo1 {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "Shintu";
        names[1] = "Chinchu";
        names[2] = "Bichu";
        names[3] = "Anu";
        names[4] = "Neethu";
        names[5] = "Adeline";
        names[6] = "Aakash";
        names[7] = "Sarath";
        names[8] = "Jibin";
        names[9] = "Alfeena";
        //names[10]="Arya"; this will show the error that array index is out of bounds.
        System.out.println(Arrays.binarySearch(names, "Anu"));

        System.out.println(Arrays.compare(new int[]{10, 2, 3}, new int[]{1, 2, 14}));
        //compares two boolean arrays lexicographically( one by one)
        String[] copy = Arrays.copyOf(names, 4, String[].class);
        System.out.println(Arrays.toString(copy));
        String[] copyOfRange = Arrays.copyOfRange(names, 2, 4, String[].class);
        // here, the first index is included and the last index is excluded.

        System.out.println(Arrays.toString(copyOfRange));

        int [] nums=new int [10];
        Arrays.fill(nums, 50);// This method will fill 50 in the nums array we created.
        // fill method is used to initialize a value to an array.
        System.out.println(Arrays.toString(nums));
        Student[] students = new Student[5];
        students[0] = new Student("Shintu", "Java");
        students[1] = new Student("Neethu", "AEM");
        students[2] = new Student("Adeline", "AEM");
        students[3] = new Student("Edison", "Web Design");
        students[4] = new Student("Jerin", "PQE");
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}
