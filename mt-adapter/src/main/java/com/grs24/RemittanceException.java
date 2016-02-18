package com.grs24;

/**
 */
public class RemittanceException extends Exception {
    /**
     * Error code holder.
     */
    private int code;
    /**
     * Stan of the request.
     */
    private String stan;
    /**
     * Error code or message have got from Remittance System.
     */
    private String mtError;

    /**
     * Constructs an <code>Exception</code> with the specified detail message.
     * @param   message   the detail message.
     */
    public RemittanceException(String message, int code, String stan, String mtError) {
        super(message);
        this.code = code;
        this.stan = stan;
        this.mtError = mtError;
    }


    /**
     * Returns error code.
     *
     * @return the Error code.
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns error code.
     *
     * @return stan.
     */
    public String getStane() {
        return stan;
    }

    /**
     * Returns mtCode.
     *
     * @return the Remottance Error code.
     */
    public String getMtError() {
        return mtError;
    }

    /**
     * Returns a string representation of error.
     * @return a string representation.
     */
    public String toString() {
        return getClass().getName()+"{\"code\": \""+code+ "\", \"stan\": \""+stan+"\", \"mtError\": \""+mtError+"\", \"msg\": \""+getMessage()+"\"}";
    }
}
