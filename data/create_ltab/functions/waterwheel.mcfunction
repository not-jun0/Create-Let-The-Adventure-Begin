gamerule sendCommandFeedback false
execute if block ~ ~ ~ minecraft:chain_command_block[facing=north] run setblock ~ ~ ~2 create:water_wheel[facing=north]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=south] run setblock ~ ~ ~-2 create:water_wheel[facing=south]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=west] run setblock ~2 ~ ~ create:water_wheel[facing=west]
execute if block ~ ~ ~ minecraft:chain_command_block[facing=east] run setblock ~-2 ~ ~ create:water_wheel[facing=east]
execute if block ^ ^-1 ^-2 minecraft:honeycomb_block run setblock ^ ^ ^-2 create:water_wheel[facing=down]
setblock ^ ^ ^-1 air
setblock ^ ^-1 ^-2 air
setblock ~ ~ ~ air
