package Java;

/**
 * @ClassName Jconsole1
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-20 15:12
 * @Version 1.0
 **/

public class Jconsole1 {
    public Jconsole1() {
        Byte[] a=new Byte[1280*1024];
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("star..");

        fill(1000);
    }

    private static void fill(int i) throws InterruptedException{
        while (true) {
            Thread.sleep(5000);
            new Jconsole1();
        }
    }
}