class A {
    void show(){
        System.out.println("Hello");
    }
}
class B extends A{
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
    
}
