package com.example.recycleview14_7__we_part;

public class SenderModel extends BaseModel {
    private String message;

    public SenderModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
