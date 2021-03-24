package com.lumbalumbadrt.colortoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class ColorToast {

    private final static int TOAST_INFO    = 1;
    private final static int TOAST_WARNING = 2;
    private final static int TOAST_ERROR   = 3;
    private final static int TOAST_SUCCESS = 4;

    private final static int TOAST_MODEL_COLOR_BACKGROUND = 1;
    private final static int TOAST_MODEL_COLOR_FOREGROUND = 2;
    private final static int TOAST_MODEL_COLOR_LINE       = 3;

    private final static String EMPTY_STRING = "";

    @SuppressLint("ResourceAsColor")
    private static void createRoundToastDecoration(Activity activity, int toastType, int toastModel,
                                                   TextView textViewTitle, TextView textViewMessage,
                                                   TableRow tableRow, ImageView imageView,
                                                   CardView cardView, String overrideTitle) {
        int icon;
        int backColorToneOne, backColorToneTwo;
        int foreColorToneOne, foreColorToneTwo = 0;
        String title;

        switch (toastType) {
            case TOAST_INFO:
                icon = R.drawable.ic_round_info_24;
                backColorToneOne = R.color.color_toast_info;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_info);
                break;
            case TOAST_WARNING:
                icon = R.drawable.ic_round_warning_24;
                backColorToneOne = R.color.color_toast_warning;
                backColorToneTwo = R.color.color_toast_warning_text;
                foreColorToneOne = R.color.color_gray;
                foreColorToneTwo = R.color.color_toast_warning_text;
                title = activity.getResources().getString(R.string.title_warning);
                break;
            case TOAST_ERROR:
                icon = R.drawable.ic_round_error_24;
                backColorToneOne = R.color.color_toast_error;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_error);
                break;
            case TOAST_SUCCESS:
                icon = R.drawable.ic_round_check_circle_24;
                backColorToneOne = R.color.color_toast_success;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_success);
                break;
            default:
                icon = R.drawable.ic_round_brightness_24;
                backColorToneOne = R.color.color_toast_default;
                backColorToneTwo = R.color.color_toast_default;
                foreColorToneOne = R.color.color_lightGray;
                foreColorToneTwo = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_default);
                break;
        }

        imageView.setImageResource(icon);
        if (overrideTitle.equalsIgnoreCase(EMPTY_STRING))
            textViewTitle.setText(title);
        else textViewTitle.setText(overrideTitle);

        if (toastModel == TOAST_MODEL_COLOR_BACKGROUND) {
            cardView.setCardBackgroundColor(
                    activity.getResources().getColor(backColorToneOne, null));
            if (toastType == TOAST_WARNING) {
                textViewTitle.setTextColor(
                        activity.getResources().getColor(foreColorToneOne, null));
                textViewMessage.setTextColor(
                        activity.getResources().getColor(foreColorToneOne, null));

                imageView.setColorFilter(
                        activity.getResources().getColor(foreColorToneOne, null));
            }
        } else {
            int color;
            if (toastType == TOAST_WARNING)
                color = foreColorToneTwo;
            else color = backColorToneOne;

            textViewTitle.setTextColor(
                    activity.getResources().getColor(color, null));
            textViewMessage.setTextColor(
                    activity.getResources().getColor(color, null));

            if (tableRow != null)
                tableRow.setBackgroundColor(
                        activity.getResources().getColor(backColorToneOne, null));
            else imageView.setColorFilter(
                    activity.getResources().getColor(color, null));

            cardView.setCardBackgroundColor(
                    activity.getResources().getColor(R.color.color_lightGray, null));
        }
    }

    @SuppressLint("ResourceAsColor")
    private static void createSquareToastDecoration(Activity activity, int toastType, int toastModel,
                                                    TextView textViewTitle, TextView textViewMessage,
                                                    TableRow tableRowLine, ImageView imageView,
                                                    TableRow tableRowBody, String overrideTitle) {
        int icon;
        int backColorToneOne, backColorToneTwo;
        int foreColorToneOne, foreColorToneTwo = 0;
        String title;

        switch (toastType) {
            case TOAST_INFO:
                icon = R.drawable.ic_round_info_24;
                backColorToneOne = R.color.color_toast_info;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_info);
                break;
            case TOAST_WARNING:
                icon = R.drawable.ic_round_warning_24;
                backColorToneOne = R.color.color_toast_warning;
                backColorToneTwo = R.color.color_toast_warning_text;
                foreColorToneOne = R.color.color_gray;
                foreColorToneTwo = R.color.color_toast_warning_text;
                title = activity.getResources().getString(R.string.title_warning);
                break;
            case TOAST_ERROR:
                icon = R.drawable.ic_round_error_24;
                backColorToneOne = R.color.color_toast_error;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_error);
                break;
            case TOAST_SUCCESS:
                icon = R.drawable.ic_round_check_circle_24;
                backColorToneOne = R.color.color_toast_success;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_success);
                break;
            default:
                icon = R.drawable.ic_round_brightness_24;
                backColorToneOne = R.color.color_toast_default;
                backColorToneTwo = R.color.color_toast_default;
                foreColorToneOne = R.color.color_lightGray;
                foreColorToneTwo = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_default);
                break;
        }

        imageView.setImageResource(icon);
        if (overrideTitle.equalsIgnoreCase(EMPTY_STRING))
            textViewTitle.setText(title);
        else textViewTitle.setText(overrideTitle);

        if (toastModel == TOAST_MODEL_COLOR_BACKGROUND) {
            tableRowBody.setBackgroundColor(
                    activity.getResources().getColor(backColorToneOne, null));

            if (toastType == TOAST_WARNING) {
                textViewTitle.setTextColor(
                        activity.getResources().getColor(foreColorToneOne, null));
                textViewMessage.setTextColor(
                        activity.getResources().getColor(foreColorToneOne, null));

                imageView.setColorFilter(
                        activity.getResources().getColor(foreColorToneOne, null));
            }
        } else {
            int color;
            if (toastType == TOAST_WARNING)
                color = foreColorToneTwo;
            else color = backColorToneOne;

            textViewTitle.setTextColor(
                    activity.getResources().getColor(color, null));
            textViewMessage.setTextColor(
                    activity.getResources().getColor(color, null));

            if (tableRowLine != null)
                tableRowLine.setBackgroundColor(
                        activity.getResources().getColor(backColorToneOne, null));
            else imageView.setColorFilter(
                    activity.getResources().getColor(color, null));

            tableRowBody.setBackgroundColor(
                    activity.getResources().getColor(R.color.color_lightGray, null));
        }
    }

    @SuppressLint("ResourceAsColor")
    private static void createBlockToastDecoration(Activity activity, int toastType, int toastModel,
                                                   TextView textViewTitle, TextView textViewMessage,
                                                   TableRow tableRow, ImageView imageView,
                                                   LinearLayout linearLayout, String overrideTitle) {
        int icon;
        int backColorToneOne, backColorToneTwo;
        int foreColorToneOne, foreColorToneTwo = 0;
        String title;

        switch (toastType) {
            case TOAST_INFO:
                icon = R.drawable.ic_round_info_24;
                backColorToneOne = R.color.color_toast_info;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_info);
                break;
            case TOAST_WARNING:
                icon = R.drawable.ic_round_warning_24;
                backColorToneOne = R.color.color_toast_warning;
                backColorToneTwo = R.color.color_toast_warning_text;
                foreColorToneOne = R.color.color_gray;
                foreColorToneTwo = R.color.color_toast_warning_text;
                title = activity.getResources().getString(R.string.title_warning);
                break;
            case TOAST_ERROR:
                icon = R.drawable.ic_round_error_24;
                backColorToneOne = R.color.color_toast_error;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_error);
                break;
            case TOAST_SUCCESS:
                icon = R.drawable.ic_round_check_circle_24;
                backColorToneOne = R.color.color_toast_success;
                foreColorToneOne = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_success);
                break;
            default:
                icon = R.drawable.ic_round_brightness_24;
                backColorToneOne = R.color.color_toast_default;
                backColorToneTwo = R.color.color_toast_default;
                foreColorToneOne = R.color.color_lightGray;
                foreColorToneTwo = R.color.color_lightGray;
                title = activity.getResources().getString(R.string.title_default);
                break;
        }

        imageView.setImageResource(icon);
        if (overrideTitle.equalsIgnoreCase(EMPTY_STRING))
            textViewTitle.setText(title);
        else textViewTitle.setText(overrideTitle);

        if (toastModel == TOAST_MODEL_COLOR_BACKGROUND) {
            linearLayout.setBackgroundColor(activity.getResources().
                    getColor(backColorToneOne, null));

            if (toastType == TOAST_WARNING) {
                textViewTitle.setTextColor(
                        activity.getResources().getColor(foreColorToneOne, null));
                textViewMessage.setTextColor(
                        activity.getResources().getColor(foreColorToneOne, null));

                imageView.setColorFilter(
                        activity.getResources().getColor(foreColorToneOne, null));
            }
        } else {
            int color;
            if (toastType == TOAST_WARNING)
                color = foreColorToneTwo;
            else color = backColorToneOne;

            textViewTitle.setTextColor(
                    activity.getResources().getColor(color, null));
            textViewMessage.setTextColor(
                    activity.getResources().getColor(color, null));

            if (tableRow != null)
                tableRow.setBackgroundColor(
                        activity.getResources().getColor(backColorToneOne, null));
            else imageView.setColorFilter(
                    activity.getResources().getColor(color, null));

            linearLayout.setBackgroundColor(
                    activity.getResources().getColor(R.color.color_lightGray, null));
        }
    }

    private static View createRoundToast(Activity activity, int toastType,
                                         int toastModel, String title, String message) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_round_color_toast,
                (ViewGroup) activity.findViewById(R.id.cl_background_round_color_toast));

        TextView tVToastMessage = (TextView) view.findViewById(R.id.tv_message_round_color_toast);
        tVToastMessage.setText(message);

        CardView cvToastBody = (CardView) view.findViewById(R.id.cv_background_round_color_toast);
        TableRow trToastLine = (TableRow) view.findViewById(R.id.tr_line_round_color_toast);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.iv_icon_round_color_toast);
        TextView tvToastTitle = (TextView) view.findViewById(R.id.tv_title_round_color_toast);

        if (toastModel == TOAST_MODEL_COLOR_LINE)
            createRoundToastDecoration(activity, toastType,
                    toastModel, tvToastTitle, tVToastMessage,
                    trToastLine, ivToastIcon, cvToastBody, title);
        else createRoundToastDecoration(activity, toastType,
                toastModel, tvToastTitle, tVToastMessage,
                null, ivToastIcon, cvToastBody, title);

        return view;
    }

    private static View createSquareToast(Activity activity, int toastType, int toastModel,
                                          String title, String message) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_square_color_toast,
                (ViewGroup) activity.findViewById(R.id.cl_background_square_color_toast));

        TextView tVToastMessage = (TextView) view.findViewById(R.id.tv_message_square_color_toast);
        tVToastMessage.setText(message);

        TableRow trToastBody = (TableRow) view.findViewById(R.id.tr_background_square_color_toast);
        TableRow trToastLine = (TableRow) view.findViewById(R.id.tr_line_square_color_toast);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.iv_icon_square_color_toast);
        TextView tvToastTitle = (TextView) view.findViewById(R.id.tv_title_square_color_toast);

        if (toastModel == TOAST_MODEL_COLOR_LINE)
            createSquareToastDecoration(activity, toastType,
                    toastModel, tvToastTitle, tVToastMessage,
                    trToastLine, ivToastIcon, trToastBody, title);
        else createSquareToastDecoration(activity, toastType,
                toastModel, tvToastTitle, tVToastMessage,
                null, ivToastIcon, trToastBody, title);

        return view;
    }

    private static View createBlockToast(Activity activity, int toastType,
                                         int toastModel, String title,
                                         String message) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_block_color_toast,
                (ViewGroup) activity.findViewById(R.id.ll_background_block_color_toast));

        TextView tVToastMessage = (TextView) view.findViewById(R.id.tv_message_block_color_toast);
        tVToastMessage.setText(message);

        LinearLayout llToastBody = (LinearLayout) view.
                findViewById(R.id.ll_background_block_color_toast);
        TableRow trToastLine = (TableRow) view.findViewById(R.id.tr_line_block_color_toast);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.iv_icon_block_color_toast);
        TextView tvToastTitle = (TextView) view.findViewById(R.id.tv_title_block_color_toast);

        if (toastModel == TOAST_MODEL_COLOR_LINE)
            createBlockToastDecoration(activity, toastType,
                    toastModel, tvToastTitle, tVToastMessage,
                    trToastLine, ivToastIcon, llToastBody, title);
        else createBlockToastDecoration(activity, toastType,
                toastModel, tvToastTitle, tVToastMessage,
                null, ivToastIcon, llToastBody, title);

        return view;
    }

    /*
    TOAST INFO
     */
    //=====================================ROUND========================================//

    public static void roundInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void roundColorInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundColorInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void roundLineInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundLineInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================SQUARE=======================================//

    public static void squareInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void squareColorInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareColorInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void squareLineInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareLineInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================BLOCK=======================================//

    public static void blockInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void blockColorInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockColorInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void blockLineInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockLineInfo(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }
    /*
    TOAST INFO
     */

    /*
    TOAST WARNING
     */
    //=====================================ROUND========================================//

    public static void roundWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void roundColorWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundColorWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void roundLineWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundLineWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================SQUARE=======================================//

    public static void squareWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void squareColorWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareColorWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void squareLineWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareLineWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================BLOCK=======================================//

    public static void blockWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void blockColorWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockColorWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void blockLineWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockLineWarning(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }
    /*
    TOAST WARNING
     */

    /*
    TOAST ERROR
     */
    //=====================================ROUND========================================//

    public static void roundError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void roundColorError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundColorError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void roundLineError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundLineError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================SQUARE=======================================//

    public static void squareError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void squareColorError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareColorError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void squareLineError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareLineError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================BLOCK=======================================//

    public static void blockError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void blockColorError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockColorError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void blockLineError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockLineError(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }
    /*
    TOAST ERROR
     */

    /*
    TOAST SUCCESS
     */
    //=====================================ROUND========================================//

    public static void roundSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void roundColorSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundColorSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void roundLineSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void roundLineSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================SQUARE=======================================//

    public static void squareSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void squareColorSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareColorSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void squareLineSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void squareLineSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }

    //======================================BLOCK=======================================//

    public static void blockSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, title, message));
        toast.show();
    }

    public static void blockColorSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_BACKGROUND, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockColorSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_BACKGROUND, title, message));
        toast.show();
    }

    public static void blockLineSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_LINE, EMPTY_STRING, message));
        toast.show();
    }

    public static void blockLineSuccess(Activity activity, String title, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_LINE, title, message));
        toast.show();
    }
    /*
    TOAST SUCCESS
     */

    /*
    DEPRECATED
    TOAST INFO
     */
    //=====================================ROUND========================================//

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #roundInfo(Activity, String, int)}  instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showRoundToastInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #squareInfo(Activity, String, int)}   instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showSquareToastInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #blockInfo(Activity, String, int)}  instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showBlockToastInfo(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_INFO,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }
    /*
    TOAST INFO
    DEPRECATED
     */

    /*
    DEPRECATED
    TOAST WARNING
     */
    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #roundWarning(Activity, String, int)}   instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showRoundToastWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #squareWarning(Activity, String, int)}   instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showSquareToastWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #blockWarning(Activity, String, int)}   instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showBlockToastWarning(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_WARNING,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }
    /*
    TOAST WARNING
    DEPRECATED
     */

    /*
    DEPRECATED
    TOAST ERROR
     */
    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #roundError(Activity, String, int)}   instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showRoundToastError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #squareError(Activity, String, int)}   instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showSquareToastError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #blockError(Activity, String, int)}  instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showBlockToastError(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_ERROR,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }
    /*
    TOAST ERROR
    DEPRECATED
     */

    /*
    DEPRECATED
    TOAST SUCCESS
     */
    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #roundSuccess(Activity, String, int)}  instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showRoundToastSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createRoundToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #squareSuccess(Activity, String, int)}  instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showSquareToastSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setView(createSquareToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }

    /**
     * Calculate period between versions
     * @deprecated
     * This method is no longer use between versions. Will be removed in the next release.
     * <p> Use {@link #blockSuccess(Activity, String, int)}  instead.
     *
     * @param activity Your Activity Context
     * @param message The Message You will Display
     * @param length length duration of Toast, can use Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    @Deprecated
    public static void showBlockToastSuccess(Activity activity, String message, int length) {
        Toast toast = new Toast(activity);
        toast.setDuration(length);
        toast.setGravity(Gravity.TOP|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(createBlockToast(activity, TOAST_SUCCESS,
                TOAST_MODEL_COLOR_FOREGROUND, EMPTY_STRING, message));
        toast.show();
    }
    /*
    TOAST SUCCESS
    DEPRECATED
     */
}
