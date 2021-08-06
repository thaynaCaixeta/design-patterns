package com.tackr.abstractfactory;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card);
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard anotherCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(anotherCard);
	}

}
