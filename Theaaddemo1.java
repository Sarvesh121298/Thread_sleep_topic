package Threadtopic;

public class Theaaddemo1 {
    public static void main(String[] args) {
        ThreadDemo d1 = new ThreadDemo();
        thread3 d2 = new thread3();
        thread4 d3 = new thread4();
        d1.start();
        d2.start();
        d3.start();
        //System.out.println(d1.getState());
    }
    
}
