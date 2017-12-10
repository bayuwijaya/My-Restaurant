package com.lombok_tourism.www.voyagetolombok;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListSummaryHolder extends RecyclerView.ViewHolder {
    private ImageView item_image_wisata;
    private TextView item_title;
    private TextView item_subtitle;

    public ListSummaryHolder(View itemView) {
        super(itemView);

        item_image_wisata = (ImageView) itemView.findViewById(R.id.item_image_wisata);
        item_title        = (TextView) itemView.findViewById(R.id.item_title);
        item_subtitle     = (TextView) itemView.findViewById(R.id.item_subtitle);
    }

    public void bind(final DataListWisata dataWisata) {
        int imageID = dataWisata.getItem_image();
        item_image_wisata.setTag(imageID);
        item_image_wisata.setImageResource(dataWisata.getItem_image());
        item_title.setText(dataWisata.getItem_title());
        item_subtitle.setText(dataWisata.getItem_subtitle());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DetailListActivity.class);
                intent.putExtra("put_item_photo",(int) dataWisata.getItem_image());
                intent.putExtra("put_item_title", dataWisata.getItem_title());
                intent.putExtra("put_item_subtitle", dataWisata.getItem_subtitle());
                intent.putExtra("put_item_deskripsi", dataWisata.getItem_deskripsi());
                intent.putExtra("put_item_jarak_tempuh", dataWisata.getItem_jarak_tempuh());
                intent.putExtra("put_item_wktu_prjlnan", dataWisata.getItem_wktu_prjlnan());
                intent.putExtra("put_item_tlpn", dataWisata.getItem_tlpn());
                intent.putExtra("put_item_web", dataWisata.getItem_web());
                view.getContext().startActivity(intent);
            }
        });
    }
}

