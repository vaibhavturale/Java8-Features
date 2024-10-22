package Lambda_Expression;

public class ThreadDemo {
    public static void main(String[] args) {

        Runnable thread1=() ->{
            for (int i=0;i<10;i++){
                System.out.println("Value of i is: "+ i);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        };

        Thread t1=new Thread(thread1);
        t1.setName("VAIBHAV");
        t1.getName();
        t1.start();
    }
}
