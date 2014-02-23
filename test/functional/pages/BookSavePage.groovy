package pages

/**
 * Created with IntelliJ IDEA.
 * User: dyego
 * Date: 23/02/14
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */

class BookSavePage extends FormPage {
    static url = "book/save"

    static at = {
        //GetPageTitle gp = new GetPageTitle()
        title ==~ /Livro Listagem/
    }

    static content = {
        flashmessage {
            $("div", class: "message", role: "status")
        }
    }
}
