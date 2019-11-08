package com.waiqin365.firstdemo.sometest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/15 19:44
 */
public class Single7Test {
    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) throws IOException {
//        Thread t1 = new Thread(new PrintNum());
//        Thread t2 = new Thread(new PrintNum());
//        t1.start();
//        t2.start();
//        LockSupport.park();
//        ThreadLocal<String> threadLocal = new ThreadLocal<>();
//        threadLocal.set("123");
//        System.out.println(threadLocal.get());
//        ThreadLocal<String> threadLocal1 = new ThreadLocal<>();
//        threadLocal1.set("456");
//        System.out.println(threadLocal1.get());
//        System.out.println(threadLocal.get());
//        Socket socket = new Socket();
//        int i = 5;
//        AtomicInteger atomicInteger = new AtomicInteger(i);
//        boolean flag = atomicInteger.compareAndSet(i,i+1);
//        System.out.println(flag);
//        System.out.println(atomicInteger);
//        String str = "ASSET_TYPE_CODE";
//        String humpStr = toHumpName(str);
//        System.out.println(humpStr);
//        File file = new File("http://accessory.waiqin365.com/5573910734985033605/customer_contract_pdf/2019-10/04b67932181f4e008b84f4ea8c095424.pdf");
//        System.out.println(file.getName().substring(0, file.getName().lastIndexOf(".")));
//        AbstractApplicationContext applicationContext = new AbstractApplicationContext() {
//            @Override
//            protected void refreshBeanFactory() throws BeansException, IllegalStateException {
//
//            }
//
//            @Override
//            protected void closeBeanFactory() {
//
//            }
//
//            @Override
//            public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
//                return null;
//            }
//        };
//        applicationContext.getBean("");
//        DefaultListableBeanFactory defaultListableBeanFactory;
//        XmlBeanDefinitionReader xmlBeanDefinitionReader;
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/spring-test.xml"));
//        String a = (String) beanFactory.getBean("123");
//        URLConnection u = new URLStreamHandler() {
//            @Override
//            protected URLConnection openConnection(URL u) throws IOException {
//                return u.openConnection();
//            }
//        }.openConnection(new URL("ww.baidu.com"));
//        u.getInputStream();
//        BeanFactoryAware beanFactoryAware = beanFactory1 -> {
//
//        };
//        Student student = new Student();
//        student.setName("cynic");
//        goSetMethod(student);
//        System.out.println(student.getName());
//        goParameterNotNull(null, "ste");
//        System.out.println(false);
//        Student student = new Student();
//        student.setName("cynic");
//        Student student2 = student;
//        student2.setName("Giilla");
//        System.out.println(student.getName());
    }

    static class PrintNum implements Runnable {

        @Override
        public void run() {
            try {
                reentrantLock.lock();
                System.out.println("====in lock====");
                System.out.println("print num");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
                System.out.println("====out lock====");
            }

        }
    }

    //下划线命名转驼峰
    private static String toHumpName(String str) {
        str = str.toLowerCase();
        final StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile("_(\\w)");
        Matcher m = p.matcher(str);
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        m.appendTail(sb);
        return sb.toString();
    }

    private static void goSetMethod(Student student) {
        student.setName("Giiallo");
    }

    private static void goParameterNotNull(String c, String v) {
        System.out.println(c);
        System.out.println(v);
    }
}
