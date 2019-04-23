<#import "parts/common.ftl" as c>

<@c.page>
    FAQ editor

    <form action="/faqAdmin" method="post">
        <input type="text" value="${faq.question_faq}" name="question_faq">
        <input type="text" value="${faq.answer_faq}" name="answer_faq">
        <input type="hidden" value="${faq.id_faq}" name="id_faq">
        <button type="submit">Save</button>
    </form>
</@c.page>