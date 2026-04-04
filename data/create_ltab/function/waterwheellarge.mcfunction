fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:large_water_wheel[axis=z] replace create:clockwork_bearing[facing=north]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:large_water_wheel[axis=x] replace create:clockwork_bearing[facing=east]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:large_water_wheel[axis=z] replace create:clockwork_bearing[facing=south]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:large_water_wheel[axis=x] replace create:clockwork_bearing[facing=west]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:large_water_wheel[axis=y] replace create:clockwork_bearing[facing=up]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:large_water_wheel[axis=y] replace create:clockwork_bearing[facing=down]
setblock ^ ^ ^-1 air
setblock ^ ^-1 ^-2 air
setblock ^ ^ ^-2 air
setblock ~ ~ ~ air
gamerule sendCommandFeedback true