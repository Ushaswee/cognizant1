package com;

	public class Circle extends Shape
	{
		int radius;
		final float c=(float) 3.14;

		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", shapeId=" + shapeId + ", toString()=" + super.toString()
					+ ", getShapeId()=" + getShapeId() + ", getShapeName()=" + getShapeName() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}

		public Circle(int shapeId, String shapeName, int radius) {
			super(shapeId, shapeName);
			this.radius = radius;
		}

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		 double Area() {
			
			return super.Area()*c*radius*radius;
		}
	

}
