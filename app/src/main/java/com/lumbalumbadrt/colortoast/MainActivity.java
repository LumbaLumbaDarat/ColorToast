package com.lumbalumbadrt.colortoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lumbalumbadrt.colortoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRoundToastInfo.setOnClickListener(onClickListenerRoundToast);
        binding.btnRoundToastWarning.setOnClickListener(onClickListenerRoundToast);
        binding.btnRoundToastError.setOnClickListener(onClickListenerRoundToast);
        binding.btnRoundToastSuccess.setOnClickListener(onClickListenerRoundToast);

        binding.btnSquareToastInfo.setOnClickListener(onClickListenerSquareToast);
        binding.btnSquareToastWarning.setOnClickListener(onClickListenerSquareToast);
        binding.btnSquareToastError.setOnClickListener(onClickListenerSquareToast);
        binding.btnSquareToastSuccess.setOnClickListener(onClickListenerSquareToast);

        binding.btnBlockToastInfo.setOnClickListener(onClickListenerBlockToast);
        binding.btnBlockToastWarning.setOnClickListener(onClickListenerBlockToast);
        binding.btnBlockToastError.setOnClickListener(onClickListenerBlockToast);
        binding.btnBlockToastSuccess.setOnClickListener(onClickListenerBlockToast);
    }

    private final View.OnClickListener onClickListenerRoundToast = view ->
    {
        switch (view.getId()) {
            case R.id.btn_round_toast_info:
                ColorToast.showRoundToastInfo(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Round Toast Info"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_toast_warning:
                ColorToast.showRoundToastWarning(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Round Toast Warning"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_toast_error:
                ColorToast.showRoundToastError(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Round Toast Error"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_toast_success:
                ColorToast.showRoundToastSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Round Toast Success"), Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquareToast = view -> {
        switch (view.getId()) {
            case R.id.btn_square_toast_info:
                ColorToast.showSquareToastInfo(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Square Toast Info"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_toast_warning:
                ColorToast.showSquareToastWarning(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Square Toast Warning"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_toast_error:
                ColorToast.showSquareToastError(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Square Toast Error"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_toast_success:
                ColorToast.showSquareToastSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Square Toast Success"), Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlockToast = view -> {
        switch (view.getId()) {
            case R.id.btn_block_toast_info:
                ColorToast.showBlockToastInfo(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Block Toast Info"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_toast_warning:
                ColorToast.showBlockToastWarning(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Block Toast Warning"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_toast_error:
                ColorToast.showBlockToastError(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Block Toast Error"), Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_toast_success:
                ColorToast.showBlockToastSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "I'm Block Toast Success"), Toast.LENGTH_SHORT);
                break;
        }
    };
}