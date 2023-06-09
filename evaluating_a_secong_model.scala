%scala

val evaluator = new MulticlassClassificationEvaluator()
  .setLabelCol("trueLabel")
  .setPredictionCol("prediction")
  .setMetricName("accuracy")
val accuracy = evaluator.evaluate(prediction)

Output:

evaluator: org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator = MulticlassClassificationEvaluator: uid=mcEval_1f7de9484e84, metricName=accuracy, metricLabel=0.0, beta=1.0, eps=1.0E-15
accuracy: Double = 0.9983518747424804
