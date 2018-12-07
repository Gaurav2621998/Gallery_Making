package com.calc.gourav.gallery_making;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Gallery_Adapter extends RecyclerView.Adapter<Gallery_Adapter.ViewHolder> {
    List<call> imagelist;
    Context context;

    public Gallery_Adapter(Context context, List<call> list) {
        this.context = context;
        this.imagelist = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.imagename.setText(imagelist.get(position).getImagename());
        holder.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        holder.image.setImageResource(imagelist.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.imagename)
        TextView imagename;


        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }

}
