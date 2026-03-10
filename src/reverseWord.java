public class reverseWord {
    public static String wordReversal(String str){
        if(str==null || str.isEmpty()){
            return str;
        }

        StringBuilder result= new StringBuilder();
        StringBuilder word=new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(c!=' '){
                word.append(c);
            }
            else{
                result.append(word.reverse());
                result.append(c);
                word.setLength(0);
            }
        }

        result.append(word.reverse());
        return result.toString();
    }
}
