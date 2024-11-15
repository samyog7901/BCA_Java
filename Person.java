public class Person{
    String name;
    int age;

    void display()
    {
        String name = "Kanha";
        System.out.println(name + " is " + age + " years old.");
        System.out.println("Hare Krishna Hare Krishna Krishna Krishna Hare Hare");

        
    }

    public static void main(String[] args){ // main function
        Person p = new Person();
       // p.name = "Ram";
        p.age = 24;
        p.display();//function call
    }
}