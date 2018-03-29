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
import com.tools20022.repository.choice.AmountOrPercentage2Choice;
import com.tools20022.repository.choice.BPOApplicableRules1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
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
 * Payment obligation contracted between two financial institutions related to
 * the financing of a commercial transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmObligorBank
 * PaymentObligation2.mmObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmRecipientBank
 * PaymentObligation2.mmRecipientBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPaymentObligationAmount
 * PaymentObligation2.mmPaymentObligationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2#mmCharges
 * PaymentObligation2.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmExpiryDate
 * PaymentObligation2.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmApplicableRules
 * PaymentObligation2.mmApplicableRules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmApplicableLaw
 * PaymentObligation2.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPlaceOfJurisdiction
 * PaymentObligation2.mmPlaceOfJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPaymentTerms
 * PaymentObligation2.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmSettlementTerms
 * PaymentObligation2.mmSettlementTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
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
 * "PaymentObligation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment obligation contracted between two financial institutions related to the financing of a commercial transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charges5 Charges5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1
 * PaymentObligation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentObligation2", propOrder = {"obligorBank", "recipientBank", "paymentObligationAmount", "charges", "expiryDate", "applicableRules", "applicableLaw", "placeOfJurisdiction", "paymentTerms", "settlementTerms"})
