package org.perscholas.java_collections.keychains;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * A KeyChain class that is a collection of Keys.
 * Each Key on a chain is unique.
 * When we encounter a Door, we can search the KeyChain for the right key to open that Door.
 */
public class KeyChain {

	private Set<Key> keys = new TreeSet<>(); // Using a Set to hold keys enforces uniqueness 
//	private HashMap<KeyShape, ArrayList<Key>> keys = new HashMap<>();
	
	/**
	 * Default constructor
	 */
	public KeyChain() {
		
	}
	
	/**
	 * Constructor that accepts a collection of Key objects
	 * @param keys A Collection of Key objects to add to this KeyChain
	 */
	public KeyChain(Collection<Key> keys) {
		this.keys.addAll(keys);
	}
	
	/**
	 * Returns how many keys are on the chain
	 * @return The number of Key objects on this KeyChain
	 */
	public int size() {
		return keys.size();
	}
	
	/**
	 * Adds a key to the chain
	 * @param key A Key object to add to this KeyChain
	 * @return true if the addition was successful
	 */
	public boolean add(Key key) {
		return keys.add(key);
	}
	
	/**
	 * Removes a key from the chain
	 * @param key A Key object to delete from this KeyChain
	 * @return true if the removal was successful
	 */
	public boolean remove(Key key) {
		return keys.remove(key);
	}
	
	/**
	 * Search for the right key to lock a Door
	 * @param door A Door object to lock
	 * @return true if locking was successful
	 */
	public boolean lock(Door door) {
		boolean isLocked = door.isLocked();
		// If the door is already locked
		if (isLocked) 
			return true;
		
		// If the door is not locked, then find a key to lock it.				
		Iterator<Key> it = keys.iterator();
		while (!isLocked && it.hasNext()) {
			isLocked = door.lock(it.next());
		}
		
		return isLocked;
	}
	
	/**
	 * Search for the right key to unlock a Door
	 * @param door A Door object to unlock
	 * @return true if unlocking was successful
	 */
	public boolean unlock(Door door) {
		boolean isUnlocked = !door.isLocked();
		// If the door is already unlocked
		if (isUnlocked) 
			return true;
		
		// If the door is locked, then find a key to unlock it.		
		Iterator<Key> it = keys.iterator();
		while (!isUnlocked && it.hasNext()) {
			isUnlocked = door.unlock(it.next());
		}
		
		return isUnlocked;
	}
	
}
