// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int rectwidth = 980;
        int rectheight = 630;
        int rectx = 10;
        int recty = 640;
        int rectx2 = 990;
        int recty2 = 640;
        g.drawRect(10,10,rectwidth,rectheight);


        //bottom right

        int rx1 = 10;
        int ry1 = 640;
        int rx2 = 990;
        int ry2 = 640;

        for(int k = 0; k < 49; k++){

            g.drawLine(rx1,ry1,rx2,ry2);

            rx1 += 20;
            ry2 -= 13;

        }

        //bottom left

        int lx1 = 990;
        int ly1 = 640;
        int lx2 = 10;
        int ly2 = 640;

        for(int k = 0; k < 49; k++) {

            g.drawLine(lx1, ly1, lx2, ly2);

            lx1 -= 20;
            ly2 -= 13;

        }

        //top left

        int trx1 = 10;
        int try1 = 10;
        int trx2 = 990;
        int try2 = 10;

        for(int k = 0; k < 49; k++) {

            g.drawLine(trx1, try1, trx2, try2);

            trx2 -= 20;
            try1 +=13;

        }

        //top right

        int tlx1 = 10;
        int tly1 = 10;
        int tlx2 = 990;
        int tly2 = 10;

        for(int k = 0; k < 49; k++) {

            g.drawLine(tlx1, tly1, tlx2, tly2);

            tlx1 += 20;
            tly2 += 13;
        }


        //Smaller Shape Starts Here


        int rect2width = 505;
        int rect2height = 300;
        int rect2x = 248;
        int rect2y = 175;
        int rect2x2 = 753;
        int rect2y2 = 475;

        g.drawRect(rect2x,rect2y,rect2width,rect2height);



        //bottom right

        int srx1 = 248;
        int sry1 = 475;
        int srx2 = 753;
        int sry2 = 475;

        for(int k = 0; k < 25; k++){

            g.drawLine(srx1,sry1,srx2,sry2);

            srx1 += 20;
            sry2 -= 12;

        }

        //bottom left

        int slx1 = 753;
        int sly1 = 475;
        int slx2 = 248;
        int sly2 = 475;

        for(int k = 0; k < 25; k++) {

            g.drawLine(slx1, sly1, slx2, sly2);

            slx1 -= 20;
            sly2 -= 12;

        }

        //top left

        int strx1 = 248;
        int stry1 = 175;
        int strx2 = 753;
        int stry2 = 175;

        for(int k = 0; k < 25; k++) {

            g.drawLine(strx1, stry1, strx2, stry2);

            strx2 -= 20;
            stry1 +=12;

        }

        //top right

        int stlx1 = 248;
        int stly1 = 175;
        int stlx2 = 753;
        int stly2 = 175;

        for(int k = 0; k < 25; k++) {

            g.drawLine(stlx1, stly1, stlx2, stly2);

            stlx1 += 20;
            stly2 += 12;
        }

    }

}

