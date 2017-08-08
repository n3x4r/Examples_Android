package com.example.carlosergio.criminalntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by CarloSergio on 04/08/2017.
 */

public class CrimeFragment extends Fragment{
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    // The methods of fragments must be protected because this methods needed to be accessed from the activities



    // no se despliega al vista del fragmente si no que se carga las onfiguraciones
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    // Se despeliega la vista del fragmente en el layour determinado en el R.layout.layout_name
    // ==== parameters ===
    // viewGroup container = es el padre de nuestra vista
    // false = Si es necesario añadir la vista desplegada a la vista del padre en este caso es false porque vamos añadir la vista
    // en el codigo de la activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        View v = inflater.inflate(R.layout.fragment_crime, container, false);


        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
                                               @Override
                                               public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                               }

                                               @Override
                                               public void onTextChanged(CharSequence s, int start, int before, int count) {
                                                    mCrime.setTitle(s.toString());
                                               }

                                               @Override
                                               public void afterTextChanged(Editable s) {

                                               }
                                           }

        );

        mDateButton = (Button)v.findViewById(R.id.crime_date);
        //mDateButton.setText(mCrime.getDate().toString());
        mDateButton.setText(mCrime.getDate2());
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });

        return v;


    }


}
