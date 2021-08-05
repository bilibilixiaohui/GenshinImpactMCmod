package net.XiaoHui.gi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer
{
	// 新物品的实例
	public static final Item GI_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));

	@Override
	public void onInitialize()
	{
		Registry.register(Registry.ITEM, new Identifier("gi", "genshinimpactmaintheme"), GI_ITEM);
	}
}