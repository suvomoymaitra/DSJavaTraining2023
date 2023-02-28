package inhertianceProject;

public class MetalProductsTest {

	public MetalProductsTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
	}
}

class metalProducts{
	float cost;
	static int var;

	public metalProducts(float cost) {
		super();
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "metalProducts [cost=" + cost + "]";
	}
	
}

final class bottle extends metalProducts{
	int capacity;
	String color;
	boolean thermal;
	public bottle(float cost, int capacity, String color, boolean thermal) {
		super(cost);
		this.capacity = capacity;
		this.color = color;
		this.thermal = thermal;
	}
	@Override
	public String toString() {
		return "bottle [toString()=" + super.toString() + ", capacity=" + capacity + ", color=" + color + ", thermal="
				+ thermal + "]";
	}
	
	
	
	
	
}

final class penNib extends metalProducts{
	String shape;
	int length;
	public penNib(float cost, String shape, int length) {
		super(cost);
		this.shape = shape;
		this.length = length;
	}
	@Override
	public String toString() {
		return "penNib [toString()=" + super.toString() + ", shape=" + shape + ", length=" + length + "]";
	}
	
	
}

final class metalBed extends metalProducts{
	int height;
	int width;
	int length;
	public metalBed(float cost, int height, int width, int length) {
		super(cost);
		this.height = height;
		this.width = width;
		this.length = length;
	}
	@Override
	public String toString() {
		return "metalBed [toString()=" + super.toString() + ", height=" + height + ", width=" + width + ", length="
				+ length + "]";
	}
	
}
