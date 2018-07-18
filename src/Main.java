public class Main {
    public static void main(String[] args){

        //first task
        System.out.println("first task\n");
        Cat Nensy= new Cat("Nansy",true);
        Nensy.say();
        Nensy.sleep();
        Cat Tom=new Cat("Tom",false);
        Tom.sleep();
        Tom.say();

        //second task
        System.out.println("\nsecond task\n");
        Triangle firstTriangle = new Triangle(20,18,31);
        System.out.println(firstTriangle.Square());
        Triangle secondTriangle = new Triangle(65,8,95);

        //third task
        System.out.println("\nthird task\n");
        Vector3D firstVec=new Vector3D(5,7,9);
        Vector3D secondVec = new Vector3D(4,6,8);
        firstVec.Addition(firstVec.Addition(secondVec));
        firstVec.Addition(secondVec.ScalarProduct(firstVec));
        firstVec.Addition(firstVec.VectorProduct(secondVec));

        //fourth task
        System.out.println("\nfourth task\n");
        Network network=new Network();
        Phone num1=new Phone("0677478621");
        network.setPhoneList(num1);
        Phone num2=new Phone("0986291621");
        network.setPhoneList(num2);
        Phone num3=new Phone("0500091621");
        network.setPhoneList(num3);
        Phone num4=new Phone("0971564789");
        network.setPhoneList(num4);

        num1.call(num2.getNumber(),network);
        num3.call("0678797895",network);

    }
}
