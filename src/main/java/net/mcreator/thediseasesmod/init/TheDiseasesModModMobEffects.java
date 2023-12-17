
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thediseasesmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.thediseasesmod.potion.TheBlackDeathMobEffect;
import net.mcreator.thediseasesmod.TheDiseasesModMod;

public class TheDiseasesModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TheDiseasesModMod.MODID);
	public static final RegistryObject<MobEffect> THE_BLACK_DEATH = REGISTRY.register("the_black_death", () -> new TheBlackDeathMobEffect());
}
