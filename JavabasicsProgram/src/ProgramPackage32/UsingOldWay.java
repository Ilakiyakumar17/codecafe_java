package ProgramPackage32;

//1. Defining Implementable class
class MyCubeImpl implements MyCube
{
	@Override
	public int getCube(int no) {
		return no*no*no;
	}
}

public class UsingOldWay {
	public static void main(String[] args) {
		//Using object of implementable class
		MyCube obj=new MyCubeImpl();
		System.out.println("Cube is "+obj.getCube(3));

		//2. Using Anonymous class
		MyCube cubeObj=new MyCube() {	
			@Override
			public int getCube(int no) {				
				return no*no*no;
			}
		};
		System.out.println("Cube is "+cubeObj.getCube(5));				
	}
}