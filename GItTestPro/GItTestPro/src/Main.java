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
        System.out.println("7");
    }

    public static void test(){
        try {
            throw new RuntimeException("re");
        }finally {
            System.out.println("fin");
        }
    }
}
