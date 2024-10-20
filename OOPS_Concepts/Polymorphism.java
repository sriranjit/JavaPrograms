abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat Meows");
    }
}
class Cow extends Animal{
    public void sound(){
        System.out.println("Cow Moos");
    }
}
public class Polymorphism
{
	public static void main(String[] args) {
		Animal[] animal=new Animal[3];
		animal[0]=new Dog();
		animal[1]=new Cat();
		animal[2]=new Cow();
		
		for (Animal ani : animal){
		    ani.sound();
		}
	}
}