public class Zoo{
  public static void main(String argsp[]){
    Animal dog = new Animal(10, "F", 29);
    dog.eat();

    Bird bird = new Bird();
    bird.fly();

    Fish fish = new Fish();
    fish.swim();
  }
}
