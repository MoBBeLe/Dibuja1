package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
		dibujarHexagono(canvas);
		dibujarEstrella(canvas);
	}


	//Método que dibuja un hexágono en el canvas
	public void dibujarHexagono(Canvas canvas)
	{
		paint.setColor(Color.YELLOW);
		paint.setStrokeWidth(3);
		//Dibuja parte superior del hexágono
		canvas.drawLine(60,150,80,100,paint);
		canvas.drawLine(90,100,125,100,paint);
		canvas.drawLine(125,100,150,150,paint);
		//Dibuja parte inferior del hexágono
		canvas.drawLine(60,150,80,200,paint);
		canvas.drawLine(80,200,125,200,paint);
		canvas.drawLine(125,200,150,150,paint);
	}

	//Se dibuja una estrella de 5 picos con triángulos para hacer los picos y
	//un pentágono.
	public void dibujarEstrella(Canvas canvas)
	{
		paint.setColor(Color.BLACK);
		paint.setStrokeWidth(3);

		//1 lado del pentágono
		canvas.drawLine(300,200,350,150,paint);
		//picos del 1 y 2 lado
		canvas.drawLine(300,200,275,140,paint);
		canvas.drawLine(275,140,350,150,paint);

		//2 lado del pentágono
		canvas.drawLine(350,150,400,200,paint);
		//picos del 2 y 3 lado
		canvas.drawLine(350,150,425,140,paint);
		canvas.drawLine(425,140,400,200,paint);

		//3 lado del pentágono
		canvas.drawLine(300,200,325,250,paint);
		//picos del 3 y 4 lado
		canvas.drawLine(300,200,265,250,paint);
		canvas.drawLine(265,250,325,250,paint);

		//4 lado del pentágono
		canvas.drawLine(325,250,375,250,paint);
		//picos del 4 y 5 lado
		canvas.drawLine(325,250,350,300,paint);
		canvas.drawLine(350,300,375,250,paint);

		//5 lado del pentágono
		canvas.drawLine(375,250,400,200,paint);
		//picos del 5 y 1 lado
		canvas.drawLine(375,250,435,250,paint);
		canvas.drawLine(435,250,400,200,paint);
	}

}
