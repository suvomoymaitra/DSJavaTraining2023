package inhertianceProject;

public class PassingObjectTest {

	public PassingObjectTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}

}


class Sugar{
	String type;
	String form;
	int quantity;
	String color;
	String taste;
	boolean organic;
	public Sugar(String type, String form, int quantity, String color, String taste, boolean organic) {
		super();
		this.type = type;
		this.form = form;
		this.quantity = quantity;
		this.color = color;
		this.taste = taste;
		this.organic = organic;
	}
	@Override
	public String toString() {
		return "Sugar [type=" + type + ", form=" + form + ", quantity=" + quantity + ", color=" + color + ", taste="
				+ taste + ", organic=" + organic + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public boolean isOrganic() {
		return organic;
	}
	public void setOrganic(boolean organic) {
		this.organic = organic;
	}
}

class Curd{

	String type;
	String density;
	String color;
	String taste;
	int quantity;
	public Curd(String type, String density, String color, String taste, int quantity) {
		super();
		this.type = type;
		this.density = density;
		this.color = color;
		this.taste = taste;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Curd [type=" + type + ", density=" + density + ", color=" + color + ", taste=" + taste + ", quantity="
				+ quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}


