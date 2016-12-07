package com.mylibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Custom TextView to set different fonts.
 * 
 * "fontName" is the key attribute to set fonts from XML Layout

 * 
 */
public class FancyTextView extends TextView {

	public FancyTextView(Context _Context) {

		super(_Context);
		init(null);
		isInEditMode();
	}

	public FancyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init(attrs);
		isInEditMode();
	}

	public FancyTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs,defStyle);
		// TODO Auto-generated constructor stub
		init(attrs);
		isInEditMode();
	}

	/**
	 * Reads font name attribute from attribute and sets font to TextView
	 * 
	 * @param attrs
	 */
	private void init(AttributeSet attrs) {

		if (!this.isInEditMode() && attrs != null) {
			TypedArray a = getContext().obtainStyledAttributes(attrs,
					R.styleable.Fonts);
			final int N = a.getIndexCount();

			String fontName = a.getString(R.styleable.Fonts_fontName);
			if(fontName != null) {
				Typeface font = Typeface.createFromAsset(getResources().getAssets(), fontName);
				try {
					if (font != null) {
						this.setTypeface(font);
					}
				} catch (RuntimeException e) {

				}
			}
			a.recycle();
		}
	}


}
