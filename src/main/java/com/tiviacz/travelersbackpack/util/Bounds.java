package com.tiviacz.travelersbackpack.util;

import net.minecraft.util.math.AxisAlignedBB;

public class Bounds
{
    public double x1, y1, z1;
    public double x2, y2, z2;

    public Bounds(int x1, int y1, int z1, int x2, int y2, int z2)
    {
        this.x1 = x1 * 0.0625;
        this.y1 = y1 * 0.0625;
        this.z1 = z1 * 0.0625;
        this.x2 = x2 * 0.0625;
        this.y2 = y2 * 0.0625;
        this.z2 = z2 * 0.0625;
    }

    public AxisAlignedBB toAABB()
    {
        return new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
    }
}