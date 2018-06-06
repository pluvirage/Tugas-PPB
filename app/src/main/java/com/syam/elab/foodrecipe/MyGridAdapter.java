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


public final class MyGridAdapter extends BaseAdapter {

    private final List<Item>mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public String[] mRecipeTitle = {
            "BBQ Beef Brisket Sandwiches",
            "Black Bean Burritos",
            "Cauliflower Crusted Quiche With Smoked Sausage",
            "Quick Beef Stir Fry",
            "Spicy Tarragon Yogurt Chicken",
            "Thai Coconut Soup",
            "bulgogi",
            "Boars Head Bold Ichiban Teriyaki",


    };

    public  String[] mDescriptionTXT = {

            "Most Bulgogi recipes call for crushed pear. This is for tenderizing the meat. My boyfriend's Korean mother says Coca-Cola® can also be used for the same purpose. This recipe uses very thin-sliced meat so tenderization isn't necessary. Sugar is used instead.",
            "Quick and easy. I make this on my busiest weeknights.",
            "Slow-cooked seasoned brisket shredded and prepared for tantalizing barbeque sandwiches. Enjoy on your favorite bread.",
            "A unique cauliflower crust serves as the base of this cheesy quiche featuring smoked sausage and sweet peppers.",
            "Authentic, bold, and delicious Thai flavors make this soup irresistible! This is the best Thai coconut soup I've had. You won't be disappointed with this one! Serve over steamed rice.",
            "These burritos are soooo good, you'll want to have them every night.",
            "Tarragon is one of the most aromatic and sweetest herbs that there is. It's good with chicken and really nice in a marinade like this. A good way to mix up the same old grilled chicken recipes.",
            "Mix fresh vegetables and fruit like celery and Mandarin oranges with the savory taste of Bold® Ichiban Teriyaki™ Style Chicken for an effortlessly delicious flavor journey.",


    };

    public static final String[] Ingredients =

            {
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",
                    " Ingredients  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lectus elit, tincidunt nec turpis sed, accumsan iaculis ipsum. Nulla at augue auctor, tristique erat in, ultricies nunc. Mauris eget metus leo. Ut in mi lacinia, mattis nisl non, ultrices risus. Vestibulum aliquet aliquam ipsum ut ullamcorper. Pellentesque fringilla, massa vel rutrum consequat, nulla velit fermentum dolor, sed scelerisque.",

            };



    // Keep all Images in array
    public Integer[] mThumbIds = {


            R.mipmap.bbq_beef_brisket_sandwiches   , R.mipmap.black_bean_burritos, R.mipmap.cauliflower_crusted_quiche_with_smoked_sausage,
            R.mipmap.quick_beef_stir_fry, R.mipmap.spicy_tarragon_yogurt_chicken, R.mipmap.thai_coconut_soup, R.mipmap.bulgogi, R.mipmap.boars_head_bold_ichiban_teriyaki,


    };


    public MyGridAdapter(Context context){
        mInflater = LayoutInflater.from(context);



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
    public Item getItem(int i) {
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

            v= mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text,v.findViewById(R.id.text));
        }

        picture = (ImageView)v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);
        Item item = getItem(i);
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
