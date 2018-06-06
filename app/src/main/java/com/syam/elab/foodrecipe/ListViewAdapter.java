package com.syam.elab.foodrecipe;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class ListViewAdapter extends BaseAdapter {

    private final List<ListViewAdapter.Item> mItems = new ArrayList<ListViewAdapter.Item>();
    private final LayoutInflater mInflater;


    public ListViewAdapter(Context context){
        mInflater = LayoutInflater.from(context);


        mItems.add(new ListViewAdapter.Item("BBQ Beef Brisket Sandwiches", R.mipmap.bbq_beef_brisket_sandwiches ) );
        mItems.add(new ListViewAdapter.Item("Black Bean Burritos", R.mipmap.black_bean_burritos ) );
        mItems.add(new ListViewAdapter.Item("Cauliflower Crusted Quiche with Smoked Sausage", R.mipmap.cauliflower_crusted_quiche_with_smoked_sausage ) );
        mItems.add(new ListViewAdapter.Item("Quick Beef Stir Fry", R.mipmap.quick_beef_stir_fry ) );
        mItems.add(new ListViewAdapter.Item("Spicy Tarragon Yogurt Chicken", R.mipmap.spicy_tarragon_yogurt_chicken ) );
        mItems.add(new ListViewAdapter.Item("Thailand Coconut Soup", R.mipmap.thai_coconut_soup ) );
        mItems.add(new ListViewAdapter.Item("Easy Bulgogi", R.mipmap.bulgogi ) );
        mItems.add(new ListViewAdapter.Item("Boars Head Bold Ichiban Teriyaki", R.mipmap.boars_head_bold_ichiban_teriyaki ) );



        mItems.add(new Item("BBQ Beef Brisket Sandwiches", R.mipmap.bbq_beef_brisket_sandwiches ) );
        mItems.add(new Item("Black Bean Burritos", R.mipmap.black_bean_burritos ) );
        mItems.add(new Item("Cauliflower Crusted Quiche with Smoked Sausage", R.mipmap.cauliflower_crusted_quiche_with_smoked_sausage ) );
        mItems.add(new Item("Quick Beef Stir Fry", R.mipmap.quick_beef_stir_fry ) );
        mItems.add(new Item("Spicy Tarragon Yogurt Chicken", R.mipmap.spicy_tarragon_yogurt_chicken ) );
        mItems.add(new Item("Thailand Coconut Soup", R.mipmap.thai_coconut_soup ) );
        mItems.add(new Item("Easy Bulgogi", R.mipmap.bulgogi ) );
        mItems.add(new Item("Boars Head Bold Ichiban Teriyaki", R.mipmap.boars_head_bold_ichiban_teriyaki ) );





    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public ListViewAdapter.Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return mItems.get(i).drawableId;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;
        if (v==null){

            v= mInflater.inflate(R.layout.list_itemz, viewGroup, false);
            v.setTag(R.id.picture_list, v.findViewById(R.id.picture_list));
            v.setTag(R.id.text_list,v.findViewById(R.id.text_list));
        }

        picture = (ImageView)v.getTag(R.id.picture_list);
        name = (TextView)v.getTag(R.id.text_list);
        ListViewAdapter.Item item = getItem(i);
        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;

    }

    private static class Item {
        public final String name;
        public final  int  drawableId;
        Item(String name, int drawableId){
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}

