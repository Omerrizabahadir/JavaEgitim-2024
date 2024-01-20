package access_modifiers;

public class AccessLevel {

    public static void main(String[] args) {

    }

    public String publicString() {
        return "public string";
    }

    private String privateString() {
        return "private string";
    }

    protected String protectedString() {
        return "protected string";
    }

    String defaultString() {
        return "default string";
    }
    public int publicInt(){
        return 5;
    }

}


