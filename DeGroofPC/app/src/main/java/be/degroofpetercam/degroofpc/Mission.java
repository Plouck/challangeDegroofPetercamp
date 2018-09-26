package be.degroofpetercam.degroofpc;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import be.degroofpetercam.degroofpc.adapter.missionNameAdapter;
import be.degroofpetercam.degroofpc.models.MissionDescritpion;

public class Mission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);

        //list missions
        List<MissionDescritpion> missionDescritpionList = new ArrayList<>();
        missionDescritpionList.add(new MissionDescritpion( "Mission RH "));
        missionDescritpionList.add(new MissionDescritpion( "Mission Coach "));
        missionDescritpionList.add(new MissionDescritpion( "Mission IT "));
        missionDescritpionList.add(new MissionDescritpion( "Mission App "));

        //get listview
        @SuppressLint("WrongViewCast") ListView missionName = findViewById(R.id.mission_name);
        missionName.setAdapter(new missionNameAdapter(this, missionDescritpionList));

    }
}
