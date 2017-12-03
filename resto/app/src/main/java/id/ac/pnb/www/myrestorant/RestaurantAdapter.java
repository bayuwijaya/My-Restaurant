package id.ac.pnb.www.myrestorant;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    private List<MenuData> list;

    public RestaurantAdapter(List<MenuData> list) {
        this.list = list;
    }

    public void replaceAll(List<MenuData> item) {
        list = item;
        notifyDataSetChanged();
    }

    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_list, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(RestaurantAdapter.ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_menu_name;
        TextView tv_menu_price;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_menu_name = (TextView) itemView.findViewById(R.id.tv_menu_name);
            tv_menu_price = (TextView) itemView.findViewById(R.id.tv_menu_price);

        }

        public void bind(final MenuData item) {
            tv_menu_name.setText(item.getName());
            tv_menu_price.setText(item.getPrice());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), item.getName(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra("name", item.getName());
                    intent.putExtra("price", item.getPrice());
                    itemView.getContext().startActivity(intent);

                    //view.getContext().startActivity(Intent());
                }
            });
        }
    }
}
