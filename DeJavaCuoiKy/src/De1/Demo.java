/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

/**
 *
 * @author arohigh
 */
class Msg {

    public Msg() {  //phuong thuc khoi tao (constructor)
        System.out.println("hello");
    }

    public void sayGoodbye() {
        System.out.println("goodbye");
    }
}

class TestMsg extends Msg {

    public TestMsg() {
        super();    //in ra hello
        System.out.println("Hello java");
    }
    
    @Override
    public void sayGoodbye(){
        System.out.println("Goodbye java");
    }
}

public class Demo {

    public static void main(String[] args) {
        Msg m1 = new Msg();
        Msg m2 = new TestMsg();
        m1.sayGoodbye();
        m2.sayGoodbye();
    }
}
