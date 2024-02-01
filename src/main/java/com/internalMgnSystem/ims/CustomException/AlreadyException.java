package com.internalMgnSystem.ims.CustomException;

public class AlreadyException extends RuntimeException{
  public AlreadyException(String message){
    super(message);
  }
}
