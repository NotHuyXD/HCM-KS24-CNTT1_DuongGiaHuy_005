public class compressedString {
    public static String compressString(String str){
        if(str==null||str.isEmpty()){
            return str;
        }

        StringBuilder compressed=new StringBuilder();
        int consCount=0;

        for(int i=0; i<str.length(); i++){
            consCount++;

            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(consCount);
                consCount=0;
            }
        }

        if(compressed.length()<str.length()){
            return compressed.toString();
        }
        else{
            return str;
        }
    }
}
