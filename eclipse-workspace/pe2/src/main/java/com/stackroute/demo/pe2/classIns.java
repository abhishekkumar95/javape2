package com.stackroute.demo.pe2;

public class classIns {
	public String classIns() 
    {
        class classInstest
        {
            String name;
            int age;
            double salary;
            String classIns()
            {
                this.age=30;
                this.name="Harry Potter";
                this.salary=2500.3;    
                return ((name+" "+age+" "+salary));
            
            }
        }
        classInstest obj=new classInstest();
        return obj.classIns();
    }
}

