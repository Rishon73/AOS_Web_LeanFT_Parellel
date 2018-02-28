<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AOSWebAppModel</className>
    <objects>
        <object type="Link" technology="Web">
            <name>MICE Shop Now </name>
            <codeName>MICEShopNowLink</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">MICE Shop Now </property>
                    <property name="TagName" type="string" isRegExp="false">DIV</property>
                </properties>
            </identification>
        </object>
        <object type="Image" technology="Web">
            <name>fetchImage?image_id=5600</name>
            <codeName>FetchImageImageId5600Image</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="Alt" type="string" isRegExp="false"></property>
                    <property name="TagName" type="string" isRegExp="false">IMG</property>
                    <property name="Type" type="enum" isRegExp="false">Normal</property>
                </properties>
                <index>8</index>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>WebElement</name>
            <codeName>WebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ClassName" type="string" isRegExp="false">plus</property>
                    <property name="InnerText" type="string" isRegExp="false"></property>
                    <property name="TagName" type="string" isRegExp="false">DIV</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>save_to_cart</name>
            <codeName>SaveToCartButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="false">ADD TO CART</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>check_out_btn</name>
            <codeName>CheckOutBtnButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="true">CHECKOUT  (.*)</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
