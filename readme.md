A CustomTextView class which removes the need for applying the custom fonts for each TextView

==============

Implementation:

1. Under `/res/values/` folder create `attrs.xml` file with the following cotents:

		<declare-styleable name="Fonts">
                <attr name="fontName" format="string">

                </attr>
            </declare-styleable>

2. Add your desired fonts in `/assets` folder like "Politica XT.otf" font

==============

Usage:

Simply set the `fontName` attribute to an EXISITING font file name in your `assets` folder


```
	<?xml version="1.0" encoding="utf-8"?>

 <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <com.mylibrary.FancyTextView
            xmlns:app="http://schemas.android.com/apk/res/com.my.app"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Test text"
            android:id="@+id/testcustomview"
            app:fontName="ProximaNova-Bold.otf"
            />
 </LinearLayout>
 ```