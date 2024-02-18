package net.scripticle.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

import static net.minecraft.entity.effect.StatusEffects.LUCK;
import static net.minecraft.entity.effect.StatusEffects.SPEED;
public class ModFoodComponents {
    public static final FoodComponent DOCTORPEPPER = new FoodComponent.Builder().hunger(3).saturationModifier(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,200), 10)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200),10).build();
}
