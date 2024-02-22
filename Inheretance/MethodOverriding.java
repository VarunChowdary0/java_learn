package Inheretance;

class Vehicle{
    public void getTires(){
        System.out.println("A velicle has minimum of 2 tires ");
    }
}
class Auto extends Vehicle{
    @Override
    public void getTires(){
        System.out.println("An auto has 3 tires ");
    }
}
class Car extends Vehicle{
    @Override
    public void getTires(){
        System.out.println("A Car has minimum of 4 tires ");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.getTires();
        Vehicle auto = new Auto();
        auto.getTires();
        Vehicle car = new Car();
        car.getTires();
    }
}
