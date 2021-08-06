package com.tackr.abstractfactory;

// Abstract factory (UML design)
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore > 650)
			return new VisaFactory();

		return new AmexFactory();
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract Validator getValidator(CardType cardType);
}
