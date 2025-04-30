package com.pdmtaller2.RafaelGutierrez_00073123.ui.data.dummy

import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.model.Dish
import com.pdmtaller2.RafaelGutierrez_00073123.ui.data.model.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Hut",
        description = "Pizza Hut es una cadena internacional de comida rápida especializada en pizzas.",
        ImageUrl = "https://www.citypng.com/public/uploads/preview/pizza-hut-red-logo-hd-transparent-background-735811696677707fulkxcgb71.png",
        categories = listOf("Pizzas"),
        menu = listOf(
            Dish(1, "Pizza de jamón y queso", "Clásica pizza con jamón y queso", "https://www.pizzahut.com.sv/static/media/images/images/jpg/1_13-06-2024-00-37_MD.jpg"),
            Dish(2, "Pizza Pepperoni", "Pizza con rodajas de pepperoni", "https://www.pizzahut.com.sv/static/media/images/images/jpg/1_13-06-2024-09-01_MD.jpg"),
            Dish(3, "Pizza Suprema", "Con vegetales, carne y más", "https://www.pizzahut.com.sv/static/media/images/images/jpg/4556_1_08-11-2023-10-57.jpg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Domino's Pizza",
        description = "Cadena internacional con pizzas al horno, pastas y más.",
        ImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Dominos_pizza_logo.svg/1200px-Dominos_pizza_logo.svg.png",
        categories = listOf("Pizzas"),
        menu = listOf(
            Dish(4, "Pizza Extravaganzza", "Con salchicha italiana, pimientos y aceitunas", "https://www.dominos.com.sg/ManagedAssets/SG/product/PXEX/SG_PXEX_en_hero_11915.jpg?v625495932"),
            Dish(5, "Pizza BBQ Chicken", "Pizza con salsa barbacoa y pollo", "https://www.dominos.com.au/ManagedAssets/AU/product/P025/AU_P025_en_hero_4055.jpg?v687172778"),
            Dish(6, "Pizza Veggie", "Pizza vegetariana con vegetales frescos", "https://www.dominos.com.sg/ManagedAssets/SG/product/PXVV/SG_PXVV_en_hero_11915.jpg?v893463060")
        )
    ),
    Restaurant(
        id = 3,
        name = "Little Caesars",
        description = "Famosa por sus pizzas HOT-N-READY.",
        ImageUrl = "https://1000marcas.net/wp-content/uploads/2023/04/Little-Caesars-Logo.jpg",
        categories = listOf("Pizzas"),
        menu = listOf(
            Dish(7, "Pizza 3 Quesos", "Con mozzarella, parmesano y cheddar", "https://mobilestatic.littlecaesars.com/mexweborderingimages/114aa112-c902-487a-a4ba-d5c56c5af28a.jpg"),
            Dish(8, "Pizza de Salchicha", "Salchicha italiana en masa clásica", "https://mobilestatic.littlecaesars.com/weborderingimages/4f444c1c-e43e-45a7-a01e-58d29b7a753d.jpg"),
            Dish(9, "Deep Dish", "Pizza con masa gruesa y queso derretido", "https://photos.prnewswire.com/prnfull/20130401/DE85888")
        )
    ),
    Restaurant(
        id = 4,
        name = "La Trattoria",
        description = "Restaurante italiano con pasta artesanal y pizza fresca.",
        ImageUrl = "https://static.wixstatic.com/media/06a864_9ac93d88d62544f5a7d4d1932f2641d2~mv2_d_2664_1464_s_2.png/v1/fit/w_2500,h_1330,al_c/06a864_9ac93d88d62544f5a7d4d1932f2641d2~mv2_d_2664_1464_s_2.png",
        categories = listOf("Comida italiana"),
        menu = listOf(
            Dish(10, "Espaguetis a la Bolognesa", "Pasta con salsa de carne y tomate", "https://www.laespanolaaceites.com/wp-content/uploads/2019/05/espaguetis-a-la-bolonesa-1080x671.jpg"),
            Dish(11, "Pizza Margherita", "Pizza tradicional con tomate, mozzarella y albahaca", "https://media-cdn.tripadvisor.com/media/photo-s/13/91/df/75/pizza-margherita.jpg"),
            Dish(12, "Lasagna", "Plato clásico italiano con carne, pasta y salsa bechamel", "https://www.bofrost.es/dw/image/v2/BGLH_PRD/on/demandware.static/-/Sites-ES-master-catalog/default/dw5ad34e17/images/19166-lasana-bolonesa.jpg?sw=400&sh=400")
        )
    ),
    Restaurant(
        id = 5,
        name = "Pasta e Basta",
        description = "Comida italiana de calidad con especialidad en pasta fresca.",
        ImageUrl = "https://pastaebasta.co.uk/wp-content/uploads/2021/12/PeB-Logos_-02.png",
        categories = listOf("Comida italiana"),
        menu = listOf(
            Dish(13, "Fettuccine Alfredo", "Pasta con una suave salsa Alfredo", "https://recetasdecocina.elmundo.es/wp-content/uploads/2021/06/pasta-alfredo.jpg"),
            Dish(14, "Pizza Carbonara", "Pizza con salsa carbonara, bacon y queso", "https://pizzapastaebasta.es/wp-content/uploads/2021/02/IMG1_ECOM-10.jpg"),
            Dish(15, "Risotto de Champiñones", "Risotto cremoso con champiñones frescos", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3wZ2tZN3FQC04zBkFHdV_U5RC5Vmwa1RhHA&s")
        )
    ),
    Restaurant(
        id = 6,
        name = "Osteria Italia",
        description = "Ambiente auténtico italiano con pizzas y pasta artesanal.",
        ImageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1e/c9/bf/a2/osteria-italia.jpg?w=700&h=400&s=1",
        categories = listOf("Comida italiana"),
        menu = listOf(
            Dish(16, "Pizza Prosciutto", "Pizza con jamón crudo y arúgula", "https://media-cdn.tripadvisor.com/media/photo-s/14/c5/a7/e0/pizza-with-prosciutto.jpg"),
            Dish(17, "Pasta al Pesto", "Pasta con salsa pesto casera", "https://superpilopi.com/wp-content/uploads/2021/01/pasta-italiana-al-pesto-1.jpg"),
            Dish(18, "Focaccia", "Pan italiano con aceite de oliva y hierbas", "https://laboutiquetrattoriaviajera.es/wp-content/uploads/receta-focaccia-italiana.png")
        )
    ),
    Restaurant(
        id = 7,
        name = "El Mexicano",
        description = "Auténtica comida mexicana, desde tacos hasta enchiladas.",
        ImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYpYCerwcPUo8hBeE2cNWWL5vNVk20n04BPQ&s",
        categories = listOf("Comida mexicana"),
        menu = listOf(
            Dish(19, "Tacos al Pastor", "Tacos con carne de cerdo y piña", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkY2LjgzMN3zrzakLYoD7xBAlIvdjv3WMTWg&s"),
            Dish(20, "Enchiladas Rojas", "Tortillas rellenas de pollo bañadas en salsa roja", "https://i0.wp.com/3.bp.blogspot.com/-Ek14YhJxlKI/V9mJtvl1tuI/AAAAAAAAG1Q/uzyMIPb3eAcBBrZoudy6AVYq4l2h4PrZgCLcB/s1600/enchiladas-rojas-de-pollo-servir.jpg?ssl=1"),
            Dish(21, "Torta", "Torta con aguacate con cebolla, cilantro y limón", "https://www.cafe-mx.com/blog/app/assets/media/2020/07/cual-es-el-origen-de-la-torta-mexicana.jpg")
        )
    ),
    Restaurant(
        id = 8,
        name = "La Casa del Taco",
        description = "Tacos tradicionales y comida casera mexicana.",
        ImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ_qkCBx-tdB_dTWxAJKx9RU9HxkAHn2Lfeg&s",
        categories = listOf("Comida mexicana"),
        menu = listOf(
            Dish(22, "Tacos de Carne Asada", "Tacos con carne asada, cebolla y cilantro", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJx4r8rzdOBliNtITzBPGec8OqPQ4Y0TxzsA&s"),
            Dish(23, "Tamales", "Tamales de pollo y cerdo con salsa verde", "https://d1w7312wesee68.cloudfront.net/2GrXi2JRKFeTjXhyDMA-Ma1l5JctDILMSsBXiPcewNY/resize:fit:720:720/plain/s3://toasttab/restaurants/restaurant-81722000000000000/menu/items/0/item-600000000355696210_1732237887.jpg"),
            Dish(24, "Quesadillas", "Tortillas rellenas de queso y otros ingredientes", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_btmuHF8kRiOXfZfWaxiajYpIgYB-qlQaEA&s")
        )
    ),
    Restaurant(
        id = 9,
        name = "Cantina Mexicana",
        description = "Una mezcla de comida tradicional y contemporánea mexicana.",
        ImageUrl = "https://media-cdn.tripadvisor.com/media/photo-s/13/0c/e1/21/la-cantina-mexicana.jpg",
        categories = listOf("Comida mexicana"),
        menu = listOf(
            Dish(25, "Chiles en Nogada", "Poblano chiles rellenos de picadillo", "https://guerrerotortillas.com/wp-content/uploads/2023/09/recipe-chiles-en-nogada-tacos.jpg"),
            Dish(26, "Fajitas", "Tiras de carne de res, pollo o cerdo con pimientos y cebolla", "https://media-cdn.tripadvisor.com/media/photo-s/04/3c/0d/3b/casa-del-taco.jpg"),
            Dish(27, "Sopes", "Pequeñas tortas gruesas con carne, crema y queso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4gybbTNgDpxgpLV9nUVwH4Us5z3p24GdMyA&s")
        )
    ),
    Restaurant(
        id = 10,
        name = "Sushi Roll",
        description = "Restaurante especializado en sushi, sashimi y platos de comida japonesa.",
        ImageUrl = "https://arrobasystem.com/cdn/shop/articles/b5ade519123f27dfc75ed088e1ba882f_1200x1200.png?v=1567010010",
        categories = listOf("Comida asiática"),
        menu = listOf(
            Dish(28, "Sushi California Roll", "Rollos con cangrejo, aguacate y pepino", "https://images.immediate.co.uk/production/volatile/sites/30/2024/01/California-roll-a87199c.jpg"),
            Dish(29, "Sashimi de Salmón", "Rodajas de salmón fresco y marinado", "https://media.post.rvohealth.io/wp-content/uploads/2021/09/sushi-sashimi-1200x628-facebook-1200x628.jpg"),
            Dish(30, "Tempura de Camarón", "Camarones fritos en una capa ligera de tempura", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSu1lA2E8Yfu2UYXt6zWlyE0KFRuOBZuk3tLA&s")
        )
    ),
    Restaurant(
        id = 11,
        name = "Chinese Kitchen",
        description = "Comida tradicional china con especialidades como dim sum y fideos.",
        ImageUrl = "https://c8.alamy.com/comp/CFF41T/chefs-preparing-chinese-cuisine-in-woks-in-the-modern-kitchen-of-a-CFF41T.jpg",
        categories = listOf("Comida asiática"),
        menu = listOf(
            Dish(31, "Dim Sum", "Pequeños dumplings rellenos de cerdo y camarón", "https://cocina-casera.com/wp-content/uploads/2018/04/Dim-sum-2.jpg"),
            Dish(32, "Fideos Chow Mein", "Fideos salteados con verduras y carne", "https://www.orientalmarket.es/recetas/wp-content/uploads/2022/04/chowmeinreceta-scaled.jpg"),
            Dish(33, "Pollo Kung Pao", "Pollo salteado con maní y salsa picante", "https://imag.bonviveur.com/pollo-kung-pao-casero.jpg")
        )
    ),
    Restaurant(
        id = 12,
        name = "Thai Spice",
        description = "Comida tailandesa fresca y sabrosa, con un enfoque en platos picantes.",
        ImageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/06/01/84/a9/thai-space.jpg?w=900&h=-1&s=1",
        categories = listOf("Comida asiática"),
        menu = listOf(
            Dish(34, "Pad Thai", "Fideos tailandeses salteados con camarones y maní", "https://recetasdecocina.elmundo.es/wp-content/uploads/2023/11/pad-thai-receta.jpg"),
            Dish(35, "Tom Yum Soup", "Sopa picante de camarón con hierba de limón", "https://hot-thai-kitchen.com/wp-content/uploads/2013/03/tom-yum-goong-blog.jpg"),
            Dish(36, "Green Curry", "Curry tailandés con leche de coco, pollo y verduras", "https://hot-thai-kitchen.com/wp-content/uploads/2022/04/green-curry-new-sq-3.jpg")
        )
    ),

    Restaurant(
        id = 13,
        name = "Green Bowl",
        description = "Restaurante saludable con ensaladas frescas y bowls de superalimentos.",
        ImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfX1_5y0B-wL31TAnie_f_GouOfo0uclQvTw&s",
        categories = listOf("Comida saludable"),
        menu = listOf(
            Dish(37, "Bowl de Acai", "Fruta de acai, granola, plátano y fresas", "https://www.cuisinart.es/on/demandware.static/-/Sites-es-cuisinart-Library/default/dw87ad5636/images/recipes/Acai-Bowl.jpg"),
            Dish(38, "Ensalada de Quinoa", "Quinoa con espinaca, pepino y tomate", "https://www.recetaslider.cl/wp-content/uploads/2021/06/principal_5cb62f13ceb97.jpg"),
            Dish(39, "Smoothie Verde", "Espinaca, pepino, manzana y jengibre", "https://www.vitamixespana.com/recetas/wp-content/uploads/2018/04/smoothie-verde-vitamix.jpg")
        )
    ),
    Restaurant(
        id = 14,
        name = "Fit Kitchen",
        description = "Platos saludables con proteínas, vegetales y granos integrales.",
        ImageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/07/45/6e/6d/getlstd-property-photo.jpg?w=900&h=-1&s=1",
        categories = listOf("Comida saludable"),
        menu = listOf(
            Dish(40, "Bowl de Pollo y Verduras", "Pollo a la parrilla con espinacas y zanahorias", "https://zenu.com.co/wp-content/uploads/2023/12/Bowl-de-pollo-con-vegetales.jpg.webp"),
            Dish(41, "Tazón de Arroz Integral", "Arroz integral con aguacate, huevo y tomate", "https://diabetesfoodhub.org/sites/foodhub/files/styles/recipe_hero_banner_720w/public/Recid_106_Brown_Rice_and_Pinto_Bean_Bowl_with_Chicken_and_Pico_de_Gallo_PNCImages_MG_4808-Edit-%28ZF-5661-35964-1-012%2902272018.jpg?h=89e83eaf&itok=rOKIRoTR"),
            Dish(42, "Pasta Integral", "Pasta integral con salsa de tomate, albahaca y aguacate", "https://cdn0.recetasgratis.net/es/posts/2/9/2/ensalada_de_pasta_integral_con_atun_61292_orig.jpg")
        )
    ),
    Restaurant(
        id = 15,
        name = "Vital Eats",
        description = "Comida energética y saludable, ideal para mantener el bienestar.",
        ImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUIE0xmUN6ZyJFGWrQX3lToS70N_aZb7V_8g&s",
        categories = listOf("Comida saludable"),
        menu = listOf(
            Dish(43, "Tostadas de Aguacate", "Pan integral con aguacate y huevo pochado", "https://i0.wp.com/passionfood.ec/wp-content/uploads/2019/12/TOSTADA-AGUACATE.jpg?fit=880%2C880"),
            Dish(44, "Wrap de Pollo y Espinacas", "Pollo con espinacas, pepino y hummus en wrap integral", "https://www.bekiacocina.com/images/cocina/0000/376-h.jpg"),
            Dish(45, "Smoothie Bowl", "Base de smoothie con frutas y granola", "https://www.hola.com/horizon/landscape/6a7c13700760-smoothie-bowl-adobe-t.jpg")
        )
    ),
    Restaurant(
        id = 16,
        name = "Sweet Tooth",
        description = "Postres caseros, tartas, y dulces artesanales.",
        ImageUrl = "https://content3.jdmagicbox.com/comp/kaimur/l4/9999p6189.6189.210312001514.r8l4/catalogue/shop-bhabua-bhabua-uef9876a25.jpg",
        categories = listOf("Postres"),
        menu = listOf(
            Dish(46, "Tarta de Fresas", "Tarta rellena de fresas frescas y crema", "https://i.ytimg.com/vi/3wmLon0_7yI/maxresdefault.jpg"),
            Dish(47, "Brownie de Chocolate", "Brownie clásico de chocolate con nueces", "https://recetasdecocina.elmundo.es/wp-content/uploads/2016/11/brownie-de-chocolate.jpg"),
            Dish(48, "Cheesecake", "Tarta de queso con base de galleta", "https://www.recetasnestle.com.ec/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/7f9ebeaceea909a80306da27f0495c59.jpg?itok=_Xp6MoSe")
        )
    ),
    Restaurant(
        id = 17,
        name = "Choco Delight",
        description = "Dulces y chocolates artesanales de alta calidad.",
        ImageUrl = "https://content3.jdmagicbox.com/v2/comp/tiruvannamalai/n3/9999p4175.4175.230821185931.i1n3/catalogue/choco-delight-cheyyar-tiruvannamalai-restaurants-0lvuvswns7.jpg",
        categories = listOf("Postres"),
        menu = listOf(
            Dish(49, "Trufas de Chocolate", "Trufas rellenas de crema de chocolate", "https://www.recetasnestle.com.pe/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/fa9696f5ff6ca9df9a980e828267192a.png?itok=WWBmQT8L"),
            Dish(50, "Tarta de Chocolate", "Tarta de chocolate negro con ganache", "https://images.aws.nestle.recipes/original/2024_10_23T08_35_37_badun_images.badun.es_6641251d07e6_tarta_de_chocolate.jpg"),
            Dish(51, "Mousse de Chocolate", "Mousse suave de chocolate con un toque de vainilla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSl3rvi_0426b4iSeAknu-1b04AiiMdVnLNbQ&s")
        )
    ),
    Restaurant(
        id = 18,
        name = "La Casa del Helado",
        description = "Helados artesanales en una variedad de sabores naturales.",
        ImageUrl = "https://www.albrookmall.com/images/2021/Tiendas/Carrusel/casa_del_helado.jpg",
        categories = listOf("Postres"),
        menu = listOf(
            Dish(52, "Helado de Fresa", "Helado de fresa con trozos de fruta", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkZAjjXKTIm5m40lQfl53A9Yvr67vu30J-Xg&s"),
                Dish(53, "Helado de Vainilla", "Helado clásico de vainilla con trozos de chocolate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgF7_xhRheW3UWAKKk4fbH2SI4xvrXR9qoHg&s"),
            Dish(54, "Helado de Chocolate", "Helado de chocolate oscuro con nueces", "https://heladosfaciles.com/wp-content/uploads/2023/07/HELADO-DE-CHOCOLATE-CON-N-UECES-scaled.jpg")
        )
    ),

    Restaurant(
        id = 19,
        name = "Juice Bar",
        description = "Bebidas naturales de jugos y smoothies frescos.",
        ImageUrl = "https://visitseinajokiregion.fi/wp-content/uploads/2022/07/Jungle-juice-bar-2-scaled.jpg",
        categories = listOf("Bebidas", "Jugos"),
        menu = listOf(
            Dish(55, "Smoothie de Fresa", "Smoothie de fresa con yogur griego", "https://www.recetasnestle.com.ve/sites/default/files/srh_recipes/ceb25755829279d2ba4f7103e0496ede.jpg"),
            Dish(56, "Jugo Verde", "Jugo de pepino, manzana y espinaca", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStDitgKIjVDSSfi-XE4XNK2cns7POmmkEPjg&s"),
            Dish(57, "Jugo de Naranja", "Jugo natural de naranja recién exprimido", "https://www.laprensagrafica.com/__export/1681596539950/sites/prensagrafica/img/2023/04/15/r_x16x.jpg_423682103.jpg")
        )
    ),
    Restaurant(
        id = 20,
        name = "Caoba",
        description = "Café, té y bebidas calientes para acompañar cualquier momento del día.",
        ImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgvL9Y0Uex-ho9jpX5owrpN2eHENHlk0ee0A&s",
        categories = listOf("Bebidas", "Café"),
        menu = listOf(
            Dish(58, "Café Latte", "Café con leche espumosa", "https://images.ctfassets.net/0e6jqcgsrcye/53teNK4AvvmFIkFLtEJSEx/4d3751dcad227c87b3cf6bda955b1649/Cafe_au_lait.jpg"),
            Dish(59, "Café Cappuccino", "Café con leche espumosa y cacao", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVUDZNZTLtrfQv3WlTxMz-MGLMELXxoFmgyA&s"),
            Dish(60, "Té Verde", "Té verde con un toque de limón", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4ENY_MQ-abtOdbquXUbinNm6eUICUD14C_Q&s")
        )
    ),
    Restaurant(
        id = 21,
        name = "Beverage Haven",
        description = "Una variedad de bebidas frías, smoothies y batidos.",
        ImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTROsQyhRIjtD4xh77Wp5sU-Ayz_CadwBT29A&s",
        categories = listOf("Bebidas", "Smoothies"),
        menu = listOf(
            Dish(61, "Smoothie Tropical", "Smoothie de mango, piña y coco", "https://iswari.s3.eu-west-3.amazonaws.com/blog/vvwktt-smoothie-tropical.jpg"),
            Dish(62, "Batido de Plátano", "Batido de plátano con avena y miel", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMaOeGojAPQFFTxnBrXB7i0kG5Xl75V22c-A&s"),
            Dish(63, "Smoothie de Mora", "Smoothie de mora con yogur natural", "https://delizia.bo/wp-content/uploads/2021/12/Smoothie-De-Moras-con-Yogurt.jpg")
        )
    )
)
