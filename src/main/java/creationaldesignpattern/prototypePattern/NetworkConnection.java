package creationaldesignpattern.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable
{
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public NetworkConnection()
    {

    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public String getImportantData()
    {
        return importantData;
    }

    public void setImportantData(String importantData)
    {
        this.importantData = importantData;
    }

    public List<String> getDomains()
    {
        return domains;
    }

    public void setDomains(List<String> domains)
    {
        this.domains = domains;
    }

    public void loadVeryImportantData() throws InterruptedException
    {
        this.importantData = "Very very important data";
        domains.add("www.aitag.com");
        domains.add("www.deeptech.com");
        domains.add("www.deepdive.com");
        domains.add("www.google.com");
        domains.add("www.awshelium.com");
        Thread.sleep(5000);
        // it will take 5 minutes
    }

    @Override
    public String toString()
    {
        return this.ip + " : " + this.importantData + " : " + this.domains;
    }

    @Override
    public NetworkConnection clone() throws CloneNotSupportedException
    {
        // Custom logic for cloning deepcopy
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for(String domain:this.getDomains())
        {
            networkConnection.getDomains().add(domain);
        }
        return networkConnection;
    }
}
