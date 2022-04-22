package Mouiad;

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

public class Main {
    public static void main(String [] args){
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
        var dirtSevice = new DirectionService();
        dirtSevice.setService(new EstimateOne());
        dirtSevice.calculatingTime();
        dirtSevice.getDirection();
        dirtSevice.setService(new EstimateThree());
        dirtSevice.calculatingTime();
        dirtSevice.getDirection();
    }
//    public static TaxCalculater getCalculater(){
//        return new TaxCalculater2019();
//    }
//    public static void drawUIControl(UIControl control){
//        control.draw();
//    }

}
