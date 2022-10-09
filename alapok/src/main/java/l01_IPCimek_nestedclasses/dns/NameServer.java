package l01_IPCimek_nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> dnsEntriesList=new ArrayList<>();

    public void addEntry(String hostName, String hostIp){
        if(validate(hostName,hostIp)){
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntriesList.add(new DnsEntry(hostIp,hostName));
    }

    private boolean validate(String hostName, String hostIp) {
        return (nameIsInTheList(hostName)||ipIsInTheList(hostIp));
    }

    private boolean nameIsInTheList(String hostName) {
        if(hostName==null||hostName.isEmpty()){
            throw new IllegalArgumentException("No hostname was provided!");
        }
        for(DnsEntry dnsEntry:dnsEntriesList){
            if(hostName.equals(dnsEntry.dnsName)){
                return true;
            }
        }
        return false;
    }

    private boolean ipIsInTheList(String ip) {
        if(ip==null||ip.isEmpty()){
            throw new IllegalArgumentException("No IP was provided!");
        }
        for(DnsEntry dnsEntry:dnsEntriesList){
            if(ip.equals(dnsEntry.IP)){
                return true;
            }
        }
        return false;
    }

    public void removeEntryByName(String nameToRemove){
        if(nameToRemove==null||nameToRemove.isEmpty()){
            throw new IllegalArgumentException("No hostname was provided!");
        }
        dnsEntriesList.remove(getElementByName(nameToRemove));
    }

    public void removeEntryByIp(String ipToRemove){
        if(ipToRemove==null||ipToRemove.isEmpty()){
            throw new IllegalArgumentException("No IP was provided!");
        }
        dnsEntriesList.remove(getElementByIp(ipToRemove));
    }

    public DnsEntry getElementByName(String nameToFind){
        if(nameToFind==null||nameToFind.isEmpty()){
            throw new IllegalArgumentException("No hostname was provided!");
        }
        for(DnsEntry dnsEntry:dnsEntriesList){
            if(nameToFind.equals(dnsEntry.dnsName)){
                return dnsEntry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
    public DnsEntry getElementByIp(String ipToFind){
        if(ipToFind==null||ipToFind.isEmpty()){
            throw new IllegalArgumentException("No IP was provided!");
        }
        for(DnsEntry dnsEntry:dnsEntriesList){
            if(ipToFind.equals(dnsEntry.IP)){
                return dnsEntry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getIpByName(String nameToFind){
        if(nameToFind==null||nameToFind.isEmpty()){
            throw new IllegalArgumentException("No hostname was provided!");
        }
        return getElementByName(nameToFind).IP;
    }

    public String getNameByIp(String ipToFind){
        if(ipToFind==null||ipToFind.isEmpty()){
            throw new IllegalArgumentException("No IP was provided!");
        }
        return getElementByIp(ipToFind).dnsName;

    }

    private static class DnsEntry {
        private String IP;
        private String dnsName;

        public DnsEntry(String IP, String dnsName) {
            this.IP = IP;
            this.dnsName = dnsName;
        }
    }
}
