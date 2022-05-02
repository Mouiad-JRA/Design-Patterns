package Mouiad;

import Mouiad.iterator.BrowseHistory;
import Mouiad.iterator.Iterator;
import Mouiad.iterator.Product;
import Mouiad.iterator.ProductCollection;
import Mouiad.memento.DocHistory;
import Mouiad.memento.Document;
import Mouiad.memento.Editor;
import Mouiad.memento.History;
import Mouiad.state.BrushTool;
import Mouiad.state.Canves;
import Mouiad.state.EraseTool;
import Mouiad.state.SelectionTool;
import Mouiad.state.homework.DirectionService;
import Mouiad.state.homework.EstimateOne;
import Mouiad.state.homework.EstimateThree;
import Mouiad.state.homework.Services;
import Mouiad.strategy.*;
import Mouiad.template.TansferMoney;
import Mouiad.template.Task;
import Mouiad.template.homework.FirstWindow;

public class Main {
    public static void main(String[] args) {
//    var user = new User("Mosh");
//    user.sayHello();
//    TaxCalculater calculater = getCalculater();
//    System.out.println(calculater.calaulateTax());
//    var account = new Account();
//    account.desposit(150);
//    account.withdraw(35);
//    System.out.println(account.getBalance());
//    var mail = new MailService();
//    mail.sendEmail();
//    var textBox = new TextBox();
//    textBox.enable();
//    var checkBox = new CheckBox();
//    drawUIControl(textBox);
//    drawUIControl(checkBox);
//    var editor = new Editor();
//    var history = new History();
//    editor.setContent("Hi Watchman");
//    history.push(editor.createState());
//    editor.setContent("Hello Guys");
//    history.push(editor.createState());
//    editor.setContent("what are you working on?");
//    editor.restore(history.pop());
//    editor.restore(history.pop());
//    System.out.println(editor.getContent());
//        var doc = new Document();
//        var his = new DocHistory();
//        doc.setContent("Word 2022");
//        doc.setFontName("Time New Roman");
//        doc.setFontSize(16);
//        his.push(doc.createState());
//        doc.setContent("Word 2021");
//        doc.setFontName("Simple");
//        doc.setFontSize(14);
//        his.push(doc.createState());
//        doc.setContent("Word 2019");
//        doc.setFontName("Console");
//        doc.setFontSize(16);
//        doc.reset(his.pop());
//        doc.reset(his.pop());
//        System.out.println(doc.getContent()+" "+doc.getFontName()+ " "+doc.getFontSize());
//        var canves = new Canves();
//        canves.setCurrentTool(new SelectionTool());
//        canves.mouseDown();
//        canves.mouseUp();
//        canves.setCurrentTool(new BrushTool());
//        canves.mouseDown();
//        canves.mouseUp();
//
//        canves.setCurrentTool(new EraseTool());
//        canves.mouseDown();
//        canves.mouseUp();
//        var dirtSevice = new DirectionService();
//        dirtSevice.setService(new EstimateOne());
//        dirtSevice.calculatingTime();
//        dirtSevice.getDirection();
//        dirtSevice.setService(new EstimateThree());
//        dirtSevice.calculatingTime();
//        dirtSevice.getDirection();
//        var browseHistory = new BrowseHistory();
//        browseHistory.push("onme.ma");
//        browseHistory.push("onme12.ma");


//        Iterator iterator = browseHistory.creatIterator();
//        Product productOne = new Product("mobile", 50, 56);
//        Product productTwo = new Product("PC", 150, 100);
//        Product productThree = new Product("Laptop", 200, 80);
//        ProductCollection productCollection = new ProductCollection();
//        productCollection.push(productOne);
//        productCollection.push(productTwo);
//        productCollection.push(productThree);
//
//        var iterator = productCollection.creatIterator();
//        // TODO : print all the product fields
//        while (iterator.hasNext()){
//            var product = iterator.current();
//            System.out.println(product);
//            iterator.next();
//        }
//        var imageStorge = new ImageStorage();
//        imageStorge.store("a", new JepgCompresser(), new HighFilter());

//        var chatEncrypt = new ChatClient();
//        chatEncrypt.send("a", new TypeOneEncrypt());
        var task = new FirstWindow();
        task.close();
    }
//    public static TaxCalculater getCalculater(){
//        return new TaxCalculater2019();
//    }
//    public static void drawUIControl(UIControl control){
//        control.draw();
//    }

}
