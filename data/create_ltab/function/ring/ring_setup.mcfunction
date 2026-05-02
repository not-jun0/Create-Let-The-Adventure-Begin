summon marker ~ ~ ~ {Tags:["followPlayer"]}
summon marker ~ ~ ~ {Tags:["followPlayer2"]}
playsound create:steam master @s ^1.73 ^.1 ^-1 1 1.2 1
playsound create:steam master @s ^ ^.1 ^2 0.9 1 0.9
playsound create:steam master @s ^-1.73 ^.1 ^-1 1 0.8 1
setblock ~1.73 ~.1 ~-1 minecraft:light[level=2] keep
setblock ~ ~.1 ~2 minecraft:light[level=2] keep
setblock ~-1.73 ~.1 ~-1 minecraft:light[level=2] keep
execute at @n[type=marker,tag=followPlayer2] run particle minecraft:flame ^1.73 ^.1 ^-1 0.01 0 0.01 0.05 10
execute at @n[type=marker,tag=followPlayer2] run particle minecraft:flame ^ ^.1 ^2 0.01 0 0.01 0.05 10
execute at @n[type=marker,tag=followPlayer2] run particle minecraft:flame ^-1.73 ^.1 ^-1 0.01 0 0.01 0.05 10
schedule function create_ltab:particles 6 append
schedule function create_ltab:particles 9 append
schedule function create_ltab:particles 12 append
schedule function create_ltab:particles 15 append
schedule function create_ltab:particles 18 append
schedule function create_ltab:particles 21 append
schedule function create_ltab:particles 24 append
schedule function create_ltab:particles 27 append
schedule function create_ltab:particles 30 append
schedule function create_ltab:particles 33 append
schedule function create_ltab:ring_removal 36 append