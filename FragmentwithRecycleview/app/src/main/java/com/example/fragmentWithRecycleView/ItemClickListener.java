package com.example.fragmentWithRecycleView;

import android.icu.text.Transliterator;
import android.os.Bundle;

public interface ItemClickListener {
    public void onClickListener(ResponseModel responseModel,int position);
}
