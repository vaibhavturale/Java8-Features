package Method_Reference;

public class RefMain {
    public static void main(String[] args) {
        System.out.println("Learning Method  reference !.........");

        //Implemetention of WorkInter Intervface

        WorkInter workInter=()->{
            System.out.println("This is doTask");
        };
        workInter.doTask();

        //Method reference  ----It will call Stuff class method automatically
        WorkInter workInter1= Stuff::doStuff;
        workInter1.doTask();

        Runnable runnable= Stuff::threadTask;
        Thread t1=new Thread(runnable);
        t1.run();
    }
}
