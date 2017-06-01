DDP API migrate steps

1. get wsdl
cd project root
cd modules/ddp_axis/src/main/java/com/google/api/ads/ddp/axis/
mkdir v201705
cd v201705
wget https://ddp.googleapis.com/api/ddp/provider/v201705/UserListService\?wsdl -O UserListService.wsdl
wget https://ddp.googleapis.com/api/ddp/dmp/v201705/DmpUserListService\?wsdl -O DmpUserListService.wsdl

2. generate java code from wsdl in IDEA(check "generate unreferenced elements")

3. update ddp-api.properties
cd project root
cd modules/ads_lib/src/main/java/com/google/api/ads/ddp/lib/conf/props

4. code
cd project root
cd examples/ddp_axis/src/main/java/ddp/axis/
mkdir v201705
copy v201609/* to v201705 in IDEA
replace 201609 with 201705 in the import part of Mutate

5. compile & test
cd project root
mvn install -Dmaven.test.skip=true
cd examples/ddp_axis
mvn -X compile
# mvn -X exec:java -Dexec.mainClass="ddp.axis.auth.GetRefreshToken" -Dhttps.proxyHost=localhost -Dhttps.proxyPort=8118
mvn exec:java -Dexec.mainClass="ddp.axis.v201705.dmpuserservice.Mutate" -Dexec.args=" -n test_only -d test_only" -Dhttps.proxyHost=localhost -Dhttps.proxyPort=8118
