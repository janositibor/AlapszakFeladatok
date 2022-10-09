package f03_Filename_URL_stringmethods;

public class KeyAndValue {
    private String key;
    private String value;

    public KeyAndValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyAndValue{" +
                "Key='" + key + '\'' +
                ", Value='" + value + '\'' +
                '}';
    }
}
