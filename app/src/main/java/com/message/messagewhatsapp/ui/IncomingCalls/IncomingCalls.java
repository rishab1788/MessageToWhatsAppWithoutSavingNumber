package com.message.messagewhatsapp.ui.IncomingCalls;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.message.messagewhatsapp.R;
import com.message.messagewhatsapp.Call_Logs_Utils.Calls_log;

public class IncomingCalls extends Fragment {

    private IncomingCallsModel incomingCallsModel;
    private static Calls_log c = new Calls_log();
    private Spinner spinner;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        incomingCallsModel =
                ViewModelProviders.of(this).get(IncomingCallsModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        incomingCallsModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) { textView.setText(s); }
        });
        String callDetails = c.getCallDetails(getActivity(), "INCOMING");
     /*   spinner = root.findViewById(R.id.spinner_Incoming_call);
        String[] arraySpinner = callDetails.split(" ");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.s, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);*/
        return root;
    }
}