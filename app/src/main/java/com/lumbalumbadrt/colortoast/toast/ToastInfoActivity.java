package com.lumbalumbadrt.colortoast.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lumbalumbadrt.colortoast.ColorToast;
import com.lumbalumbadrt.colortoast.R;
import com.lumbalumbadrt.colortoast.databinding.ActivityToastInfoBinding;

@SuppressLint("NonConstantResourceId")
public class ToastInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToastInfoBinding binding = ActivityToastInfoBinding.
                inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRoundInfo.setOnClickListener(onClickListenerRound);
        binding.btnRoundColorInfo.setOnClickListener(onClickListenerRound);
        binding.btnRoundLineInfo.setOnClickListener(onClickListenerRound);

        binding.btnRoundTitleInfo.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundColorTitleInfo.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundLineTitleInfo.setOnClickListener(onClickListenerRoundTitle);

        binding.btnSquareInfo.setOnClickListener(onClickListenerSquare);
        binding.btnSquareColorInfo.setOnClickListener(onClickListenerSquare);
        binding.btnSquareLineInfo.setOnClickListener(onClickListenerSquare);

        binding.btnSquareTitleInfo.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareColorTitleInfo.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareLineTitleInfo.setOnClickListener(onClickListenerSquareTitle);

        binding.btnBlockInfo.setOnClickListener(onClickListenerBlock);
        binding.btnBlockColorInfo.setOnClickListener(onClickListenerBlock);
        binding.btnBlockLineInfo.setOnClickListener(onClickListenerBlock);

        binding.btnBlockTitleInfo.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockColorTitleInfo.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockLineTitleInfo.setOnClickListener(onClickListenerBlockTitle);
    }

    private final View.OnClickListener onClickListenerRound = view ->
    {
        switch (view.getId()) {
            case R.id.btn_round_info:
                ColorToast.roundInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Round Info"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_info:
                ColorToast.roundColorInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Round Color Info"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_info:
                ColorToast.roundLineInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Round Line Info"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerRoundTitle = view ->
    {
        switch (view.getId()) {
            case R.id.btn_round_title_info:
                ColorToast.roundInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_title_info:
                ColorToast.roundColorInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_title_info:
                ColorToast.roundLineInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquare = view ->
    {
        switch (view.getId()) {
            case R.id.btn_square_info:
                ColorToast.squareInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Square Info"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_info:
                ColorToast.squareColorInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Square Color Info"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_info:
                ColorToast.squareLineInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Square Line Info"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquareTitle = view -> {
        switch (view.getId()) {
            case R.id.btn_square_title_info:
                ColorToast.squareInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_title_info:
                ColorToast.squareColorInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_title_info:
                ColorToast.squareLineInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlock = view ->
    {
        switch (view.getId()) {
            case R.id.btn_block_info:
                ColorToast.blockInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Block Info"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_info:
                ColorToast.blockColorInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Block Color Info"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_info:
                ColorToast.blockLineInfo(this,
                        getResources().getString(R.string.hello_world,
                                "Block Line Info"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlockTitle = view -> {
        switch (view.getId()) {
            case R.id.btn_block_title_info:
                ColorToast.blockInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_title_info:
                ColorToast.blockColorInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_title_info:
                ColorToast.blockLineInfo(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };
}