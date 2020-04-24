package com.example.examplemod.init;

import java.util.jar.Attributes.Name;

import com.example.examplemod.ExampleMod;
import com.google.common.base.FinalizablePhantomReference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.RegistryObject;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus=Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class ItemInit 
{	
	public static final Item example_item = null;
	
	
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry()
		.register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
		
	}
}


