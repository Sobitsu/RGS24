/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import com.grs24.mt.RemittanceException;
import org.slf4j.Logger;
/**
 *
 * @author Dale
 */
public class RemmitanceError {
    protected ErrorCode code;
    protected Integer id;
    protected String message;
    protected String errorMethods;
    protected String errorClass;
    protected Logger logger;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCode }
     *     
     */
    public ErrorCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCode }
     *     
     */
    public void setCode(ErrorCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    } 
    RemmitanceError(String errorClass, String errorMeth, String errorCode, Integer errorId, String errorMessage, Logger logger){
        this.message = errorMessage;
        this.id = errorId;
        this.code = ErrorCode.fromValue(errorCode);
        this.errorClass = errorClass;
        this.errorMethods = errorMeth;
        this.logger = logger;
    }
    public void generateEx() throws RemittanceException
        {
            String errormsg = errorClass+":"+errorMethods+"-"+message;
            logger.error(errormsg + ":" + code.value() + " - " + errormsg);
            throw new RemittanceException(message, id, code.value(), errormsg);
        }
}
