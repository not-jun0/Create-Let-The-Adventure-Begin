execute if block ~ ~ ~ minecraft:chain_command_block[facing=down] run setblock ~ ~ ~ create:water_wheel[facing=down]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=up] run setblock ~ ~ ~ create:water_wheel[facing=up]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=north] run setblock ~ ~ ~ create:water_wheel[facing=north]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=south] run setblock ~ ~ ~ create:water_wheel[facing=south]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=west] run setblock ~ ~ ~ create:water_wheel[facing=west]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=east] run setblock ~ ~ ~ create:water_wheel[facing=east]
fill ~-1 ~-1 ~-1 ~1 ~1 ~1 air replace minecraft:command_block
fill ~-1 ~-1 ~-1 ~1 ~1 ~1 air replace minecraft:redstone_block
gamerule sendCommandFeedback true