class PageGenerator {
    fun generate() =
        page {
            number = 1
            pageBlocks {
                headerBlock("This is header")
                pageBlock {
                    content = "Текст статьи"
                }
                pageBlock {
                    content = "Текст статьи 2"
                }
            }
        }
}
