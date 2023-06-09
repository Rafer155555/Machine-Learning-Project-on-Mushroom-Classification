%scala

import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

val dt = new DecisionTreeClassifier().setLabelCol("label").setFeaturesCol("features")

val model = dt.fit(training)

println("Model Trained!")
