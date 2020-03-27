#-*-coding:utf-8-*-
import requests
import json
import random
import time


def sendmessage(text,desp):
    url='https://sc.ftqq.com/***send' #这里替换成自己的id，可以支持推送
    r=requests.session()
    data={'text':text,'desp':desp}
    sf=r.post(url,data=data)
    print (sf.content)

headers={
'Host': 'mobileapp.apple.com',
'X-Apple-I-TimeZone': 'GMT+8',
'X-Apple-I-Locale': 'zh_CN',
'X-Apple-I-MD-RINFO': '17106176',
'X-MMe-Client-Info': '<iPhone10,2> <iPhone OS;13.1;17A844> <com.apple.AuthKit/1 (com.apple.store.Jolly/5.5.0.0480)>',
'X-MALang': 'zh-HK',
'Accept-Language': 'en-us',
'Accept-Encoding': 'gzip',
'X-Mme-Device-Id': '6847f2feb773616b6e0402c385448799177e31df',
'X-DeviceConfiguration': 'ss=2.61;dim=1080x1920;m=iPhone;v=iPhone10,2;vv=5.5;sv=13.1',
'User-Agent': 'ASA/5.5 (iPhone) ss/2.61',
'X-Apple-I-Client-Time': '2019-09-26T03:03:56Z',
'x-ma-pcmh': 'REL-5.5.0',



	}
#
r=requests.session()

for i in range(999999):
	url1='https://mobileapp.apple.com/mnm/p/hk-zh/product-locator/quotes?stores=R610%2CR485%2CR499%2CR428%2CR409%2CR673&pn=MWF02ZA%2FA' 
	url2='https://mobileapp.apple.com/mnm/p/hk-zh/product-locator/quotes?pn=MWF42ZA%2FA&stores=R610%2CR485%2CR499%2CR428%2CR409%2CR673'
	url3='https://mobileapp.apple.com/mnm/p/hk-zh/product-locator/quotes?pn=MWF82ZA%2FA&stores=R610%2CR485%2CR499%2CR428%2CR409%2CR673'
	sf1=r.get(url1,headers=headers)
	sf2=r.get(url2,headers=headers)
	sf3=r.get(url3,headers=headers)
	ssff1=json.loads(sf1.text)
	ssff2=json.loads(sf2.text)
	ssff3=json.loads(sf3.text)
	sf=''
	print ('当前时间',time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time())))
	print ('库存情况如下')
	sf='当前时间'+str(time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))+'\n')
	sfyh=''
	for line in ssff1['quoteDetails']['quotes']:
		print ('型号 64G ',line['partNumber'],'店名',line['pickupQuote'],line['availabilityInfo'])
		sf=sf+'型号 64G  '+line['pickupQuote']+'\n'
		if (line['availabilityInfo']!='暫無供應'):
		    sfyh=sfyh+' 64G  '+ line['pickupQuote']
			
	print ('\n')
	for line in ssff2['quoteDetails']['quotes']:
		print ('型号 256G ',line['partNumber'],'店名',line['pickupQuote'],line['availabilityInfo'])
		sf=sf+'型号 256G  '+line['pickupQuote']+'\n'
		if line['availabilityInfo']!='暫無供應':
		    sfyh=sfyh+' 256G  '+ line['pickupQuote']

	print ('\n')
	for line in ssff3['quoteDetails']['quotes']:
		print ('型号 512G ',line['partNumber'],'店名',line['pickupQuote'],line['availabilityInfo'])
		sf=sf+'型号  512G '+line['pickupQuote']+'\n'
		if (line['availabilityInfo']!='暫無供應'):
			sfyh=sfyh+'型号 512G  '+line['pickupQuote']+'\n'
			
	print ('\n')
	print (sfyh)
	if (len(sfyh)>=10):
	    sendmessage(sfyh,'有货啦')
	print ('sf',sf)
	time.sleep(120)

	
