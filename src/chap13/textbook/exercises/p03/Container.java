package chap13.textbook.exercises.p03;

public class Container<K, V> {
	private K key;
	private V value;
	
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}

}
