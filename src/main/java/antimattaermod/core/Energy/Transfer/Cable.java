package antimattaermod.core.Energy.Transfer;

import antimattaermod.core.AntiMatterModCore;
import antimattaermod.core.AntiMatterModRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Cable extends BlockContainer {

    public Cable(Material material){
        super(material);
        setBlockName("Cable");
        setHardness(2.0f);
        setResistance(0.0F);
        setCreativeTab(AntiMatterModRegistry.tabMachines);
        setBlockTextureName(AntiMatterModCore.MOD_ID+":"+"/blocks/cable");
        setBlockBounds(0.4f,0f,0f,0.6f,0.1875f,1f);
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        TileEntityCable tile = (TileEntityCable) world.getTileEntity(x,y,z);

    }

    //たぶん自作のRender使うときはこれ
    public int getRenderType(){
        return -1;
    }

    //透明化
    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    //Entityの作成
    @Override
    public TileEntity createNewTileEntity(World var1,int var2){
        return new TileEntityCable();
    }
}
