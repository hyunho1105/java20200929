package chap08.textbook.s080302;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
	}
}
