package Restaurant;

public class ListNode // Сама конструкция, которая будет реализовывать двухсвязанный список позиций в заказе
{
    ListNode next; // Ссылка на следующий элемент в структуре данных
    ListNode previous; // Ссылка на предыдущий элемент в структуре данных
    MenuItem item; // Сам тип того, что мы сохраняем в структуре данных
    ListNode(MenuItem item)
    {
        this.item = item;
    }
}
