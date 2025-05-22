class A {
    void show() {
        System.out.println("Hello");
    }
}
class B extends A {
    void disp() {
        System.out.println("hii");
    }
}
class Multilevel extends B {
    
    void output() {
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Multilevel m = new Multilevel();
        a.show();
        b.disp();
        b.show();
        m.output();
        m.disp();
        m.show();
    }
}
