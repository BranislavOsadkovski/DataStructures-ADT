package util;

import ArrayedStructures.ArrayedBag;
import ArrayedStructures.ArrayedDeque;
import ArrayedStructures.ArrayedQueue;
import ArrayedStructures.ArrayedStack;



public class StructureFactory {

	public static <T> ArrayedStack<T> newLinkedStack() {
		return new ArrayedStack<>();
	}
	public static <T> ArrayedQueue<T> newLinkedQueue() {
		return new ArrayedQueue<>();
	}
	public static <T> ArrayedDeque<T> newLinkedDeque() {
		return new ArrayedDeque<>();
	}
	public static <T> ArrayedBag<T> newLinkedBag() {
		return new ArrayedBag<>();
	}
}














