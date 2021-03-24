package com.lumbalumbadrt.colortoast.app.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lumbalumbadrt.colortoast.ColorToast;
import com.lumbalumbadrt.colortoast.app.databinding.ActivityToastErrorBinding;
import com.lumbalumbadrt.colortoast.app.R;

@SuppressLint("NonConstantResourceId")
public class ToastErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToastErrorBinding binding = ActivityToastErrorBinding.
                inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRoundError.setOnClickListener(onClickListenerRound);
        binding.btnRoundColorError.setOnClickListener(onClickListenerRound);
        binding.btnRoundLineError.setOnClickListener(onClickListenerRound);

        binding.btnRoundTitleError.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundColorTitleError.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundLineTitleError.setOnClickListener(onClickListenerRoundTitle);

        binding.btnSquareError.setOnClickListener(onClickListenerSquare);
        binding.btnSquareColorError.setOnClickListener(onClickListenerSquare);
        binding.btnSquareLineError.setOnClickListener(onClickListenerSquare);

        binding.btnSquareTitleError.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareColorTitleError.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareLineTitleError.setOnClickListener(onClickListenerSquareTitle);

        binding.btnBlockError.setOnClickListener(onClickListenerBlock);
        binding.btnBlockColorError.setOnClickListener(onClickListenerBlock);
        binding.btnBlockLineError.setOnClickListener(onClickListenerBlock);

        binding.btnBlockTitleError.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockColorTitleError.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockLineTitleError.setOnClickListener(onClickListenerBlockTitle);
    }

    private final View.OnClickListener onClickListenerRound = view ->
    {
        switch (view.getId()) {
            case R.id.btn_round_error:
                ColorToast.roundError(this,
                        getResources().getString(R.string.hello_world,
                                "Round Error"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_error:
                ColorToast.roundColorError(this,
                        getResources().getString(R.string.hello_world,
                                "Round Color Error"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_error:
                ColorToast.roundLineError(this,
                        getResources().getString(R.string.hello_world,
                                "Round Line Error"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerRoundTitle = view ->
    {
        switch (view.getId()) {
            case R.id.btn_round_title_error:
                ColorToast.roundError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_title_error:
                ColorToast.roundColorError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_title_error:
                ColorToast.roundLineError(this,
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
            case R.id.btn_square_error:
                ColorToast.squareError(this,
                        getResources().getString(R.string.hello_world,
                                "Square Error"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_error:
                ColorToast.squareColorError(this,
                        getResources().getString(R.string.hello_world,
                                "Square Color Error"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_error:
                ColorToast.squareLineError(this,
                        getResources().getString(R.string.hello_world,
                                "Square Line Error"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquareTitle = view ->
    {
        switch (view.getId()) {
            case R.id.btn_square_title_error:
                ColorToast.squareError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_title_error:
                ColorToast.squareColorError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_title_error:
                ColorToast.squareLineError(this,
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
            case R.id.btn_block_error:
                ColorToast.blockError(this,
                        getResources().getString(R.string.hello_world,
                                "Block Error"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_error:
                ColorToast.blockColorError(this,
                        getResources().getString(R.string.hello_world,
                                "Block Color Error"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_error:
                ColorToast.blockLineError(this,
                        getResources().getString(R.string.hello_world,
                                "Block Line Error"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlockTitle = view ->
    {
        switch (view.getId()) {
            case R.id.btn_block_title_error:
                ColorToast.blockError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_title_error:
                ColorToast.blockColorError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_title_error:
                ColorToast.blockLineError(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };
}