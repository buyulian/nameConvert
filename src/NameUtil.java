public class NameUtil {

    public static String convertCase(String name){
        if(name.contains("_")){
            return toCamelCase(name);
        }else{
            return toSnakeCase(name);
        }
    }

    private static String toCamelCase(String name){
        StringBuilder sb=new StringBuilder();
        char[] chars=name.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            char c=chars[i];
            if(c=='_'){
                i++;
                char c1=chars[i];
                sb.append(Character.toUpperCase(c1));
            } else {
                sb.append(c);
            }
        }
        sb.append(chars[chars.length-1]);
        return sb.toString();
    }

    private static String toSnakeCase(String name){
        StringBuilder sb=new StringBuilder();
        char[] chars=name.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(Character.isUpperCase(c)){
                if(i!=0){
                    sb.append('_');
                }
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
