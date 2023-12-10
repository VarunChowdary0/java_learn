package AbstractClass;

/*
 * Consider building a project ;
 * having the following:
 * 1 - introduction.
 * 2 - Topic1
 * 3 - Topic2
 * 4 - Topic3
 * 5 - Conclusion
 * 
 * Each member does some work.
 */

abstract class TeamLeader{
    // leader does Indroduction;
    public void Indroduction(){
        System.out.println("Introduction By Team-Leader.");
    }

    public abstract void Topic1();
    public abstract void Topic2();
    public abstract void Topic3();
    public abstract void Conclusion();
}
abstract class TeamMember1 extends TeamLeader{
    public void Topic1(){
        System.out.println("Topic-1 By Team-Member-1.");
    }
}
abstract class TeamMember2 extends TeamMember1{
    public void Topic2(){
        System.out.println("Topic-2 By Team-Member-2.");
    }
}
abstract class TeamMember3 extends TeamMember2{
    public void Topic3(){
        System.out.println("Topic-3 By Team-Member-3.");
    }
}
class FinalMember extends TeamMember3{  // This will not be an abstract class
    public void Conclusion(){           // Beacouse all the abstract methods are implimented. 
        System.out.println("Conclusion By Final-Member.");
    }
}
public class AbsExamplePrg {
    public static void main(String[] args) {
        TeamLeader Prj = new FinalMember();
        Prj.Indroduction();
        Prj.Topic1();;
        Prj.Topic2();
        Prj.Topic3();
        Prj.Conclusion();
    }
}
