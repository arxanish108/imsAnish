package com.internalMgnSystem.ims.CustomException;

public class InvalidFieldException extends RuntimeException{
  public InvalidFieldException(String message){
    super(message);
  }
}
