package com.tw.vapasi;

 public class CannotAddException extends Exception {
  String message;

  CannotAddException(String message) {
    this.message = message;
  }

}
