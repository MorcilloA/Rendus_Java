package com.example.tasklist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    ArrayList<Task> myTasks;

    TaskAdapter(ArrayList<Task> myTasks){
        this.myTasks = myTasks;
    }

    @NonNull
    @Override
    public TaskAdapter.TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.task_list_item, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.TaskViewHolder holder, final int position) {
        holder.display(myTasks.get(position));
        holder.delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTasks.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, myTasks.size());
            }
        });
    }

    @Override
    public int getItemCount() {
        return myTasks.size();
    }



    public class TaskViewHolder extends RecyclerView.ViewHolder {

        private TextView mName, mDescription;
        private Button delButton;


        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);

            mName = itemView.findViewById(R.id.taskName);
            mDescription = itemView.findViewById(R.id.taskDescription);
            delButton = itemView.findViewById(R.id.delButton);
        }

        void display(Task task){
            mName.setText(task.getTaskName());
            mDescription.setText("Description: "+task.getTaskDescription());
        }
    }





}
