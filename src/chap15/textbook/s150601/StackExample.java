package chap15.textbook.s150601;

import java.util.Stack;

public class StackExample {
	// LIFO (Last In First Out)
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox.get(0).getValue());
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " +coin.getValue() + "원");
		}
	}
}
