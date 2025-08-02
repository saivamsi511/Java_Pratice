package searlizationanddeseralization;

import java.io.Serializable;

public class presidentclass implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int term;
    private String party;

    // Eager initialization
    private static final presidentclass instance = new presidentclass("Default", 0, "None");

    private presidentclass(String name, int term, String party) {
        this.name = name;
        this.term = term;
        this.party = party;
    }

    public static presidentclass getInstance(String name, int term, String party) {
        instance.name = name;
        instance.term = term;
        instance.party = party;
        return instance;
    }

    // Ensures singleton during deserialization
    protected Object readResolve() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getTrem() {
        return term;
    }

    public String getParty() {
        return party;
    }
}
