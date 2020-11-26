package live.dounine.study;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/***
 * @project EmailUtil
 * @class PropertyUtil
 * @author douNine
 * @date 2019/11/3 10:51
 * @description �����ļ���������
 */
public class PropertyUtil {
    private static PropertyUtil singleton = null; // ȫ�־�̬����
    private Properties properties; // �����ļ�����

    /**
     * ��ȡ��������
     * @return PropertyManager����
     * @throws IOException
     */
    public static PropertyUtil getSingleton() throws IOException {
        if (singleton == null) {
            return singleton = new PropertyUtil();
        }
        else {
            return singleton;
        }
    }

    /**
     * ����ģʽ�µ�˽�й��캯��
     * @throws IOException
     */
    private PropertyUtil() throws IOException {
        InputStream inputStream = EmailUtil.class.getClassLoader().getResourceAsStream("config.properties");
        properties = new Properties();
        properties.load(inputStream);
    }

    /**
     * ��ȡ�����ļ��У�key��Ӧ��valueֵ
     * @param key String
     * @return value�ַ���
     */
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}
