// http://codingbat.com/java/Map-1

// Problem 1 

public Map<String, String> mapBully(Map<String, String> map) {
  
  if(map.containsKey("a")) {
      map.put("b",map.get("a"));
      map.put("a","");
    }
  
  return map;
}
  


// Problem 2

public Map<String, String> mapShare(Map<String, String> map) {
    if(map.containsKey("a")) {
      map.put("b",map.get("a"));
    }
    map.remove("c");
  return map;
}

// Problem 3

public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")) {
      map.put("ab",(map.get("a")+map.get("b")));
  }
  return map;
}

// Problem 4

public Map<String, String> topping1(Map<String, String> map) {
   if(map.containsKey("ice cream")) {
      map.put("ice cream","cherry");
   }
   if(map.containsKey("bread")) {
     map.put("bread","butter");
   }else {
     map.put("bread","butter");
   }
   
   return map;
}


// Problem 5

public Map<String, String> topping2(Map<String, String> map) {
  String temp ="";
  if(map.containsKey("ice cream")) {
      temp = map.get("ice cream");
      map.put("yogurt",temp);
  }
  if (map.containsKey("spinach")) {
      map.put("spinach","nuts");
  }
  return map;
}


// Problem 6

public Map<String, String> topping3(Map<String, String> map) {
  if(map.containsKey("potato")) {
    map.put("fries",map.get("potato"));
  }
  if(map.containsKey("salad")) {
    map.put("spinach",map.get("salad"));
  }
  return map;
}
