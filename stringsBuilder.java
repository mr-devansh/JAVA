public class stringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("devansh singh");
        System.out.println("Original string: "+sb);
        // get element
        System.out.println("first element: "+sb.charAt(0)); 
        // update element 
        sb.setCharAt(0, 'p');
        System.out.println("after replacing index 0 element with 'p': "+ sb);
        // set element 
        sb.insert(0, 'Z');
        System.out.println("after inserting at index 0 with 'z': "+ sb);
        // delete element 
        sb.delete(0, 2);
        System.out.println("after deletion of first two indeces: "+ sb);
        // append element 
        sb.append('y');
        System.out.println("after appending 'y' at the end: "+ sb);
        // length of String Builder 
        System.out.println("Length: "+sb.length());
    }
}
