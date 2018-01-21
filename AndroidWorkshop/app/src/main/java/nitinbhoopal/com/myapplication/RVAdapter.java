package nitinbhoopal.com.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nitin on 21-01-2018.
 */

public class RVAdapter extends  RecyclerView.Adapter<RVAdapter.NumViewHolder>{
    Context context;
    List<Model> numList;

    public RVAdapter(Context context, List<Model> numList){
        this.context = context;
        this.numList = numList;
    }
    @Override

    public NumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        NumViewHolder viewHolder = new NumViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NumViewHolder holder, int position) {
    Model model = numList.get(position);
    holder.numTextView.setText(model.getNum()+"");
    }

    @Override
    public int getItemCount() {
        return numList.size();
    }

    class NumViewHolder extends RecyclerView.ViewHolder {
        TextView numTextView;
        public NumViewHolder(View itemView) {
            super(itemView);
            numTextView=(TextView)itemView.findViewById(R.id.item_text_view);
        }
    }
}
