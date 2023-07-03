// interface Phone{
//     void Display();
//     void Ram();
// }
// interface Laptop{
//     // final String name;
//     void Screen();
//     void Ram(String name);
// }
// public class Keys implements Phone,Laptop {
//     public void Display(){
//         System.out.println("hello dplay");
//     }
//     public void Ram(String name){
//         System.out.println("hello RAM"+name);
//     }
//     public void Ram(){
//         System.out.println("helooram ");
//     }
//     public void Screen(){
//         System.out.println("hello scren");
//     }
//     public void Hdd(){
//         System.out.println("hell hdd");
//     }
// }
// class A{
//     void Hello(){
//         System.out.println("helo A");
//     }
// }
// class B extends A{
//     void Hello(){
//         System.out.println("helo B");
//     }
// }
// public class Keys extends A,B{
//     void Hello(){
//         System.out.println("helo C");
//     }
// }

// class Keys{
//     private String name;
//     private String age;

//     public Keys(String name,String age){
//         this.name=name;
//         this.age=age;
//     }

//     public void setName(String name){this.name=name;}
//     public void setAge(String age){this.age=age;}
//     public String getName(){return name;}
//     public String geAge(){return age;}

//     public void Display(){
//         System.out.println(this.getName()+" "+this.geAge());
//     }

class Keys{
    public void m1(int i){
        System.out.println("Integer type");
    }
    public void m1(double j){
        System.out.println("Float type");
    }
}