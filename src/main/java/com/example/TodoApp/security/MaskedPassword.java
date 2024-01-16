package com.example.TodoApp.security;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MaskedPassword extends JsonSerializer<String> {

    @Override
    public void serialize(String value, JsonGenerator generate, SerializerProvider serializers) throws IOException {
        generate.writeString("********");
    }
}