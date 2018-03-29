/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV04;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV05;
import com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04;
import com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05;
import com.tools20022.repository.choice.CertifiedCharacteristics2Choice;
import com.tools20022.repository.codeset.TradeCertificateType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Formal document used to record a fact and used as proof of the fact, in the
 * context of a commercial trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmDataSetIdentification
 * CertificateDataSet2.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmCertificateType
 * CertificateDataSet2.mmCertificateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmLineItem
 * CertificateDataSet2.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmCertifiedCharacteristics
 * CertificateDataSet2.mmCertifiedCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmIssueDate
 * CertificateDataSet2.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmPlaceOfIssue
 * CertificateDataSet2.mmPlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmIssuer
 * CertificateDataSet2.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmInspectionDate
 * CertificateDataSet2.mmInspectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmAuthorisedInspectorIndicator
 * CertificateDataSet2.mmAuthorisedInspectorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmCertificateIdentification
 * CertificateDataSet2.mmCertificateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmTransport
 * CertificateDataSet2.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmGoodsDescription
 * CertificateDataSet2.mmGoodsDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmConsignor
 * CertificateDataSet2.mmConsignor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmConsignee
 * CertificateDataSet2.mmConsignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmManufacturer
 * CertificateDataSet2.mmManufacturer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmAdditionalInformation
 * CertificateDataSet2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmCertificateDataSet
 * DataSetSubmissionV04.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCertificateDataSet
 * ForwardDataSetSubmissionReportV04.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCertificateDataSet
 * ForwardDataSetSubmissionReportV05.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmCertificateDataSet
 * DataSetSubmissionV05.mmCertificateDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateDataSet2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1
 * CertificateDataSet1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertificateDataSet2", propOrder = {"dataSetIdentification", "certificateType", "lineItem", "certifiedCharacteristics", "issueDate", "placeOfIssue", "issuer", "inspectionDate", "authorisedInspectorIndicator",
		"certificateIdentification", "transport", "goodsDescription", "consignor", "consignee", "manufacturer", "additionalInformation"})
