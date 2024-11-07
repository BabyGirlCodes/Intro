public class Main {
    public static void main(String[] args) {
        // Corrected: Class name should be capitalized
        car myCar = new car();

        myCar.color = "red";
        myCar.model = "Toyota"; // Corrected: model instead of modal
        myCar.year = 2006;
        System.out.println("My car is a " + myCar.color + " " + myCar.year + " model of " + myCar.model);

        // Assuming you have methods start() and accelerate() in the Car class
        myCar.start();
        myCar.accelerate();


        // Question 2 (can be placed anywhere in the same file)
        Person people = new Person();
        Person people2 = new Person();

        people.name = "Aisha";
        people.age = 10;
        System.out.println("Name: " + people.name + " and Age:" + people.age);



    }


}