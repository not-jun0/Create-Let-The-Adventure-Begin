fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:water_wheel[facing=north] replace create:clockwork_bearing[facing=north]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:water_wheel[facing=east] replace create:clockwork_bearing[facing=east]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:water_wheel[facing=south] replace create:clockwork_bearing[facing=south]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:water_wheel[facing=west] replace create:clockwork_bearing[facing=west]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:water_wheel[facing=up] replace create:clockwork_bearing[facing=up]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:water_wheel[facing=down] replace create:clockwork_bearing[facing=down]
setblock ^ ^ ^-1 air
setblock ^ ^-1 ^-2 air
setblock ^ ^ ^-2 air
setblock ~ ~ ~ air
gamerule sendCommandFeedback true