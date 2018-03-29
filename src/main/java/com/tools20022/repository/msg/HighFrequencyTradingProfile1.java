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
import com.tools20022.repository.choice.ConsolidationType1Choice;
import com.tools20022.repository.choice.SettlementFrequency1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a high frequency trading profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1#mmDate
 * HighFrequencyTradingProfile1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1#mmSettlementFrequency
 * HighFrequencyTradingProfile1.mmSettlementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1#mmConsolidationType
 * HighFrequencyTradingProfile1.mmConsolidationType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HighFrequencyTradingProfile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a high frequency trading profile."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "HighFrequencyTradingProfile1", propOrder = {"date", "settlementFrequency", "consolidationType"})
public class HighFrequencyTradingProfile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt")
	protected ISODate date;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1
	 * HighFrequencyTradingProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the investor starts high frequency trading."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HighFrequencyTradingProfile1, Optional<ISODate>> mmDate = new MMMessageAttribute<HighFrequencyTradingProfile1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HighFrequencyTradingProfile1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date on which the investor starts high frequency trading.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(HighFrequencyTradingProfile1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(HighFrequencyTradingProfile1 obj, Optional<ISODate> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmFrqcy")
	protected SettlementFrequency1Choice settlementFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementFrequency1Choice
	 * SettlementFrequency1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1
	 * HighFrequencyTradingProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HighFrequencyTradingProfile1, Optional<SettlementFrequency1Choice>> mmSettlementFrequency = new MMMessageAssociationEnd<HighFrequencyTradingProfile1, Optional<SettlementFrequency1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HighFrequencyTradingProfile1.mmObject();
			isDerived = false;
			xmlTag = "SttlmFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementFrequency";
			definition = "Frequency of settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementFrequency1Choice.mmObject();
		}

		@Override
		public Optional<SettlementFrequency1Choice> getValue(HighFrequencyTradingProfile1 obj) {
			return obj.getSettlementFrequency();
		}

		@Override
		public void setValue(HighFrequencyTradingProfile1 obj, Optional<SettlementFrequency1Choice> value) {
			obj.setSettlementFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "CnsldtnTp")
	protected ConsolidationType1Choice consolidationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConsolidationType1Choice
	 * ConsolidationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1
	 * HighFrequencyTradingProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsldtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether consolidation is done generally or at the level of segregated account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HighFrequencyTradingProfile1, Optional<ConsolidationType1Choice>> mmConsolidationType = new MMMessageAssociationEnd<HighFrequencyTradingProfile1, Optional<ConsolidationType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HighFrequencyTradingProfile1.mmObject();
			isDerived = false;
			xmlTag = "CnsldtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidationType";
			definition = "Specifies whether consolidation is done generally or at the level of segregated account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConsolidationType1Choice.mmObject();
		}

		@Override
		public Optional<ConsolidationType1Choice> getValue(HighFrequencyTradingProfile1 obj) {
			return obj.getConsolidationType();
		}

		@Override
		public void setValue(HighFrequencyTradingProfile1 obj, Optional<ConsolidationType1Choice> value) {
			obj.setConsolidationType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HighFrequencyTradingProfile1.mmDate, com.tools20022.repository.msg.HighFrequencyTradingProfile1.mmSettlementFrequency,
						com.tools20022.repository.msg.HighFrequencyTradingProfile1.mmConsolidationType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HighFrequencyTradingProfile1";
				definition = "Information about a high frequency trading profile.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public HighFrequencyTradingProfile1 setDate(ISODate date) {
		this.date = date;
		return this;
	}

	public Optional<SettlementFrequency1Choice> getSettlementFrequency() {
		return settlementFrequency == null ? Optional.empty() : Optional.of(settlementFrequency);
	}

	public HighFrequencyTradingProfile1 setSettlementFrequency(SettlementFrequency1Choice settlementFrequency) {
		this.settlementFrequency = settlementFrequency;
		return this;
	}

	public Optional<ConsolidationType1Choice> getConsolidationType() {
		return consolidationType == null ? Optional.empty() : Optional.of(consolidationType);
	}

	public HighFrequencyTradingProfile1 setConsolidationType(ConsolidationType1Choice consolidationType) {
		this.consolidationType = consolidationType;
		return this;
	}
}