effect give @s minecraft:bad_omen 7
execute if predicate create_ltab:random_chance run effect give @s minecraft:bad_omen 7 1
execute if predicate create_ltab:random_chance run effect give @s minecraft:bad_omen 7 2
advancement revoke @s only create_ltab:evoker_use
particle minecraft:large_smoke ~ ~ ~ 0.12 0.12 0.12 0.05 1