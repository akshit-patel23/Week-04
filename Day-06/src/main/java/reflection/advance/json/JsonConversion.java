package reflection.advance.json;

import java.lang.reflect.Field;

public class JsonConversion {
    public static String jsonConversion(Object obj) throws IllegalAccessException {
        Class<?> object1=obj.getClass();
        StringBuilder str=new StringBuilder("{");
        for(Field field: object1.getDeclaredFields()){
            field.setAccessible(true);
            Object value = field.get(obj);
            str.append(field.getName()).append(":");
            str.append( value instanceof String? "\""+value+"\"": value).append(", ");
        }
if(str.length()>2){
    str.delete(str.length()-2,str.length());
}
str.append("}");
        return str.toString();
    }
}
