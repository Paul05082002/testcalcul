package model;
import java.util.List;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	public String accu;
	public List<Double> tab;
	public void add() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n1+n2);
	}
	public void substract() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n2-n1);
	}
	public void multiply() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n1*n2);
	}
	public void divide() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n2/n1);
	}
	public void opposite() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(-n1);
	}
	public void push() {
		// TODO Auto-generated method stub
		accu="";
		tab.add(Double.parseDouble(accu));
	}
	public void pop() {
		// TODO Auto-generated method stub
		tab.get(tab.size()-1);
	}
	public void drop() {
		// TODO Auto-generated method stub
		tab.remove(tab.size()-1);
	}
	public void swap() {
		// TODO Auto-generated method stub
		Double n1 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		Double n2 = tab.get(tab.size()-1);
		tab.remove(tab.size()-1);
		tab.add(n1);
		tab.add(n2);
	}
	public void clear() {
		// TODO Auto-generated method stub
		tab.clear();
	}

}
