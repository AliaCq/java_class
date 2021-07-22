public class String方法 {
    public static void main1(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "world";
        boolean equals = s.equals(s1); // true
        System.out.println(equals);
        boolean equals1 = s.equals(s2);  //false
        System.out.println(equals1);
        boolean b = s.equalsIgnoreCase(s2); //true
        System.out.println(b);

        int i = s.compareTo(s1);
        System.out.println(i); //0

        int i1 = s.compareTo(s3);
        System.out.println(i1);

        int i2 = s.compareToIgnoreCase(s2);
        System.out.println(i2);
        int i3 = s.compareTo(s2);
        System.out.println(i3);
    }

    public static void main2(String[] args) {
        String[] filenames = {"板书.png","记事本.exe","笔记.txt","图.jpg","jpgx.txt"};
        int i = 0;
        for(i=0;i<filenames.length;i++){
            if(filenames[i].endsWith(".png") || filenames[i].endsWith(".jpg")){
                System.out.println(filenames[i]);
            }
        }

    }

    public static void main3(String[] args) {
        String[] names = {"张三","李四","孙一","王五","孙伟","孙晓晓"};
        int i = 0;
        for(i=0;i<names.length;i++){
            if(names[i].startsWith("孙") && names[i].length() == 2){
                System.out.println(names[i]);
            }
        }
    }

    public static void main4(String[] args) {
        String s = "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html";
        int i = s.lastIndexOf("/");
        System.out.println(s.substring(i + 1, s.length() - 5));
        String[] t = s.split("/");
        String[] m = new String[t.length - 7];
        int j = 0;
        for(j=7;j<t.length;j++){
            m[j-7] = t[j];
        }

        String n = m[m.length-1];
        n = n.substring(0,n.length()-5);
        m[m.length-1] = n;
        String join = String.join("/", m);
        System.out.println(join);
    }

    public static void main5(String[] args) {
        String s = "java.util.Scanner";
        String t = String.format("https://docs.oracle.com/javase/8/docs/api/%s.html",s.replace(".","/"));
        System.out.println(t);
    }

    public static void main6(String[] args) {
        String s = "package com.peixinchen.javase.learn_String;\n" +
                "\n"+
                "import java.util.Arrays;\n"+
                "import java.util.Scanner;\n" +
                "\n"+
                "public class Helloworld{\n"+
                "public static void main(String[] args) {\n"+
                "long[] array = new long[5];\n"+
                "Scanner s = new Scanner(System.in);\n"+
                "for(int i=0;i<5;i++){\n"+
                "arrat[i]=s.nextLong();\n"+
                "}\n"+
                "System.out.println(Arrays.toString(array));\n"+
                "}\n"+
                "}";
        String[] lines = s.split("\n");
        for(int i = 0;i < lines.length;i++){
            String line = lines[i];
           // System.out.printf("%02d:%s\n",i,line);
            if(line != ""){
                if(line.startsWith("package")){
                    System.out.println(line.substring(8));
                }else if(line.startsWith("import")){
                    System.out.println(line.substring(7));
                }else if(line.startsWith("public class")){
                    System.out.println(line.substring(13,23));
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
