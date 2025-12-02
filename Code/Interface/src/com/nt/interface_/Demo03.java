package com.nt.interface_;

sealed interface Drink permits Tea, Cofee {
	void prepare();
}

non-sealed class Tea implements Drink {
	@Override
	public void prepare() {
		System.out.println("tea is getting prepare....");
	}
}

final class Cofee implements Drink {
	@Override
	public void prepare() {
		System.out.println("cofee is getting prepare....");
	}
}

class CafeCofeeDay {
	public void prepareDrink(Drink drink) {
		drink.prepare();
	}
}

public class Demo03 {
	public static void main(String[] args) {
		CafeCofeeDay ccd = new CafeCofeeDay();
		ccd.prepareDrink(new Tea());
		ccd.prepareDrink(new Cofee());
	}

}
