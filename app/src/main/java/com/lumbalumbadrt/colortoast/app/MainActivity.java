package com.lumbalumbadrt.colortoast.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lumbalumbadrt.colortoast.app.R;
import com.lumbalumbadrt.colortoast.app.databinding.ActivityMainBinding;
import com.lumbalumbadrt.colortoast.app.toast.ToastErrorActivity;
import com.lumbalumbadrt.colortoast.app.toast.ToastInfoActivity;
import com.lumbalumbadrt.colortoast.app.toast.ToastSuccessActivity;
import com.lumbalumbadrt.colortoast.app.toast.ToastWarningActivity;

@SuppressLint("NonConstantResourceId")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnToastInfo.setOnClickListener(onClickListener);
        binding.btnToastWarning.setOnClickListener(onClickListener);
        binding.btnToastError.setOnClickListener(onClickListener);
        binding.btnToastSuccess.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = view -> {
        switch (view.getId()) {
            case R.id.btn_toast_info:
                goToSampleToast(ToastInfoActivity.class);
                break;
            case R.id.btn_toast_warning:
                goToSampleToast(ToastWarningActivity.class);
                break;
            case R.id.btn_toast_error:
                goToSampleToast(ToastErrorActivity.class);
                break;
            case R.id.btn_toast_success:
                goToSampleToast(ToastSuccessActivity.class);
                break;
        }
    };

    private <T> void goToSampleToast(Class<T> tClass) {
        Intent intent = new Intent(this, tClass);
        startActivity(intent);
    }
}