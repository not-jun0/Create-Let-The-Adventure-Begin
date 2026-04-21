fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:windmill_bearing[facing=north]{QueueAssembly:true} replace create:clockwork_bearing[facing=north]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:windmill_bearing[facing=east]{QueueAssembly:true,ScrollValue:1} replace create:clockwork_bearing[facing=east]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:windmill_bearing[facing=south]{QueueAssembly:true,ScrollValue:1} replace create:clockwork_bearing[facing=south]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:windmill_bearing[facing=west]{QueueAssembly:true} replace create:clockwork_bearing[facing=west]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:windmill_bearing[facing=up]{QueueAssembly:true} replace create:clockwork_bearing[facing=up]
fill ^-10 ^-10 ^-10 ^10 ^10 ^10 create:windmill_bearing[facing=down]{QueueAssembly:true} replace create:clockwork_bearing[facing=down]
setblock ^ ^ ^-1 air
setblock ^ ^-1 ^-2 air
setblock ^ ^ ^-2 air
setblock ~ ~ ~ air
gamerule sendCommandFeedback true