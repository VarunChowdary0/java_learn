package CallByValue_CallByRef;

public class CallByValue__ {
    public void Add10(int num){
        num+=10;
    }
    public int Add10andReturn(int num){
        return num+=10;
    }
    public static void main(String[] args) {
        int n = 100;
        CallByValue__ C = new CallByValue__();
        C.Add10(n);
        System.out.println(n); // call by value
        n = C.Add10andReturn(n);
        System.out.println(n); // call by value 
    }
}
