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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class PaymentObligation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BICIdentification1 obligorBank;
	/**
	 * Bank that has to pay under the obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmObligorBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "OblgrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorBank";
			definition = "Bank that has to pay under the obligation.";
			previousVersion_lazy = () -> PaymentObligation1.mmObligorBank;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected BICIdentification1 recipientBank;
	/**
	 * Bank that will be paid under the obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRecipientBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "RcptBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientBank";
			definition = "Bank that will be paid under the obligation.";
			previousVersion_lazy = () -> PaymentObligation1.mmRecipientBank;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected AmountOrPercentage2Choice paymentObligationAmount;
	/**
	 * Payment obligation amount specified as an amount or percentage.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPaymentObligationAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> PaymentObligation2.mmObject();
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
	};
	protected List<com.tools20022.repository.msg.Charges5> charges;
	/**
	 * Charges related to the payment obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCharges = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Charges related to the payment obligation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charges5.mmObject();
		}
	};
	protected ISODate expiryDate;
	/**
	 * Date at which the obligation will expire.
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
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExpiryDate;
			componentContext_lazy = () -> PaymentObligation2.mmObject();
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
	};
	protected BPOApplicableRules1Choice applicableRules;
	/**
	 * Rules which apply to the BPO (Bank Payment Obligation).
	 * <p>
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
	public static final MMMessageAssociationEnd mmApplicableRules = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmGoverningDocument;
			componentContext_lazy = () -> PaymentObligation2.mmObject();
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
	};
	protected CountryCode applicableLaw;
	/**
	 * Country of which the law governs the bank payment obligation.
	 * <p>
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
	public static final MMMessageAttribute mmApplicableLaw = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmApplicableLaw;
			componentContext_lazy = () -> PaymentObligation2.mmObject();
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
	};
	protected Location2 placeOfJurisdiction;
	/**
	 * Location and forum for dispute resolution.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPlaceOfJurisdiction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Jurisdiction.mmIdentification;
			componentContext_lazy = () -> PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfJursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfJurisdiction";
			definition = "Location and forum for dispute resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Location2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentTerms4> paymentTerms;
	/**
	 * Payment processes required to transfer cash from the debtor to the
	 * creditor.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPaymentTerms = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentObligation.mmObject();
			componentContext_lazy = () -> PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			previousVersion_lazy = () -> PaymentObligation1.mmPaymentTerms;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTerms4.mmObject();
		}
	};
	protected SettlementTerms3 settlementTerms;
	/**
	 * Instruction between two clearing agents stipulating the cash transfer
	 * characteristics between the two parties.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSettlementTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> PaymentObligation2.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Instruction between two clearing agents stipulating the cash transfer characteristics between the two parties.";
			previousVersion_lazy = () -> PaymentObligation1.mmSettlementTerms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTerms3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentObligation2.mmObligorBank, PaymentObligation2.mmRecipientBank, PaymentObligation2.mmPaymentObligationAmount, PaymentObligation2.mmCharges, PaymentObligation2.mmExpiryDate,
						PaymentObligation2.mmApplicableRules, PaymentObligation2.mmApplicableLaw, PaymentObligation2.mmPlaceOfJurisdiction, PaymentObligation2.mmPaymentTerms, PaymentObligation2.mmSettlementTerms);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentObligation2";
				definition = "Payment obligation contracted between two financial institutions related to the financing of a commercial transaction.";
				nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charges5.mmObject());
				previousVersion_lazy = () -> PaymentObligation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BICIdentification1 getObligorBank() {
		return obligorBank;
	}

	public void setObligorBank(com.tools20022.repository.msg.BICIdentification1 obligorBank) {
		this.obligorBank = obligorBank;
	}

	public BICIdentification1 getRecipientBank() {
		return recipientBank;
	}

	public void setRecipientBank(com.tools20022.repository.msg.BICIdentification1 recipientBank) {
		this.recipientBank = recipientBank;
	}

	public AmountOrPercentage2Choice getPaymentObligationAmount() {
		return paymentObligationAmount;
	}

	public void setPaymentObligationAmount(AmountOrPercentage2Choice paymentObligationAmount) {
		this.paymentObligationAmount = paymentObligationAmount;
	}

	public List<Charges5> getCharges() {
		return charges;
	}

	public void setCharges(List<com.tools20022.repository.msg.Charges5> charges) {
		this.charges = charges;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public BPOApplicableRules1Choice getApplicableRules() {
		return applicableRules;
	}

	public void setApplicableRules(BPOApplicableRules1Choice applicableRules) {
		this.applicableRules = applicableRules;
	}

	public CountryCode getApplicableLaw() {
		return applicableLaw;
	}

	public void setApplicableLaw(CountryCode applicableLaw) {
		this.applicableLaw = applicableLaw;
	}

	public Location2 getPlaceOfJurisdiction() {
		return placeOfJurisdiction;
	}

	public void setPlaceOfJurisdiction(com.tools20022.repository.msg.Location2 placeOfJurisdiction) {
		this.placeOfJurisdiction = placeOfJurisdiction;
	}

	public List<PaymentTerms4> getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(List<com.tools20022.repository.msg.PaymentTerms4> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public SettlementTerms3 getSettlementTerms() {
		return settlementTerms;
	}

	public void setSettlementTerms(com.tools20022.repository.msg.SettlementTerms3 settlementTerms) {
		this.settlementTerms = settlementTerms;
	}
}