public class CertificateDataSet2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DocumentIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the certificate data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmDataSetIdentification
	 * CertificateDataSet1.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, DocumentIdentification1> mmDataSetIdentification = new MMMessageAssociationEnd<CertificateDataSet2, DocumentIdentification1>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identifies the certificate data set.";
			previousVersion_lazy = () -> CertificateDataSet1.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification1.mmObject();
		}

		@Override
		public DocumentIdentification1 getValue(CertificateDataSet2 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, DocumentIdentification1 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "CertTp", required = true)
	protected TradeCertificateType1Code certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateType1Code
	 * TradeCertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmCertificateType
	 * TradeCertificate.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmCertificateType
	 * CertificateDataSet1.mmCertificateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, TradeCertificateType1Code> mmCertificateType = new MMMessageAttribute<CertificateDataSet2, TradeCertificateType1Code>() {
		{
			businessElementTrace_lazy = () -> TradeCertificate.mmCertificateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			previousVersion_lazy = () -> CertificateDataSet1.mmCertificateType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeCertificateType1Code.mmObject();
		}

		@Override
		public TradeCertificateType1Code getValue(CertificateDataSet2 obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, TradeCertificateType1Code value) {
			obj.setCertificateType(value);
		}
	};
	@XmlElement(name = "LineItm")
	protected List<LineItemAndPOIdentification1> lineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAndPOIdentification1
	 * LineItemAndPOIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the certificate data set is required in relation to specific line items, and which line items."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmLineItem
	 * CertificateDataSet1.mmLineItem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, List<LineItemAndPOIdentification1>> mmLineItem = new MMMessageAttribute<CertificateDataSet2, List<LineItemAndPOIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "LineItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItem";
			definition = "Specifies if the certificate data set is required in relation to specific line items, and which line items.";
			previousVersion_lazy = () -> CertificateDataSet1.mmLineItem;
			minOccurs = 0;
			complexType_lazy = () -> LineItemAndPOIdentification1.mmObject();
		}

		@Override
		public List<LineItemAndPOIdentification1> getValue(CertificateDataSet2 obj) {
			return obj.getLineItem();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, List<LineItemAndPOIdentification1> value) {
			obj.setLineItem(value);
		}
	};
	@XmlElement(name = "CertfdChrtcs", required = true)
	protected CertifiedCharacteristics2Choice certifiedCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
	 * ProductDelivery.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfdChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertifiedCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics of the goods that are certified, in the context of a commercial trade transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmCertifiedCharacteristics
	 * CertificateDataSet1.mmCertifiedCharacteristics}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, CertifiedCharacteristics2Choice> mmCertifiedCharacteristics = new MMMessageAssociationEnd<CertificateDataSet2, CertifiedCharacteristics2Choice>() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertfdChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertifiedCharacteristics";
			definition = "Characteristics of the goods that are certified, in the context of a commercial trade transaction.";
			previousVersion_lazy = () -> CertificateDataSet1.mmCertifiedCharacteristics;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
		}

		@Override
		public CertifiedCharacteristics2Choice getValue(CertificateDataSet2 obj) {
			return obj.getCertifiedCharacteristics();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, CertifiedCharacteristics2Choice value) {
			obj.setCertifiedCharacteristics(value);
		}
	};
	@XmlElement(name = "IsseDt", required = true)
	protected ISODate issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmIssueDate
	 * CertificateDataSet1.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, ISODate> mmIssueDate = new MMMessageAttribute<CertificateDataSet2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			previousVersion_lazy = () -> CertificateDataSet1.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CertificateDataSet2 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, ISODate value) {
			obj.setIssueDate(value);
		}
	};
	@XmlElement(name = "PlcOfIsse")
	protected PostalAddress5 placeOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress5
	 * PostalAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
	 * Document.mmPlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the certificate was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmPlaceOfIssue
	 * CertificateDataSet1.mmPlaceOfIssue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, Optional<PostalAddress5>> mmPlaceOfIssue = new MMMessageAttribute<CertificateDataSet2, Optional<PostalAddress5>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPlaceOfIssue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the certificate was issued.";
			previousVersion_lazy = () -> CertificateDataSet1.mmPlaceOfIssue;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PostalAddress5.mmObject();
		}

		@Override
		public Optional<PostalAddress5> getValue(CertificateDataSet2 obj) {
			return obj.getPlaceOfIssue();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<PostalAddress5> value) {
			obj.setPlaceOfIssue(value.orElse(null));
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected PartyIdentification26 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer of the certificate, typically the inspection company or its agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmIssuer
	 * CertificateDataSet1.mmIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, PartyIdentification26> mmIssuer = new MMMessageAssociationEnd<CertificateDataSet2, PartyIdentification26>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer of the certificate, typically the inspection company or its agent.";
			previousVersion_lazy = () -> CertificateDataSet1.mmIssuer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(CertificateDataSet2 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, PartyIdentification26 value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "InspctnDt")
	protected DatePeriodDetails inspectionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmInspectionDate
	 * TradeCertificate.mmInspectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InspctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InspectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date(s) at which inspection of the goods took place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmInspectionDate
	 * CertificateDataSet1.mmInspectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, Optional<DatePeriodDetails>> mmInspectionDate = new MMMessageAttribute<CertificateDataSet2, Optional<DatePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> TradeCertificate.mmInspectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "InspctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InspectionDate";
			definition = "Date(s) at which inspection of the goods took place.";
			previousVersion_lazy = () -> CertificateDataSet1.mmInspectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public Optional<DatePeriodDetails> getValue(CertificateDataSet2 obj) {
			return obj.getInspectionDate();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<DatePeriodDetails> value) {
			obj.setInspectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthrsdInspctrInd")
	protected YesNoIndicator authorisedInspectorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdInspctrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedInspectorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the inspection has been performed by an authorised inspector."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmAuthorisedInspectorIndicator
	 * CertificateDataSet1.mmAuthorisedInspectorIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, Optional<YesNoIndicator>> mmAuthorisedInspectorIndicator = new MMMessageAttribute<CertificateDataSet2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdInspctrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedInspectorIndicator";
			definition = "Indicates that the inspection has been performed by an authorised inspector.";
			previousVersion_lazy = () -> CertificateDataSet1.mmAuthorisedInspectorIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CertificateDataSet2 obj) {
			return obj.getAuthorisedInspectorIndicator();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<YesNoIndicator> value) {
			obj.setAuthorisedInspectorIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CertId", required = true)
	protected Max35Text certificateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmCertificateIdentification
	 * CertificateDataSet1.mmCertificateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, Max35Text> mmCertificateIdentification = new MMMessageAttribute<CertificateDataSet2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Unique identifier of the document.";
			previousVersion_lazy = () -> CertificateDataSet1.mmCertificateIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CertificateDataSet2 obj) {
			return obj.getCertificateIdentification();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Max35Text value) {
			obj.setCertificateIdentification(value);
		}
	};
	@XmlElement(name = "Trnsprt")
	protected SingleTransport3 transport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleTransport3
	 * SingleTransport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport information relative to the goods that are covered by the certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmTransport
	 * CertificateDataSet1.mmTransport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, Optional<SingleTransport3>> mmTransport = new MMMessageAssociationEnd<CertificateDataSet2, Optional<SingleTransport3>>() {
		{
			businessElementTrace_lazy = () -> Document.mmTransport;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Trnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transport";
			definition = "Transport information relative to the goods that are covered by the certificate.";
			previousVersion_lazy = () -> CertificateDataSet1.mmTransport;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SingleTransport3.mmObject();
		}

		@Override
		public Optional<SingleTransport3> getValue(CertificateDataSet2 obj) {
			return obj.getTransport();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<SingleTransport3> value) {
			obj.setTransport(value.orElse(null));
		}
	};
	@XmlElement(name = "GoodsDesc")
	protected Max70Text goodsDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDescription
	 * Product.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoodsDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodsDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmGoodsDescription
	 * CertificateDataSet1.mmGoodsDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, Optional<Max70Text>> mmGoodsDescription = new MMMessageAttribute<CertificateDataSet2, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "GoodsDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodsDescription";
			definition = "Information about the goods and/or services of a trade transaction.";
			previousVersion_lazy = () -> CertificateDataSet1.mmGoodsDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CertificateDataSet2 obj) {
			return obj.getGoodsDescription();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<Max70Text> value) {
			obj.setGoodsDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Consgnr")
	protected PartyIdentification26 consignor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party responsible for dispatching the goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmConsignor
	 * CertificateDataSet1.mmConsignor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, Optional<PartyIdentification26>> mmConsignor = new MMMessageAssociationEnd<CertificateDataSet2, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Consgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignor";
			definition = "Party responsible for dispatching the goods.";
			previousVersion_lazy = () -> CertificateDataSet1.mmConsignor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(CertificateDataSet2 obj) {
			return obj.getConsignor();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<PartyIdentification26> value) {
			obj.setConsignor(value.orElse(null));
		}
	};
	@XmlElement(name = "Consgn")
	protected PartyIdentification26 consignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to whom the goods (which are the subject of the certificate) must be delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmConsignee
	 * CertificateDataSet1.mmConsignee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, Optional<PartyIdentification26>> mmConsignee = new MMMessageAssociationEnd<CertificateDataSet2, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to whom the goods (which are the subject of the certificate) must be delivered.";
			previousVersion_lazy = () -> CertificateDataSet1.mmConsignee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(CertificateDataSet2 obj) {
			return obj.getConsignee();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<PartyIdentification26> value) {
			obj.setConsignee(value.orElse(null));
		}
	};
	@XmlElement(name = "Manfctr")
	protected PartyIdentification26 manufacturer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Manfctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manufacturer of the goods which are the subject of the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmManufacturer
	 * CertificateDataSet1.mmManufacturer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateDataSet2, Optional<PartyIdentification26>> mmManufacturer = new MMMessageAssociationEnd<CertificateDataSet2, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Manfctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturer";
			definition = "Manufacturer of the goods which are the subject of the certificate.";
			previousVersion_lazy = () -> CertificateDataSet1.mmManufacturer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(CertificateDataSet2 obj) {
			return obj.getManufacturer();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, Optional<PartyIdentification26> value) {
			obj.setManufacturer(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max350Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional and important information that could not be captured by structured fields."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmAdditionalInformation
	 * CertificateDataSet1.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateDataSet2, List<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<CertificateDataSet2, List<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional and important information that could not be captured by structured fields.";
			previousVersion_lazy = () -> CertificateDataSet1.mmAdditionalInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public List<Max350Text> getValue(CertificateDataSet2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CertificateDataSet2 obj, List<Max350Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CertificateDataSet2.mmDataSetIdentification, com.tools20022.repository.msg.CertificateDataSet2.mmCertificateType,
						com.tools20022.repository.msg.CertificateDataSet2.mmLineItem, com.tools20022.repository.msg.CertificateDataSet2.mmCertifiedCharacteristics, com.tools20022.repository.msg.CertificateDataSet2.mmIssueDate,
						com.tools20022.repository.msg.CertificateDataSet2.mmPlaceOfIssue, com.tools20022.repository.msg.CertificateDataSet2.mmIssuer, com.tools20022.repository.msg.CertificateDataSet2.mmInspectionDate,
						com.tools20022.repository.msg.CertificateDataSet2.mmAuthorisedInspectorIndicator, com.tools20022.repository.msg.CertificateDataSet2.mmCertificateIdentification,
						com.tools20022.repository.msg.CertificateDataSet2.mmTransport, com.tools20022.repository.msg.CertificateDataSet2.mmGoodsDescription, com.tools20022.repository.msg.CertificateDataSet2.mmConsignor,
						com.tools20022.repository.msg.CertificateDataSet2.mmConsignee, com.tools20022.repository.msg.CertificateDataSet2.mmManufacturer, com.tools20022.repository.msg.CertificateDataSet2.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmCertificateDataSet, ForwardDataSetSubmissionReportV04.mmCertificateDataSet, ForwardDataSetSubmissionReportV05.mmCertificateDataSet,
						DataSetSubmissionV05.mmCertificateDataSet);
				trace_lazy = () -> TradeCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateDataSet2";
				definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
				previousVersion_lazy = () -> CertificateDataSet1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CertificateDataSet2 setDataSetIdentification(DocumentIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public TradeCertificateType1Code getCertificateType() {
		return certificateType;
	}

	public CertificateDataSet2 setCertificateType(TradeCertificateType1Code certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}

	public List<LineItemAndPOIdentification1> getLineItem() {
		return lineItem == null ? lineItem = new ArrayList<>() : lineItem;
	}

	public CertificateDataSet2 setLineItem(List<LineItemAndPOIdentification1> lineItem) {
		this.lineItem = Objects.requireNonNull(lineItem);
		return this;
	}

	public CertifiedCharacteristics2Choice getCertifiedCharacteristics() {
		return certifiedCharacteristics;
	}

	public CertificateDataSet2 setCertifiedCharacteristics(CertifiedCharacteristics2Choice certifiedCharacteristics) {
		this.certifiedCharacteristics = Objects.requireNonNull(certifiedCharacteristics);
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public CertificateDataSet2 setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public Optional<PostalAddress5> getPlaceOfIssue() {
		return placeOfIssue == null ? Optional.empty() : Optional.of(placeOfIssue);
	}

	public CertificateDataSet2 setPlaceOfIssue(PostalAddress5 placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
		return this;
	}

	public PartyIdentification26 getIssuer() {
		return issuer;
	}

	public CertificateDataSet2 setIssuer(PartyIdentification26 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public Optional<DatePeriodDetails> getInspectionDate() {
		return inspectionDate == null ? Optional.empty() : Optional.of(inspectionDate);
	}

	public CertificateDataSet2 setInspectionDate(DatePeriodDetails inspectionDate) {
		this.inspectionDate = inspectionDate;
		return this;
	}

	public Optional<YesNoIndicator> getAuthorisedInspectorIndicator() {
		return authorisedInspectorIndicator == null ? Optional.empty() : Optional.of(authorisedInspectorIndicator);
	}

	public CertificateDataSet2 setAuthorisedInspectorIndicator(YesNoIndicator authorisedInspectorIndicator) {
		this.authorisedInspectorIndicator = authorisedInspectorIndicator;
		return this;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public CertificateDataSet2 setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = Objects.requireNonNull(certificateIdentification);
		return this;
	}

	public Optional<SingleTransport3> getTransport() {
		return transport == null ? Optional.empty() : Optional.of(transport);
	}

	public CertificateDataSet2 setTransport(SingleTransport3 transport) {
		this.transport = transport;
		return this;
	}

	public Optional<Max70Text> getGoodsDescription() {
		return goodsDescription == null ? Optional.empty() : Optional.of(goodsDescription);
	}

	public CertificateDataSet2 setGoodsDescription(Max70Text goodsDescription) {
		this.goodsDescription = goodsDescription;
		return this;
	}

	public Optional<PartyIdentification26> getConsignor() {
		return consignor == null ? Optional.empty() : Optional.of(consignor);
	}

	public CertificateDataSet2 setConsignor(PartyIdentification26 consignor) {
		this.consignor = consignor;
		return this;
	}

	public Optional<PartyIdentification26> getConsignee() {
		return consignee == null ? Optional.empty() : Optional.of(consignee);
	}

	public CertificateDataSet2 setConsignee(PartyIdentification26 consignee) {
		this.consignee = consignee;
		return this;
	}

	public Optional<PartyIdentification26> getManufacturer() {
		return manufacturer == null ? Optional.empty() : Optional.of(manufacturer);
	}

	public CertificateDataSet2 setManufacturer(PartyIdentification26 manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	public List<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public CertificateDataSet2 setAdditionalInformation(List<Max350Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}