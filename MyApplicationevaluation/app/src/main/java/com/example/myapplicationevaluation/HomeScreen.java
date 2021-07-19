package com.example.myapplicationevaluation;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeScreen extends AppCompatActivity {
      EditText mtvemail, metUserId;
      TextView tvDate,tvPositive,tvHospitalizedCurrently,tvOnVentilatorCurrently,tvDeath,tvNegative;
      Button mTvFetchBTN;
      private static final String SHARED_PREFEREBCE_KEY = "FirstDir";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.second_main);
        initView();
        mtvemail = findViewById(R.id.edEmail);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFEREBCE_KEY,MODE_PRIVATE);
        String email = sharedPreferences.getString("name", "");
        mtvemail.setText(email);
        mtvemail = findViewById(R.id.edEmail);
        if (getIntent() != null){
            String memail = getIntent().getStringExtra("key");
            mtvemail.setText(memail);
        }
        mTvFetchBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiService apiService = Network.getRetrofitInstance().create(ApiService.class);
                int userId = Integer.parseInt(metUserId.getText().toString());
                apiService.getUser(userId).enqueue(new Callback<ResponseDTO>() {
                    @Override
                    public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
//                        ResponseDTO model = response.body();
//                        String positive = model.getPositive()+ " ";
//                        String negative = model.getPositive()+ " ";
//                        String hostitalize = model.getPositive()+ " ";
//                        String death = model.getPositive()+ " ";
//                        String recover = model.getPositive()+ " ";

                    }

                    @Override
                    public void onFailure(Call<ResponseDTO> call, Throwable t) {

                    }
                });
            }
        });
    }


    private void initView() {
        tvDate = findViewById(R.id.tvDate);
        tvDeath = findViewById(R.id.tvDeath);
        tvHospitalizedCurrently = findViewById(R.id.tvHospitalizedCurrently);
        tvOnVentilatorCurrently = findViewById(R.id.tvOnVentilatorCurrently);
        tvPositive = findViewById(R.id.tvPositive);
        tvNegative = findViewById(R.id.tvNegative);
        mTvFetchBTN = findViewById(R.id.TvFetchBTN);
        metUserId = findViewById(R.id.etUserId);




    }
}
