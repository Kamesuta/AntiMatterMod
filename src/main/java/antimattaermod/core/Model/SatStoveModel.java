package antimattaermod.core.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by worldofthetakumi on 2016/10/14.
 */
public class SatStoveModel extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer FireWood1;
    ModelRenderer FireWood2;
    ModelRenderer FireWood3;
    ModelRenderer FireWood4;
    ModelRenderer FireWood5;
    ModelRenderer FireWood6;
    ModelRenderer FireWood7;
    ModelRenderer FireWood8;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape24;
    ModelRenderer Ingot;

    public SatStoveModel()
    {
        textureWidth = 64;
        textureHeight = 32;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 12, 1, 12);
        Shape1.setRotationPoint(-6F, 23F, -6F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        FireWood1 = new ModelRenderer(this, 0, 0);
        FireWood1.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood1.setRotationPoint(0F, 19F, 0F);
        FireWood1.setTextureSize(64, 32);
        FireWood1.mirror = true;
        setRotation(FireWood1, -0.7853982F, 0F, 0F);
        FireWood2 = new ModelRenderer(this, 0, 0);
        FireWood2.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood2.setRotationPoint(0F, 20F, 0F);
        FireWood2.setTextureSize(64, 32);
        FireWood2.mirror = true;
        setRotation(FireWood2, 0F, 0F, -0.7853982F);
        FireWood3 = new ModelRenderer(this, 0, 0);
        FireWood3.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood3.setRotationPoint(0F, 19F, -1F);
        FireWood3.setTextureSize(64, 32);
        FireWood3.mirror = true;
        setRotation(FireWood3, 0F, 0F, 0.7853982F);
        FireWood4 = new ModelRenderer(this, 0, 0);
        FireWood4.addBox(0F, 0F, 0F, 1, 4, 1);
        FireWood4.setRotationPoint(-1F, 20F, 0F);
        FireWood4.setTextureSize(64, 32);
        FireWood4.mirror = true;
        setRotation(FireWood4, 0.7853982F, 0F, 0F);
        FireWood5 = new ModelRenderer(this, 0, 0);
        FireWood5.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood5.setRotationPoint(-1F, 19F, 0F);
        FireWood5.setTextureSize(64, 32);
        FireWood5.mirror = true;
        setRotation(FireWood5, 0F, 0.4886922F, 0.7853982F);
        FireWood6 = new ModelRenderer(this, 0, 0);
        FireWood6.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood6.setRotationPoint(-1F, 19F, 0F);
        FireWood6.setTextureSize(64, 32);
        FireWood6.mirror = true;
        setRotation(FireWood6, -0.7853982F, 0.5759587F, 0F);
        FireWood7 = new ModelRenderer(this, 0, 0);
        FireWood7.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood7.setRotationPoint(0F, 20F, -1F);
        FireWood7.setTextureSize(64, 32);
        FireWood7.mirror = true;
        setRotation(FireWood7, 0F, 0.5235988F, -0.7853982F);
        FireWood8 = new ModelRenderer(this, 0, 0);
        FireWood8.addBox(0F, 0F, 0F, 1, 5, 1);
        FireWood8.setRotationPoint(-1F, 20F, 0F);
        FireWood8.setTextureSize(64, 32);
        FireWood8.mirror = true;
        setRotation(FireWood8, 0.7853982F, 0.6981317F, 0F);
        Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(0F, 0F, 0F, 12, 13, 1);
        Shape3.setRotationPoint(-6F, 11F, -7F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(0F, 0F, 0F, 12, 13, 1);
        Shape4.setRotationPoint(-6F, 11F, 6F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 0, 0);
        Shape5.addBox(0F, 0F, 0F, 1, 12, 12);
        Shape5.setRotationPoint(-7F, 11F, -6F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 0, 0);
        Shape6.addBox(0F, 0F, 0F, 3, 1, 12);
        Shape6.setRotationPoint(-6F, 10F, -6F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 0, 0);
        Shape7.addBox(0F, 0F, 0F, 3, 1, 12);
        Shape7.setRotationPoint(3F, 10F, -6F);
        Shape7.setTextureSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 0, 0);
        Shape8.addBox(0F, 0F, 0F, 6, 1, 3);
        Shape8.setRotationPoint(-3F, 10F, -6F);
        Shape8.setTextureSize(64, 32);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 0, 0);
        Shape9.addBox(0F, 0F, 0F, 6, 1, 3);
        Shape9.setRotationPoint(-3F, 10F, 3F);
        Shape9.setTextureSize(64, 32);
        Shape9.mirror = true;
        setRotation(Shape9, 0F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 0, 0);
        Shape10.addBox(0F, 0F, 0F, 1, 1, 2);
        Shape10.setRotationPoint(-3F, 10F, -3F);
        Shape10.setTextureSize(64, 32);
        Shape10.mirror = true;
        setRotation(Shape10, 0F, 0F, 0F);
        Shape11 = new ModelRenderer(this, 0, 0);
        Shape11.addBox(0F, 0F, 0F, 1, 1, 2);
        Shape11.setRotationPoint(2F, 10F, -3F);
        Shape11.setTextureSize(64, 32);
        Shape11.mirror = true;
        setRotation(Shape11, 0F, 0F, 0F);
        Shape12 = new ModelRenderer(this, 0, 0);
        Shape12.addBox(0F, 0F, 0F, 1, 1, 2);
        Shape12.setRotationPoint(-3F, 10F, 1F);
        Shape12.setTextureSize(64, 32);
        Shape12.mirror = true;
        setRotation(Shape12, 0F, 0F, 0F);
        Shape13 = new ModelRenderer(this, 0, 0);
        Shape13.addBox(0F, 0F, 0F, 1, 1, 2);
        Shape13.setRotationPoint(2F, 10F, 1F);
        Shape13.setTextureSize(64, 32);
        Shape13.mirror = true;
        setRotation(Shape13, 0F, 0F, 0F);
        Shape14 = new ModelRenderer(this, 0, 0);
        Shape14.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape14.setRotationPoint(-2F, 10F, -3F);
        Shape14.setTextureSize(64, 32);
        Shape14.mirror = true;
        setRotation(Shape14, 0F, 0F, 0F);
        Shape15 = new ModelRenderer(this, 0, 0);
        Shape15.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape15.setRotationPoint(1F, 10F, -3F);
        Shape15.setTextureSize(64, 32);
        Shape15.mirror = true;
        setRotation(Shape15, 0F, 0F, 0F);
        Shape16 = new ModelRenderer(this, 0, 0);
        Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape16.setRotationPoint(-2F, 10F, 2F);
        Shape16.setTextureSize(64, 32);
        Shape16.mirror = true;
        setRotation(Shape16, 0F, 0F, 0F);
        Shape17 = new ModelRenderer(this, 0, 0);
        Shape17.addBox(0F, 0F, 0F, 1, 1, 1);
        Shape17.setRotationPoint(1F, 10F, 2F);
        Shape17.setTextureSize(64, 32);
        Shape17.mirror = true;
        setRotation(Shape17, 0F, 0F, 0F);
        Shape18 = new ModelRenderer(this, 0, 0);
        Shape18.addBox(0F, 0F, 0F, 1, 13, 3);
        Shape18.setRotationPoint(6F, 10F, -6F);
        Shape18.setTextureSize(64, 32);
        Shape18.mirror = true;
        setRotation(Shape18, 0F, 0F, 0F);
        Shape19 = new ModelRenderer(this, 0, 0);
        Shape19.addBox(0F, 0F, 0F, 1, 13, 3);
        Shape19.setRotationPoint(6F, 10F, 3F);
        Shape19.setTextureSize(64, 32);
        Shape19.mirror = true;
        setRotation(Shape19, 0F, 0F, 0F);
        Shape20 = new ModelRenderer(this, 0, 0);
        Shape20.addBox(0F, 0F, 0F, 1, 8, 2);
        Shape20.setRotationPoint(6F, 10F, -1F);
        Shape20.setTextureSize(64, 32);
        Shape20.mirror = true;
        setRotation(Shape20, 0F, 0F, 0F);
        Shape21 = new ModelRenderer(this, 0, 0);
        Shape21.addBox(0F, 0F, 0F, 1, 9, 1);
        Shape21.setRotationPoint(6F, 10F, -2F);
        Shape21.setTextureSize(64, 32);
        Shape21.mirror = true;
        setRotation(Shape21, 0F, 0F, 0F);
        Shape22 = new ModelRenderer(this, 0, 0);
        Shape22.addBox(0F, 0F, 0F, 1, 9, 1);
        Shape22.setRotationPoint(6F, 10F, 1F);
        Shape22.setTextureSize(64, 32);
        Shape22.mirror = true;
        setRotation(Shape22, 0F, 0F, 0F);
        Shape23 = new ModelRenderer(this, 0, 0);
        Shape23.addBox(0F, 0F, 0F, 1, 10, 1);
        Shape23.setRotationPoint(6F, 10F, 2F);
        Shape23.setTextureSize(64, 32);
        Shape23.mirror = true;
        setRotation(Shape23, 0F, 0F, 0F);
        Shape24 = new ModelRenderer(this, 0, 0);
        Shape24.addBox(0F, 0F, 0F, 1, 10, 1);
        Shape24.setRotationPoint(6F, 10F, -3F);
        Shape24.setTextureSize(64, 32);
        Shape24.mirror = true;
        setRotation(Shape24, 0F, 0F, 0F);
        Ingot = new ModelRenderer(this, 0, 0);
        Ingot.addBox(0F, 0F, 0F, 2, 10, 2);
        Ingot.setRotationPoint(-1F, 13F, -1F);
        Ingot.setTextureSize(64, 32);
        Ingot.mirror = true;
        setRotation(Ingot, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5,entity);
        Shape1.render(f5);
        FireWood1.render(f5);
        FireWood2.render(f5);
        FireWood3.render(f5);
        FireWood4.render(f5);
        FireWood5.render(f5);
        FireWood6.render(f5);
        FireWood7.render(f5);
        FireWood8.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        Shape8.render(f5);
        Shape9.render(f5);
        Shape10.render(f5);
        Shape11.render(f5);
        Shape12.render(f5);
        Shape13.render(f5);
        Shape14.render(f5);
        Shape15.render(f5);
        Shape16.render(f5);
        Shape17.render(f5);
        Shape18.render(f5);
        Shape19.render(f5);
        Shape20.render(f5);
        Shape21.render(f5);
        Shape22.render(f5);
        Shape23.render(f5);
        Shape24.render(f5);
        Ingot.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    }

}
