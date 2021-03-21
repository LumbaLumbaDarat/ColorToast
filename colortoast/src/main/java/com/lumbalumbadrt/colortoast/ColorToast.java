package com.lumbalumbadrt.colortoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ColorToast {

    private final static int TOAST_INFO    = 1;
    private final static int TOAST_WARNING = 2;
    private final static int TOAST_ERROR   = 3;
    private final static int TOAST_SUCCESS = 4;

    private final static String EMPTY_STRING = "";

    @SuppressLint("ResourceAsColor")
    private static void createRoundToastDecoration(Activity activity, int toastType,
                                              TextView textView, ImageView imageView,
                                              CardView cardView) {
        int icon;
        int color;
        String title;

        switch (toastType) {
            case TOAST_INFO:
                icon = R.drawable.ic_round_info_24;
                color = R.color.color_toast_info;
                title = activity.getResources().getString(R.string.title_info);
                break;
            case TOAST_WARNING:
                icon = R.drawable.ic_round_warning_24;
                color = R.color.color_toast_warning;
                title = activity.getResources().getString(R.string.title_warning);
                break;
            case TOAST_ERROR:
                icon = R.drawable.ic_round_error_24;
                color = R.color.color_toast_error;
                title = activity.getResources().getString(R.string.title_error);
                break;
            case TOAST_SUCCESS:
                icon = R.drawable.ic_round_check_circle_24;
                color = R.color.color_toast_success;
                title = activity.getResources().getString(R.string.title_success);
                break;
            default:
                icon = R.drawable.ic_round_brightness_24;
                color = R.color.color_toast_default;
                title = activity.getResources().getString(R.string.title_default);
                break;
        }

        if (textView != null)
            textView.setText(title);

        imageView.setImageResource(icon);
        cardView.setCardBackgroundColor(activity.getResources().getColor(color, null));
    }

    @SuppressLint("ResourceAsColor")
    private static void createSquareToastDecoration(Activity activity, int toastType,
                                                   TextView textView, ImageView imageView,
                                                   TableRow tableRow) {
        int icon;
        int color;
        String title;

        switch (toastType) {
            case TOAST_INFO:
                icon = R.drawable.ic_round_info_24;
                color = R.color.color_toast_info;
                title = activity.getResources().getString(R.string.title_info);
                break;
            case TOAST_WARNING:
                icon = R.drawable.ic_round_warning_24;
                color = R.color.color_toast_warning;
                title = activity.getResources().getString(R.string.title_warning);
                break;
            case TOAST_ERROR:
                icon = R.drawable.ic_round_error_24;
                color = R.color.color_toast_error;
                title = activity.getResources().getString(R.string.title_error);
                break;
            case TOAST_SUCCESS:
                icon = R.drawable.ic_round_check_circle_24;
                color = R.color.color_toast_success;
                title = activity.getResources().getString(R.string.title_success);
                break;
            default:
                icon = R.drawable.ic_round_brightness_24;
                color = R.color.color_toast_default;
                title = activity.getResources().getString(R.string.title_default);
                break;
        }

        textView.setText(title);
        imageView.setImageResource(icon);
        tableRow.setBackgroundColor(activity.getResources().getColor(color, null));
    }

    @SuppressLint("ResourceAsColor")
    private static void createBlockToastDecoration(Activity activity, int toastType,
                                                    TextView textView, ImageView imageView,
                                                    ConstraintLayout constraintLayout) {
        int icon;
        int color;
        String title;

        switch (toastType) {
            case TOAST_INFO:
                icon = R.drawable.ic_round_info_24;
                color = R.color.color_toast_info;
                title = activity.getResources().getString(R.string.title_info);
                break;
            case TOAST_WARNING:
                icon = R.drawable.ic_round_warning_24;
                color = R.color.color_toast_warning;
                title = activity.getResources().getString(R.string.title_warning);
                break;
            case TOAST_ERROR:
                icon = R.drawable.ic_round_error_24;
                color = R.color.color_toast_error;
                title = activity.getResources().getString(R.string.title_error);
                break;
            case TOAST_SUCCESS:
                icon = R.drawable.ic_round_check_circle_24;
                color = R.color.color_toast_success;
                title = activity.getResources().getString(R.string.title_success);
                break;
            default:
                icon = R.drawable.ic_round_brightness_24;
                color = R.color.color_toast_default;
                title = activity.getResources().getString(R.string.title_default);
                break;
        }

        textView.setText(title);
        imageView.setImageResource(icon);
        constraintLayout.setBackgroundColor(activity.getResources().getColor(color, null));
    }

    private static View createRoundToast(Activity activity, int toastType,
                                         String title, String message) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_round_color_toast,
                (ViewGroup) activity.findViewById(R.id.cl_background_round_color_toast));

        TextView tVToastMessage = (TextView) view.findViewById(R.id.tv_message_round_color_toast);
        tVToastMessage.setText(message);

        CardView cvToastBody = (CardView) view.findViewById(R.id.cv_background_round_color_toast);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.iv_icon_round_color_toast);
        TextView tvToastTitle = (TextView) view.findViewById(R.id.tv_title_round_color_toast);

        if (title == null ||
                TextUtils.isEmpty(title))
            createRoundToastDecoration(activity, toastType,
                    tvToastTitle, ivToastIcon, cvToastBody);
        else {
            tvToastTitle.setText(title);
            createRoundToastDecoration(activity, toastType,
                    null, ivToastIcon, cvToastBody);
        }

        return view;
    }

    private static View createSquareToast(Activity activity,
                                    int toastType, String message) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_square_color_toast,
                (ViewGroup) activity.findViewById(R.id.cl_background_square_color_toast));

        TextView tVToastMessage = (TextView) view.findViewById(R.id.tv_message_square_color_toast);
        tVToastMessage.setText(message);

        TableRow trToastBody = (TableRow) view.findViewById(R.id.tr_background_square_color_toast);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.iv_icon_square_color_toast);
        TextView tvToastTitle = (TextView) view.findViewById(R.id.tv_title_square_color_toast);

        createSquareToastDecoration(activity, toastType, tvToastTitle, ivToastIcon, trToastBody);

        return view;
    }

    private static View createBlockToast(Activity activity,
                                          int toastType, String message) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_block_color_toast,
                (ViewGroup) activity.findViewById(R.id.cl_background_block_color_toast));

        TextView tVToastMessage = (TextView) view.findViewById(R.id.tv_message_block_color_toast);
        tVToastMessage.setText(message);

        ConstraintLayout clToastBody = (ConstraintLayout) view.
                findViewById(R.id.cl_background_block_color_toast);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.iv_icon_block_color_toast);
        TextView tvToastTitle = (TextView) view.findViewById(R.id.tv_title_block_color_toast);

        createBlockToastDecoration(activity, toastType, tvToastTitle, ivToastIcon, clToastBody);

        return view;
    }

    /*
    TOAST INFO
     */
    public static void showRoundToastInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO, EMPTY_STRING, message));
        toast.show();
    }

    public static void showSquareToastInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO, message));
        toast.show();
    }

    public static void showBlockToastInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO, message));
        toast.show();
    }
    /*
    TOAST INFO
     */

    /*
    TOAST WARNING
     */
    public static void showRoundToastWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING, EMPTY_STRING, message));
        toast.show();
    }

    public static void showSquareToastWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING, message));
        toast.show();
    }

    public static void showBlockToastWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING, message));
        toast.show();
    }
    /*
    TOAST WARNING
     */

    /*
    TOAST ERROR
     */
    public static void showRoundToastError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR, EMPTY_STRING, message));
        toast.show();
    }

    public static void showSquareToastError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR, message));
        toast.show();
    }

    public static void showBlockToastError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR, message));
        toast.show();
    }
    /*
    TOAST ERROR
     */

    /*
    TOAST SUCCESS
     */
    public static void showRoundToastSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS, EMPTY_STRING, message));
        toast.show();
    }

    public static void showSquareToastSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS, message));
        toast.show();
    }

    public static void showBlockToastSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS, message));
        toast.show();
    }
    /*
    TOAST SUCCESS
     */
}
