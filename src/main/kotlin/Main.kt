fun main(args: Array<String>) {
    val page = page {
        number = 1
        pageBlocks {
            headerBlock("Хедер блок")
            pageBlock {
                content = "Текст статьи"
            }
            pageBlock {
                content = "Еще один текст статьи"
            }

        }
    }

    println(page)
}