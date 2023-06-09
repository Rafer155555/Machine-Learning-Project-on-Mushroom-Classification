scala

val mushroom = sqlContext.read.format("csv")
  .option("header", "true")
  .option("inferSchema", "true")
  .option("delimiter", ",")
  .load("/FileStore/tables/mushrooms-1.csv")

mushroom.show()

+-----+--------+----------+--------+-------+----+--------------+-----------+--------+---------+----------+---------+---------------------+---------------------+-------------------+-------------------+--------+---------+----------+--------+---------------+----------+-------+
|class|capshape|capsurface|capcolor|bruises|odor|gillattachment|gillspacing|gillsize|gillcolor|stalkshape|stalkroot|stalksurfaceabovering|stalksurfacebelowring|stalkcolorabovering|stalkcolorbelowring|veiltype|veilcolor|ringnumber|ringtype|sporeprintcolor|population|habitat|
+-----+--------+----------+--------+-------+----+--------------+-----------+--------+---------+----------+---------+---------------------+---------------------+-------------------+-------------------+--------+---------+----------+--------+---------------+----------+-------+
|    p|       x|         s|       n|      t|   p|             f|          c|       n|        k|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         s|      u|
|    e|       x|         s|       y|      t|   a|             f|          c|       b|        k|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         n|      g|
|    e|       b|         s|       w|      t|   l|             f|          c|       b|        n|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         n|      m|
|    p|       x|         y|       w|      t|   p|             f|          c|       n|        n|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         s|      u|
|    e|       x|         s|       g|      f|   n|             f|          w|       b|        k|         t|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       e|              n|         a|      g|
|    e|       x|         y|       y|      t|   a|             f|          c|       b|        n|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         n|      g|
|    e|       b|         s|       w|      t|   a|             f|          c|       b|        g|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         n|      m|
|    e|       b|         y|       w|      t|   l|             f|          c|       b|        n|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         s|      m|
|    p|       x|         y|       w|      t|   p|             f|          c|       n|        p|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         v|      g|
|    e|       b|         s|       y|      t|   a|             f|          c|       b|        g|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         s|      m|
|    e|       x|         y|       y|      t|   l|             f|          c|       b|        g|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         n|      g|
|    e|       x|         y|       y|      t|   a|             f|          c|       b|        n|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         s|      m|
|    e|       b|         s|       y|      t|   a|             f|          c|       b|        w|         e|        c|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         s|      g|
|    p|       x|         y|       w|      t|   p|             f|          c|       n|        k|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         v|      u|
|    e|       x|         f|       n|      f|   n|             f|          w|       b|        n|         t|        e|                    s|                    f|                  w|                  w|       p|        w|         o|       e|              k|         a|      g|
|    e|       s|         f|       g|      f|   n|             f|          c|       n|        k|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         y|      u|
|    e|       f|         f|       w|      f|   n|             f|          w|       b|        k|         t|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       e|              n|         a|      g|
|    p|       x|         s|       n|      t|   p|             f|          c|       n|        n|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              k|         s|      g|
|    p|       x|         y|       w|      t|   p|             f|          c|       n|        n|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         s|      u|
|    p|       x|         s|       n|      t|   p|             f|          c|       n|        k|         e|        e|                    s|                    s|                  w|                  w|       p|        w|         o|       p|              n|         s|      u|
+-----+--------+----------+--------+-------+----+--------------+-----------+--------+---------+----------+---------+---------------------+---------------------+-------------------+-------------------+--------+---------+----------+--------+---------------+----------+-------+
only showing top 20 rows
