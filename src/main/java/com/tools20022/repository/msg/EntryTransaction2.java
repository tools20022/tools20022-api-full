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
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.choice.SecurityIdentification4Choice;
import com.tools20022.repository.choice.TransactionPrice2Choice;
import com.tools20022.repository.choice.TransactionQuantities1Choice;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#mmReferences
 * EntryTransaction2.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmAmountDetails
 * EntryTransaction2.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmAvailability
 * EntryTransaction2.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmBankTransactionCode
 * EntryTransaction2.mmBankTransactionCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#mmCharges
 * EntryTransaction2.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#mmInterest
 * EntryTransaction2.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedParties
 * EntryTransaction2.mmRelatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedAgents
 * EntryTransaction2.mmRelatedAgents}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#mmPurpose
 * EntryTransaction2.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedRemittanceInformation
 * EntryTransaction2.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRemittanceInformation
 * EntryTransaction2.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedDates
 * EntryTransaction2.mmRelatedDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedPrice
 * EntryTransaction2.mmRelatedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedQuantities
 * EntryTransaction2.mmRelatedQuantities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmFinancialInstrumentIdentification
 * EntryTransaction2.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#mmTax
 * EntryTransaction2.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmReturnInformation
 * EntryTransaction2.mmReturnInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmCorporateAction
 * EntryTransaction2.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmSafekeepingAccount
 * EntryTransaction2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmAdditionalTransactionInformation
 * EntryTransaction2.mmAdditionalTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
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
 * "EntryTransaction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements used to identify the underlying transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntryTransaction2", propOrder = {"references", "amountDetails", "availability", "bankTransactionCode", "charges", "interest", "relatedParties", "relatedAgents", "purpose", "relatedRemittanceInformation",
		"remittanceInformation", "relatedDates", "relatedPrice", "relatedQuantities", "financialInstrumentIdentification", "tax", "returnInformation", "corporateAction", "safekeepingAccount", "additionalTransactionInformation"})
