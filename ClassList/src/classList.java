Map<String,String> classList = new HashMap<String,String>();
public ClassGrades(){
      classList.put("Bob","A");
classList.put("Mary","C");
classList.put("Sarah","B");
classList.put("Philip","A");
classList.put("Greg","F");
}

public void printClassList(){
Iterator<Entry<String>> entries = classList.entrySet().iterato();
while (entries.hasNext()){
Entry<String, String> entry = entries.next();
System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
}

public void printClassList2(){
for (Map.Entry<String, String> entry : classList.entrySet()) {
System.out.println("Key = " + entry.getkey() + ", Value = " + entry.getValue());
}

//iterating overkeys only
for (String key : classList.keySet()) {
System.out.println("Key = " + key);
}

//iterating over values only
for (String value : classList.values()) {
System.out.println("Value = " + value);
}
}

public static void main(String[] args){
ClassGrades myClassList = new ClassGrades();
myClassList.printClssList();
