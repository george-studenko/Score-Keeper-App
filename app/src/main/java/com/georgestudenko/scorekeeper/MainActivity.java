package com.georgestudenko.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button scoreGoalBarcelona;
    Button scoreGoalMadrid;
    Button addFoulBarcelona;
    Button addFoulMadrid;
    TextView foulsMadrid;
    TextView foulsBarcelona;
    TextView goalsMadrid;
    TextView goalsBarcelona;
    int totalFoulsBarcelona;
    int totalFoulsMadrid;
    int totalGoalsBarcelona ;
    int totalGoalsMadrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalFoulsBarcelona = 0;
        totalFoulsMadrid = 0;
        totalGoalsBarcelona = 0;
        totalGoalsMadrid = 0;
        scoreGoalBarcelona =(Button) findViewById(R.id.scoreGoalBarcelona);
        scoreGoalMadrid =(Button) findViewById(R.id.scoreGoalMadrid);
        addFoulBarcelona =(Button) findViewById(R.id.addFoulBarcelonaButton);
        addFoulMadrid =(Button) findViewById(R.id.addFoulMadridButton);
        foulsBarcelona = (TextView) findViewById(R.id.foulsBarcelona);
        foulsMadrid = (TextView) findViewById(R.id.foulsMadrid);
        goalsBarcelona = (TextView) findViewById(R.id.goalsBarcelona);
        goalsMadrid = (TextView) findViewById(R.id.goalsMadrid);
    }

    public void reset(View view) {
        totalFoulsBarcelona=0;
        totalFoulsMadrid=0;
        totalGoalsBarcelona=0;
        totalGoalsMadrid=0;
        foulsBarcelona.setText(String.valueOf(totalFoulsBarcelona));
        foulsMadrid.setText(String.valueOf(totalFoulsMadrid));
        goalsBarcelona.setText(String.valueOf(totalGoalsBarcelona));
        goalsMadrid.setText(String.valueOf(totalGoalsMadrid));
        Toast.makeText(this,"Reset performed, new game on!",Toast.LENGTH_LONG).show();
    }

    public void addFoul(View view) {
     int viewId = view.getId();
        if(viewId == addFoulBarcelona.getId()){
            totalFoulsBarcelona++;
            foulsBarcelona.setText(String.valueOf(totalFoulsBarcelona));
        }else{
            totalFoulsMadrid++;
            foulsMadrid.setText(String.valueOf(totalFoulsMadrid));
        }
    }

    public void scoreGoal(View view) {
        int viewId = view.getId();
        if(viewId == scoreGoalBarcelona.getId()){
            totalGoalsBarcelona++;
            goalsBarcelona.setText(String.valueOf(totalGoalsBarcelona));
        }else{
            totalGoalsMadrid++;
            goalsMadrid.setText(String.valueOf(totalGoalsMadrid));
        }
    }
}

