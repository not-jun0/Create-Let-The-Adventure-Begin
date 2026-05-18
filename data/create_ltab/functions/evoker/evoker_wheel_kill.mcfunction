execute at @e[limit=1,sort=nearest,tag=evoker_wheel] run particle minecraft:crit ~ ~ ~ 0.1 0.1 0.1 1 20
execute at @e[limit=1,sort=nearest,type=minecraft:evoker] run kill @e[tag=evoker_wheel,distance=..50]
