//Program to demonstrate generic interface
package ProgramPackage25;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
