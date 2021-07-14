package com.example.recycleview14_7__we_part;

public class ReciverModel extends BaseModel{
    private String ReciverMessage;

    public ReciverModel(String reciverMessage) {
        ReciverMessage = reciverMessage;
    }

    public String getReciverMessage() {
        return ReciverMessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
