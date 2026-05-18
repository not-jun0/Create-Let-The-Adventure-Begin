summon evoker ~ ~1 ~ {Health:200,Attributes:[{Name:"generic.max_health",Base:200f},{Name:"generic.knockback_resistance",Base:1f},{Name:"generic.movement_speed",Base:0.2f}],HandItems:[{},{id:"minecraft:totem_of_undying",Count:1}],ArmorItems:[{},{},{},{id:"create:goggles",Count:1}],ArmorDropChances:[0f,0f,0f,0f],Tags:["evoker_entity","evoker_evoker"],DeathLootTable:"create_ltab:evoker_kill"}
team add evoker
team modify evoker collisionRule never
team modify evoker friendlyFire false
team join evoker @e[tag=evoker_entity]
bossbar add evoker "EVOKER KING"
execute at @e[tag=evoker_evoker] run bossbar set evoker players @a[distance=..32]
bossbar set minecraft:evoker max 200
bossbar set minecraft:evoker style notched_6
bossbar set minecraft:evoker color yellow
bossbar set minecraft:evoker value 200


playsound create:whistle_train_manual_low_end master @a ~ ~ ~ 100 0.2
playsound create:whistle_train_manual_low_end master @a ~ ~ ~ 100 0.2
particle minecraft:flame ~ ~ ~ 0.2 0.5 0.2 0.1 50
particle minecraft:soul_fire_flame ~ ~ ~ 0.15 0.4 0.15 0.07 25

summon minecraft:item_display ~ ~ ~ {FallDistance: 0.0f, item: {Count: 1, id: "create:experience_block"}, transformation: {left_rotation: [-0.5f, 0f, 0.7f, -0.5f], right_rotation: [0.0f, 0.0f, 0.0f, 1.0f], scale: [0.25f, 0.25f, 0.25f], translation: [0.0f, 0.0f, 0.0f]},Tags:["evoker_orb1","evoker_entity"],brightness: {block: 15, sky: 0}}
summon minecraft:item_display ~ ~ ~ {FallDistance: 0.0f, item: {Count: 1, id: "create:experience_block"}, transformation: {left_rotation: [-0.5f, 0f, 0.7f, -0.5f], right_rotation: [0.0f, 0.0f, 0.0f, 1.0f], scale: [0.25f, 0.25f, 0.25f], translation: [0.0f, 0.0f, 0.0f]},Tags:["evoker_orb2","evoker_entity"],brightness: {block: 15, sky: 0}}

execute as @e[limit=1,sort=nearest,tag=evoker_orb1] at @e[limit=1,sort=nearest,tag=evoker_evoker] rotated as @e[limit=1,sort=nearest,tag=evoker_evoker] run tp @s ^0.8 ^2 ^ ~ 0
execute as @e[limit=1,sort=nearest,tag=evoker_orb2] at @e[limit=1,sort=nearest,tag=evoker_evoker] rotated as @e[limit=1,sort=nearest,tag=evoker_evoker] run tp @s ^-0.8 ^2 ^ ~ 0