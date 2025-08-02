package searlizationanddeseralization;

import java.io.*;

public class singletonwithseralization {
    public static void main(String[] args) {
        try {
            // Step 1: Get Singleton instance and modify values
            presidentclass ans = presidentclass.getInstance("Vamsi", 5, "Kings");
            System.out.println("Before Serialization:");
            System.out.println(ans.getName() + " " + ans.getTrem() + " " + ans.getParty());
            System.out.println(ans);

            // Step 2: Serialize to file
            FileOutputStream fos = new FileOutputStream("c:\\files\\serilazation.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ans);
            oos.close();
            fos.close();

            // Step 3: Deserialize from file
            FileInputStream fis = new FileInputStream("c:\\files\\serilazation.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            presidentclass deserialized = (presidentclass) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("\nAfter Deserialization:");
            System.out.println(deserialized.getName() + " " + deserialized.getTrem() + " " + deserialized.getParty());
            System.out.println(deserialized);

            // Step 4: Verify singleton
            presidentclass p1 = presidentclass.getInstance("Sai", 4, "Pulli");
            System.out.println("\nAfter Updating Singleton:");
            System.out.println(p1.getName() + " " + p1.getTrem() + " " + p1.getParty());
            System.out.println(p1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