public class EntryTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs")
	protected TransactionReferences2 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionReferences2
	 * TransactionReferences2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmIdentification
	 * Entry.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the identification of the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferences = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Entry.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements used to provide the identification of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionReferences2.mmObject();
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange3 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Set of elements providing detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<com.tools20022.repository.msg.CashBalanceAvailability2> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2
	 * CashBalanceAvailability2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
	 * CashEntry.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to indicate when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAvailability = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAvailability;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Set of elements used to indicate when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceAvailability2.mmObject();
		}
	};
	@XmlElement(name = "BkTxCd")
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBankTransactionCode = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Entry.mmBankTransactionCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure4.mmObject();
		}
	};
	@XmlElement(name = "Chrgs")
	protected List<com.tools20022.repository.msg.ChargesInformation6> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ChargesInformation6
	 * ChargesInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
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
	 * definition} =
	 * "Provides information on the charges included in the entry amount.\n\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCharges = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.\n\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ChargesInformation6.mmObject();
		}
	};
	@XmlElement(name = "Intrst")
	protected List<com.tools20022.repository.msg.TransactionInterest2> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionInterest2
	 * TransactionInterest2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount.  It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount.  It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionInterest2.mmObject();
		}
	};
	@XmlElement(name = "RltdPties")
	protected TransactionParty2 relatedParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionParty2
	 * TransactionParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the parties related to the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Set of elements used to identify the parties related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionParty2.mmObject();
		}
	};
	@XmlElement(name = "RltdAgts")
	protected TransactionAgents2 relatedAgents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionAgents2
	 * TransactionAgents2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAgts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the agents related to the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedAgents = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RltdAgts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAgents";
			definition = "Set of elements used to identify the agents related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionAgents2.mmObject();
		}
	};
	@XmlElement(name = "Purp")
	protected Purpose2Choice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose2Choice.mmObject();
		}
	};
	@XmlElement(name = "RltdRmtInf")
	protected List<com.tools20022.repository.msg.RemittanceLocation2> relatedRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
	 * Document.mmPlaceOfStorage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmPlaceOfStorage;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Set of elements used to provide information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceLocation2.mmObject();
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation5 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation5
	 * RemittanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structured information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Structured information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceInformation5.mmObject();
		}
	};
	@XmlElement(name = "RltdDts")
	protected TransactionDates2 relatedDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDates2
	 * TransactionDates2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the dates related to the underlying transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedDates = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RltdDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDates";
			definition = "Set of elements used to identify the dates related to the underlying transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionDates2.mmObject();
		}
	};
	@XmlElement(name = "RltdPric")
	protected TransactionPrice2Choice relatedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice2Choice
	 * TransactionPrice2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the price information related to the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RltdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPrice";
			definition = "Set of elements used to identify the price information related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionPrice2Choice.mmObject();
		}
	};
	@XmlElement(name = "RltdQties")
	protected List<TransactionQuantities1Choice> relatedQuantities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice
	 * TransactionQuantities1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
	 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdQties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuantities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the related quantities, such as securities, in the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedQuantities = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesEntry.mmFinancialInstrumentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RltdQties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedQuantities";
			definition = "Set of elements used to identify the related quantities, such as securities, in the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionQuantities1Choice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification4Choice financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice
	 * SecurityIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "Tax")
	protected TaxInformation3 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation3
	 * TaxInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to provide details on the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Set of elements used to provide details on the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxInformation3.mmObject();
		}
	};
	@XmlElement(name = "RtrInf")
	protected ReturnReasonInformation10 returnInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation10
	 * ReturnReasonInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to provide the return information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReturnInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Set of elements used to provide the return information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReturnReasonInformation10.mmObject();
		}
	};
	@XmlElement(name = "CorpActn")
	protected CorporateAction1 corporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateAction1
	 * CorporateAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the underlying corporate action."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateAction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmCorporateEvent;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "CorpActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Set of elements used to identify the underlying corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateAction1.mmObject();
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected CashAccount16 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "AddtlTxInf")
	protected Max500Text additionalTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2
	 * EntryTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTransactionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionInformation";
			definition = "Further details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction2.mmReferences, com.tools20022.repository.msg.EntryTransaction2.mmAmountDetails,
						com.tools20022.repository.msg.EntryTransaction2.mmAvailability, com.tools20022.repository.msg.EntryTransaction2.mmBankTransactionCode, com.tools20022.repository.msg.EntryTransaction2.mmCharges,
						com.tools20022.repository.msg.EntryTransaction2.mmInterest, com.tools20022.repository.msg.EntryTransaction2.mmRelatedParties, com.tools20022.repository.msg.EntryTransaction2.mmRelatedAgents,
						com.tools20022.repository.msg.EntryTransaction2.mmPurpose, com.tools20022.repository.msg.EntryTransaction2.mmRelatedRemittanceInformation, com.tools20022.repository.msg.EntryTransaction2.mmRemittanceInformation,
						com.tools20022.repository.msg.EntryTransaction2.mmRelatedDates, com.tools20022.repository.msg.EntryTransaction2.mmRelatedPrice, com.tools20022.repository.msg.EntryTransaction2.mmRelatedQuantities,
						com.tools20022.repository.msg.EntryTransaction2.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.EntryTransaction2.mmTax, com.tools20022.repository.msg.EntryTransaction2.mmReturnInformation,
						com.tools20022.repository.msg.EntryTransaction2.mmCorporateAction, com.tools20022.repository.msg.EntryTransaction2.mmSafekeepingAccount,
						com.tools20022.repository.msg.EntryTransaction2.mmAdditionalTransactionInformation);
				trace_lazy = () -> Entry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryTransaction2";
				definition = "Set of elements used to identify the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TransactionReferences2> getReferences() {
		return references == null ? Optional.empty() : Optional.of(references);
	}

	public EntryTransaction2 setReferences(com.tools20022.repository.msg.TransactionReferences2 references) {
		this.references = references;
		return this;
	}

	public Optional<AmountAndCurrencyExchange3> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public EntryTransaction2 setAmountDetails(com.tools20022.repository.msg.AmountAndCurrencyExchange3 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public List<CashBalanceAvailability2> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public EntryTransaction2 setAvailability(List<com.tools20022.repository.msg.CashBalanceAvailability2> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public Optional<BankTransactionCodeStructure4> getBankTransactionCode() {
		return bankTransactionCode == null ? Optional.empty() : Optional.of(bankTransactionCode);
	}

	public EntryTransaction2 setBankTransactionCode(com.tools20022.repository.msg.BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	public List<ChargesInformation6> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public EntryTransaction2 setCharges(List<com.tools20022.repository.msg.ChargesInformation6> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public List<TransactionInterest2> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public EntryTransaction2 setInterest(List<com.tools20022.repository.msg.TransactionInterest2> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Optional<TransactionParty2> getRelatedParties() {
		return relatedParties == null ? Optional.empty() : Optional.of(relatedParties);
	}

	public EntryTransaction2 setRelatedParties(com.tools20022.repository.msg.TransactionParty2 relatedParties) {
		this.relatedParties = relatedParties;
		return this;
	}

	public Optional<TransactionAgents2> getRelatedAgents() {
		return relatedAgents == null ? Optional.empty() : Optional.of(relatedAgents);
	}

	public EntryTransaction2 setRelatedAgents(com.tools20022.repository.msg.TransactionAgents2 relatedAgents) {
		this.relatedAgents = relatedAgents;
		return this;
	}

	public Optional<Purpose2Choice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public EntryTransaction2 setPurpose(Purpose2Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RemittanceLocation2> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public EntryTransaction2 setRelatedRemittanceInformation(List<com.tools20022.repository.msg.RemittanceLocation2> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation5> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public EntryTransaction2 setRemittanceInformation(com.tools20022.repository.msg.RemittanceInformation5 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Optional<TransactionDates2> getRelatedDates() {
		return relatedDates == null ? Optional.empty() : Optional.of(relatedDates);
	}

	public EntryTransaction2 setRelatedDates(com.tools20022.repository.msg.TransactionDates2 relatedDates) {
		this.relatedDates = relatedDates;
		return this;
	}

	public Optional<TransactionPrice2Choice> getRelatedPrice() {
		return relatedPrice == null ? Optional.empty() : Optional.of(relatedPrice);
	}

	public EntryTransaction2 setRelatedPrice(TransactionPrice2Choice relatedPrice) {
		this.relatedPrice = relatedPrice;
		return this;
	}

	public List<TransactionQuantities1Choice> getRelatedQuantities() {
		return relatedQuantities == null ? relatedQuantities = new ArrayList<>() : relatedQuantities;
	}

	public EntryTransaction2 setRelatedQuantities(List<TransactionQuantities1Choice> relatedQuantities) {
		this.relatedQuantities = Objects.requireNonNull(relatedQuantities);
		return this;
	}

	public Optional<SecurityIdentification4Choice> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public EntryTransaction2 setFinancialInstrumentIdentification(SecurityIdentification4Choice financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<TaxInformation3> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public EntryTransaction2 setTax(com.tools20022.repository.msg.TaxInformation3 tax) {
		this.tax = tax;
		return this;
	}

	public Optional<ReturnReasonInformation10> getReturnInformation() {
		return returnInformation == null ? Optional.empty() : Optional.of(returnInformation);
	}

	public EntryTransaction2 setReturnInformation(com.tools20022.repository.msg.ReturnReasonInformation10 returnInformation) {
		this.returnInformation = returnInformation;
		return this;
	}

	public Optional<CorporateAction1> getCorporateAction() {
		return corporateAction == null ? Optional.empty() : Optional.of(corporateAction);
	}

	public EntryTransaction2 setCorporateAction(com.tools20022.repository.msg.CorporateAction1 corporateAction) {
		this.corporateAction = corporateAction;
		return this;
	}

	public Optional<CashAccount16> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public EntryTransaction2 setSafekeepingAccount(com.tools20022.repository.msg.CashAccount16 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<Max500Text> getAdditionalTransactionInformation() {
		return additionalTransactionInformation == null ? Optional.empty() : Optional.of(additionalTransactionInformation);
	}

	public EntryTransaction2 setAdditionalTransactionInformation(Max500Text additionalTransactionInformation) {
		this.additionalTransactionInformation = additionalTransactionInformation;
		return this;
	}
}