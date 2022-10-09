package f03_Filename_URL_stringmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URLManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;
    private String URL;
    private List<KeyAndValue> keyAndValuesList = new ArrayList<>();

    public URLManager(String URL) {
        this.URL = URL;
    }
    public String getProperty(String key){
        int i=0;
        while(i<keyAndValuesList.size()){
            if(key.equals(keyAndValuesList.get(i).getKey())){
                return keyAndValuesList.get(i).getValue();
            }
            i++;
        }
        return "";
    }
    public boolean hasProperty(String key){
        int i=0;
        while(i<keyAndValuesList.size()){
            if(key.equals(keyAndValuesList.get(i).getKey())){
                return true;
            }
            i++;
        }
        return false;
    }
    public void setQueriesList(String query) {
        String[] queryPairs=query.split("&");
        String[] keyValueStrings;
        KeyAndValue keyAndValue;
        for(String queryPair:queryPairs){
            keyValueStrings=queryPair.split("=");
            keyAndValue=new KeyAndValue(keyValueStrings[0],keyValueStrings[1]);
            keyAndValuesList.add(keyAndValue);
        }
    }
    public void setPath(String str) {
        int indexOfQuestionMark=str.indexOf("?");
        if(indexOfQuestionMark<0){
            path=str;
        }
        else{
            path=str.substring(0,indexOfQuestionMark);
            query=str.substring(indexOfQuestionMark+1);
            setQueriesList(query);
        }
    }
    public void setHostAndPort(String str) {
        int hostAndPortEndIndex=str.indexOf("/");
        String hostAndPort=str.substring(0,hostAndPortEndIndex);
        int indexOfColon=hostAndPort.indexOf(":");
        if(indexOfColon<0){
            host=hostAndPort;
        }
        else{
            host=hostAndPort.substring(0,indexOfColon);
            port=Integer.parseInt(hostAndPort.substring(indexOfColon+1));
        }
        setPath(str.substring(hostAndPortEndIndex+1));
    }

    public void setURLParts(){
        int protocolEndIndex=URL.indexOf("://");
        protocol=URL.substring(0,protocolEndIndex);
        setHostAndPort(URL.substring(protocolEndIndex+3));
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public List<KeyAndValue> getKeyAndValuesList() {
        return keyAndValuesList;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in an URL:");
        String URL=scanner.nextLine();
        URLManager urlManager=new URLManager(URL);
        urlManager.setURLParts();
        System.out.println();
        System.out.println("Protocol: "+urlManager.getProtocol());
        System.out.println("Host: "+urlManager.getHost());
        System.out.println("Port: "+urlManager.getPort());
        System.out.println("Path: "+urlManager.getPath());
        System.out.println();
        System.out.println("Query: "+urlManager.getQuery());
        System.out.println("KeyValueLists: "+urlManager.getKeyAndValuesList());
        System.out.println("Type in the first key to check:");
        String key1=scanner.nextLine();
        System.out.println(key1+": "+(urlManager.hasProperty(key1)?urlManager.getProperty(key1):"No key found."));
        System.out.println("Type in the second key to check:");
        String key2=scanner.nextLine();
        System.out.println(key2+": "+(urlManager.hasProperty(key2)?urlManager.getProperty(key2):"No key found."));

    }
}
