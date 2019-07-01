import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class desginMode {
	
	public static void main(String[] args) {
        System.out.println("Desgin Mode -- Observer");
        
        MySubject mySubject = new MySubject();
        
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        ObserverC observerC = new ObserverC();
        
        mySubject.addObserver(observerA);
        mySubject.addObserver(observerB);
        mySubject.addObserver(observerC);
        
        mySubject.notifyObserver();
    }

	public static class Subject{
		
		private List allObservers;
		
		public void addObserver(Observer observer) {
			allObservers.add(observer);
		}
		
		public void deleteObserver(Observer observer){
			allObservers.remove(observer);
		}
		
		public void notifyObserver(){
			
		}
	}
	
	public static class Observer{
		
		public void update(){
			
		}
	}

	public static class ObserverA extends Observer{
		public void update(){
			System.out.println("ObserverA update.");
		}
	}

	public static class ObserverB extends Observer{
		public void update(){
			System.out.println("ObserverB update.");
		}
	}
	
	public static class ObserverC extends Observer{
		public void update(){
			System.out.println("ObserverC update.");
		}
	}

	public static class MySubject extends Subject{
		private List allObservers;

		MySubject(){
			allObservers = new ArrayList();
		}
		
		public void addObserver(Observer observer) {
			allObservers.add(observer);
		}
		
		public void deleteObserver(Observer observer){
			allObservers.remove(observer);
		}

		public void notifyObserver(){
			for(Iterator i = allObservers.iterator();i.hasNext(); ){ 
				Observer observer = (Observer)i.next();
				observer.update();
			}
		}
	}
	
}

