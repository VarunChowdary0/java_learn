package Inheretance;
class ParentClass_131{
    int num1,num2;
    ParentClass_131(int n1,int n2){
        num1 = n1;
        num2 = n2;
    }
    public void Hello(){
        System.out.println("Hello ! by parent "+num1+" "+num2);
    }
}
class ChildClass_232 extends ParentClass_131{
    public void display(){
        super.Hello();
        System.out.println(super.num1);
    }
    public void Hello(){ // method overriding
        System.out.println("Child says hello");
    }

    ChildClass_232(){
        super(23,43);
    }
}
public class DemonstrateSuper{
    public static void main(String[] args) {
        ChildClass_232 C = new ChildClass_232();
        C.display();
        C.Hello();
    }
}
