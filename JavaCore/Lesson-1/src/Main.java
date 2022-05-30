public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào");
        System.out.println("Tôi tên là ...");
        System.out.println(20+20);
        System.out.println('a');

        int age;        // khai báo biến
        age = 21;

        long salary = 15000000L;

        System.out.println("Lương của tôi là: " + salary + "VND");

        float height = 1.5f;
        double weight = 40.5;

        double bmi = weight / (height*height);
        System.out.println("Chỉ số BMI của tôi: " + bmi);

        char ch = '6';
        System.out.println(ch);

        boolean flag = 5 > 6;
        System.out.println(flag);
    }
}
