package com.example.joel.basicauthretrofit;

public class Login {
  private String name;
  private String email;
  private String password;
  private String phone_number;
  private String address;

    public Login(String name, String email, String password, String phone_number, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.address = address;
    }
}
