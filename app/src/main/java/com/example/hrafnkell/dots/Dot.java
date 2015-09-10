package com.example.hrafnkell.dots;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/**
 * Created by Hrafnkell on 10/9/2015.
 *
 * This class represents a single dot on the grid of the game
 */
public class Dot {

    // Center x and y coordinates
    private int x, y;

    private int xGrid, yGrid;

    // Coordinates to draw the circle
    private RectF rectf;
    private Paint paint;

    // Radius = size / 2
    private float size;

    // The color of the dot
    private int color;

    public Dot(int x,int y, int xGrid, int yGrid, float size, int color){
        this.x = x;
        this.y = y;
        this.xGrid = xGrid;
        this.yGrid = yGrid;
        this.size = size;
        this.color = color;
        this.rectf = new RectF(x - size, y - size, x + size, y + size );
        this.paint = new Paint();
        //this.paint.setColor(this.color.hashCode());
        this.paint.setColor(color);
        this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.paint.setAntiAlias(true);
        //super.set(xBegin, yBegin, xEnd, yEnd);
    }


    public void setX(int x){
        this.x = x;
        this.rectf.set(x-size, y-size, x+size, y+size);
        //super.set(xBegin, yBegin, xEnd, yEnd);
    }

    public void setY(int y){
        this.y = y;
        this.rectf.set(x-size, y-size, x+size, y+size);
        //super.set(xBegin, yBegin, xEnd, yEnd);
    }

    public void setColor(int color){
        this.color = color;
    }

    public int getColor(){
        return this.color;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setXGrid(int x){
        this.xGrid = x;
    }

    public void setYGrid(int y){
        this.yGrid = y;
    }

    public int getXGrid(){
        return this.xGrid;
    }

    public int getyGrid(){
        return this.yGrid;
    }

    public void setSize(float size){
        this.size = size;
    }

    public float getSize(){
        return this.size;
    }

    public RectF getRectf(){
        return this.rectf;
    }

    public void setRectf(float f1, float f2, float f3, float f4){
        this.rectf.set(f1,f2,f3,f4);
    }

    public Paint getPaint(){
        return this.paint;
    }

    public void setPaint(Paint paint){
        this.paint = paint;
    }
}