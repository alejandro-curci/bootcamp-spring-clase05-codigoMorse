package com.bootcamp.morse.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Response {

    private String status;
    private String message;
    private CodigoMorse data;

    public Response(String status, CodigoMorse data, String message) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
