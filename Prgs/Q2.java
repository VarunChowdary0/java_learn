public class Q2 {
    public int aMethod(){
        int i = 0;
        i++;
        return i;
    }
    public static void main(String[] args) {
        Q2 q = new Q2();
        q.aMethod();
        int j = q.aMethod();
        System.out.println(j);
    }
}
