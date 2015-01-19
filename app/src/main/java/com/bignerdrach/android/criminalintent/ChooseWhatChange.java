package com.bignerdrach.android.criminalintent;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;


public class ChooseWhatChange extends DialogFragment{
    public static final String EXTRA_CHOOSE = "com.bignerdrach.android.criminalintent.choose";

    private void sendResult(int resultCode,int choose){
        if(getTargetFragment() == null)
            return;
        Intent i = new Intent();
        i.putExtra(EXTRA_CHOOSE,choose);

        getTargetFragment().onActivityResult(getTargetRequestCode(),resultCode,i);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.change_time_picker_title)
                .setItems(R.array.whatChange, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        sendResult(Activity.RESULT_OK,which);
                    }
                })
                .create();
    }
}
