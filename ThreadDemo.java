package Threadtopic;
public class ThreadDemo extends Thread {
    public void run(){
        for(int i = 0 ; 1<100;i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    
    }
}
} 
class thread3 extends Thread{  
    public void run(){
        for(int i = 0 ; 1<200;i++){
        System.out.println(i);
        try{
            Thread.sleep(800);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
    
        }
    }
}
}


class thread4 extends Thread{  
    public void run(){
        for(int i = 0 ; 1<300;i++){
        System.out.println(i);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
    
        }
    }
}
}
