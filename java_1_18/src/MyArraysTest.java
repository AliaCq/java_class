public class MyArraysTest {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
    }

    private static void test6() {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long target = 0 ;
        for(target = -1;target <= 10;target++)
        {
            System.out.println(MyArrays.BinarySearch2(array, target));
        }
    }

    private static void test5() {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long target = 0 ;
        for(target = -1;target <= 10;target++)
        {
            System.out.println(MyArrays.BinarySearch(array, target));
        }
    }

    private static void test4() {
        long[] array;
        array = new long[] { 1, 2, 3, 4, 5, 6 };
        MyArrays.BubleSort(array);
        System.out.println(MyArrays.toString(array));

        array = new long[] { 6, 5, 4, 3, 2, 1 };
        MyArrays.BubleSort(array);
        System.out.println(MyArrays.toString(array));

        array = new long[] { 6, 4, 1, 3, 5, 2 };
        MyArrays.BubleSort(array);
        System.out.println(MyArrays.toString(array));

        array = new long[] { 1, 1, 1, 1, 1, 1 };
        MyArrays.BubleSort(array);
        System.out.println(MyArrays.toString(array));

        array = new long[] { };
        MyArrays.BubleSort(array);
        System.out.println(MyArrays.toString(array));
    }

    private static void test3() {
        long[] original = {1, 2, 3};
        long[] c1 = MyArrays.copyOfRange(original, 0,0);
        long[] c2 = MyArrays.copyOfRange(original, 1,1);
        long[] c3 = MyArrays.copyOfRange(original, 0,1);
        long[] c4 = MyArrays.copyOfRange(original, 0,3);
        long[] c5 = MyArrays.copyOfRange(original, 1,2);
        long[] c6 = MyArrays.copyOfRange(original, 0,5);
        long[] c7 = MyArrays.copyOfRange(original, 3,5);
        long[] c8 = MyArrays.copyOfRange(original, 2,5);

        System.out.println(MyArrays.toString(c1));
        System.out.println(MyArrays.toString(c2));
        System.out.println(MyArrays.toString(c3));
        System.out.println(MyArrays.toString(c4));
        System.out.println(MyArrays.toString(c5));
        System.out.println(MyArrays.toString(c6));
        System.out.println(MyArrays.toString(c7));
        System.out.println(MyArrays.toString(c8));

    }

    private static void test2() {
        long[] original = {1, 2, 3};
        long[] c1 = MyArrays.copyOf(original, 2);
        long[] c2 = MyArrays.copyOf(original, 3);
        long[] c3 = MyArrays.copyOf(original, 5);
        System.out.println(MyArrays.toString(c1));
        System.out.println(MyArrays.toString(c2));
        System.out.println(MyArrays.toString(c3));
    }

    private static void test1() {
        long[] array;
        String s;

        array = new long[0];
        s = MyArrays.toString(array);
        System.out.println(s);

        array = new long[5];
        s = MyArrays.toString(array);
        System.out.println(s);

        array = new long[] {1, 2, 3, 4, 5};
        s = MyArrays.toString(array);
        System.out.println(s);
    }
}
