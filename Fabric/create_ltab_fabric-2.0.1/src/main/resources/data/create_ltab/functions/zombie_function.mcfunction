gamerule sendCommandFeedback false
summon minecraft:zombie ~ ~ ~
loot replace entity @e[type=minecraft:zombie,distance=..1] armor.head loot create_ltab:random_head_loot
loot replace entity @e[type=minecraft:zombie,distance=..1] armor.chest loot create_ltab:random_chest_loot
loot replace entity @e[type=minecraft:zombie,distance=..1] armor.legs loot create_ltab:random_leg_loot
loot replace entity @e[type=minecraft:zombie,distance=..1] armor.feet loot create_ltab:random_foot_loot
loot replace entity @e[type=minecraft:zombie,distance=..1] weapon loot create_ltab:random_weapon_loot
setblock ~ ~ ~ minecraft:air 
