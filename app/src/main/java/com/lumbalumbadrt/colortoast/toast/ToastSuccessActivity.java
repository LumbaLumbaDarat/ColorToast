package com.lumbalumbadrt.colortoast.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lumbalumbadrt.colortoast.ColorToast;
import com.lumbalumbadrt.colortoast.R;
import com.lumbalumbadrt.colortoast.databinding.ActivityToastSuccessBinding;

@SuppressLint("NonConstantResourceId")
public class ToastSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToastSuccessBinding binding = ActivityToastSuccessBinding.
                inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRoundSuccess.setOnClickListener(onClickListenerRound);
        binding.btnRoundColorSuccess.setOnClickListener(onClickListenerRound);
        binding.btnRoundLineSuccess.setOnClickListener(onClickListenerRound);

        binding.btnRoundTitleSuccess.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundColorTitleSuccess.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundLineTitleSuccess.setOnClickListener(onClickListenerRoundTitle);

        binding.btnSquareSuccess.setOnClickListener(onClickListenerSquare);
        binding.btnSquareColorSuccess.setOnClickListener(onClickListenerSquare);
        binding.btnSquareLineSuccess.setOnClickListener(onClickListenerSquare);

        binding.btnSquareTitleSuccess.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareColorTitleSuccess.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareLineTitleSuccess.setOnClickListener(onClickListenerSquareTitle);

        binding.btnBlockSuccess.setOnClickListener(onClickListenerBlock);
        binding.btnBlockColorSuccess.setOnClickListener(onClickListenerBlock);
        binding.btnBlockLineSuccess.setOnClickListener(onClickListenerBlock);

        binding.btnBlockTitleSuccess.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockColorTitleSuccess.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockLineTitleSuccess.setOnClickListener(onClickListenerBlockTitle);
    }

    private final View.OnClickListener onClickListenerRound = view -> {
        switch (view.getId()) {
            case R.id.btn_round_success:
                ColorToast.roundSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Round Success"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_success:
                ColorToast.roundColorSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Round Color Success"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_success:
                ColorToast.roundLineSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Round Line Success"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerRoundTitle = view -> {
        switch (view.getId()) {
            case R.id.btn_round_title_success:
                ColorToast.roundSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_title_success:
                ColorToast.roundColorSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_title_success:
                ColorToast.roundLineSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquare = view -> {
        switch (view.getId()) {
            case R.id.btn_square_success:
                ColorToast.squareSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Square Success"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_success:
                ColorToast.squareColorSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Square Color Success"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_success:
                ColorToast.squareLineSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Square Line Success"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquareTitle = view -> {
        switch (view.getId()) {
            case R.id.btn_square_title_success:
                ColorToast.squareSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_title_success:
                ColorToast.squareColorSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_title_success:
                ColorToast.squareLineSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlock = view -> {
        switch (view.getId()) {
            case R.id.btn_block_success:
                ColorToast.blockSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Block Success"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_success:
                ColorToast.blockColorSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Block Color Success"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_success:
                ColorToast.blockLineSuccess(this,
                        getResources().getString(R.string.hello_world,
                                "Block Line Success"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlockTitle = view -> {
        switch (view.getId()) {
            case R.id.btn_block_title_success:
                ColorToast.blockSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_title_success:
                ColorToast.blockColorSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_title_success:
                ColorToast.blockLineSuccess(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };
}