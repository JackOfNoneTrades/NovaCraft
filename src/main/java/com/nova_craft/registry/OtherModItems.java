package com.nova_craft.registry;

import net.minecraft.block.*;
import net.minecraft.item.*;

import com.nova_craft.config.Configs;

import cpw.mods.fml.common.registry.*;

public class OtherModItems
{
	//Et Futurum
    public static Item netherite_helmet;
    public static Item netherite_chestplate;
    public static Item netherite_leggings;
    public static Item netherite_boots;
    public static Item netherite_sword;
    public static Item netherite_pickaxe;
    public static Item netherite_spade;
    public static Item netherite_axe;
    public static Item netherite_hoe;
    public static Item netherite_scrap;
    public static Item copper_ingot;
    public static Item netherite_ingot;
    public static Item rabbit_foot;
    public static Item amethyst_shard;
    public static Item raw_ore;
    public static Item prismarine_shard;
    public static Item prismarine_crystals;

    //Netherlious
    public static Item Nugget;
    public static Item Ingot;
    public static Item VoidQuartzItem;
    public static Item Materials;

    //Divine RPG
    public static Item rupeeIngot;
    public static Item arlemiteIngot;
    public static Item realmiteIngot;
    public static Item netheriteIngot;
    public static Item bloodgem;
    public static Item jungleShards;
    public static Item corruptedShards;
    public static Item enderShards;
    public static Item terranShards;
    public static Item moltenShards;
    public static Item divineShards;

    //Vanilla Aether Legacy
    public static Item zanite_gemstone;
    public static Item swet_ball;
    public static Item ambrosium_shard;

    //Aether Departure
    public static Item arkenium_chunk;
    public static Item continuum_orb;
    public static Item continuum_gemstone;
    public static Item divineral_ingot;
    public static Item enchanted_divineral;
    public static Item arkenium_fragement;
    public static Item raw_gravitite;
    public static Item divineral_nugget;

    //public static Item ascensite_pickaxe;
    //public static Item ascensite_axe;
    //public static Item ascensite_shovel;
    //public static Item ascensite_sword;
    public static Item pherithium_gloves;
    public static Item vanite_gloves;
    public static Item klangite_gloves;


    static {
    	OtherModItems.netherite_helmet = GameRegistry.findItem("etfuturum", "netherite_helmet");
    	OtherModItems.netherite_chestplate = GameRegistry.findItem("etfuturum", "netherite_chestplate");
    	OtherModItems.netherite_leggings = GameRegistry.findItem("etfuturum", "netherite_leggings");
    	OtherModItems.netherite_boots = GameRegistry.findItem("etfuturum", "netherite_boots");
    	OtherModItems.netherite_sword = GameRegistry.findItem("etfuturum", "netherite_sword");
    	OtherModItems.netherite_pickaxe = GameRegistry.findItem("etfuturum", "netherite_pickaxe");
    	OtherModItems.netherite_spade = GameRegistry.findItem("etfuturum", "netherite_spade");
    	OtherModItems.netherite_axe = GameRegistry.findItem("etfuturum", "netherite_axe");
    	OtherModItems.netherite_hoe = GameRegistry.findItem("etfuturum", "netherite_hoe");
    	OtherModItems.netherite_scrap = GameRegistry.findItem("etfuturum", "netherite_scrap");
    	OtherModItems.netherite_ingot = GameRegistry.findItem("etfuturum", "netherite_ingot");
    	OtherModItems.copper_ingot = GameRegistry.findItem("etfuturum", "copper_ingot");
    	OtherModItems.rabbit_foot = GameRegistry.findItem("etfuturum", "rabbit_foot");
    	OtherModItems.amethyst_shard = GameRegistry.findItem("etfuturum", "amethyst_shard");
    	OtherModItems.raw_ore = GameRegistry.findItem("etfuturum", "raw_ore");
    	OtherModItems.prismarine_shard = GameRegistry.findItem("etfuturum", "prismarine_shard");
    	OtherModItems.prismarine_crystals = GameRegistry.findItem("etfuturum", "prismarine_crystals");

    	OtherModItems.VoidQuartzItem = GameRegistry.findItem("netherlicious", "VoidQuartzItem");
    	OtherModItems.Ingot = GameRegistry.findItem("netherlicious", "Ingot");
    	OtherModItems.Nugget = GameRegistry.findItem("netherlicious", "Nugget");
    	OtherModItems.Materials = GameRegistry.findItem("netherlicious", "Materials");

    	OtherModItems.rupeeIngot = GameRegistry.findItem("divinerpg", "rupeeIngot");
    	OtherModItems.arlemiteIngot = GameRegistry.findItem("divinerpg", "arlemiteIngot");
    	OtherModItems.realmiteIngot = GameRegistry.findItem("divinerpg", "realmiteIngot");
    	OtherModItems.netheriteIngot = GameRegistry.findItem("divinerpg", "netheriteIngot");
    	OtherModItems.bloodgem = GameRegistry.findItem("divinerpg", "bloodgem");
    	OtherModItems.jungleShards = GameRegistry.findItem("divinerpg", "jungleShards");
    	OtherModItems.corruptedShards = GameRegistry.findItem("divinerpg", "corruptedShards");
    	OtherModItems.enderShards = GameRegistry.findItem("divinerpg", "enderShards");
    	OtherModItems.terranShards = GameRegistry.findItem("divinerpg", "terranShards");
    	OtherModItems.moltenShards = GameRegistry.findItem("divinerpg", "moltenShards");
    	OtherModItems.divineShards = GameRegistry.findItem("divinerpg", "divineShards");

    	OtherModItems.zanite_gemstone = GameRegistry.findItem("aether_legacy", "zanite_gemstone");
    	OtherModItems.swet_ball = GameRegistry.findItem("aether_legacy", "swet_ball");
    	OtherModItems.ambrosium_shard = GameRegistry.findItem("aether_legacy", "ambrosium_shard");

    	OtherModItems.arkenium_chunk = GameRegistry.findItem("aether_legacy", "arkenium_chunk");
    	OtherModItems.continuum_orb = GameRegistry.findItem("aether_legacy", "continuum_orb");
    	OtherModItems.continuum_gemstone = GameRegistry.findItem("aether_legacy", "continuum_gemstone");
    	OtherModItems.divineral_ingot = GameRegistry.findItem("aether_legacy", "divineral_ingot");
    	OtherModItems.enchanted_divineral = GameRegistry.findItem("aether_legacy", "enchanted_divineral");
    	OtherModItems.arkenium_fragement = GameRegistry.findItem("aether_legacy", "arkenium_fragement");
    	OtherModItems.raw_gravitite = GameRegistry.findItem("aether_legacy", "raw_gravitite");
    	OtherModItems.divineral_nugget = GameRegistry.findItem("aether_legacy", "divineral_nugget");

    	OtherModItems.pherithium_gloves = GameRegistry.findItem("aether_legacy", "pherithium_gloves");
    	OtherModItems.vanite_gloves = GameRegistry.findItem("aether_legacy", "vanite_gloves");
    	OtherModItems.klangite_gloves = GameRegistry.findItem("aether_legacy", "klangite_gloves");




    }
}

