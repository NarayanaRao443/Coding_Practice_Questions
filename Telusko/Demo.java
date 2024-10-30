public class Demo {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        int r1 = c.add(10, 20);
        int r2 = c.sub(10, 5);
        int r3 = c.mul(10, 5);
        int r4 = c.div(10, 5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
