$execute if block ~ ~-0.8 ~ minecraft:chest[facing=east] run setblock ~ ~-0.8 ~ minecraft:chest[facing=east]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:chest[facing=north] run setblock ~ ~-0.8 ~ minecraft:chest[facing=north]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:chest[facing=south] run setblock ~ ~-0.8 ~ minecraft:chest[facing=south]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:chest[facing=west] run setblock ~ ~-0.8 ~ minecraft:chest[facing=west]{LootTable:"create_ltab:$(type)/rare_loot"} destroy

$execute if block ~ ~-0.8 ~ minecraft:barrel[facing=east] run setblock ~ ~-0.8 ~ minecraft:barrel[facing=east]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:barrel[facing=north] run setblock ~ ~-0.8 ~ minecraft:barrel[facing=north]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:barrel[facing=south] run setblock ~ ~-0.8 ~ minecraft:barrel[facing=south]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:barrel[facing=west] run setblock ~ ~-0.8 ~ minecraft:barrel[facing=west]{LootTable:"create_ltab:$(type)/rare_loot"} destroy

$execute if block ~ ~-0.8 ~ minecraft:trapped_chest[facing=east] run setblock ~ ~-0.8 ~ minecraft:trapped_chest[facing=east]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:trapped_chest[facing=north] run setblock ~ ~-0.8 ~ minecraft:trapped_chest[facing=north]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:trapped_chest[facing=south] run setblock ~ ~-0.8 ~ minecraft:trapped_chest[facing=south]{LootTable:"create_ltab:$(type)/rare_loot"} destroy
$execute if block ~ ~-0.8 ~ minecraft:trapped_chest[facing=west] run setblock ~ ~-0.8 ~ minecraft:trapped_chest[facing=west]{LootTable:"create_ltab:$(type)/rare_loot"} destroy


kill @e[type=minecraft:item,distance=..2]