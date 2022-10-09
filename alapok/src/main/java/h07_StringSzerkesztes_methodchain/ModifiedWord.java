package h07_StringSzerkesztes_methodchain;

public class ModifiedWord {
    String text;


    public String modify(String word){
        if(word==null||word.isBlank()||word.length()<4){
            throw new IllegalArgumentException("We need a word to modify!");
        }
        text=word;
        shorten()
        .changeThisCharToUppercase(0)
        .changeThisToThissString(1,"x")
        .changeThisCharToUppercase(2)
        .changeThisToThissString(3,"y");
        return text;
    }

    private ModifiedWord changeThisToThissString(int i,String toChange) {
        String newText="";
        if(i>0){
            newText=text.substring(0,i);
        }
        newText+=toChange;
        if(i<text.length()-1){
            newText+=text.substring(i+1);
        }
        text=newText;
        return this;
    }

    private ModifiedWord changeThisCharToUppercase(int i) {
        String newText="";
        if(i>0){
            newText=text.substring(0,i);
        }
        newText+=text.substring(i,i+1).toUpperCase();
        if(i<text.length()-1){
            newText+=text.substring(i+1);
        }
        text=newText;
        return this;
    }

    private ModifiedWord shorten() {
        text=text.substring(0,4);
        return this;
    }
}
