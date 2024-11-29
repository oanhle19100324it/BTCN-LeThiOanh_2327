package com.example.btcn_lethioanh_2327;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        TextView greetingText = findViewById(R.id.tv_greeting);
        TextView tasksTodayText = findViewById(R.id.tv_tasks_today);

        TextView taskTitle1 = findViewById(R.id.task1);
        //TextView taskProgress1 = findViewById(R.id.percent_task1);
        ProgressBar progressBar1 = findViewById(R.id.line_task1);

        TextView taskTitle2 = findViewById(R.id.task2);
        //TextView taskProgress2 = findViewById(R.id.percent_task2);
        ProgressBar progressBar2 = findViewById(R.id.line_task2);


        greetingText.setText("Hello, Alex!");
        tasksTodayText.setText("You’ve got 5 tasks today 📅");

        taskTitle1.setText("Đang tải tiến độ hoàn thành");
        //taskProgress1.setText("40%");
        progressBar1.setProgress(40);

        taskTitle2.setText("Đang tải tiến độ hoàn thành");
        //taskProgress2.setText("22%");
        progressBar2.setProgress(22);
    }

}
