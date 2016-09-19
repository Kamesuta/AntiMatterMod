/*
 * 
 */
package antimattaermod.core.util;

import antimattaermod.core.item.MetaItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/** <h1>ItemUtil</h1>
 * 中間アイテム簡易登録クラス<br>
 * @author Raiti
 * @version 1.0.0
 * 
 */
public class ItemUtil {
	/**
	 * <h1>CreateItem</h1>
	 * 無機能なアイテムオブジェクトを作成します<br>
	 * @param name アイテム名 {@link Item#setUnlocalizedName(String)}
	 * @param textureName テクスチャ―名 {@link Item#setTextureName(String)}
	 * @param addTab 追加タブ {@link Item#setCreativeTab(CreativeTabs)}
	 * @param stackSize 最大スタックサイズ {@link Item#setMaxStackSize(int)}
	 * @param hasSubtype メタ値でアイテムが分けられているか {@link Item#setHasSubtypes(boolean)}
	 * @param maxMeta
	 * @param isFull3D アイテムを3Dで表示するか {@link Item#isFull3D()}
	 * @param containerItem クラフト時に帰ってくるアイテム {@link Item#setContainerItem(Item)}
	 * @return アイテムオブジェクト
	 */
	public static Item CreateItem(String name , String textureName , CreativeTabs addTab , int stackSize , boolean hasSubtype , 
			int maxMeta , boolean isFull3D, Item containerItem) {
		
		Item item = hasSubtype ? new MetaItem(maxMeta) : new Item();
		item.setUnlocalizedName(name);
		item.setTextureName(textureName);
		if(addTab != null) item.setCreativeTab(addTab);
		item.setMaxStackSize(stackSize);
		item.setMaxDamage(0);
		if(isFull3D) item.setFull3D();
		if(containerItem != null) item.setContainerItem(containerItem);
		
		return item;
	}
	
	
}