class Demo{
    int a,b;
    Demo(int i, int j){
        a = i;
        b = j;
    }
    void show(){
        System.out.println("a = " + a + ", b = " + b);
    }

    
}
class InnerDemo{
    public static void main(String[] args) {
        Demo d = new Demo(10, 20){
            void show(){
                System.out.println("a = " + a + ", b = " + b);
            }
        };
        d.show();
    }

    
}