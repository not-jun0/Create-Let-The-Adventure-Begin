gamerule commandBlockOutput false
execute at @n[tag=evoker_command_block1] run setblock ~ ~ ~ minecraft:repeating_command_block{auto:true,Command:"execute as @n[tag=evoker_evoker] at @n[tag=evoker_evoker] run function create_ltab:evoker/evoker_tick"}
execute at @n[tag=evoker_command_block2] run setblock ~ ~ ~ minecraft:repeating_command_block{auto:true,Command:"execute unless entity @n[tag=evoker_evoker] at @n[tag=evoker_point] as @n[tag=evoker_point] run function create_ltab:evoker/evoker_kill"}
advancement revoke @s only create_ltab:evoker_trigger
execute at @n[tag=evoker_point] run function create_ltab:evoker/evoker_spawn
