package com.example.chatup.Dialog;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.chatup.R;

public class DialogChangeProfile extends AppCompatDialogFragment {
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder abuilder= new AlertDialog.Builder(getActivity());
        abuilder.setTitle("Change Profile")
                .setMessage(R.string.faq_change_profile_desc)
                .setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                });
        return  abuilder.create();
    }
}

