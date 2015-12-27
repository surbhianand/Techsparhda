package com.tipsandtricks.HelloCard.adapters;

import android.view.View.OnClickListener;

/**
 * Created by Justin on 2/2/14.
 */
public class CardItemData
{
	private String m_text1;
	private int id;

	
	
	public CardItemData(String text1,int i)
	{
		m_text1 = text1;
		id=i;
		
	}

	public String getText1()
	{
		return m_text1;
	
	}
	public int id()
	{
		return id;
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		// TODO Auto-generated method stub
		
	}

	
}
