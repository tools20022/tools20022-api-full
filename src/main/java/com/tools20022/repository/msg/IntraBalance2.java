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
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-balance movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettledAmount
 * IntraBalance2.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmPreviouslySettledAmount
 * IntraBalance2.mmPreviouslySettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmRemainingSettlementAmount
 * IntraBalance2.mmRemainingSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettlementDate
 * IntraBalance2.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmBalanceFrom
 * IntraBalance2.mmBalanceFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmBalanceTo
 * IntraBalance2.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmCashSubBalanceIdentification
 * IntraBalance2.mmCashSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmInstructionProcessingAdditionalDetails
 * IntraBalance2.mmInstructionProcessingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalance2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-balance movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraBalance2", propOrder = {"settledAmount", "previouslySettledAmount", "remainingSettlementAmount", "settlementDate", "balanceFrom", "balanceTo", "cashSubBalanceIdentification", "instructionProcessingAdditionalDetails"})
public class IntraBalance2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Amount2Choice settledAmount;
	/**
	 * Amount of money effectively settled and which will be credited to/debited
	 * from the account owner's cash account. It may differ from the instructed
	 * settlement amount based on market tolerance level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettledAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}
	};
	protected Amount2Choice previouslySettledAmount;
	/**
	 * Amount of money previously settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money previously settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviouslySettledAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledAmount";
			definition = "Amount of money previously settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}
	};
	protected Amount2Choice remainingSettlementAmount;
	/**
	 * Amount of money remaining to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remaining to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemainingSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "RmngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingSettlementAmount";
			definition = "Amount of money remaining to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice settlementDate;
	/**
	 * Date and time at which the amount of money is moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the amount of money is moved."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the amount of money is moved.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected CashSubBalanceTypeAndQuantityBreakdown1 balanceFrom;
	/**
	 * Balance from which the amount of money is moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
	 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the amount of money is moved."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceFrom = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashBalance;
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the amount of money is moved.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}
	};
	protected CashSubBalanceTypeAndQuantityBreakdown1 balanceTo;
	/**
	 * Balance to which the amount of money is moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
	 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the amount of money is moved."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashBalance;
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the amount of money is moved.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}
	};
	protected GenericIdentification37 cashSubBalanceIdentification;
	/**
	 * Number identifying a lot constituting the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number identifying a lot constituting the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashSubBalanceIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashBalance.mmObject();
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification37.mmObject();
		}
	};
	protected Max350Text instructionProcessingAdditionalDetails;
	/**
	 * Provides additional settlement processing information which can not be
	 * included within the structured fields of the message.
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraBalance2.mmSettledAmount, IntraBalance2.mmPreviouslySettledAmount, IntraBalance2.mmRemainingSettlementAmount, IntraBalance2.mmSettlementDate, IntraBalance2.mmBalanceFrom,
						IntraBalance2.mmBalanceTo, IntraBalance2.mmCashSubBalanceIdentification, IntraBalance2.mmInstructionProcessingAdditionalDetails);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalance2";
				definition = "Details of the intra-balance movement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttldAmt")
	public Amount2Choice getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(Amount2Choice settledAmount) {
		this.settledAmount = settledAmount;
	}

	@XmlElement(name = "PrevslySttldAmt")
	public Amount2Choice getPreviouslySettledAmount() {
		return previouslySettledAmount;
	}

	public void setPreviouslySettledAmount(Amount2Choice previouslySettledAmount) {
		this.previouslySettledAmount = previouslySettledAmount;
	}

	@XmlElement(name = "RmngSttlmAmt")
	public Amount2Choice getRemainingSettlementAmount() {
		return remainingSettlementAmount;
	}

	public void setRemainingSettlementAmount(Amount2Choice remainingSettlementAmount) {
		this.remainingSettlementAmount = remainingSettlementAmount;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public DateAndDateTimeChoice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(DateAndDateTimeChoice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "BalFr", required = true)
	public CashSubBalanceTypeAndQuantityBreakdown1 getBalanceFrom() {
		return balanceFrom;
	}

	public void setBalanceFrom(com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1 balanceFrom) {
		this.balanceFrom = balanceFrom;
	}

	@XmlElement(name = "BalTo", required = true)
	public CashSubBalanceTypeAndQuantityBreakdown1 getBalanceTo() {
		return balanceTo;
	}

	public void setBalanceTo(com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1 balanceTo) {
		this.balanceTo = balanceTo;
	}

	@XmlElement(name = "CshSubBalId")
	public GenericIdentification37 getCashSubBalanceIdentification() {
		return cashSubBalanceIdentification;
	}

	public void setCashSubBalanceIdentification(com.tools20022.repository.msg.GenericIdentification37 cashSubBalanceIdentification) {
		this.cashSubBalanceIdentification = cashSubBalanceIdentification;
	}

	@XmlElement(name = "InstrPrcgAddtlDtls")
	public Max350Text getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails;
	}

	public void setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
	}
}