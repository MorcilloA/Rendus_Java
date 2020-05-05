package com.example.tasklist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabAddFragment extends Fragment {

    public static TabListFragment tabListFragment = new TabListFragment();
    private EditText taskNameInput, taskDescriptionInput, taskDurationAmountInput, taskDurationUnitInput;
    private DatePicker taskDateInput;
    private Button buttonInput;

    public TabAddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_add, container, false);



        taskNameInput = view.findViewById(R.id.taskNameInput);
        taskDescriptionInput = view.findViewById(R.id.taskDescriptionInput);
        taskDurationAmountInput = view.findViewById(R.id.taskDurationAmountInput);
        taskDurationUnitInput = view.findViewById(R.id.taskDurationUnitInput);
        taskDateInput = view.findViewById(R.id.taskDateInput);
        buttonInput = view.findViewById(R.id.buttonInput);

        buttonInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameValue = taskNameInput.getText().toString();
                String descriptionValue = taskDescriptionInput.getText().toString();
                String durationAmountValue = taskDurationAmountInput.getText().toString();
                String durationUnitValue = taskDurationUnitInput.getText().toString();

                int day = taskDateInput.getDayOfMonth();
                int month = taskDateInput.getMonth();
                int year = taskDateInput.getYear();

                Calendar calendar = Calendar.getInstance();
                calendar.set( year, month, day );
                Date dateValue = calendar.getTime();


                //Vérif champs
                Task newTask = new Task("newName", "newDesc");

                if (TextUtils.isEmpty(nameValue) && TextUtils.isEmpty(descriptionValue)){
                    Toast.makeText(getActivity(), "Vous devez remplir les champs avant de valider", Toast.LENGTH_SHORT).show();
                }else if (TextUtils.isEmpty(nameValue)){
                    Toast.makeText(getActivity(), "Vous devez donner un nom à votre tâche", Toast.LENGTH_SHORT).show();
                }else if (TextUtils.isEmpty(descriptionValue)){
                    Toast.makeText(getActivity(), "Vous devez donner une description à votre tâche", Toast.LENGTH_SHORT).show();
                }else{

                    newTask.setTaskName(nameValue);
                    newTask.setTaskDescription(descriptionValue);

                    if (!TextUtils.isEmpty(durationAmountValue) && !TextUtils.isEmpty(durationUnitValue) && dateValue != null){

                        //La date ou la durée est définie
                        //if (TextUtils.isEmpty(durationAmountValue) || TextUtils.isEmpty(durationUnitValue) || dateValue == null){
                            /*Toast.makeText(getActivity(), "Si vous fournissez un des 3 éléments optionnels vous devez tous les fournir.", Toast.LENGTH_SHORT).show();
                            return;
                        }else{*/

                            if (!TextUtils.isDigitsOnly(durationAmountValue)){
                                Toast.makeText(getActivity(), "La durée doit être un chiffre ou un nombre.", Toast.LENGTH_SHORT).show();
                                return;
                            }else if(!TextUtils.equals(durationUnitValue, "heures") && !TextUtils.equals(durationUnitValue, "jours")){
                                Toast.makeText(getActivity(), "L'unité de la durée doit être 'heures' ou 'jours'.", Toast.LENGTH_SHORT).show();
                                return;
                            }else{
                                String finalDurationValue = durationAmountValue+"/"+durationUnitValue;
                                newTask.setTaskDuration(finalDurationValue);
                                newTask.setTaskDate(dateValue);
                            }

                        //}

                    }

                    tabListFragment.taskList.add(newTask);
/*
                    for (int i=0; i<=tabListFragment.taskList.size()-1; i++){
                        Log.w("content"+i, tabListFragment.taskList.get(i).toString());
                    }*/

                    Toast.makeText(getActivity(), "L'ajout a réussi", Toast.LENGTH_SHORT).show();

                    taskNameInput.getText().clear();
                    taskDescriptionInput.getText().clear();
                    taskDurationUnitInput.getText().clear();
                    taskDurationAmountInput.getText().clear();
                    calendar.setTime(new Date());
                    taskDateInput.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), null);

                }
            }
        });


        return view;
    }
}
