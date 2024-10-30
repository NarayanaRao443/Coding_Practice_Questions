/**
 * TeluskoDemo
 */
/* 
// Method overloading
class Calculator
{
    public int add(int a , int b)
    {
        return a+b;
    }
    public int add(int a , int b, int c)
    {
        return a+b+c;
    }

    public double add(int a, double b)
    {
        return a*b;
    }
}
public class TeluskoDemo {

    public static void main(String[] args) {
        
        Calculator ob = new Calculator();
        int res = ob.add(10, 20);
        System.out.println(res);

        int res2 = ob.add(10, 20, 30);
        System.out.println(res2);

        double res3 = ob.add(20,10.0);
        System.out.println(res3);
    }
}
*/

/* 
// Mthod overloading
 public class TeluskoDemo {

    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static double add(double a, double b, double c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(10.0,20.0,40.0));
    }
}
*/

/**
 * TeluskoDemo
 */
/*
    class Student
    {
        int rollno;
        String name;
        int marks;
    }
public class TeluskoDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 123;
        s1.name = "Kumar";
        s1.marks = 200;

        Student s2 = new Student();
        s2.rollno = 124;
        s2.name = "Raju";
        s2.marks = 300;

        Student s3 = new Student();
        s3.rollno = 125;
        s3.name = "Navin";
        s3.marks = 400;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name +" "+students[i].rollno+" "+students[i].marks);
        // }

       for(Student stu : students)
       {
            System.out.println(stu.name+ ": "+ stu.rollno +": "+ stu.marks);
       }

       //System.out.println(s1.rollno +" "+s1.name+" "+s1.marks);
       //System.out.println(s2.rollno +" "+s2.name+" "+s2.marks);
       //System.out.println(s3.rollno +" "+s3.name+" "+s3.marks);
       
       

        // int nums[] = new int[4];
        // nums[0] = 10;
        // nums[1] = 20;
        // //nums[1]= 100;
        // nums[2] = 30;
        // nums[3] = 40;

        // // for (int i = 0; i < nums.length; i++) {
        // //     System.out.println(nums[i]);
        // // }

        // for(int i: nums)
        // {
        //     System.out.println(i);
        // }
    }
}
*/

/**
 * TeluskoDemo
 */
/* 
public class TeluskoDemo {

    public static void main(String[] args) {

        // String name = new String("Raju"); 
        // System.out.println("Hello " +name);
        // System.out.println(name.charAt(2));
        // System.out.println(name.concat(" Kumar"));

        // String name = "Raju ";
        // name = name + "Kumar";
        // System.out.println("Hello "+name);

        // String s1 = "Kiran";
        // String s2 = "Kiran";
        // System.out.println(s1==s2);

        StringBuffer sb = new StringBuffer("Raju");
        //System.out.println(sb.capacity());
        sb.append(" Kumar");
        System.out.println(sb);
        
        //sb.deleteCharAt(2);
       // System.out.println(sb);
        
       sb.insert(0, "Java ");
        System.out.println(sb);
    }
}
*/




/* 
class Mobile
{
    String brand;
    int price;
   static String name;

    public void show()
    {
        System.out.println(brand +" "+ price +" "+ name);
    }
    public static void show1(Mobile m)
    {
        System.out.println("This is static");
         System.out.println(m.brand +" "+ m.price +" "+ name);
    }

}

  
public class TeluskoDemo {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Oppo";
        m.price = 200;
        m.name = "y123";

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 300;
        m1.name = "y203";

        m.show();
        m1.show();
        Mobile.show1(m);
        //m1.show1();
    }
}
*/
/* 

class Mobile
{
    String brand;
    int price;
    static String name;

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }
    static
    {
        name = "phone";
        System.out.println("Static block");
    }
    public void show()
    {
        System.out.println(brand +" "+ price +" "+ name);
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Oppp";
        m.price = 200;
        m.name = "y123";
        
        Mobile m1 = new Mobile();
        m1.show();

    }
}
*/

