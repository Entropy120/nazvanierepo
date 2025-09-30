 package com.example;

  public class App {
      public static void main(String[] args) {
          String message = "Hello";
          message = "World"; // первое значение не используется!
          System.out.println(message);
      }
  }
