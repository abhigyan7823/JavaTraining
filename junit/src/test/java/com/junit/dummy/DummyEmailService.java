package com.junit.dummy;

public class DummyEmailService implements EmailService {
	public void sendEmail(String message) {
		throw new AssertionError("Method not implemented !!!");
	}
}
