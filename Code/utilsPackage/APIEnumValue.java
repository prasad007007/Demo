package utilsPackage;

public enum APIEnumValue {
    addAPI("This is use for ADD API"),
    getAPI("This is use for GET API"),
    updateAPI("This is use for UPDATE API"),
    deleteAPI("This is use for DELETE API");
    String Resource;

    APIEnumValue(String resource) {
        Resource = resource;
    }

    public String getResource() {
        return Resource;
    }


}
