public class Main {
    public static void main(String[] args) {
        System.out.println("12");
        System.out.println("branch3");
        System.out.println("m1e1");
        System.out.println("b3e2");
        try {
            test();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("2");
        System.out.println("1");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
    }

    public static void test(){
        try {
            throw new RuntimeException("re");
        }finally {
            System.out.println("fin");
        }
    }
}
