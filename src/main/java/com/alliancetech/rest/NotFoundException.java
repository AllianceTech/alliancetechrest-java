package com.alliancetech.rest;

/**
 * HTTP 404 status code ("not found")
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String msg) {
        super(msg);
    }

}
