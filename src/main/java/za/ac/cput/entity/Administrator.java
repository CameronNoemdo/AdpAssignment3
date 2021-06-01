package za.ac.cput.entity;

/** Author: Cameron Noemdo
 *  Student number: 219115443
 *  Administrator entity to login and review trainer qualifications
 */

public class Administrator
{
    private int employeeID;
    private String displayInfo, name, gender, phoneNumber, email;

    private Administrator(Builder build)
    {
        this.employeeID= build.employeeID;
        this.displayInfo= build.displayInfo;
        this.name= build.name;
        this.gender= build.gender;
        this.phoneNumber= build.phoneNumber;
        this.email= build.email;
    }

    public static class Builder
    {
        private int employeeID;
        private String displayInfo, name, gender, phoneNumber, email;

        public Builder setEmployeeID(int employeeID)
        {
            this.employeeID = employeeID;
            return this;
        }

        public Builder setDisplayInfo(String displayInfo)
        {
            this.displayInfo = displayInfo;
            return this;
        }

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender)
        {
            this.gender = gender;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email)
        {
            this.email = email;
            return this;
        }

        public Administrator build()
        {
            return new Administrator(this);
        }

        public Builder copy (Administrator admin)
        {
            this.employeeID= admin.employeeID;
            this.displayInfo= admin.displayInfo;
            this.name= admin.name;
            this.gender= admin.gender;
            this.phoneNumber= admin.phoneNumber;
            this.email= admin.email;

            return this;
        }
    }

    public boolean reviewQualification()
    {
        boolean qualification;
        if (qualification = true)
        {
            return true;
        }
        return false;
    }

    public boolean login()
    {
        return true;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "employeeID=" + employeeID +
                ", displayInfo='" + displayInfo + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
