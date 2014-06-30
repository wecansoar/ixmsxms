package com.wecansoar.ixmsxms.piece;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.wecansoar.ixmsxms.R;


public class LayoutBottom extends LinearLayout{

    public LayoutBottom (Context context) {
        super(context);
        init();
    }

    public LayoutBottom (Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init () {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout_bottom, this, true);
    }
}
