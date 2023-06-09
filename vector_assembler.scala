%scala

import org.apache.spark.sql.functions._
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.VectorAssembler

val assembler = new VectorAssembler().setInputCols(Array("capshape_indexed", "capsurface_indexed", "capcolor_indexed", "bruises_indexed", "odor_indexed",
"gillattachment_indexed", "gillspacing_indexed", "gillsize_indexed", "gillcolor_indexed", "stalkshape_indexed", "stalkroot_indexed",
"stalksurfaceabovering_indexed", "stalksurfacebelowring_indexed", "stalkcolorabovering_indexed", "stalkcolorbelowring_indexed", 
"veiltype_indexed", "veilcolor_indexed", "ringnumber_indexed", "ringtype_indexed", "sporeprintcolor_indexed", "population_indexed", "habitat_indexed")).setOutputCol("features")

val training = assembler.transform(train).select($"features", $"class_indexed".alias("label"))

training.show(false)

Output

+--------------------------------------------------------------------------------------+-----+
|features                                                                              |label|
+--------------------------------------------------------------------------------------+-----+
|(22,[0,1,2,6,8,9,10,11,12,17,20,21],[3.0,2.0,1.0,1.0,4.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0])|0.0  |
|(22,[0,1,2,6,8,9,10,11,17,20,21],[3.0,2.0,1.0,1.0,4.0,1.0,1.0,1.0,1.0,2.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,12,17,20,21],[3.0,2.0,1.0,1.0,4.0,1.0,1.0,1.0,1.0,3.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,17,20,21],[3.0,2.0,1.0,1.0,4.0,1.0,1.0,1.0,3.0,1.0])              |0.0  |
|(22,[0,1,2,6,8,9,10,17,20,21],[3.0,2.0,1.0,1.0,4.0,1.0,1.0,1.0,2.0,1.0])              |0.0  |
|(22,[0,1,2,6,8,9,10,11,17,20,21],[3.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,12,17,20,21],[3.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,12,17,20,21],[3.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,17,20,21],[3.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0])              |0.0  |
|(22,[0,1,2,6,8,9,10,17,20,21],[3.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0])              |0.0  |
|(22,[0,1,2,6,8,9,10,11,12,17,20,21],[3.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0])|0.0  |
|(22,[0,1,2,6,8,9,10,11,12,17,20,21],[3.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0])|0.0  |
|(22,[0,1,2,6,8,9,10,11,17,20,21],[3.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,3.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,11,17,20,21],[3.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,2.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,12,17,20,21],[3.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,3.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,17,20,21],[3.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,2.0,1.0])              |0.0  |
|(22,[0,1,2,6,8,9,10,11,12,17,20,21],[3.0,2.0,4.0,1.0,4.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0])|0.0  |
|(22,[0,1,2,6,8,9,10,11,12,17,20,21],[3.0,2.0,4.0,1.0,4.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0])|0.0  |
|(22,[0,1,2,6,8,9,10,11,17,20,21],[3.0,2.0,4.0,1.0,4.0,1.0,1.0,1.0,1.0,3.0,1.0])       |0.0  |
|(22,[0,1,2,6,8,9,10,11,17,20,21],[3.0,2.0,4.0,1.0,4.0,1.0,1.0,1.0,1.0,2.0,1.0])       |0.0  |
+--------------------------------------------------------------------------------------+-----+
only showing top 20 rows
