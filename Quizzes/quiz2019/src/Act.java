public abstract class Act {
    private String name;
    private String country;
    public Act(String name, String country){
        this.name = name;
        this.country = country;
    }
    public String getName(){ return name;}
    public  String getCountry(){return country;}
    @Override
    public boolean equals(Object obj) {
        return (this.getName() == ((Act)obj).getName()) && (this.getCountry() == ((Act)obj).getCountry());
    }
}
