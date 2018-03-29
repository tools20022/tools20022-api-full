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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Measure of the total capital requirement all the clearing members are
 * required to hold against their default fund contributions to a central
 * counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HypotheticalCapitalMeasure1#mmAmount
 * HypotheticalCapitalMeasure1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HypotheticalCapitalMeasure1#mmDefaultWaterfallIdentification
 * HypotheticalCapitalMeasure1.mmDefaultWaterfallIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmHypotheticalCapitalMeasure
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmHypotheticalCapitalMeasure}</li>
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
 * "HypotheticalCapitalMeasure1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Measure of the total capital requirement all the clearing members are required to hold against their default fund contributions to a central counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "HypotheticalCapitalMeasure1", propOrder = {"amount", "defaultWaterfallIdentification"})
public class HypotheticalCapitalMeasure1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HypotheticalCapitalMeasure1
	 * HypotheticalCapitalMeasure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the amount of the total capital requirement all the clearing members are required to hold against their default fund contributions to a central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HypotheticalCapitalMeasure1, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<HypotheticalCapitalMeasure1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HypotheticalCapitalMeasure1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Indicates the amount of the total capital requirement all the clearing members are required to hold against their default fund contributions to a central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(HypotheticalCapitalMeasure1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(HypotheticalCapitalMeasure1 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "DfltWtrfllId", required = true)
	protected Max35Text defaultWaterfallIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HypotheticalCapitalMeasure1
	 * HypotheticalCapitalMeasure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltWtrfllId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultWaterfallIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique internal identifier for each default waterfall at the central counterparty.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HypotheticalCapitalMeasure1, Max35Text> mmDefaultWaterfallIdentification = new MMMessageAttribute<HypotheticalCapitalMeasure1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HypotheticalCapitalMeasure1.mmObject();
			isDerived = false;
			xmlTag = "DfltWtrfllId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultWaterfallIdentification";
			definition = "Unique internal identifier for each default waterfall at the central counterparty.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(HypotheticalCapitalMeasure1 obj) {
			return obj.getDefaultWaterfallIdentification();
		}

		@Override
		public void setValue(HypotheticalCapitalMeasure1 obj, Max35Text value) {
			obj.setDefaultWaterfallIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HypotheticalCapitalMeasure1.mmAmount, com.tools20022.repository.msg.HypotheticalCapitalMeasure1.mmDefaultWaterfallIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPIncomeStatementAndCapitalAdequacyReportV01.mmHypotheticalCapitalMeasure);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "HypotheticalCapitalMeasure1";
				definition = "Measure of the total capital requirement all the clearing members are required to hold against their default fund contributions to a central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public HypotheticalCapitalMeasure1 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Max35Text getDefaultWaterfallIdentification() {
		return defaultWaterfallIdentification;
	}

	public HypotheticalCapitalMeasure1 setDefaultWaterfallIdentification(Max35Text defaultWaterfallIdentification) {
		this.defaultWaterfallIdentification = Objects.requireNonNull(defaultWaterfallIdentification);
		return this;
	}
}