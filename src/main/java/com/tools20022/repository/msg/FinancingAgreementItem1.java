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
import com.tools20022.repository.codeset.AgreementItemAction1Code;
import com.tools20022.repository.codeset.PaymentInstrumentCode;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes a financing relation between two parties, for example invoice,
 * credit, financing request, cash accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmItemContext
 * FinancingAgreementItem1.mmItemContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmItemAction
 * FinancingAgreementItem1.mmItemAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmPaymentInstrument
 * FinancingAgreementItem1.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmValidationStatusInformation
 * FinancingAgreementItem1.mmValidationStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmRating
 * FinancingAgreementItem1.mmRating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmReopenIndication
 * FinancingAgreementItem1.mmReopenIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmGuarantee
 * FinancingAgreementItem1.mmGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmGuaranteeStatus
 * FinancingAgreementItem1.mmGuaranteeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmRelatedGuaranteeLetter
 * FinancingAgreementItem1.mmRelatedGuaranteeLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmAssociatedDocument
 * FinancingAgreementItem1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmAdditionalInformation
 * FinancingAgreementItem1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
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
 * "FinancingAgreementItem1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancingAgreementItem1", propOrder = {"itemContext", "itemAction", "paymentInstrument", "validationStatusInformation", "rating", "reopenIndication", "guarantee", "guaranteeStatus", "relatedGuaranteeLetter",
		"associatedDocument", "additionalInformation"})
