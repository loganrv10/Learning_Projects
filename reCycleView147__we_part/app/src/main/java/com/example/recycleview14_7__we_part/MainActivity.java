package com.example.recycleview14_7__we_part;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText mEtOption;
    private EditText mEtSendMessage;
    private ImageView mIvSend;
    private ArrayList<BaseModel> messageList = new ArrayList<>();
    private ChatAdpdter chatAdpdter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setRecycleView();
    }

    private void setRecycleView() {
        chatAdpdter = new ChatAdpdter(messageList);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager1);
        recyclerView.setAdapter(chatAdpdter);
    }

    private void buildList() {
        if (mEtOption.getText().toString().equals("0")) {
            messageList.add(new SenderModel(mEtSendMessage.getText().toString()));
        } else if (mEtOption.getText().toString().equals("1")) {
            messageList.add(new ReciverModel(mEtSendMessage.getText().toString()));
        }
        chatAdpdter.notifyDataSetChanged();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        mEtOption = findViewById(R.id.etChoice);
        mEtSendMessage = findViewById(R.id.etSendMessage);
        mIvSend = findViewById(R.id.ivSend);
        mIvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildList();
            }
        });


    }
}