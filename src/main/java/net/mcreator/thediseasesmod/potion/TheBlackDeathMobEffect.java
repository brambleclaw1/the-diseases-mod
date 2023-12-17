
package net.mcreator.thediseasesmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.thediseasesmod.procedures.TheBlackDeathOnEffectActiveTickProcedure;

public class TheBlackDeathMobEffect extends MobEffect {
	public TheBlackDeathMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_diseases_mod.the_black_death";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TheBlackDeathOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
