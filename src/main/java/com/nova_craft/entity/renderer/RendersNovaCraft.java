package com.nova_craft.entity.renderer;

import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.TileEntity.TileEntityAdvancedEnchantmentTable;
import com.nova_craft.TileEntity.TileEntityAncientChest;
import com.nova_craft.TileEntity.TileEntityAncientChestRenderer;
import com.nova_craft.TileEntity.TileEntityLegendaryBeacon;
import com.nova_craft.TileEntity.TileEntityLegendaryEnchantmentTable;
import com.nova_craft.config.Configs;
import com.nova_craft.entity.EntityBlazingCharger;
import com.nova_craft.entity.EntityBlazingSerpent;
import com.nova_craft.entity.EntityBloviator;
import com.nova_craft.entity.EntityCaveMonitor;
import com.nova_craft.entity.EntityCrystalGolem;
import com.nova_craft.entity.EntityDeathStalker;
import com.nova_craft.entity.EntityDeepoid;
import com.nova_craft.entity.EntityDestitumite;
import com.nova_craft.entity.EntityDestituteTentacle;
import com.nova_craft.entity.EntityDrifter;
import com.nova_craft.entity.EntityEnderAvis;
import com.nova_craft.entity.EntityEnderLord;
import com.nova_craft.entity.EntityEnderLordStaffProjectile;
import com.nova_craft.entity.EntityEnderRay;
import com.nova_craft.entity.EntityFirefly;
import com.nova_craft.entity.EntityGlowSquid;
import com.nova_craft.entity.EntityGoat;
import com.nova_craft.entity.EntityIceSceptorProjectile;
import com.nova_craft.entity.EntityIceologer;
import com.nova_craft.entity.EntityIonizatior;
import com.nova_craft.entity.EntityNitro;
import com.nova_craft.entity.EntityNulk;
import com.nova_craft.entity.EntityNullifier;
import com.nova_craft.entity.EntityNuxx;
import com.nova_craft.entity.EntityOutsider;
import com.nova_craft.entity.EntityOutsiderEye;
import com.nova_craft.entity.EntityPhantom;
import com.nova_craft.entity.EntityPhoenix;
import com.nova_craft.entity.EntityPrimedPETN;
import com.nova_craft.entity.EntityPrimedXanciumTNT;
import com.nova_craft.entity.EntityPrisoner;
import com.nova_craft.entity.EntityRealityDistorter;
import com.nova_craft.entity.EntitySculkAbomination;
import com.nova_craft.entity.EntitySculkDuplicator;
import com.nova_craft.entity.EntitySculkDweller;
import com.nova_craft.entity.EntitySculkHunger;
import com.nova_craft.entity.EntitySculkIncinerator;
import com.nova_craft.entity.EntitySculkSymbiote;
import com.nova_craft.entity.EntitySculkedMonitor;
import com.nova_craft.entity.EntitySeaSerpent;
import com.nova_craft.entity.EntitySlaughter;
import com.nova_craft.entity.EntityVargouzite;
import com.nova_craft.entity.EntityVindicator;
import com.nova_craft.entity.EntityVoidCube;
import com.nova_craft.entity.EntityVoidEntity;
import com.nova_craft.entity.EntityWarden;
import com.nova_craft.entity.EntityWardenVessel;
import com.nova_craft.entity.DeepoidDragon.EntityDeepoidDragon;
import com.nova_craft.entity.hardmode.EntityHardmodeCreeper;
import com.nova_craft.entity.hardmode.EntityHardmodeGhast;
import com.nova_craft.entity.hardmode.EntityHardmodeMagmaCube;
import com.nova_craft.entity.hardmode.EntityHardmodeSkeleton;
import com.nova_craft.entity.hardmode.EntityHardmodeSlime;
import com.nova_craft.entity.hardmode.EntityHardmodeSpider;
import com.nova_craft.entity.hardmode.EntityHardmodeZombie;
import com.nova_craft.entity.illager.EntityIllagerChief;
import com.nova_craft.entity.illager.EntityIllagerTrader;
import com.nova_craft.entity.misc.EntityBloviatorProjectile;
import com.nova_craft.entity.misc.EntityDestituteTentacleProjectile;
import com.nova_craft.entity.misc.EntityDiamondFirechargeProjectile;
import com.nova_craft.entity.misc.EntityIceProjectile;
import com.nova_craft.entity.misc.EntityIonizatiorProjectile;
import com.nova_craft.entity.misc.EntityKlangiteFirechargeProjectile;
import com.nova_craft.entity.misc.EntityPrimevalHornProjectile;
import com.nova_craft.entity.misc.EntityRayfireball;
import com.nova_craft.entity.misc.EntitySculkHornProjectile;
import com.nova_craft.entity.misc.EntitySculkLaser;
import com.nova_craft.entity.misc.EntitySculkedMonitorProjectile;
import com.nova_craft.entity.misc.EntityVaniteFirechargeProjectile;
import com.nova_craft.entity.misc.EntityVaniteTrident;
import com.nova_craft.entity.misc.EntityWardenProjectile;
import com.nova_craft.entity.misc.KlangiteSwordProjectile;
import com.nova_craft.entity.models.BlazingChargerModel;
import com.nova_craft.entity.models.BlazingSerpentModel;
import com.nova_craft.entity.models.BloviatorModel;
import com.nova_craft.entity.models.CaveMonitorModel;
import com.nova_craft.entity.models.DeathStalkerModel;
import com.nova_craft.entity.models.DeepoidModel;
import com.nova_craft.entity.models.DrifterModel;
import com.nova_craft.entity.models.FireflyModel;
import com.nova_craft.entity.models.GlowSquidModel;
import com.nova_craft.entity.models.GoatModel;
import com.nova_craft.entity.models.OutsiderEyeModel;
import com.nova_craft.entity.models.PhantomModel;
import com.nova_craft.entity.models.RealityDistorterModel;
import com.nova_craft.entity.models.SculkAbominationModel;
import com.nova_craft.entity.models.SculkHungerModel;
import com.nova_craft.entity.models.SculkIncineratorModel;
import com.nova_craft.entity.models.SculkedMonitorModel;
import com.nova_craft.entity.models.SeaSerpentModel;
import com.nova_craft.entity.models.VargouziteModel;
import com.nova_craft.entity.models.VoidCubeModel;
import com.nova_craft.entity.models.VoidEntityModel;
import com.nova_craft.entity.models.hardmode.HardmodeMagmaCubeModel;
import com.nova_craft.entity.models.hardmode.HardmodeSlimeModel;
import com.nova_craft.entity.renderer.hardmode.HardmodeCreeperRenderer;
import com.nova_craft.entity.renderer.hardmode.HardmodeGhastRenderer;
import com.nova_craft.entity.renderer.hardmode.HardmodeMagmaCubeRenderer;
import com.nova_craft.entity.renderer.hardmode.HardmodeSkeletonRenderer;
import com.nova_craft.entity.renderer.hardmode.HardmodeSlimeRenderer;
import com.nova_craft.entity.renderer.hardmode.HardmodeSpiderRenderer;
import com.nova_craft.entity.renderer.hardmode.HardmodeZombieRenderer;
import com.nova_craft.entity.renderer.illager.IllagerChiefOverlayRenderer;
import com.nova_craft.entity.renderer.illager.IllagerChiefRenderer;
import com.nova_craft.entity.renderer.illager.IllagerTraderOverlayRenderer;
import com.nova_craft.entity.renderer.illager.IllagerTraderRenderer;
import com.nova_craft.entity.renderer.staff.BloviatorProjectileRenderer;
import com.nova_craft.entity.renderer.staff.DestituteTentacleProjectileRenderer;
import com.nova_craft.entity.renderer.staff.DiamondFirechargeProjectileRenderer;
import com.nova_craft.entity.renderer.staff.EnderLordStaffProjectileRenderer;
import com.nova_craft.entity.renderer.staff.IceProjectileRenderer;
import com.nova_craft.entity.renderer.staff.IceSceptorProjectileRenderer;
import com.nova_craft.entity.renderer.staff.IonizatiorProjectileRenderer;
import com.nova_craft.entity.renderer.staff.KlangiteFirechargeProjectileRenderer;
import com.nova_craft.entity.renderer.staff.NovaCraftBowRenderer;
import com.nova_craft.entity.renderer.staff.NovaCraftHornRenderer;
import com.nova_craft.entity.renderer.staff.PrimevalHornProjectileRenderer;
import com.nova_craft.entity.renderer.staff.SculkHornProjectileRenderer;
import com.nova_craft.entity.renderer.staff.SculkLaserRenderer;
import com.nova_craft.entity.renderer.staff.SculkedMonitorProjectileRenderer;
import com.nova_craft.entity.renderer.staff.VaniteFirechargeProjectileRenderer;
import com.nova_craft.entity.renderer.staff.VaniteTridentRenderer;
import com.nova_craft.entity.renderer.staff.WardenProjectileRenderer;
import com.nova_craft.legendarybeacon.LegendaryBeaconRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.MinecraftForgeClient;

