import java.lang.reflect.*;
class Hello{
    protected void def(){
        System.out.println("helo class");
    }
}
public class Index{
    public static void main(String[] args) throws Exception{
    //    Test t=new Test2("buju","kutyma");
    //    t.dis();
    //    Test n=new Test3("bujjukutty");
    //    n.dis();
    //   Test t=new Test2();
    //   t.dis();t.Ex();
        // MountainBike b=new MountainBike(5, 78);
        // b.reduceGear(2);
        // System.out.println("Gear reduced to "+b.reduceGear(2));
        // System.out.println("Gear is inc to "+b.addGear(4));
        // System.out.println("Speed is inc to "+b.incSpeed(15));
        // System.out.println("The gearshift is done "+b.gearShift(2));
    Keys k=new Keys();
    // k.Display();
    // k.Hdd();
    // k.Ram("buju");
    // k.Screen();
    // k.Ram();
    k.Hello();
    }
}