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
import com.tools20022.repository.codeset.AgreementItemAction1Code;
import com.tools20022.repository.codeset.PaymentInstrumentCode;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#ItemContext
 * FinancingAgreementItem1.ItemContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#ItemAction
 * FinancingAgreementItem1.ItemAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#PaymentInstrument
 * FinancingAgreementItem1.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#ValidationStatusInformation
 * FinancingAgreementItem1.ValidationStatusInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#Rating
 * FinancingAgreementItem1.Rating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#ReopenIndication
 * FinancingAgreementItem1.ReopenIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#Guarantee
 * FinancingAgreementItem1.Guarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#GuaranteeStatus
 * FinancingAgreementItem1.GuaranteeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#RelatedGuaranteeLetter
 * FinancingAgreementItem1.RelatedGuaranteeLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#AssociatedDocument
 * FinancingAgreementItem1.AssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#AdditionalInformation
 * FinancingAgreementItem1.AdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
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
 * "FinancingAgreementItem1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts."
 * </li>
 * </ul>
 */
public class FinancingAgreementItem1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Invoice
	 * InvoiceFinancingAgreement.Invoice}</li>
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
	public static final MMMessageAssociationEnd ItemContext = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice;
			isDerived = false;
			xmlTag = "ItmCntxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemContext";
			definition = "Parameters related to the context of the item.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FinancialItemParameters1.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAttribute ItemAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ItmActn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemAction";
			definition = "Code to indicate the action concerning the item.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> AgreementItemAction1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Payment#Type Payment.Type}</li>
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
	public static final MMMessageAttribute PaymentInstrument = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Type;
			isDerived = false;
			xmlTag = "PmtInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstrument";
			definition = "Desired payment instruction to be used by buyer.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingStatus
	 * InvoiceFinancingAgreement.InvoiceFinancingStatus}</li>
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
	public static final MMMessageAssociationEnd ValidationStatusInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus;
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the item.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAttribute Rating = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Guarantee is (to be) provided according current rating.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMMessageAttribute ReopenIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ReopIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenIndication";
			definition = "Set to yes if the agreement was rejected and needs to be re-opened for arbitrage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Trade#Guarantee
	 * Trade.Guarantee}</li>
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
	public static final MMMessageAssociationEnd Guarantee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.Guarantee;
			isDerived = false;
			xmlTag = "Grnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Guarantee";
			definition = "Issuers, amounts and periods to be guaranteed. At a given date, the sum of all issuers is guaranteed, covered as specified by rank/position and excess. For each period, the maximum value at a given date is used.";
			minOccurs = 0;
			type_lazy = () -> GuaranteeDetails1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingStatus
	 * InvoiceFinancingAgreement.InvoiceFinancingStatus}</li>
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
	public static final MMMessageAssociationEnd GuaranteeStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus;
			isDerived = false;
			xmlTag = "GrntSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeStatus";
			definition = "Status of guarantee if applicable.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#Document
	 * Agreement.Document}</li>
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
	public static final MMMessageAssociationEnd RelatedGuaranteeLetter = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Document;
			isDerived = false;
			xmlTag = "RltdGrntLttr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedGuaranteeLetter";
			definition = "Reference to the guarantee letter issued by a guarantee provider.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isComposite = false;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#Document
	 * Agreement.Document}</li>
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
	public static final MMMessageAssociationEnd AssociatedDocument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Document;
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isComposite = false;
		}
	};
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
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Free form textual information related to the agreement.";
			minOccurs = 0;
			maxOccurs = 5;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAgreementItem1.ItemContext, com.tools20022.repository.msg.FinancingAgreementItem1.ItemAction,
						com.tools20022.repository.msg.FinancingAgreementItem1.PaymentInstrument, com.tools20022.repository.msg.FinancingAgreementItem1.ValidationStatusInformation,
						com.tools20022.repository.msg.FinancingAgreementItem1.Rating, com.tools20022.repository.msg.FinancingAgreementItem1.ReopenIndication, com.tools20022.repository.msg.FinancingAgreementItem1.Guarantee,
						com.tools20022.repository.msg.FinancingAgreementItem1.GuaranteeStatus, com.tools20022.repository.msg.FinancingAgreementItem1.RelatedGuaranteeLetter,
						com.tools20022.repository.msg.FinancingAgreementItem1.AssociatedDocument, com.tools20022.repository.msg.FinancingAgreementItem1.AdditionalInformation);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancingAgreementItem1";
				definition = "Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts.";
			}
		});
		return mmObject_lazy.get();
	}
}