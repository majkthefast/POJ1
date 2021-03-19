package com.company;

import java.io.IOException;
import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String[] args) throws IOException {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if(x>z && x >y && y > z)
        {
            //x - 1, y - 2, z - 3
            System.out.println(z+".000000 "+y+".000000 "+x+".000000");
            System.out.println(x+".000000 "+y+".000000 "+z+".000000");
        }
        else if(x>z && x >y && y < z)
        {
            //x - 1, z - 2, y - 3
            System.out.println(y+".000000 "+z+".000000 "+x+".000000");
            System.out.println(x+".000000 "+z+".000000 "+y+".000000");
        }
        else if(y>x && y>z && x>z)
        {
            //y - 1, x - 2, z - 3
            System.out.println(z+".000000 "+x+".000000 "+y+".000000");
            System.out.println(y+".000000 "+x+".000000 "+z+".000000");
        }
        else if(y>x && y>z && x<z)
        {
            //y - 1, z - 2, x - 3
            System.out.println(x+".000000 "+z+".000000 "+y+".000000");
            System.out.println(y+".000000 "+z+".000000 "+x+".000000");
        }
        else if(z>x && z>y && x>y)
        {
            //z - 1, x - 2, y - 3
            System.out.println(y+".000000 "+x+".000000 "+z+".000000");
            System.out.println(z+".000000 "+x+".000000 "+y+".000000");
        }
        else if(z>x && z>y && x<y)
        {
            //z - 1, y - 2, x - 3
            System.out.println(x+".000000 "+y+".000000 "+z+".000000");
            System.out.println(z+".000000 "+y+".000000 "+x+".000000");
        }
    }
}
