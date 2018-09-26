package be.degroofpetercam.degroofpc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import be.degroofpetercam.degroofpc.R;
import be.degroofpetercam.degroofpc.models.MissionDescritpion;

public class missionNameAdapter extends BaseAdapter {

    //fields
    private Context context;
    private List<MissionDescritpion> missionDescritpionList;
    private LayoutInflater inflater;

    //constructor
    public missionNameAdapter(Context context, List<MissionDescritpion> missionDescritpionList)
    {
        this.context = context;
        this.missionDescritpionList = missionDescritpionList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return missionDescritpionList.size();
    }

    @Override
    public MissionDescritpion getItem(int position) {
        return missionDescritpionList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.adapter_mission, parent, false);

        return convertView;
    }
}
