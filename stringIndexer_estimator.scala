%scala

import org.apache.spark.ml.attribute.Attribute
import org.apache.spark.ml.feature.{IndexToString, StringIndexer}
import org.apache.spark.ml.{Pipeline, PipelineModel}

val indexers = StringfeatureCol.map { colName =>
  new StringIndexer().setInputCol(colName).setOutputCol(colName + "_indexed")
}

val pipeline = new Pipeline()
                    .setStages(indexers)      

val mushroomDF = pipeline.fit(mushroom).transform(mushroom)
