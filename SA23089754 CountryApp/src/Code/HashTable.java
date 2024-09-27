/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class HashTable {
    
    private Country[] hashArray;
    private int arraySize;
    private int count;

    //constructor
    public HashTable(int arraySize){
        this.arraySize = arraySize;
        hashArray = new Country[arraySize];
    }
    
    // Hash function
    private int hashFunction(int key){
        return key % arraySize;
    }
    
    
    public void insert(Country country) {
        int key = country.getM49code();
        int hashValue = hashFunction(key);
        
        while (hashArray[hashValue] != null) {
            hashValue ++;
            hashValue %= arraySize;
        }

        hashArray[hashValue] = country;
        count++;
    }
    
 
    public Country delete(int key) {
        int hashVal = hashFunction(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getM49code() == key) {
                Country temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                count--;
                return temp;
            }
            hashVal++;
            hashVal %= arraySize;
        }
        return null;
    }

   
    public Country find(int key) {
        int hashVal = hashFunction(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getM49code() == key) {
                return hashArray[hashVal];
            }
            hashVal++;
            hashVal %= arraySize;
        }
        return null;
    }

}
