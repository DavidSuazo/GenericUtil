
package com.credencial.util.request;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.annotations.Expose;

/**
 *
 * @author cj_sr
 */
public class NoModuleExclusionStrategy implements ExclusionStrategy {

    private final boolean deserialize;

    public NoModuleExclusionStrategy(boolean isdeserialize) {
        deserialize = isdeserialize;
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }

    @Override
    public boolean shouldSkipField(FieldAttributes field) {
        return !(field.getAnnotation(Expose.class) == null || (deserialize ? field.getAnnotation(Expose.class).deserialize() : field.getAnnotation(Expose.class).serialize()));
    }

}
