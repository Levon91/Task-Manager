package am.iguan.taskmanager.model;

/**
 * Created by Admin on 15.12.2014.
 */
public enum Gender {

    MALE    (1, "male"),
    FEMALE  (2, "female");

    private long key;
    private String value;

    Gender(long key, String value) {
        this.key = key;
        this.value = value;
    }

    public long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
