import java.util.HashMap;
import java.util.Map;

public abstract class NativeDictionaryATD<T> {

    //конструктор
    //постусловие: создан новый ассоциативный массив
    public abstract NativeDictionaryATD<T> tNativeDictionaryATD();

    // команды
    //постусловие: в словарь добавлен новый элемент
    public abstract void put(String key, T value);

    // запросы

    //предусловие: такой ключ содержится в словаре
    //постуловие: возвращает значение принадлещее переданному ключу
    public abstract T get(String key);
    public abstract boolean isKey(String key); // содержится ли такой ключ в таблице
    public abstract int size(); // количество элементов в словаре

    public abstract int getGetStatus(); //успешно; такого ключа нет в словаре
}
