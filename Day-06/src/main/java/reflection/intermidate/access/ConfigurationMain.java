package reflection.intermidate.access;

import java.lang.reflect.Field;

public class ConfigurationMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Configuration config=new Configuration();
        Class<?> obj=config.getClass();
        Field field=config.getClass().getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(obj,"Deepak");

        Configuration config1=new Configuration();
        System.out.println(config1.getApiKey());
    }
}
