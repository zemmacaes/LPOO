public abstract class Act
{
    private String name, country;

    public Act(String name, String country)
    {
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            return false;

        Act a = (Act) o;

        return this.getName().equals(a.getName()) && this.getCountry().equals(a.getCountry());
    }
}
