gamerule commandBlockOutput false

execute at @e[limit=1,sort=nearest,tag=evoker_command_block1] run setblock ~ ~ ~ minecraft:repeating_command_block{auto:true,Command:"execute as @e[limit=1,sort=nearest,tag=evoker_evoker] at @e[limit=1,sort=nearest,tag=evoker_evoker] run function create_ltab:evoker/evoker_tick"}

execute at @e[limit=1,sort=nearest,tag=evoker_command_block2] run setblock ~ ~ ~ minecraft:repeating_command_block{auto:true,Command:"execute unless entity @e[limit=1,sort=nearest,tag=evoker_evoker] at @e[limit=1,sort=nearest,tag=evoker_point] as @e[limit=1,sort=nearest,tag=evoker_point] run function create_ltab:evoker/evoker_kill"}

advancement revoke @s only create_ltab:evoker_trigger
execute at @e[limit=1,sort=nearest,tag=evoker_point] run function create_ltab:evoker/evoker_spawn