public class FinancingAgreementItem1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialItemParameters1 itemContext;
	/**
	 * Parameters related to the context of the item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoice
	 * InvoiceFinancingAgreement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters related to the context of the item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmItemContext = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoice;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ItmCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemContext";
			definition = "Parameters related to the context of the item.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
		}
	};
	protected AgreementItemAction1Code itemAction;
	/**
	 * Code to indicate the action concerning the item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementItemAction1Code
	 * AgreementItemAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code to indicate the action concerning the item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItemAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ItmActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemAction";
			definition = "Code to indicate the action concerning the item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AgreementItemAction1Code.mmObject();
		}
	};
	protected PaymentInstrumentCode paymentInstrument;
	/**
	 * Desired payment instruction to be used by buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Desired payment instruction to be used by buyer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstrument = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstrument";
			definition = "Desired payment instruction to be used by buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}
	};
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * Validation status of the item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnStsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation status of the item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidationStatusInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
		}
	};
	protected YesNoIndicator rating;
	/**
	 * Guarantee is (to be) provided according current rating.
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ratg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee is (to be) provided according current rating."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRating = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Guarantee is (to be) provided according current rating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator reopenIndication;
	/**
	 * Set to yes if the agreement was rejected and needs to be re-opened for
	 * arbitrage.
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReopIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReopenIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set to yes if the agreement was rejected and needs to be re-opened for arbitrage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReopenIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ReopIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenIndication";
			definition = "Set to yes if the agreement was rejected and needs to be re-opened for arbitrage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GuaranteeDetails1> guarantee;
	/**
	 * Issuers, amounts and periods to be guaranteed. At a given date, the sum
	 * of all issuers is guaranteed, covered as specified by rank/position and
	 * excess. For each period, the maximum value at a given date is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
	 * Trade.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuers, amounts and periods to be guaranteed. At a given date, the sum of all issuers is guaranteed, covered as specified by rank/position and excess. For each period, the maximum value at a given date is used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuarantee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmGuarantee;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "Grnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Guarantee";
			definition = "Issuers, amounts and periods to be guaranteed. At a given date, the sum of all issuers is guaranteed, covered as specified by rank/position and excess. For each period, the maximum value at a given date is used.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GuaranteeDetails1.mmObject();
		}
	};
	protected ValidationStatusInformation1 guaranteeStatus;
	/**
	 * Status of guarantee if applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of guarantee if applicable."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteeStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "GrntSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeStatus";
			definition = "Status of guarantee if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
		}
	};
	protected QualifiedDocumentInformation1 relatedGuaranteeLetter;
	/**
	 * Reference to the guarantee letter issued by a guarantee provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdGrntLttr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedGuaranteeLetter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the guarantee letter issued by a guarantee provider."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedGuaranteeLetter = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "RltdGrntLttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedGuaranteeLetter";
			definition = "Reference to the guarantee letter issued by a guarantee provider.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument;
	/**
	 * Associated free form document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Associated free form document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssociatedDocument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<Max2000Text> additionalInformation;
	/**
	 * Free form textual information related to the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
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
	 * definition} = "Free form textual information related to the agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Free form textual information related to the agreement.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancingAgreementItem1.mmItemContext, FinancingAgreementItem1.mmItemAction, FinancingAgreementItem1.mmPaymentInstrument, FinancingAgreementItem1.mmValidationStatusInformation,
						FinancingAgreementItem1.mmRating, FinancingAgreementItem1.mmReopenIndication, FinancingAgreementItem1.mmGuarantee, FinancingAgreementItem1.mmGuaranteeStatus, FinancingAgreementItem1.mmRelatedGuaranteeLetter,
						FinancingAgreementItem1.mmAssociatedDocument, FinancingAgreementItem1.mmAdditionalInformation);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingAgreementItem1";
				definition = "Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ItmCntxt", required = true)
	public FinancialItemParameters1 getItemContext() {
		return itemContext;
	}

	public void setItemContext(com.tools20022.repository.msg.FinancialItemParameters1 itemContext) {
		this.itemContext = itemContext;
	}

	@XmlElement(name = "ItmActn")
	public AgreementItemAction1Code getItemAction() {
		return itemAction;
	}

	public void setItemAction(AgreementItemAction1Code itemAction) {
		this.itemAction = itemAction;
	}

	@XmlElement(name = "PmtInstrm")
	public PaymentInstrumentCode getPaymentInstrument() {
		return paymentInstrument;
	}

	public void setPaymentInstrument(PaymentInstrumentCode paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
	}

	@XmlElement(name = "VldtnStsInf")
	public ValidationStatusInformation1 getValidationStatusInformation() {
		return validationStatusInformation;
	}

	public void setValidationStatusInformation(com.tools20022.repository.msg.ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
	}

	@XmlElement(name = "Ratg", required = true)
	public YesNoIndicator getRating() {
		return rating;
	}

	public void setRating(YesNoIndicator rating) {
		this.rating = rating;
	}

	@XmlElement(name = "ReopIndctn", required = true)
	public YesNoIndicator getReopenIndication() {
		return reopenIndication;
	}

	public void setReopenIndication(YesNoIndicator reopenIndication) {
		this.reopenIndication = reopenIndication;
	}

	@XmlElement(name = "Grnt")
	public List<GuaranteeDetails1> getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(List<com.tools20022.repository.msg.GuaranteeDetails1> guarantee) {
		this.guarantee = guarantee;
	}

	@XmlElement(name = "GrntSts")
	public ValidationStatusInformation1 getGuaranteeStatus() {
		return guaranteeStatus;
	}

	public void setGuaranteeStatus(com.tools20022.repository.msg.ValidationStatusInformation1 guaranteeStatus) {
		this.guaranteeStatus = guaranteeStatus;
	}

	@XmlElement(name = "RltdGrntLttr")
	public QualifiedDocumentInformation1 getRelatedGuaranteeLetter() {
		return relatedGuaranteeLetter;
	}

	public void setRelatedGuaranteeLetter(com.tools20022.repository.msg.QualifiedDocumentInformation1 relatedGuaranteeLetter) {
		this.relatedGuaranteeLetter = relatedGuaranteeLetter;
	}

	@XmlElement(name = "AssoctdDoc")
	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument;
	}

	public void setAssociatedDocument(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = associatedDocument;
	}

	@XmlElement(name = "AddtlInf")
	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}