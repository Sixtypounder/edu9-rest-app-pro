package gr.aueb.cf.eduapp.core.exceptions;

import gr.aueb.cf.eduapp.core.exception.AppGenericException;

public class EntityInvalidArgumentException extends AppGenericException {
    private static final String DEFAULT_CODE = "InvalidArgument";

    public EntityInvalidArgumentException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}