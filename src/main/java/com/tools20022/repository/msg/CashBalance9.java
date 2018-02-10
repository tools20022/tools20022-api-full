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
import com.tools20022.repository.choice.BalanceType8Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearch3Choice;
import com.tools20022.repository.codeset.BalanceCounterparty1Code;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance details for a cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance9#mmType
 * CashBalance9.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalance9#mmCounterpartyType
 * CashBalance9.mmCounterpartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalance9#mmCounterpartyIdentification
 * CashBalance9.mmCounterpartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance9#mmValueDate
 * CashBalance9.mmValueDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule#forCashBalance9
 * ConstraintCounterpartyIdentification1Rule.forCashBalance9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentification2Rule#forCashBalance9
 * ConstraintCounterpartyIdentification2Rule.forCashBalance9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashBalance9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance details for a cash account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashBalance4
 * CashBalance4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashBalance9", propOrder = {"type", "counterpartyType", "counterpartyIdentification", "valueDate"})
public class CashBalance9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected List<BalanceType8Choice> type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BalanceType8Choice
	 * BalanceType8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance9 CashBalance9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature of a balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#mmType
	 * CashBalance4.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalance9.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			previousVersion_lazy = () -> CashBalance4.mmType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceType8Choice.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyTp", required = true)
	protected BalanceCounterparty1Code counterpartyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceCounterparty1Code
	 * BalanceCounterparty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCalculationType
	 * CashBalance.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance9 CashBalance9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of counterparty for which the balance is calculated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#mmCounterpartyType
	 * CashBalance4.mmCounterpartyType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalance9.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyType";
			definition = "Specifies the type of counterparty for which the balance is calculated.";
			previousVersion_lazy = () -> CashBalance4.mmCounterpartyType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceCounterparty1Code.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyId")
	protected List<com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5> counterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCounterparty
	 * CashBalance.mmCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance9 CashBalance9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty for which the balance is calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#mmCounterpartyIdentification
	 * CashBalance4.mmCounterpartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCounterparty;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalance9.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Specifies the counterparty for which the balance is calculated.";
			previousVersion_lazy = () -> CashBalance4.mmCounterpartyIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "ValDt")
	protected List<DateAndDateTimeSearch3Choice> valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice
	 * DateAndDateTimeSearch3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmValueDate
	 * Balance.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance9 CashBalance9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the balance is or will be available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#mmValueDate
	 * CashBalance4.mmValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Balance.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalance9.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which the balance is or will be available.";
			previousVersion_lazy = () -> CashBalance4.mmValueDate;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalance9.mmType, com.tools20022.repository.msg.CashBalance9.mmCounterpartyType,
						com.tools20022.repository.msg.CashBalance9.mmCounterpartyIdentification, com.tools20022.repository.msg.CashBalance9.mmValueDate);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCounterpartyIdentification1Rule.forCashBalance9,
						com.tools20022.repository.constraints.ConstraintCounterpartyIdentification2Rule.forCashBalance9);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashBalance9";
				definition = "Balance details for a cash account.";
				previousVersion_lazy = () -> CashBalance4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<BalanceType8Choice> getType() {
		return type == null ? type = new ArrayList<>() : type;
	}

	public CashBalance9 setType(List<BalanceType8Choice> type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public BalanceCounterparty1Code getCounterpartyType() {
		return counterpartyType;
	}

	public CashBalance9 setCounterpartyType(BalanceCounterparty1Code counterpartyType) {
		this.counterpartyType = Objects.requireNonNull(counterpartyType);
		return this;
	}

	public List<BranchAndFinancialInstitutionIdentification5> getCounterpartyIdentification() {
		return counterpartyIdentification == null ? counterpartyIdentification = new ArrayList<>() : counterpartyIdentification;
	}

	public CashBalance9 setCounterpartyIdentification(List<com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5> counterpartyIdentification) {
		this.counterpartyIdentification = Objects.requireNonNull(counterpartyIdentification);
		return this;
	}

	public List<DateAndDateTimeSearch3Choice> getValueDate() {
		return valueDate == null ? valueDate = new ArrayList<>() : valueDate;
	}

	public CashBalance9 setValueDate(List<DateAndDateTimeSearch3Choice> valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}
}