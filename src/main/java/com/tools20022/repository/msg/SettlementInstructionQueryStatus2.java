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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementTransactionStatusType2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the settlement instruction status query criteria including the status
 * period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus2#mmType
 * SettlementInstructionQueryStatus2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus2#mmDatePeriod
 * SettlementInstructionQueryStatus2.mmDatePeriod}</li>
 * </ul>
 * </li>
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
 * "SettlementInstructionQueryStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the settlement instruction status query criteria including the status period."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus1
 * SettlementInstructionQueryStatus1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInstructionQueryStatus2", propOrder = {"type", "datePeriod"})
public class SettlementInstructionQueryStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected SettlementTransactionStatusType2 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
	 * SettlementTransactionStatusType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus2
	 * SettlementInstructionQueryStatus2}</li>
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
	 * definition} = "Defines the status type of query criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus1#mmType
	 * SettlementInstructionQueryStatus1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryStatus2, SettlementTransactionStatusType2> mmType = new MMMessageAssociationEnd<SettlementInstructionQueryStatus2, SettlementTransactionStatusType2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryStatus2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Defines the status type of query criteria.";
			previousVersion_lazy = () -> SettlementInstructionQueryStatus1.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTransactionStatusType2.mmObject();
		}

		@Override
		public SettlementTransactionStatusType2 getValue(SettlementInstructionQueryStatus2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SettlementInstructionQueryStatus2 obj, SettlementTransactionStatusType2 value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "DtPrd")
	protected DateAndDateTimeSearch2Choice datePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus2
	 * SettlementInstructionQueryStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date period of the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryStatus1#mmDatePeriod
	 * SettlementInstructionQueryStatus1.mmDatePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInstructionQueryStatus2, Optional<DateAndDateTimeSearch2Choice>> mmDatePeriod = new MMMessageAssociationEnd<SettlementInstructionQueryStatus2, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryStatus2.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Specified date period of the status.";
			previousVersion_lazy = () -> SettlementInstructionQueryStatus1.mmDatePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(SettlementInstructionQueryStatus2 obj) {
			return obj.getDatePeriod();
		}

		@Override
		public void setValue(SettlementInstructionQueryStatus2 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setDatePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstructionQueryStatus2.mmType, com.tools20022.repository.msg.SettlementInstructionQueryStatus2.mmDatePeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInstructionQueryStatus2";
				definition = "Defines the settlement instruction status query criteria including the status period.";
				previousVersion_lazy = () -> SettlementInstructionQueryStatus1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTransactionStatusType2 getType() {
		return type;
	}

	public SettlementInstructionQueryStatus2 setType(SettlementTransactionStatusType2 type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getDatePeriod() {
		return datePeriod == null ? Optional.empty() : Optional.of(datePeriod);
	}

	public SettlementInstructionQueryStatus2 setDatePeriod(DateAndDateTimeSearch2Choice datePeriod) {
		this.datePeriod = datePeriod;
		return this;
	}
}