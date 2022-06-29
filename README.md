# sellingpartner-api-fba-shipment-sdk
> 亚马逊sp-api的发货sdk,发货到亚马逊fba仓库
> 
### 包含
- sp-api签名
- 认证
- feed
- inbound
- xml模板
- xsd文件
- xlsx模板
- 箱子尺寸重量等
- 枚举值

### 流程/步骤
1. 创建货件计划：createInboundShipmentPlan
2. 确认创建货件：createInboundShipment
3. 修改货件的运输信息：putTransportDetails
4. 上传箱子尺寸信息：枚举值为`POST_FLAT_FILE_FROM_EXCEL_FBA_CREATE_CARTON_INFO` ,type:`application/vnd.ms-excel`,**注意:此枚举值是隐藏值,亚马逊文档中找不到,这是特殊途径获取到的**
5. 上传亚马逊纸箱内容：POST_FBA_INBOUND_CARTON_CONTENTS
6. 打印标签：getLabels
7. 更改为发货(更改运单号会自动变为发货状态,这里还需要设置吗?)updateInboundShipment
8. 更改每个箱子的运单号：putTransportDetails
9. 重新上传excel尺寸重量,**注意:如果不再次上传尺寸重量,亚马逊后台里去看,会发现缺少尺寸重量信息**
10. 查询信息getShipmentItemsByShipmentId

### 其他
- 如果想使用sp-api的其他api,自己替换src/main/java/api/xxx ,签名或者认证信息完全可以共用
- 使用示例在src/test/**
