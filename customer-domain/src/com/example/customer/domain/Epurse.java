package com.example.customer.domain;

public final class Epurse {
	private final double money;

	private Epurse(double money) {

		this.money = money;
	}

	public static Epurse of(double money) {

		if (money < 0.0)
			throw new IllegalArgumentException("The amount of money cannot be less than zero!");

		return new Epurse(money);
	}

	public double getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return "Epurse [money=" + money + "]";
	}
}
