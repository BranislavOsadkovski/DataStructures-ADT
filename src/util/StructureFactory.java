package factories;

import structures.CustomBagStructure;
import structures.DequeStructure;

import structures.QueueStructure;
import structures.StackStructure;


public class StructureFactory {

	public static <T> StackStructure<T> newLinkedStack() {
		return new StackStructure<>();
	}
	public static <T> QueueStructure<T> newLinkedQueue() {
		return new QueueStructure<>();
	}
	public static <T> DequeStructure<T> newLinkedDeque() {
		return new DequeStructure<>();
	}
	public static <T> CustomBagStructure<T> newLinkedBag() {
		return new CustomBagStructure<>();
	}
}














