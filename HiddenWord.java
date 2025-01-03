public class HiddenWord {
    private String hidden = "";
    
    public HiddenWord(String hide) {
    hidden = hide;
    }
    public String getHint(String hint) {
    String thing = "";
    for (int count = 0; count < hint.length(); count++) {
    String first = "" + hint.charAt(count);
    String second = "" + hidden.charAt(count);
    if (first.equals(second)) {
    thing += hint.charAt(count);
    } else if (hidden.indexOf(hint.charAt(count)) != -1) {
    thing += "+";
    } else {
    thing += "*";
    }
    }
    return thing;
    }
    }
    