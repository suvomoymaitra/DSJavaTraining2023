
public class ProducerConsumerTest {

	public static void main(String[] args) {
		FoodItem pizza = new FoodItem("Pizza");
		Producer producer = new Producer(pizza);
		Consumer consumer = new Consumer(pizza);
		
		producer.start();
		consumer.start();
		
	}
}



class Producer extends Thread{
	
	FoodItem food;
	Producer(FoodItem food){
		this.food = food;
	}
	
	public void produce() {
		food.serve();
	}
	
	public void run() {
		produce();
	}
}

class Consumer extends Thread{
	FoodItem food;
	
	Consumer(FoodItem food){
		this.food =food;
	}
	
	void consume() {
		food.eat();
	}
	
	public void run() {
		consume();
	}
}



class FoodItem{
	String itemName;
	boolean isAvailable;
	
	FoodItem(String itemName){
		this.itemName = itemName;
		isAvailable = false;
	}
	
	synchronized void eat() {
		if(isAvailable == false) {
			System.out.println("Waiting for producer to produce....");
			try {
				wait();
			}
			catch(InterruptedException err) {
				System.out.println("Err : " + err);
			}
		}
		System.out.println(itemName + " is consumed by the consumer....");
		isAvailable = false;
	}
	
	synchronized void serve() {
		if(isAvailable==false) {
			System.out.println(itemName + " is produced by the producer....");
			isAvailable = true;
			notify();
		}
	}
	
}