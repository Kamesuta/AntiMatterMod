package antimattermod.core

import antimattermod.core.Energy.Block.EnergyControllerBlock
import antimattermod.core.Energy.Block.Generator.BlockFurnaceGenerator
import antimattermod.core.Energy.TileEntity.Generator.TileEntityFurnaceGenerator
import antimattermod.core.Energy.TileEntity.TileEnergyController
import antimattermod.core.Energy.Item.StatesChecker
import antimattermod.core.Energy.Item.Wrench.ItemWrench
import antimattermod.core.Energy.MultiBlock.MultiControllerBlock
import antimattermod.core.Energy.MultiBlock.MultiControllerTile
import antimattermod.core.Mob.EntityDeveloperBoss
import antimattermod.core.Mob.ItemEgg.ItemDeveloperBossEgg
import antimattermod.core.Util.AddInformationfunction
import cpw.mods.fml.common.registry.EntityRegistry
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.item.Item
import cpw.mods.fml.common.network.NetworkRegistry



/**
 * @author C6H2Cl2
 */
object AMMRegistry {
    //Item  ============================================================================================================
    //ツール類
    val statesChecker: Item = StatesChecker()
    val toolWrench: Item = ItemWrench("toolWrench", "toolwrench", AddInformationfunction { item, player, list, isdebug -> antimattermod.core.Util.AddInformationfunction.WrenchInformation(item, player, list, isdebug) })

    //テスト用
    val developerBossEgg: Item = ItemDeveloperBossEgg()

    //Block  ===========================================================================================================
    //発電機
    val furnaceGenerator: Block = BlockFurnaceGenerator()
    //エネルギー制御
    val energyController = EnergyControllerBlock()

    val multiController = MultiControllerBlock()

    fun handlePreinit() {
        //Itemの登録 ===================================================================================================
        //ツール
        GameRegistry.registerItem(statesChecker, "statesCheckerAP")
        GameRegistry.registerItem(developerBossEgg, "developerBossEgg")
        GameRegistry.registerItem(toolWrench, "toolWrench")

        //機械
        GameRegistry.registerBlock(furnaceGenerator, "furnaceGeneratorAP")
        GameRegistry.registerBlock(energyController, "energyControllerAP")
        GameRegistry.registerBlock(multiController, "multiController")
    }

    fun handleInit() {
        //TileEntityの登録 =============================================================================================
        GameRegistry.registerTileEntity(TileEntityFurnaceGenerator::class.java, "tileFurnaceGeneratorAP")
        GameRegistry.registerTileEntity(TileEnergyController::class.java, "tileEnergyControllerAP")
        GameRegistry.registerTileEntity(MultiControllerTile::class.java, "multiControllerTile")

        //Entityの登録 =============================================================================================
        EntityRegistry.registerModEntity(EntityDeveloperBoss::class.java, "DeveloperBoss", 1, AntiMatterModCore.MOD_ID, 250, 1, false)

        NetworkRegistry.INSTANCE.registerGuiHandler(AntiMatterModCore.INSTANCE, AMMGuiHandler())

    }
}