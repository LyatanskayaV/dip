<#import "parts/common.ftl" as c>

<@c.page>
    List of FAQs

    <table>
        <thead>
        <tr>
            <th>Question</th>
            <th>Answer</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <#list faqs as faq>
            <tr>
                <td>${faq.question_faq}</td>
                <td>${faq.answer_faq}</td>
                <td><a href="/faqAdmin/${faq.id_faq}">edit</a></td>
            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>