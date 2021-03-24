package com.lumbalumbadrt.colortoast.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lumbalumbadrt.colortoast.ColorToast;
import com.lumbalumbadrt.colortoast.R;
import com.lumbalumbadrt.colortoast.databinding.ActivityToastWarningBinding;

@SuppressLint("NonConstantResourceId")
public class ToastWarningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToastWarningBinding binding = ActivityToastWarningBinding.
                inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRoundWarning.setOnClickListener(onClickListenerRound);
        binding.btnRoundColorWarning.setOnClickListener(onClickListenerRound);
        binding.btnRoundLineWarning.setOnClickListener(onClickListenerRound);

        binding.btnRoundTitleWarning.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundColorTitleWarning.setOnClickListener(onClickListenerRoundTitle);
        binding.btnRoundLineTitleWarning.setOnClickListener(onClickListenerRoundTitle);

        binding.btnSquareWarning.setOnClickListener(onClickListenerSquare);
        binding.btnSquareColorWarning.setOnClickListener(onClickListenerSquare);
        binding.btnSquareLineWarning.setOnClickListener(onClickListenerSquare);

        binding.btnSquareTitleWarning.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareColorTitleWarning.setOnClickListener(onClickListenerSquareTitle);
        binding.btnSquareLineTitleWarning.setOnClickListener(onClickListenerSquareTitle);

        binding.btnBlockWarning.setOnClickListener(onClickListenerBlock);
        binding.btnBlockColorWarning.setOnClickListener(onClickListenerBlock);
        binding.btnBlockLineWarning.setOnClickListener(onClickListenerBlock);

        binding.btnBlockTitleWarning.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockColorTitleWarning.setOnClickListener(onClickListenerBlockTitle);
        binding.btnBlockLineTitleWarning.setOnClickListener(onClickListenerBlockTitle);
    }

    private final View.OnClickListener onClickListenerRound = view ->
    {
        switch (view.getId()) {
            case R.id.btn_round_warning:
                ColorToast.roundWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Round Warning"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_warning:
                ColorToast.roundColorWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Round Color Warning"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_warning:
                ColorToast.roundLineWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Round Line Warning"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerRoundTitle = view -> {
        switch (view.getId()) {
            case R.id.btn_round_title_warning:
                ColorToast.roundWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_color_title_warning:
                ColorToast.roundColorWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_round_line_title_warning:
                ColorToast.roundLineWarning(this,
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
            case R.id.btn_square_warning:
                ColorToast.squareWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Square Warning"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_warning:
                ColorToast.squareColorWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Square Color Warning"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_warning:
                ColorToast.squareLineWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Square Line Warning"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerSquareTitle = view ->
    {
        switch (view.getId()) {
            case R.id.btn_square_title_warning:
                ColorToast.squareWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_color_title_warning:
                ColorToast.squareColorWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_square_line_title_warning:
                ColorToast.squareLineWarning(this,
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
            case R.id.btn_block_warning:
                ColorToast.blockWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Block Warning"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_warning:
                ColorToast.blockColorWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Block Color Warning"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_warning:
                ColorToast.blockLineWarning(this,
                        getResources().getString(R.string.hello_world,
                                "Block Line Warning"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };

    private final View.OnClickListener onClickListenerBlockTitle = view ->
    {
        switch (view.getId()) {
            case R.id.btn_block_title_warning:
                ColorToast.blockWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_color_title_warning:
                ColorToast.blockColorWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
            case R.id.btn_block_line_title_warning:
                ColorToast.blockLineWarning(this,
                        getResources().getString(R.string.hello_world_message,
                                "Title"),
                        getResources().getString(R.string.hello_world_message,
                                "Message"),
                        Toast.LENGTH_SHORT);
                break;
        }
    };
}