package antimattermod.core;

import antimattermod.core.Energy.GUI.AlloySmelterContainer;
import antimattermod.core.Energy.GUI.AlloySmelterGuiContainer;
import antimattermod.core.Energy.GUI.MultiControllerContainer;
import antimattermod.core.Energy.GUI.MultiControllerGui;
import antimattermod.core.Energy.MultiBlock.TileMultiController;
import antimattermod.core.Energy.TileEntity.Machine.TileAlloySmelter;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * @author C6H2Cl2
 */
public class AMMGuiHandler implements IGuiHandler {
    public static final int GuiID_AlloySmelter = 334;
    public static final int GuiID_MultiController = 335;
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case GuiID_AlloySmelter: return new AlloySmelterContainer(x, y, z,(TileAlloySmelter)(world.getTileEntity(x,y,z)),player.inventory);
            case GuiID_MultiController: return new MultiControllerContainer();
            default:return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case GuiID_AlloySmelter: return new AlloySmelterGuiContainer(x, y, z,(TileAlloySmelter)(world.getTileEntity(x,y,z)),player.inventory);
            case GuiID_MultiController: return new MultiControllerGui((TileMultiController)(world.getTileEntity(x, y, z)), world, player, x, y, z);
            default:return null;
        }
    }
}
