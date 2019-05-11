package org.katheer.bean;

public class Welcome {
    private String user;
    private String message;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void welcomeUser() {
        System.out.println("Hello " + this.getUser() + ", " + this.getMessage());
    }
}