/* 
class Student
{
    int rollno;
    String name;
    static String college = "ITS";

    static void change()
    {
        college = "BDTT";
    }

    Student(int r, String n)
    {
        rollno = r;
        name  = n;
    }
    void display()
    {
        System.out.println(rollno+" "+ name +" "+ college);
    }
}


public class TeluskoDemo {

    public static void main(String[] args) {
        
        Student.change();
        Student s1 = new Student(123, "Raju");
        s1.display();
    }
}
*/

/* 
class Student
{
    int rollno;
    String name;
    float fee;

    // Student(int r, String n, float f)
    // {
    //     rollno = r;
    //     name = n;
    //     fee = f;
    // }
    
    Student(int rollno, String name, float fee)
    {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display()
    {
        System.out.println(name+" "+ rollno+" "+fee);
    }
}


public class TeluskoDemo {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Kumar", 1000.0f);
        s1.display();

    }
}
*/

/* 
class Student
{
    int id;
    String name;
    void displayt()
    {
    //    System.out.println("This is school");
        System.out.println(id+" "+name);
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {
        Student s = new Student();
        s.displayt();
    }
}
*/
/* 
class Student
{
    int id;
    String name;
    int age;

    Student(int i, String n)
    {
        id = i;
        name = n;
    }

    Student(int i, String n,int a )
    {
        id = i;
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
}
public class TeluskoDemo {

    public static void main(String[] args) {
        
        Student s = new Student(123,"Raj");
        Student s1 = new Student(10, "Kumar", 100);
        s.display();
        s1.display();
    }
}
*/
/* 
class Student
{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void display()
    {
        System.out.println(name+" "+id+" "+marks);
    }
    
}
public class TeluskoDemo {
    public static void main(String[] args) {
        Student s = new Student(123,"Raju",100);
        s.display();
       

    }
    
}
*/
/* 
class Animal
{
    public static void display()
    {
        System.out.println("This is Animal");
    }
}
class Dog extends Animal
{
    public static void display1()
    {
        System.out.println("This is dog");
    }
}

class Cat extends Dog
{
    public void display2()
    {
        System.out.println("This is Cat");
    }
}
public class TeluskoDemo {

    public static void main(String[] args) {
        Cat d = new Cat();
        d.display1();
        d.display();
        d.display2();
        
        Dog dd = new Dog();
        dd.display();
        dd.display1();
        //dd.display2();

       
    }
}
*/

// Heirarchical Inheritance
/* 
class Animal
{
    static void eat()
    {
        System.out.println("Animal is running");
    }
}
class Dog extends Animal{
    static void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal
{
    static void meow()
    {
        System.out.println("Cat is Meow");
    }
}


public class TeluskoDemo {

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.meow();
        c.eat();
        d.bark();
        d.eat();
    }
}
*/

// Runtime Polymorphism
/* 
class A 
{
    public void show()
    {
        System.out.println("A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("C show");
    }
}
public class TeluskoDemo {

    public static void main(String[] args) {
        //A obj = new B();
        //obj.show();

        A obj = new A();
        obj.show(); // A method calls

        obj = new B();
        obj.show(); // B method calls

        obj = new C();
        obj.show(); // C method calls
    }
}
*/

/*
// final keyword. Can't change the variable, method and class once declared

 class  Calc
 {
    public final void show()
    {
        System.out.println("In Calc show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
 }

 class AdvCalc extends Calc
 {
    // public void show()
    // {
    //     System.out.println("In AdvCal show");
    // }
 }
public class TeluskoDemo {

    public static void main(String[] args) {
        //final int a = 8;
        //a = 9;
        //System.out.println(a);

        AdvCalc c = new AdvCalc();
        c.show();
        c.add(4, 6);
    }
}
*/
// Object class equals toString hashcode in java
/* 
class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model +" : "+price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Laptop that)
    // {
    //     return this.model.equals(that.model) && this.price == that.price;
            
       
    // }
    
}


public class TeluskoDemo {

    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Asus Tuf";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Asus Tuf1";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}
*/
// Wrapper Classes

