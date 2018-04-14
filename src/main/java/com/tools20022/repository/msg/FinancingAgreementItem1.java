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
import com.tools20022.repository.msg.FinancialItemParameters1;
import com.tools20022.repository.msg.GuaranteeDetails1;
import com.tools20022.repository.msg.QualifiedDocumentInformation1;
import com.tools20022.repository.msg.ValidationStatusInformation1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingAgreementItem1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancingAgreementItem1", propOrder = {"itemContext", "itemAction", "paymentInstrument", "validationStatusInformation", "rating", "reopenIndication", "guarantee", "guaranteeStatus", "relatedGuaranteeLetter",
		"associatedDocument", "additionalInformation"})
public class FinancingAgreementItem1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ItmCntxt", required = true)
	protected FinancialItemParameters1 itemContext;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters related to the context of the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementItem1, FinancialItemParameters1> mmItemContext = new MMMessageAssociationEnd<FinancingAgreementItem1, FinancialItemParameters1>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ItmCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemContext";
			definition = "Parameters related to the context of the item.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialItemParameters1.mmObject();
		}

		@Override
		public FinancialItemParameters1 getValue(FinancingAgreementItem1 obj) {
			return obj.getItemContext();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, FinancialItemParameters1 value) {
			obj.setItemContext(value);
		}
	};
	@XmlElement(name = "ItmActn")
	protected AgreementItemAction1Code itemAction;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code to indicate the action concerning the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementItem1, Optional<AgreementItemAction1Code>> mmItemAction = new MMMessageAttribute<FinancingAgreementItem1, Optional<AgreementItemAction1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ItmActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemAction";
			definition = "Code to indicate the action concerning the item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AgreementItemAction1Code.mmObject();
		}

		@Override
		public Optional<AgreementItemAction1Code> getValue(FinancingAgreementItem1 obj) {
			return obj.getItemAction();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, Optional<AgreementItemAction1Code> value) {
			obj.setItemAction(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInstrm")
	protected PaymentInstrumentCode paymentInstrument;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Desired payment instruction to be used by buyer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementItem1, Optional<PaymentInstrumentCode>> mmPaymentInstrument = new MMMessageAttribute<FinancingAgreementItem1, Optional<PaymentInstrumentCode>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstrument";
			definition = "Desired payment instruction to be used by buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}

		@Override
		public Optional<PaymentInstrumentCode> getValue(FinancingAgreementItem1 obj) {
			return obj.getPaymentInstrument();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, Optional<PaymentInstrumentCode> value) {
			obj.setPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnStsInf")
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation status of the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementItem1, Optional<ValidationStatusInformation1>> mmValidationStatusInformation = new MMMessageAssociationEnd<FinancingAgreementItem1, Optional<ValidationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
		}

		@Override
		public Optional<ValidationStatusInformation1> getValue(FinancingAgreementItem1 obj) {
			return obj.getValidationStatusInformation();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, Optional<ValidationStatusInformation1> value) {
			obj.setValidationStatusInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Ratg", required = true)
	protected YesNoIndicator rating;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ratg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee is (to be) provided according current rating."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementItem1, YesNoIndicator> mmRating = new MMMessageAttribute<FinancingAgreementItem1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Guarantee is (to be) provided according current rating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancingAgreementItem1 obj) {
			return obj.getRating();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, YesNoIndicator value) {
			obj.setRating(value);
		}
	};
	@XmlElement(name = "ReopIndctn", required = true)
	protected YesNoIndicator reopenIndication;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReopIndctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReopenIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set to yes if the agreement was rejected and needs to be re-opened for arbitrage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementItem1, YesNoIndicator> mmReopenIndication = new MMMessageAttribute<FinancingAgreementItem1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "ReopIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenIndication";
			definition = "Set to yes if the agreement was rejected and needs to be re-opened for arbitrage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancingAgreementItem1 obj) {
			return obj.getReopenIndication();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, YesNoIndicator value) {
			obj.setReopenIndication(value);
		}
	};
	@XmlElement(name = "Grnt")
	protected List<GuaranteeDetails1> guarantee;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuers, amounts and periods to be guaranteed. At a given date, the sum of all issuers is guaranteed, covered as specified by rank/position and excess. For each period, the maximum value at a given date is used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementItem1, List<GuaranteeDetails1>> mmGuarantee = new MMMessageAssociationEnd<FinancingAgreementItem1, List<GuaranteeDetails1>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmGuarantee;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "Grnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Guarantee";
			definition = "Issuers, amounts and periods to be guaranteed. At a given date, the sum of all issuers is guaranteed, covered as specified by rank/position and excess. For each period, the maximum value at a given date is used.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GuaranteeDetails1.mmObject();
		}

		@Override
		public List<GuaranteeDetails1> getValue(FinancingAgreementItem1 obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, List<GuaranteeDetails1> value) {
			obj.setGuarantee(value);
		}
	};
	@XmlElement(name = "GrntSts")
	protected ValidationStatusInformation1 guaranteeStatus;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of guarantee if applicable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementItem1, Optional<ValidationStatusInformation1>> mmGuaranteeStatus = new MMMessageAssociationEnd<FinancingAgreementItem1, Optional<ValidationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "GrntSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeStatus";
			definition = "Status of guarantee if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
		}

		@Override
		public Optional<ValidationStatusInformation1> getValue(FinancingAgreementItem1 obj) {
			return obj.getGuaranteeStatus();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, Optional<ValidationStatusInformation1> value) {
			obj.setGuaranteeStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdGrntLttr")
	protected QualifiedDocumentInformation1 relatedGuaranteeLetter;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedGuaranteeLetter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the guarantee letter issued by a guarantee provider."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementItem1, Optional<QualifiedDocumentInformation1>> mmRelatedGuaranteeLetter = new MMMessageAssociationEnd<FinancingAgreementItem1, Optional<QualifiedDocumentInformation1>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "RltdGrntLttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedGuaranteeLetter";
			definition = "Reference to the guarantee letter issued by a guarantee provider.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public Optional<QualifiedDocumentInformation1> getValue(FinancingAgreementItem1 obj) {
			return obj.getRelatedGuaranteeLetter();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, Optional<QualifiedDocumentInformation1> value) {
			obj.setRelatedGuaranteeLetter(value.orElse(null));
		}
	};
	@XmlElement(name = "AssoctdDoc")
	protected List<QualifiedDocumentInformation1> associatedDocument;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Associated free form document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementItem1, List<QualifiedDocumentInformation1>> mmAssociatedDocument = new MMMessageAssociationEnd<FinancingAgreementItem1, List<QualifiedDocumentInformation1>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancingAgreementItem1 obj) {
			return obj.getAssociatedDocument();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setAssociatedDocument(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free form textual information related to the agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementItem1, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<FinancingAgreementItem1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Free form textual information related to the agreement.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(FinancingAgreementItem1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(FinancingAgreementItem1 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAgreementItem1.mmItemContext, com.tools20022.repository.msg.FinancingAgreementItem1.mmItemAction,
						com.tools20022.repository.msg.FinancingAgreementItem1.mmPaymentInstrument, com.tools20022.repository.msg.FinancingAgreementItem1.mmValidationStatusInformation,
						com.tools20022.repository.msg.FinancingAgreementItem1.mmRating, com.tools20022.repository.msg.FinancingAgreementItem1.mmReopenIndication, com.tools20022.repository.msg.FinancingAgreementItem1.mmGuarantee,
						com.tools20022.repository.msg.FinancingAgreementItem1.mmGuaranteeStatus, com.tools20022.repository.msg.FinancingAgreementItem1.mmRelatedGuaranteeLetter,
						com.tools20022.repository.msg.FinancingAgreementItem1.mmAssociatedDocument, com.tools20022.repository.msg.FinancingAgreementItem1.mmAdditionalInformation);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingAgreementItem1";
				definition = "Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialItemParameters1 getItemContext() {
		return itemContext;
	}

	public FinancingAgreementItem1 setItemContext(FinancialItemParameters1 itemContext) {
		this.itemContext = Objects.requireNonNull(itemContext);
		return this;
	}

	public Optional<AgreementItemAction1Code> getItemAction() {
		return itemAction == null ? Optional.empty() : Optional.of(itemAction);
	}

	public FinancingAgreementItem1 setItemAction(AgreementItemAction1Code itemAction) {
		this.itemAction = itemAction;
		return this;
	}

	public Optional<PaymentInstrumentCode> getPaymentInstrument() {
		return paymentInstrument == null ? Optional.empty() : Optional.of(paymentInstrument);
	}

	public FinancingAgreementItem1 setPaymentInstrument(PaymentInstrumentCode paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
		return this;
	}

	public Optional<ValidationStatusInformation1> getValidationStatusInformation() {
		return validationStatusInformation == null ? Optional.empty() : Optional.of(validationStatusInformation);
	}

	public FinancingAgreementItem1 setValidationStatusInformation(ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
		return this;
	}

	public YesNoIndicator getRating() {
		return rating;
	}

	public FinancingAgreementItem1 setRating(YesNoIndicator rating) {
		this.rating = Objects.requireNonNull(rating);
		return this;
	}

	public YesNoIndicator getReopenIndication() {
		return reopenIndication;
	}

	public FinancingAgreementItem1 setReopenIndication(YesNoIndicator reopenIndication) {
		this.reopenIndication = Objects.requireNonNull(reopenIndication);
		return this;
	}

	public List<GuaranteeDetails1> getGuarantee() {
		return guarantee == null ? guarantee = new ArrayList<>() : guarantee;
	}

	public FinancingAgreementItem1 setGuarantee(List<GuaranteeDetails1> guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public Optional<ValidationStatusInformation1> getGuaranteeStatus() {
		return guaranteeStatus == null ? Optional.empty() : Optional.of(guaranteeStatus);
	}

	public FinancingAgreementItem1 setGuaranteeStatus(ValidationStatusInformation1 guaranteeStatus) {
		this.guaranteeStatus = guaranteeStatus;
		return this;
	}

	public Optional<QualifiedDocumentInformation1> getRelatedGuaranteeLetter() {
		return relatedGuaranteeLetter == null ? Optional.empty() : Optional.of(relatedGuaranteeLetter);
	}

	public FinancingAgreementItem1 setRelatedGuaranteeLetter(QualifiedDocumentInformation1 relatedGuaranteeLetter) {
		this.relatedGuaranteeLetter = relatedGuaranteeLetter;
		return this;
	}

	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument == null ? associatedDocument = new ArrayList<>() : associatedDocument;
	}

	public FinancingAgreementItem1 setAssociatedDocument(List<QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public FinancingAgreementItem1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}