package one_test.four.cache;

import one_test.four.contact.Prototype;
import java.util.Hashtable;

public class Cache<T extends Prototype<T>> {
        private static final Hashtable<String, Prototype<?>> CACHE_MAP = new Hashtable<>();

        public static  <T extends Prototype<T>> void addPrototype(T prototype){
            if (prototype != null && prototype.getId() != null){
                if (!CACHE_MAP.containsKey(prototype.getId())){
                    CACHE_MAP.put(prototype.getId(), prototype);
                }else{
                    throw new IllegalArgumentException("Prototype with id " + prototype.getId() + " already exists.");
                }
            }
        }

        @SuppressWarnings("unchecked")
        public static <T extends Prototype<T>> T getPrototype(String id, Class<T> type){
            Prototype<?> prototype =CACHE_MAP.get(id);
            if (type.isInstance(prototype)){
                return (T) prototype.clone();
            }
            return null;
        }

        public static void clearAll(){
            CACHE_MAP.clear();
        }

        public static  void removePrototype(String id){
            CACHE_MAP.remove(id);
        }

        public static int size(){
            return CACHE_MAP.size();
        }

}
