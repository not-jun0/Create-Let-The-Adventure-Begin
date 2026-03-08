$data modify block ~ ~-0.8 ~ LootTable set value "create_ltab:$(type)/rare_loot"
execute if data block ~ ~-0.8 ~ id run particle minecraft:sonic_boom ~ ~ ~ 0 0 0 1 1 force
execute if data block ~ ~-0.8 ~ id run playsound minecraft:block.note_block.harp master
