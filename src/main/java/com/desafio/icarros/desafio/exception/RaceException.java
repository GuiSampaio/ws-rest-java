package com.desafio.icarros.desafio.exception;

import java.io.Serializable;

public class RaceException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public RaceException() {
	}

	public RaceException(final String msg) {
		super(msg);
	}

	public RaceException(final Throwable erro) {
		super(erro);
	}

	public RaceException(String msg, Throwable erro) {
		super(msg, erro);
	}

}
