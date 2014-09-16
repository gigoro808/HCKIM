package ex1;

/**
 *
 * @author kosta Document : test Created on : ±èÇöÃ¶ 2014. 9. 12, ¿ÀÈÄ 1:49:39
 */
class Test { 
    public void who( ){
        System.out.println("A");
    }
}
class B extends Test {
    @Override
        public void who( ){
        System.out.println("B");
    }
}
class C {
    public static void main(String[] args) { 
           B b1 = new B();
           b1.who();
           Test b2 = new B();
           b2.who();
    }
}
