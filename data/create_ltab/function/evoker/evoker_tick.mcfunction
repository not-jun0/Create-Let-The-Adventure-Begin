execute as @n[tag=evoker_evoker] store result bossbar evoker value run data get entity @s Health

execute if entity @e[type=vex,distance=..10] at @e[type=vex,distance=..10] run function create_ltab:evoker/evoker_vex
tp @e[type=minecraft:vex,distance=..10] ~ ~-500 ~

execute if entity @e[type=minecraft:evoker_fangs,distance=..3] as @e[type=minecraft:evoker_fangs,tag=!is_saw,distance=..3] at @s run function create_ltab:evoker/evoker_wheel

execute as @e[type=minecraft:evoker_fangs,tag=!is_down,distance=..30] at @s run tp @s ~ ~-2 ~
execute as @e[type=minecraft:evoker_fangs,tag=!is_down,distance=..30] at @s run tag @s add is_down

execute if predicate create_ltab:evoker_spawn_chance at @e[tag=evoker_wheel,distance=..30] as @n[tag=is_saw] rotated as @n[tag=is_saw] run tp @n[tag=evoker_wheel] ^0.6 ^ ^ ~ 0
execute unless predicate create_ltab:evoker_spawn_chance at @e[tag=evoker_wheel,distance=..30] as @n[tag=is_saw] rotated as @n[tag=is_saw] run tp @n[tag=evoker_wheel] ^1 ^ ^ ~ 0
execute at @e[tag=evoker_wheel,distance=10..30] run tp @n[tag=evoker_wheel] ~ ~-0.1 ~ ~ 0
execute if predicate create_ltab:evoker_spawn_chance at @e[tag=evoker_wheel,distance=..50] run damage @p[y=-10,dy=200,dx=0.4,dz=0.4] 15 create:crush
execute unless predicate create_ltab:evoker_spawn_chance at @e[tag=evoker_wheel,distance=..50] run damage @p[y=-10,dy=200,dx=0.6,dz=0.6] 20 create:crush
stopsound @a[distance=..50] * minecraft:entity.evoker_fangs.attack

execute if entity @e[tag=evoker_wheel,distance=..20] at @e[tag=evoker_wheel,distance=..20] run particle minecraft:crit ~ ~ ~ 0 0 0 1 2

execute as @n[tag=evoker_orb1] at @n[tag=evoker_evoker] rotated as @n[tag=evoker_evoker] run tp @s ^0.8 ^1 ^ ~ 0
execute as @n[tag=evoker_orb2] at @n[tag=evoker_evoker] rotated as @n[tag=evoker_evoker] run tp @s ^-0.8 ^1 ^ ~ 0

execute unless predicate create_ltab:evoker_spawn_chance run effect give @n[tag=!totemless,tag=evoker_evoker] minecraft:instant_health 1 10
execute unless predicate create_ltab:evoker_spawn_chance run tag @n[tag=evoker_evoker] add totemless

