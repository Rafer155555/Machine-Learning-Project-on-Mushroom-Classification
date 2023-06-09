%scala

import org.apache.spark.ml.evaluation.BinaryClassificationEvaluator

val evaluator = new BinaryClassificationEvaluator().setLabelCol("trueLabel").setRawPredictionCol("rawPrediction").setMetricName("areaUnderROC")
val auc = evaluator.evaluate(prediction)
println("AUC = " + (auc))

Output:

AUC = 0.9739827185870374
import org.apache.spark.ml.evaluation.BinaryClassificationEvaluator
evaluator: org.apache.spark.ml.evaluation.BinaryClassificationEvaluator = BinaryClassificationEvaluator: uid=binEval_7c586b29a6e6, metricName=areaUnderROC, numBins=1000
auc: Double = 0.9739827185870374
