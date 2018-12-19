package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    private Paint paint;
    private int width;
    private int height;

    public Practice4DrawPointView(Context context) {
        this(context,null);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(20);
        canvas.drawPoint(width/4,height/2,paint);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(width/2,height/2,paint);
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(width*3/4,height/2,paint);
    }
}
