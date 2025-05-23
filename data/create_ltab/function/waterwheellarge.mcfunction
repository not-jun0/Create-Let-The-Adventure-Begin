execute if block ~ ~ ~ minecraft:chain_command_block[facing=down] run setblock ~ ~ ~ create:large_water_wheel[axis=y]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=up] run setblock ~ ~ ~ create:large_water_wheel[axis=y]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=north] run setblock ~ ~ ~ create:large_water_wheel[axis=z]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=south] run setblock ~ ~ ~ create:large_water_wheel[axis=z]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=west] run setblock ~ ~ ~ create:large_water_wheel[axis=x]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=east] run setblock ~ ~ ~ create:large_water_wheel[axis=x]
fill ~-1 ~-1 ~-1 ~1 ~1 ~1 air replace minecraft:command_block
fill ~-1 ~-1 ~-1 ~1 ~1 ~1 air replace minecraft:redstone_block
gamerule sendCommandFeedback true