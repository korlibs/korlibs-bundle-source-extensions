package com.soywiz.korma.geom

import com.soywiz.korma.geom.*

val IRectangleInt.topLeft get() = PointInt(left, top)
val IRectangleInt.topRight get() = PointInt(right, top)
val IRectangleInt.bottomLeft get() = PointInt(left, bottom)
val IRectangleInt.bottomRight get() = PointInt(right, bottom)

val IRectangleInt.x2: Int get() = x + width - 1
val IRectangleInt.y2: Int get() = y + height - 1

val IRectangleInt.topLeft2 get() = PointInt(x, y)
val IRectangleInt.topRight2 get() = PointInt(x2, y)
val IRectangleInt.bottomLeft2 get() = PointInt(x, y2)
val IRectangleInt.bottomRight2 get() = PointInt(x2, y2)

