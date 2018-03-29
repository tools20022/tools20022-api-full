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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FinancialPartySectorType1Code;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.entity.ClearingSystem;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.NonFinancialInstitution;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NonFinancialInstitutionSector1;
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
 * Nature of the reporting counterparty's company activities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice#mmFinancialInstitution
 * CounterpartyTradeNature4Choice.mmFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice#mmNonFinancialInstitution
 * CounterpartyTradeNature4Choice.mmNonFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice#mmCentralCounterParty
 * CounterpartyTradeNature4Choice.mmCentralCounterParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice#mmOther
 * CounterpartyTradeNature4Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CounterpartyTradeNature4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nature of the reporting counterparty's company activities."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CounterpartyTradeNature4Choice", propOrder = {"financialInstitution", "nonFinancialInstitution", "centralCounterParty", "other"})
public class CounterpartyTradeNature4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FI", required = true)
	protected List<FinancialPartySectorType1Code> financialInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice
	 * CounterpartyTradeNature4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reporting counterparty is a financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CounterpartyTradeNature4Choice, List<FinancialPartySectorType1Code>> mmFinancialInstitution = new MMMessageAttribute<CounterpartyTradeNature4Choice, List<FinancialPartySectorType1Code>>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmObject();
			isDerived = false;
			xmlTag = "FI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitution";
			definition = "Indicates that reporting counterparty is a financial institution.";
			minOccurs = 1;
			simpleType_lazy = () -> FinancialPartySectorType1Code.mmObject();
		}

		@Override
		public List<FinancialPartySectorType1Code> getValue(CounterpartyTradeNature4Choice obj) {
			return obj.getFinancialInstitution();
		}

		@Override
		public void setValue(CounterpartyTradeNature4Choice obj, List<FinancialPartySectorType1Code> value) {
			obj.setFinancialInstitution(value);
		}
	};
	@XmlElement(name = "NFI", required = true)
	protected NonFinancialInstitutionSector1 nonFinancialInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1
	 * NonFinancialInstitutionSector1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonFinancialInstitution
	 * NonFinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice
	 * CounterpartyTradeNature4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reporting counterparty is a non financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CounterpartyTradeNature4Choice, NonFinancialInstitutionSector1> mmNonFinancialInstitution = new MMMessageAssociationEnd<CounterpartyTradeNature4Choice, NonFinancialInstitutionSector1>() {
		{
			businessComponentTrace_lazy = () -> NonFinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmObject();
			isDerived = false;
			xmlTag = "NFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFinancialInstitution";
			definition = "Indicates that reporting counterparty is a non financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NonFinancialInstitutionSector1.mmObject();
		}

		@Override
		public NonFinancialInstitutionSector1 getValue(CounterpartyTradeNature4Choice obj) {
			return obj.getNonFinancialInstitution();
		}

		@Override
		public void setValue(CounterpartyTradeNature4Choice obj, NonFinancialInstitutionSector1 value) {
			obj.setNonFinancialInstitution(value);
		}
	};
	@XmlElement(name = "CntrlCntrPty", required = true)
	protected NoReasonCode centralCounterParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCentralClearingCounterparty
	 * ClearingSystem.mmCentralClearingCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice
	 * CounterpartyTradeNature4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrlCntrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that reporting party is a central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CounterpartyTradeNature4Choice, NoReasonCode> mmCentralCounterParty = new MMMessageAttribute<CounterpartyTradeNature4Choice, NoReasonCode>() {
		{
			businessElementTrace_lazy = () -> ClearingSystem.mmCentralClearingCounterparty;
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmObject();
			isDerived = false;
			xmlTag = "CntrlCntrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterParty";
			definition = "Indicates that reporting party is a central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(CounterpartyTradeNature4Choice obj) {
			return obj.getCentralCounterParty();
		}

		@Override
		public void setValue(CounterpartyTradeNature4Choice obj, NoReasonCode value) {
			obj.setCentralCounterParty(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected NoReasonCode other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice
	 * CounterpartyTradeNature4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reporting party is other type of counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CounterpartyTradeNature4Choice, NoReasonCode> mmOther = new MMMessageAttribute<CounterpartyTradeNature4Choice, NoReasonCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Indicates that reporting party is other type of counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(CounterpartyTradeNature4Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(CounterpartyTradeNature4Choice obj, NoReasonCode value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmFinancialInstitution, com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmNonFinancialInstitution,
						com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmCentralCounterParty, com.tools20022.repository.choice.CounterpartyTradeNature4Choice.mmOther);
				trace_lazy = () -> RolePlayer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CounterpartyTradeNature4Choice";
				definition = "Nature of the reporting counterparty's company activities.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<FinancialPartySectorType1Code> getFinancialInstitution() {
		return financialInstitution == null ? financialInstitution = new ArrayList<>() : financialInstitution;
	}

	public CounterpartyTradeNature4Choice setFinancialInstitution(List<FinancialPartySectorType1Code> financialInstitution) {
		this.financialInstitution = Objects.requireNonNull(financialInstitution);
		return this;
	}

	public NonFinancialInstitutionSector1 getNonFinancialInstitution() {
		return nonFinancialInstitution;
	}

	public CounterpartyTradeNature4Choice setNonFinancialInstitution(NonFinancialInstitutionSector1 nonFinancialInstitution) {
		this.nonFinancialInstitution = Objects.requireNonNull(nonFinancialInstitution);
		return this;
	}

	public NoReasonCode getCentralCounterParty() {
		return centralCounterParty;
	}

	public CounterpartyTradeNature4Choice setCentralCounterParty(NoReasonCode centralCounterParty) {
		this.centralCounterParty = Objects.requireNonNull(centralCounterParty);
		return this;
	}

	public NoReasonCode getOther() {
		return other;
	}

	public CounterpartyTradeNature4Choice setOther(NoReasonCode other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}