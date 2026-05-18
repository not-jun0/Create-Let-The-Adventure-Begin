execute at @n[tag=evoker_orb1] run particle minecraft:flame ~ ~ ~ 0.2 0.5 0.2 0.1 50
execute at @n[tag=evoker_orb1] run particle minecraft:soul_fire_flame ~ ~ ~ 0.15 0.4 0.15 0.07 25
execute at @n[tag=evoker_orb2] run particle minecraft:flame ~ ~ ~ 0.2 0.5 0.2 0.1 50
execute at @n[tag=evoker_orb2] run particle minecraft:soul_fire_flame ~ ~ ~ 0.15 0.4 0.15 0.07 25
execute at @n[tag=evoker_point] run fill ^20 ^5 ^20 ^-20 ^-5 ^-20 minecraft:bricks replace minecraft:repeating_command_block
playsound create:whistle_train_manual_low_end master @a ~ ~ ~ 100 0.2
playsound create:whistle_train_manual_low_end master @a ~ ~ ~ 100 0.2
kill @e[tag=evoker_entity]
bossbar remove minecraft:evoker