/*

public class TeluskoDemo {

    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; //autoboxing

        int num2 = num1; // auto-unboxing
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
*/

// Abstract classes

// If u have any abstract methods u have to make a class as abstract class
/* 
abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing Music");
    }
}
abstract class Wagnor extends Car
{
    public void drive()
    {
        System.out.println("Car driving");
    }
}
class UpdatedWagnor extends Wagnor     // concrete class
{
    public void fly()
    {
        System.out.println("Car is flying");
    }
}
public class TeluskoDemo {

    public static void main(String[] args) {
        Car obj = new UpdatedWagnor();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
*/

// Inner classes
/* 
class A
{
    public void show()
    {
        System.out.println("In A show");
    }
   // static class B
    class B 
   {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //obj.config();

       // A.B obj1 = new A.B(); // for static class
       A.B obj1 = obj.new B(); 
       obj1.config();
    }
}
*/
// Anonymous inner class
/* 
class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}


public class TeluskoDemo {

    public static void main(String[] args) {
        A obj = new A() // Anonymous inner class
        {
            public void show()
            {
                System.out.println("In anonymous show");
            }
        };
        obj.show();
    }
}
*/

// Anonymous abstract class
/* 
abstract class A 
{
    public abstract void show();
    public abstract void config();
}

public class TeluskoDemo {

    public static void main(String[] args) {
        A obj = new A() // Anonymous abstract class
        {
            public void show()
            {
                System.out.println("In A show");
            }
            public void config()
            {
                System.out.println("In Config show");
            }
            
        };
        obj.show();
        obj.config();
    }
}
*/
// Interfaces
/* 
class Laptop
{
    public void code()
    {
        System.out.println("code compile run");
    } 
}

class Developer
{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}
public class TeluskoDemo {

    public static void main(String[] args) {
        Laptop lap = new Laptop();
        //Desktop desk = new Desktop();
        Developer dev = new Developer();
        dev.devApp(lap);
        
    }
}
*/

/* 
class Laptop
{
    public void code()
    {
        System.out.println("code compile run");
    }
}

class Desktop 
{
    public void code()
    {
        System.out.println("code compile run faster");
    }
}
class Developer
{
    public void devApp(Desktop d)
    {   
        d.code();
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        
        Developer dev = new Developer();
        dev.devApp(desk);
    }
    
}
*/
/* 
class Computer
{
    public void code()
    {

    }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code compile run");
    }
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println("code compile run faster");
    }
}
class Developer
{
    public void devApp(Computer d)
    {   
        d.code();
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        //dev.devApp(lap);
        dev.devApp(desk);

        
    }
    
}
*/

// finally this is the correct abstaraction
/* 
abstract class Computer
{
    public abstract void code();
}
class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code compile run");
    }
}
class Desktop extends Computer
{
    public void code()
    {
        System.out.println("code compile run faster");
    }
}
class Developer
{
    public void devApp(Computer d)
    {
        d.code();
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desk);
    }    
}
*/

// by using interfaces
/* 
interface Computer
{
     void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code compile run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code compile run faster");
    }
}
class Developer
{
    public void devApp(Computer d)
    {
        d.code();
    }
}

public class TeluskoDemo {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desk);
    }    
}
*/

// INTERFACES

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface A 
{
    void show();
    void config();
}

interface X 
{
    void run();
}
interface Y extends X
{

}
class B implements A,X
{
    public void show()
    {
        System.out.println("In A show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    // public void run()
    // {
    //     System.out.println("Runnn");
    // }
}

public class TeluskoDemo {

    public static void main(String[] args) {
        
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
    }
}