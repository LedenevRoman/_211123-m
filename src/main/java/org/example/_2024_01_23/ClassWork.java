package org.example._2024_01_23;

public class ClassWork {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = new int[]{1, 2, 3};

        int[] array3 = new int[5];

/*        System.out.println(array1.length);
        System.out.println(array3[1]);*/

        for (int number : array) {
            System.out.println(number);
        }

        Student student1 = new Student("Mariya", 30);
        Student student2 = new Student("Mariya", 30);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}
