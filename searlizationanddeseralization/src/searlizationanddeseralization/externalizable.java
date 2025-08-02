package searlizationanddeseralization;

import java.io.*;

public class externalizable implements Externalizable {
    String username;
    transient String password;
    int age;

    // Mandatory no-arg constructor
    public externalizable() {}

    public externalizable(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(username);
        out.writeInt(age);
        // password is not written = selective serialization
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        username = (String) in.readObject();
        age = in.readInt();
        // password is not read = will remain null
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "', age=" + age + "}";
    }
}
