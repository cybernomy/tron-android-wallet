package com.devband.tronwalletforandroid.ui.detail_block.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.devband.tronwalletforandroid.ui.detail_block.model.BaseModel;

/**
 * Created by user on 2018. 5. 29..
 */

public abstract class BaseViewHolder<T extends BaseModel> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T model);
}
