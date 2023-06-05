class Test {
    int value;
    public Test(int value) {
        this.value = value;
    }
    public void printValue() {
        System.out.println("The value of test is: " + value);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Test test = new Test(5);
        test.printValue();
    }
}
