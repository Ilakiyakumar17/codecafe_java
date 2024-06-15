package ProgramPackage34;

import java.lang.annotation.Annotation;

public class AnnotationsDemo {
	public static void main(String[] args) {
		AndroidSeries obj = new AndroidSeries("A23", 14);
		System.out.println(obj.model);
		System.out.println(obj.screenSize);
		System.out.println("SmartPhone details");
		
		@SuppressWarnings("rawtypes")
		Class c = obj.getClass();
		
		@SuppressWarnings("unchecked")
		Annotation an = c.getAnnotation(SmartPhone.class);
		
		SmartPhone s = (SmartPhone) an;

		System.out.println(s.os());
		System.out.println(s.version());

		System.out.println("SmartTV details");

		@SuppressWarnings("unchecked")
		Annotation an1 = c.getAnnotation(SmartTV.class);
		
		SmartTV s1 = (SmartTV) an1;

		System.out.println(s1.os());
		System.out.println(s1.height());
		System.out.println(s1.width());

	}
}