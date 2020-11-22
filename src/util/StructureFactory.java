package util;

import ArrayedStructures.ArrayedBag;
import ArrayedStructures.ArrayedDeque;
import ArrayedStructures.ArrayedQueue;
import ArrayedStructures.ArrayedStack;



public class StructureFactory {

	public static <T> ArrayedStack<T> newArrayedStack() {
		return new ArrayedStack<>();
	}
	public static <T> ArrayedQueue<T> newArrayedQueue() {
		return new ArrayedQueue<>();
	}
	public static <T> ArrayedDeque<T> newArrayedDeque() {
		return new ArrayedDeque<>();
	}
	public static <T> ArrayedBag<T> newArrayedBag() {
		return new ArrayedBag<>();
	}
}














