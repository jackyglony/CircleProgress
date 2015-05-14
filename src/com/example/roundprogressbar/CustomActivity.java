/**
 * Copyright (C) 2011 The Android Open Source Project 
 * Emial : guoyil199@163.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */ 
package com.example.roundprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;


public class CustomActivity extends Activity {
	LinearLayout layout;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LayoutParams(-1,-1));
        setContentView(layout);
        init();
    }

	private void init() {
		//LinearLayout layout=new LinearLayout(this);
		final DrawView view=new DrawView(this);
		view.setMinimumHeight(500);
		view.setMinimumWidth(300);
		//通知view组件重绘  
		view.invalidate();
		layout.addView(view);
		
	}
}
