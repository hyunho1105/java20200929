package chap13.textbook.s130401;

import chap13.textbook.s130202.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
