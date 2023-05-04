package com.imagegallery.store.Response;

public class Response {
    String message;
    Boolean status;

    public Response(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public Response() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ImageUpload{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
