package paquete;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomObjectMapper extends ObjectMapper {
    public CustomObjectMapper(){
        super();
        configureProperties();
    }

    private void configureProperties(){
        this.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES,true);
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }
}