public class PaymentObligation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OblgrBk", required = true)
	protected BICIdentification1 obligorBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank that has to pay under the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmObligorBank
	 * PaymentObligation1.mmObligorBank}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, BICIdentification1> mmObligorBank = new MMMessageAssociationEnd<PaymentObligation2, BICIdentification1>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "OblgrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorBank";
			definition = "Bank that has to pay under the obligation.";
			previousVersion_lazy = () -> PaymentObligation1.mmObligorBank;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(PaymentObligation2 obj) {
			return obj.getObligorBank();
		}

		@Override
		public void setValue(PaymentObligation2 obj, BICIdentification1 value) {
			obj.setObligorBank(value);
		}
	};
	@XmlElement(name = "RcptBk", required = true)
	protected BICIdentification1 recipientBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank that will be paid under the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmRecipientBank
	 * PaymentObligation1.mmRecipientBank}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, BICIdentification1> mmRecipientBank = new MMMessageAssociationEnd<PaymentObligation2, BICIdentification1>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "RcptBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientBank";
			definition = "Bank that will be paid under the obligation.";
			previousVersion_lazy = () -> PaymentObligation1.mmRecipientBank;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(PaymentObligation2 obj) {
			return obj.getRecipientBank();
		}

		@Override
		public void setValue(PaymentObligation2 obj, BICIdentification1 value) {
			obj.setRecipientBank(value);
		}
	};
	@XmlElement(name = "PmtOblgtnAmt", required = true)
	protected AmountOrPercentage2Choice paymentObligationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AmountOrPercentage2Choice
	 * AmountOrPercentage2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtOblgtnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment obligation amount specified as an amount or percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, AmountOrPercentage2Choice> mmPaymentObligationAmount = new MMMessageAssociationEnd<PaymentObligation2, AmountOrPercentage2Choice>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "PmtOblgtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentObligationAmount";
			definition = "Payment obligation amount specified as an amount or percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountOrPercentage2Choice.mmObject();
		}

		@Override
		public AmountOrPercentage2Choice getValue(PaymentObligation2 obj) {
			return obj.getPaymentObligationAmount();
		}

		@Override
		public void setValue(PaymentObligation2 obj, AmountOrPercentage2Choice value) {
			obj.setPaymentObligationAmount(value);
		}
	};
	@XmlElement(name = "Chrgs")
	protected List<Charges5> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charges5 Charges5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the payment obligation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, List<Charges5>> mmCharges = new MMMessageAssociationEnd<PaymentObligation2, List<Charges5>>() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Charges related to the payment obligation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charges5.mmObject();
		}

		@Override
		public List<Charges5> getValue(PaymentObligation2 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(PaymentObligation2 obj, List<Charges5> value) {
			obj.setCharges(value);
		}
	};
	@XmlElement(name = "XpryDt", required = true)
	protected ISODate expiryDate;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExpiryDate
	 * PaymentObligation.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the obligation will expire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmExpiryDate
	 * PaymentObligation1.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation2, ISODate> mmExpiryDate = new MMMessageAttribute<PaymentObligation2, ISODate>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire.";
			previousVersion_lazy = () -> PaymentObligation1.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentObligation2 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PaymentObligation2 obj, ISODate value) {
			obj.setExpiryDate(value);
		}
	};
	@XmlElement(name = "AplblRules")
	protected BPOApplicableRules1Choice applicableRules;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BPOApplicableRules1Choice
	 * BPOApplicableRules1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
	 * Trade.mmGoverningDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblRules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableRules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules which apply to the BPO (Bank Payment Obligation)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, Optional<BPOApplicableRules1Choice>> mmApplicableRules = new MMMessageAssociationEnd<PaymentObligation2, Optional<BPOApplicableRules1Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmGoverningDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "AplblRules";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRules";
			definition = "Rules which apply to the BPO (Bank Payment Obligation).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BPOApplicableRules1Choice.mmObject();
		}

		@Override
		public Optional<BPOApplicableRules1Choice> getValue(PaymentObligation2 obj) {
			return obj.getApplicableRules();
		}

		@Override
		public void setValue(PaymentObligation2 obj, Optional<BPOApplicableRules1Choice> value) {
			obj.setApplicableRules(value.orElse(null));
		}
	};
	@XmlElement(name = "AplblLaw")
	protected CountryCode applicableLaw;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmApplicableLaw
	 * PaymentObligation.mmApplicableLaw}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of which the law governs the bank payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmApplicableLaw
	 * PaymentObligation1.mmApplicableLaw}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentObligation2, Optional<CountryCode>> mmApplicableLaw = new MMMessageAttribute<PaymentObligation2, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmApplicableLaw;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "AplblLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the bank payment obligation.";
			previousVersion_lazy = () -> PaymentObligation1.mmApplicableLaw;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(PaymentObligation2 obj) {
			return obj.getApplicableLaw();
		}

		@Override
		public void setValue(PaymentObligation2 obj, Optional<CountryCode> value) {
			obj.setApplicableLaw(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfJursdctn")
	protected Location2 placeOfJurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Location2 Location2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmIdentification
	 * Jurisdiction.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfJursdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location and forum for dispute resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, Optional<Location2>> mmPlaceOfJurisdiction = new MMMessageAssociationEnd<PaymentObligation2, Optional<Location2>>() {
		{
			businessElementTrace_lazy = () -> Jurisdiction.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfJursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfJurisdiction";
			definition = "Location and forum for dispute resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Location2.mmObject();
		}

		@Override
		public Optional<Location2> getValue(PaymentObligation2 obj) {
			return obj.getPlaceOfJurisdiction();
		}

		@Override
		public void setValue(PaymentObligation2 obj, Optional<Location2> value) {
			obj.setPlaceOfJurisdiction(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTerms")
	protected List<PaymentTerms4> paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms4
	 * PaymentTerms4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPaymentTerms
	 * PaymentObligation1.mmPaymentTerms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, List<PaymentTerms4>> mmPaymentTerms = new MMMessageAssociationEnd<PaymentObligation2, List<PaymentTerms4>>() {
		{
			businessComponentTrace_lazy = () -> PaymentObligation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			previousVersion_lazy = () -> PaymentObligation1.mmPaymentTerms;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTerms4.mmObject();
		}

		@Override
		public List<PaymentTerms4> getValue(PaymentObligation2 obj) {
			return obj.getPaymentTerms();
		}

		@Override
		public void setValue(PaymentObligation2 obj, List<PaymentTerms4> value) {
			obj.setPaymentTerms(value);
		}
	};
	@XmlElement(name = "SttlmTerms")
	protected SettlementTerms3 settlementTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms3
	 * SettlementTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2
	 * PaymentObligation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction between two clearing agents stipulating the cash transfer characteristics between the two parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmSettlementTerms
	 * PaymentObligation1.mmSettlementTerms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentObligation2, Optional<SettlementTerms3>> mmSettlementTerms = new MMMessageAssociationEnd<PaymentObligation2, Optional<SettlementTerms3>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Instruction between two clearing agents stipulating the cash transfer characteristics between the two parties.";
			previousVersion_lazy = () -> PaymentObligation1.mmSettlementTerms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTerms3.mmObject();
		}

		@Override
		public Optional<SettlementTerms3> getValue(PaymentObligation2 obj) {
			return obj.getSettlementTerms();
		}

		@Override
		public void setValue(PaymentObligation2 obj, Optional<SettlementTerms3> value) {
			obj.setSettlementTerms(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation2.mmObligorBank, com.tools20022.repository.msg.PaymentObligation2.mmRecipientBank,
						com.tools20022.repository.msg.PaymentObligation2.mmPaymentObligationAmount, com.tools20022.repository.msg.PaymentObligation2.mmCharges, com.tools20022.repository.msg.PaymentObligation2.mmExpiryDate,
						com.tools20022.repository.msg.PaymentObligation2.mmApplicableRules, com.tools20022.repository.msg.PaymentObligation2.mmApplicableLaw, com.tools20022.repository.msg.PaymentObligation2.mmPlaceOfJurisdiction,
						com.tools20022.repository.msg.PaymentObligation2.mmPaymentTerms, com.tools20022.repository.msg.PaymentObligation2.mmSettlementTerms);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentObligation2";
				definition = "Payment obligation contracted between two financial institutions related to the financing of a commercial transaction.";
				nextVersions_lazy = () -> Arrays.asList(Charges5.mmObject());
				previousVersion_lazy = () -> PaymentObligation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BICIdentification1 getObligorBank() {
		return obligorBank;
	}

	public PaymentObligation2 setObligorBank(BICIdentification1 obligorBank) {
		this.obligorBank = Objects.requireNonNull(obligorBank);
		return this;
	}

	public BICIdentification1 getRecipientBank() {
		return recipientBank;
	}

	public PaymentObligation2 setRecipientBank(BICIdentification1 recipientBank) {
		this.recipientBank = Objects.requireNonNull(recipientBank);
		return this;
	}

	public AmountOrPercentage2Choice getPaymentObligationAmount() {
		return paymentObligationAmount;
	}

	public PaymentObligation2 setPaymentObligationAmount(AmountOrPercentage2Choice paymentObligationAmount) {
		this.paymentObligationAmount = Objects.requireNonNull(paymentObligationAmount);
		return this;
	}

	public List<Charges5> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public PaymentObligation2 setCharges(List<Charges5> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public PaymentObligation2 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Optional<BPOApplicableRules1Choice> getApplicableRules() {
		return applicableRules == null ? Optional.empty() : Optional.of(applicableRules);
	}

	public PaymentObligation2 setApplicableRules(BPOApplicableRules1Choice applicableRules) {
		this.applicableRules = applicableRules;
		return this;
	}

	public Optional<CountryCode> getApplicableLaw() {
		return applicableLaw == null ? Optional.empty() : Optional.of(applicableLaw);
	}

	public PaymentObligation2 setApplicableLaw(CountryCode applicableLaw) {
		this.applicableLaw = applicableLaw;
		return this;
	}

	public Optional<Location2> getPlaceOfJurisdiction() {
		return placeOfJurisdiction == null ? Optional.empty() : Optional.of(placeOfJurisdiction);
	}

	public PaymentObligation2 setPlaceOfJurisdiction(Location2 placeOfJurisdiction) {
		this.placeOfJurisdiction = placeOfJurisdiction;
		return this;
	}

	public List<PaymentTerms4> getPaymentTerms() {
		return paymentTerms == null ? paymentTerms = new ArrayList<>() : paymentTerms;
	}

	public PaymentObligation2 setPaymentTerms(List<PaymentTerms4> paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public Optional<SettlementTerms3> getSettlementTerms() {
		return settlementTerms == null ? Optional.empty() : Optional.of(settlementTerms);
	}

	public PaymentObligation2 setSettlementTerms(SettlementTerms3 settlementTerms) {
		this.settlementTerms = settlementTerms;
		return this;
	}
}