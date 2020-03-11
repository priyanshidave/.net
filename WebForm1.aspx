<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        </div>
        <asp:Xml ID="Xml1" runat="server" DocumentSource="~/ProductList.xml" TransformSource="~/ProductListXSLT.xslt"></asp:Xml>
    </form>
</body>
</html>
