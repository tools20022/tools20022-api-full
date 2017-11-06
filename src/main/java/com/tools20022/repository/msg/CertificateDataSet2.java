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
import com.tools20022.repository.choice.CertifiedCharacteristics2Choice;
import com.tools20022.repository.codeset.TradeCertificateType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.TradeCertificate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CertificateDataSet2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification1 dataSetIdentification;
	/**
	 * Identifies the certificate data set.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identifies the certificate data set.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification1.mmObject();
		}
	};
	protected TradeCertificateType1Code certificateType;
	/**
	 * Specifies the type of the certificate.
	 * <p>
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
	public static final MMMessageAttribute mmCertificateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmCertificateType;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmCertificateType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeCertificateType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LineItemAndPOIdentification1> lineItem;
	/**
	 * Specifies if the certificate data set is required in relation to specific
	 * line items, and which line items.
	 * <p>
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
	public static final MMMessageAttribute mmLineItem = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.mmLineItem;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "LineItm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItem";
			definition = "Specifies if the certificate data set is required in relation to specific line items, and which line items.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmLineItem;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.LineItemAndPOIdentification1.mmObject();
		}
	};
	protected CertifiedCharacteristics2Choice certifiedCharacteristics;
	/**
	 * Characteristics of the goods that are certified, in the context of a
	 * commercial trade transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCertifiedCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmProduct;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertfdChrtcs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertifiedCharacteristics";
			definition = "Characteristics of the goods that are certified, in the context of a commercial trade transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmCertifiedCharacteristics;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
		}
	};
	protected ISODate issueDate;
	/**
	 * Issue date of the document.
	 * <p>
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
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.mmIssueDate;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PostalAddress5 placeOfIssue;
	/**
	 * Place where the certificate was issued.
	 * <p>
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
	public static final MMMessageAttribute mmPlaceOfIssue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.mmPlaceOfIssue;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfIsse";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the certificate was issued.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmPlaceOfIssue;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress5.mmObject();
		}
	};
	protected PartyIdentification26 issuer;
	/**
	 * Issuer of the certificate, typically the inspection company or its agent.
	 * <p>
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
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer of the certificate, typically the inspection company or its agent.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmIssuer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected DatePeriodDetails inspectionDate;
	/**
	 * Date(s) at which inspection of the goods took place.
	 * <p>
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
	public static final MMMessageAttribute mmInspectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmInspectionDate;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "InspctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InspectionDate";
			definition = "Date(s) at which inspection of the goods took place.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmInspectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	protected YesNoIndicator authorisedInspectorIndicator;
	/**
	 * Indicates that the inspection has been performed by an authorised
	 * inspector.
	 * <p>
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
	public static final MMMessageAttribute mmAuthorisedInspectorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdInspctrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedInspectorIndicator";
			definition = "Indicates that the inspection has been performed by an authorised inspector.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmAuthorisedInspectorIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text certificateIdentification;
	/**
	 * Unique identifier of the document.
	 * <p>
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
	public static final MMMessageAttribute mmCertificateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Unique identifier of the document.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmCertificateIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SingleTransport3 transport;
	/**
	 * Transport information relative to the goods that are covered by the
	 * certificate.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.mmTransport;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Trnsprt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transport";
			definition = "Transport information relative to the goods that are covered by the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmTransport;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SingleTransport3.mmObject();
		}
	};
	protected Max70Text goodsDescription;
	/**
	 * Information about the goods and/or services of a trade transaction.
	 * <p>
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
	public static final MMMessageAttribute mmGoodsDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmDescription;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "GoodsDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodsDescription";
			definition = "Information about the goods and/or services of a trade transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmGoodsDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected PartyIdentification26 consignor;
	/**
	 * Party responsible for dispatching the goods.
	 * <p>
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
	public static final MMMessageAssociationEnd mmConsignor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Consgnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignor";
			definition = "Party responsible for dispatching the goods.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmConsignor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected PartyIdentification26 consignee;
	/**
	 * Party to whom the goods (which are the subject of the certificate) must
	 * be delivered.
	 * <p>
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
	public static final MMMessageAssociationEnd mmConsignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to whom the goods (which are the subject of the certificate) must be delivered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmConsignee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected PartyIdentification26 manufacturer;
	/**
	 * Manufacturer of the goods which are the subject of the certificate.
	 * <p>
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
	public static final MMMessageAssociationEnd mmManufacturer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Manfctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturer";
			definition = "Manufacturer of the goods which are the subject of the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmManufacturer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected List<Max350Text> additionalInformation;
	/**
	 * Additional and important information that could not be captured by
	 * structured fields.
	 * <p>
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
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional and important information that could not be captured by structured fields.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificateDataSet1.mmAdditionalInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
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
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.DataSetSubmissionV04.mmCertificateDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmCertificateDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmCertificateDataSet, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmCertificateDataSet);
				trace_lazy = () -> TradeCertificate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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

	public void setDataSetIdentification(com.tools20022.repository.msg.DocumentIdentification1 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
	}

	public TradeCertificateType1Code getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(TradeCertificateType1Code certificateType) {
		this.certificateType = certificateType;
	}

	public List<LineItemAndPOIdentification1> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<com.tools20022.repository.msg.LineItemAndPOIdentification1> lineItem) {
		this.lineItem = lineItem;
	}

	public CertifiedCharacteristics2Choice getCertifiedCharacteristics() {
		return certifiedCharacteristics;
	}

	public void setCertifiedCharacteristics(CertifiedCharacteristics2Choice certifiedCharacteristics) {
		this.certifiedCharacteristics = certifiedCharacteristics;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	public PostalAddress5 getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(com.tools20022.repository.msg.PostalAddress5 placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public PartyIdentification26 getIssuer() {
		return issuer;
	}

	public void setIssuer(com.tools20022.repository.msg.PartyIdentification26 issuer) {
		this.issuer = issuer;
	}

	public DatePeriodDetails getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(com.tools20022.repository.msg.DatePeriodDetails inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public YesNoIndicator getAuthorisedInspectorIndicator() {
		return authorisedInspectorIndicator;
	}

	public void setAuthorisedInspectorIndicator(YesNoIndicator authorisedInspectorIndicator) {
		this.authorisedInspectorIndicator = authorisedInspectorIndicator;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public void setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
	}

	public SingleTransport3 getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.msg.SingleTransport3 transport) {
		this.transport = transport;
	}

	public Max70Text getGoodsDescription() {
		return goodsDescription;
	}

	public void setGoodsDescription(Max70Text goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public PartyIdentification26 getConsignor() {
		return consignor;
	}

	public void setConsignor(com.tools20022.repository.msg.PartyIdentification26 consignor) {
		this.consignor = consignor;
	}

	public PartyIdentification26 getConsignee() {
		return consignee;
	}

	public void setConsignee(com.tools20022.repository.msg.PartyIdentification26 consignee) {
		this.consignee = consignee;
	}

	public PartyIdentification26 getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(com.tools20022.repository.msg.PartyIdentification26 manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<Max350Text> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max350Text> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}