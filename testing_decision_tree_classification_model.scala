scala

val prediction = model.transform(testing)
val predicted = prediction.select("features", "prediction", "trueLabel")
predicted.show()

Output:

+--------------------+----------+---------+
|            features|prediction|trueLabel|
+--------------------+----------+---------+
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
|(22,[0,1,2,6,8,9,...|       0.0|      0.0|
+--------------------+----------+---------+      
