package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageProvider provider = MessageSupportFactory.getInstance().getProvider();
        MessageRenderer renderer = MessageSupportFactory.getInstance().getRenderer();

        renderer.setMessageProvider(provider);
        renderer.render();
    }

    //    public static void main(String args[]) throws IOException {
//        Properties prop = readPropertiesFile("src/com/apress/prospring5/ch2/deucopled/credentials.properties");
//        System.out.println("username: "+ prop.getProperty("username"));
//        System.out.println("password: "+ prop.getProperty("password"));
//    }
//    public static Properties readPropertiesFile(String fileName) throws IOException {
//        FileInputStream fis = null;
//        Properties prop = null;
//        try {
//            fis = new FileInputStream(fileName);
//            prop = new Properties();
//            prop.load(fis);
//        } catch(FileNotFoundException fnfe) {
//            fnfe.printStackTrace();
//        } catch(IOException ioe) {
//            ioe.printStackTrace();
//        } finally {
//            fis.close();
//        }
//        return prop;
//    }
}