public class RendersNovaCraft {

	public static void initialization() {
	//Misc
	register(EntityPrimedXanciumTNT.class, new PrimedXanciumTNTRenderer());
	register(EntityPrimedPETN.class, new PrimedPETNRenderer());
	register(EntityRayfireball.class, new RayfireballRenderer());
	register(EntityBloviatorProjectile.class, new BloviatorProjectileRenderer());
	register(EntityEnderLordStaffProjectile.class, new EnderLordStaffProjectileRenderer());
	register(EntitySculkHornProjectile.class, new SculkHornProjectileRenderer());
	register(EntityIceSceptorProjectile.class, new IceSceptorProjectileRenderer());
	register(EntityIceProjectile.class, new IceProjectileRenderer());
	register(EntityWardenProjectile.class, new WardenProjectileRenderer());
	register(EntityDiamondFirechargeProjectile.class, new DiamondFirechargeProjectileRenderer((2.0F)));
	register(EntityVaniteFirechargeProjectile.class, new VaniteFirechargeProjectileRenderer((2.0F)));
	register(EntityKlangiteFirechargeProjectile.class, new KlangiteFirechargeProjectileRenderer((2.0F)));
	register(EntityVaniteTrident.class, new VaniteTridentRenderer());
	register(EntityIonizatiorProjectile.class, new IonizatiorProjectileRenderer(0.5F));
	register(EntityDestituteTentacleProjectile.class, new DestituteTentacleProjectileRenderer());
	register(EntitySculkLaser.class, new SculkLaserRenderer());
	register(EntityPrimevalHornProjectile.class, new PrimevalHornProjectileRenderer());
	register(EntitySculkedMonitorProjectile.class, new SculkedMonitorProjectileRenderer());
	register(KlangiteSwordProjectile.class, new KlangiteSwordProjectileRenderer());

	//Passive
	register(EntityGlowSquid.class, new GlowSquidRenderer(new GlowSquidModel(), 0.7F));
	register(EntityEnderAvis.class, new EnderAvisRenderer());
	register(EntityGoat.class, new GoatRenderer(new GoatModel(), 0.7f));
	register(EntityPhoenix.class, new PhoenixRenderer());
	register(EntityFirefly.class, new FireflyRenderer(new FireflyModel(), new FireflyModel(), 0.7F));

	//Hostile
	register(EntityPhantom.class, new PhantomRenderer(new PhantomModel(), new PhantomModel(), 0.7F));
	register(EntityDrifter.class, new DrifterRenderer());
	register(EntityBlazingCharger.class, new BlazingChargerRenderer(new BlazingChargerModel(), 0.6f));
	register(EntityEnderLord.class, new EnderLordRenderer());
	register(EntityEnderRay.class, new EnderRayRenderer());
	register(EntitySculkSymbiote.class, new SculkSymbioteRenderer());
	register(EntityVoidEntity.class, new VoidEntityRenderer(new VoidEntityModel(), 0.5f));
	register(EntityVoidCube.class, new VoidCubeRenderer(new VoidCubeModel(16), new VoidCubeModel(0), 0.25F));
	register(EntityNullifier.class, new VoidiferRenderer());
	register(EntitySculkDweller.class, new SculkDwellerRenderer());
	register(EntityWarden.class, new WardenRenderer());
	register(EntitySculkAbomination.class, new SculkAbominationRenderer(new SculkAbominationModel(), new SculkAbominationModel(), 0.7F));
	register(EntityBlazingSerpent.class, new BlazingSerpentRenderer(new BlazingSerpentModel(), 1.0f));
	register(EntitySculkHunger.class, new SculkHungerRenderer(new SculkHungerModel(), new SculkHungerModel(), 0.8f));
	register(EntitySculkDuplicator.class, new SculkDuplicatorRenderer());
	register(EntityIonizatior.class, new IonizatiorRenderer());
	register(EntityDeepoid.class, new DeepoidRenderer(new DeepoidModel(), 0.4f));
	register(EntityVargouzite.class, new VargouziteRenderer(new VargouziteModel(), 0.4f));
	register(EntityCaveMonitor.class, new CaveMonitorRenderer(new CaveMonitorModel(), 0.6f));
	register(EntitySculkedMonitor.class, new SculkedMonitorRenderer(new SculkedMonitorModel(), 0.6f));
	register(EntitySeaSerpent.class, new SeaSerpentRenderer(new SeaSerpentModel(), 0.5f));
	register(EntityDeepoidDragon.class, new DeepoidDragonRenderer());
	register(EntityCrystalGolem.class, new CrystalGolemRenderer());
	register(EntityBloviator.class, new BloviatorRenderer());
	register(EntityDeathStalker.class, new DeathStalkerRenderer(new DeathStalkerModel(), 0.0f));
	register(EntityRealityDistorter.class, new RealityDistorterRenderer());
	register(EntityDestitumite.class, new DestitumiteRenderer());
	register(EntityDestituteTentacle.class, new DestituteTentacleRenderer());
	register(EntitySculkIncinerator.class, new SculkIncineratorRenderer(new SculkIncineratorModel(), new SculkIncineratorModel(), 0.6f));
	register(EntityPrisoner.class, new PrisonerRenderer());
	register(EntityWardenVessel.class, new WardenVesselRenderer());
	register(EntityNitro.class, new NitroRenderer());
	register(EntityNulk.class, new NulkRenderer());
	register(EntityNuxx.class, new NuxxRenderer());
	register(EntityOutsiderEye.class, new OutsiderEyeRenderer(new OutsiderEyeModel(), new OutsiderEyeModel(), 0.7F));
	register(EntityOutsider.class, new OutsiderRenderer());

	register(EntityHardmodeCreeper.class, new HardmodeCreeperRenderer());
	register(EntityHardmodeSpider.class, new HardmodeSpiderRenderer());
	register(EntityHardmodeZombie.class, new HardmodeZombieRenderer());
	register(EntityHardmodeSkeleton.class, new HardmodeSkeletonRenderer());
	register(EntityHardmodeSlime.class, new HardmodeSlimeRenderer(new HardmodeSlimeModel(16), new HardmodeSlimeModel(0), 0.25F));
	register(EntityHardmodeMagmaCube.class, new HardmodeMagmaCubeRenderer());
	register(EntityHardmodeGhast.class, new HardmodeGhastRenderer());

	register(EntityVindicator.class, new VindicatorRenderer());
	register(EntityVindicator.class, new VindicatorOverlayRenderer());

	register(EntityIllagerTrader.class, new IllagerTraderRenderer());
	register(EntityIllagerTrader.class, new IllagerTraderOverlayRenderer());

	register(EntityIllagerChief.class, new IllagerChiefRenderer());
	register(EntityIllagerChief.class, new IllagerChiefOverlayRenderer());

	register(EntityIceologer.class, new IceologerRenderer());
	register(EntityIceologer.class, new IceologerOverlayRenderer());

	register(EntitySlaughter.class, new SlaughterRenderer());
	register(EntitySlaughter.class, new SlaughterOverlayRenderer());

	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.diamond_bow, new NovaCraftBowRenderer());
	if (Loader.isModLoaded("etfuturum")) {
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.netherite_bow, new NovaCraftBowRenderer());
	}
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.kylazite_bow, new NovaCraftBowRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.ophidian_bow, new NovaCraftBowRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.crystallized_vanite_bow, new NovaCraftBowRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.warden_bow, new NovaCraftBowRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.tophinite_bow, new NovaCraftBowRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.klangite_bow, new NovaCraftBowRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.crystalite_bow, new NovaCraftBowRenderer());

	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_admire, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_call, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_dream, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_feel, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_ponder, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_seek, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_sing, new NovaCraftHornRenderer());
	MinecraftForgeClient.registerItemRenderer(NovaCraftItems.goat_horn_yearn, new NovaCraftHornRenderer());

	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLegendaryEnchantmentTable.class, new LegendaryEnchantmentTableRenderer());
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAdvancedEnchantmentTable.class, new AdvancedEnchantmentTableRenderer());
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientChest.class, new TileEntityAncientChestRenderer());

	if (Configs.enableUniqueLegendaryBeaconBeam) {
      	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLegendaryBeacon.class, (TileEntitySpecialRenderer)new LegendaryBeaconRenderer());
      	}

	}

	public static void register(Class<? extends Entity> entityClass, Render render) {
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
	}

}
