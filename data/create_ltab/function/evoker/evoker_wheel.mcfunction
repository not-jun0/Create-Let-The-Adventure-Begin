particle minecraft:soul_fire_flame ^-3 ^0.35 ^ 0.05 0.1 0.05 0.1 5
particle minecraft:flame ^-3 ^0.35 ^ 0.05 0.1 0.05 0.1 15

summon minecraft:item_display ^-3 ^0.35 ^ {FallDistance: 0.0f, item: {count: 1, id: "create:crushing_wheel"}, transformation: {left_rotation: [0.707f, 0.0f, 0.0f, 0.707f], right_rotation: [0.0f, 0.0f, 0.0f, 1.0f], scale: [1.25f, 1.25f, 1.25f], translation: [0.0f, 0.0f, 0.0f]},Tags:["evoker_wheel","evoker_entity"],teleport_duration:1}

tag @s add is_saw

schedule function create_ltab:evoker/evoker_wheel_kill 40t append
