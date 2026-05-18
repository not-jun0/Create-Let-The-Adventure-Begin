execute unless predicate create_ltab:evoker_spawn_chance if entity @n[tag=!evoker_vindicator] run summon vindicator ~ ~ ~ {Health:20,PersistenceRequired:1b,HandItems:[{id:iron_axe},{}],attributes:[{id:"generic.max_health",base:12f}],Tags:["evoker_vindicator"]}
particle minecraft:soul_fire_flame ~ ~ ~ 0 0.5 0 0.05 20
execute unless predicate create_ltab:evoker_spawn_chance at @e[type=vex,distance=..5] run effect give @n[tag=evoker_evoker] minecraft:instant_health 1 3
execute at @n[type=minecraft:vindicator,distance=..10] run playsound create:haunted_bell_convert hostile @a ~ ~ ~ 0.5 1

execute if predicate create_ltab:evoker_spawn_chance at @e[type=vex,distance=..5] run particle minecraft:heart ~ ~ ~ 0.1 0.5 0.1 0 4
execute if predicate create_ltab:evoker_spawn_chance at @e[type=vex,distance=..5] run effect give @n[tag=evoker_evoker] minecraft:instant_health 1 2
execute if predicate create_ltab:evoker_spawn_chance at @e[type=vex,distance=..5] run effect give @n[tag=evoker_evoker] minecraft:regeneration 3 2