package ca.pfv.spmf.algorithms.clustering.distanceFunctions;

import ca.pfv.spmf.patterns.cluster.DoubleArray;

public class MiguelEuclidian extends DistanceFunction{
	static String NAME = "mikeEuclidian";

	public double calculateDistance(DoubleArray vector1, DoubleArray vector2) {
		double sum = 0;	
		for(int i=0; i< vector1.data.length; i++){
			sum += Math.pow(vector1.data[i] - vector2.data[i], 2);
		}
		return Math.sqrt(sum);
	}

	@Override
	public String getName() {
		return NAME;
	}
}
