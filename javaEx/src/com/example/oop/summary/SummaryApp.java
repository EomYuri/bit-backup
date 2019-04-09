package com.example.oop.summary;

public class SummaryApp {
	static KungfuSkill[] masters;
	public SummaryApp() {
	}

	public static void main(String[] args) {
		Human h1 = new Human("엄유리", 24);
		Human h2 = new TheOne("네오", 55);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("포",15);
		
		fight(h1); fight(h2); fight(p1); fight(p2);
		
		// 쿵푸를 할 수 있는 객체만 masters에 담아봅시다.
		masters = new KungfuSkill[] {
				(KungfuSkill)h2,
				(KungfuSkill)p2
		};
		
		for(KungfuSkill master:masters) {
			master.Kungfu();
		}

	}
	public static void fight(Animal animal) {
		if (animal instanceof KungfuSkill) {
			((KungfuSkill)animal).Kungfu();
		}else {
			System.out.println(animal.name + ": 전 쿵푸 못해요.");
		}
	}

}
