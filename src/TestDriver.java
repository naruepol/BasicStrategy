
public class TestDriver {

	public static void main(String[] args) {
		MallardDuck d1 = new MallardDuck();
		d1.quack();
		d1.display();
		RubberDuck d2 = new RubberDuck();
		d2.quack();
		d2.display();
		Duck d3 = new RedheadDuck();
		d3.quack();
		d3.display();
		d3 = new RubberDuck();
		d3.quack();
		d3.display();
		MallardDuck d4 = new MallardDuck();
		d4.quack();
		
	}

}
