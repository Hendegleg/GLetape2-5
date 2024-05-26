package controllerjava;

import java.util.Map;

public class Event {
 private String type;
 private Map<String, String> data;

 public Event(String type, Map<String, String> data) {
     this.type = type;
     this.data = data;
 }

 public String getType() {
     return type;
 }

 public Map<String, String> getData() {
     return data;
 }
}
