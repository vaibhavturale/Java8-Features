package Method_Reference;

import java.time.LocalDateTime;

public class Stuff {

    public static void doStuff() {
        System.out.println("I am doing stuff11111111111");
        System.out.println("I am doing  stuff22222222222");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());
    }

    static void threadTask() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
