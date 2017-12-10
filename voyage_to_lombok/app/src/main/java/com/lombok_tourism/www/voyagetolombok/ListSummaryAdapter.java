package com.lombok_tourism.www.voyagetolombok;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ListSummaryAdapter extends RecyclerView.Adapter<ListSummaryHolder>
{
    private List<DataListWisata> list = new ArrayList<>();

    public ListSummaryAdapter(List<DataListWisata> list)
    {
        this.list = list;
    }

    @Override
    public ListSummaryHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wisata_layout, parent, false);
        return new ListSummaryHolder(view);
    }

    @Override
    public void onBindViewHolder(ListSummaryHolder holder, int position)
    {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
}

