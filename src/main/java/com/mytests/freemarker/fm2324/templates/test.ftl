<#ftl output_format='HTML' auto_esc=true>
<#-- @ftlvariable name="javanames" type="java.util.Map" -->

<#-- @ftlvariable name="today" type="java.util.Date" -->

<@macro0 "text1 & text2 -> text3"?no_esc />
<@macro0 "text1: <p>text2</p>"?no_esc />
<@macro0 user?no_esc />

<#macro macro0 snippet>
<div class="no_esc_test">
${snippet}
</div>
</#macro>

<#assign markupOutput1="<b>Test</b>"?no_esc>
<#assign markupOutput2="Foo & bar"?esc>

As expected:
${markupOutput1}
${markupOutput2}

Possibly unintended double escaping:
${markupOutput1?markup_string?upper_case}
${markupOutput2?is_markup_output?then('yes!','no!')}

${"<h1>"?no_esc+"Foo & bar"+"</h1>"?no_esc}

<#assign mo1 = "Foo's bar {}"?esc>
HTML: ${mo1}
XML:  <#outputformat "XML">${.output_format}:${mo1}</#outputformat>
RTF:  <#outputformat 'RTF'>${.auto_esc?c}; ${.output_format}:{mo1}</#outputformat>



${.incompatible_improvements}

<#assign now = .now>
<#assign nowDate = now?date>
<#assign nowTime = now?time>

<#assign todayDateTime = today?datetime>
<#assign todayDate = today?date>
<#assign todayTime = today?time>

<#assign stringDateTime = "Jun 28, 2016 6:33:31 PM">
<#assign stringDate = stringDateTime?date()>
<#assign stringTime = "6::33::31"?time['hh::mm::ss']>
<#assign stringTime1 = "6::33::31"?time('hh::mm::ss')>

<#assign birthday = "1996-02-12"?date['xs']>
<#assign birthday1 = "1996-02-12"?date('xs')>
<#assign birthtime = "04:20:30"?time.xs>
<#assign dateofbirth = "19960212T042030"?datetime.iso>

${now}; ${nowDate}; ${nowTime}
${todayDateTime}; ${todayDate}; ${todayTime}
${stringDateTime}; ${stringDate}; ${stringTime}
${birthday}; ${birthtime}; ${dateofbirth}

Standard decimal format: ${25001.5?string(",000")}
Standard decimal format: ${30551.4?string[",000"]}
Extended decimal format: ${1542791.5?string(",000;; roundingMode=halfUp ")}


<#assign myNumber=46.5>
${myNumber}
${myNumber?string}
${myNumber?string.number}
${myNumber?string.currency}
${myNumber?string.percent}
${myNumber?string.computer}

<#-- for 2.3.25 -->
<#--
<#list jvn as jvn_key, jvn_val>
    ${jvn_key}: ${jvn_val}
</#list>-->

<#assign myHash = { "name": "mouse", "price": 50 }>
<#list myHash?keys as k>
${k}
</#list>

<#list javanames?keys as jk>
${jk}
</#list>
<#list javanames?values as jv>
${jv}
</#list>

<#assign mapPlus={1:2} + {3:4} + {5:6}>
<#list mapPlus?keys as kk>
${kk}
</#list>

<#assign seq=["1"] + ["2", "3"]>
<#list seq as elem>
${elem}
</#list>