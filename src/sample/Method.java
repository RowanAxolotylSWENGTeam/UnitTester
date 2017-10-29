package sample;

/**
 * Stores necessary data of one method for easy transfer.
 *
 * @author Axolotl Development Team
 */
public class Method {

    /*
     * className - The name of the class that this method belongs to.
     * returnType - The name of the data type that this method returns.
     * paramTypes - The data types of the method's parameters.
     */
    private String className, returnType;
    private String[] paramTypes;

    /**
     * Creates a new Method object.
     *
     * @param className  The name of the class this method belongs to.
     * @param returnType The return type of the method.
     * @param paramTypes The types of the method's parameters.
     */
    Method(String className, String returnType, String[] paramTypes) {
        this.className = className;
        this.returnType = returnType;
        // Copies the values of the array
        this.paramTypes = new String[paramTypes.length];
        System.arraycopy(paramTypes, 0, this.paramTypes, 0, this.paramTypes.length);
    }

    public String getClassName() {
        return className;
    }

    public String getReturnType() {
        return returnType;
    }

    public String[] getParamTypes() {
        String[] copy = new String[paramTypes.length];
        System.arraycopy(paramTypes, 0, copy, 0, copy.length);
        return copy;
    }
}