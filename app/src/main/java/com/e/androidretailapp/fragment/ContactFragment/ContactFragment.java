package com.e.androidretailapp.fragment.ContactFragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.e.androidretailapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {
    private ContactViewModel contactViewModel;

    private EditText etPhoneNo;
    private Button btnDial;
    private EditText etText;
    private Button btnAppend;
    private TextView tvText;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_contact, container, false);

        etPhoneNo = root.findViewById(R.id.etPhoneNo);
        btnDial = root.findViewById(R.id.btnDial);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dial();
            }
        });

        etText = root.findViewById(R.id.etText);
        btnAppend = root.findViewById(R.id.btnAppend);
        tvText = root.findViewById(R.id.tvText);

        btnAppend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText();
            }
        });

    return  root;
    }

    private void Dial() {
        Uri u = Uri.parse("tel:" + etPhoneNo.getText().toString());
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0123456789"));
        startActivity(intent);
    }

    private void appendText() {
        // "\n" is used for new line
        tvText.append(etText.getText().toString() + "\n");
    }

}
