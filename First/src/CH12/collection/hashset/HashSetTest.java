package CH12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("임정가"));
		hashSet.add(new String("임정나"));
		hashSet.add(new String("임정다"));
		hashSet.add(new String("임정라"));
		
		System.out.println(hashSet);	
		}

	}
