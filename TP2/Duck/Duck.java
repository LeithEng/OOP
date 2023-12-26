public abstract class Duck {
    public void swim(){
        System.out.println("I'm swimming");
    }
    public void display() {}

    public static void main(String[] args) {
        Fly2 f2=new Fly2();
        Fly1 f1=new Fly1();
        MallardDuck m=new MallardDuck(f2);
        m.display();
        m.fly();
        m.swim();
        m.quack();

    }
}

interface Flyable{
      public void fly();

}
interface Quackable{
   public void quack();


}

class Fly1  implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly 1");
    }
}
class Fly2  implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly 2");
    }
}

class MallardDuck extends Duck implements Flyable, Quackable{
    Flyable f;
    MallardDuck(Flyable f)
    {this.f=f;}
    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }

    @Override
    public void fly() {
        f.fly();
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

class RedHeadDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("I'm a redhead duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}



