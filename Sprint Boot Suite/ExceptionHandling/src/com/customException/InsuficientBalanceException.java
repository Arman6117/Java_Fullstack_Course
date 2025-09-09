package com.customException;

public class InsuficientBalanceException extends Exception {
  public InsuficientBalanceException(String msg) {
	super(msg);
}
}
