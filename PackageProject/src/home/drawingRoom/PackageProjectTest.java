package home.drawingRoom;

import home.myRoom.Myself;

import home.myRoom.Parents;

public class PackageProjectTest {

	public static void main(String[] args) {
		Myself myself = new Myself();
		myself.accessRoom();
		myself.accessDrawingRoom();
		Parents parents = new Parents();
		parents.accessRoom();
		parents.accessDrawingRoom();
	}

}
