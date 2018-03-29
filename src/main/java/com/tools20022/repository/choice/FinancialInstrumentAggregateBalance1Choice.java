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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of holding indicator and aggregated position of holdings.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice#mmHoldingsIndicator
 * FinancialInstrumentAggregateBalance1Choice.mmHoldingsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice#mmHoldingBalance
 * FinancialInstrumentAggregateBalance1Choice.mmHoldingBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetHolding
 * AssetHolding}</li>
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
 * "FinancialInstrumentAggregateBalance1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of holding indicator and aggregated position of holdings."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAggregateBalance1Choice", propOrder = {"holdingsIndicator", "holdingBalance"})
public class FinancialInstrumentAggregateBalance1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HldgsInd", required = true)
	protected YesNoIndicator holdingsIndicator;
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice
	 * FinancialInstrumentAggregateBalance1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether holdings are present."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAggregateBalance1Choice, YesNoIndicator> mmHoldingsIndicator = new MMMessageAttribute<FinancialInstrumentAggregateBalance1Choice, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice.mmObject();
			isDerived = false;
			xmlTag = "HldgsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsIndicator";
			definition = "Indicates whether holdings are present.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrumentAggregateBalance1Choice obj) {
			return obj.getHoldingsIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAggregateBalance1Choice obj, YesNoIndicator value) {
			obj.setHoldingsIndicator(value);
		}
	};
	@XmlElement(name = "HldgBal", required = true)
	protected FinancialInstrumentAggregateBalance2 holdingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2
	 * FinancialInstrumentAggregateBalance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice
	 * FinancialInstrumentAggregateBalance1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of holdings."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAggregateBalance1Choice, FinancialInstrumentAggregateBalance2> mmHoldingBalance = new MMMessageAssociationEnd<FinancialInstrumentAggregateBalance1Choice, FinancialInstrumentAggregateBalance2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice.mmObject();
			isDerived = false;
			xmlTag = "HldgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingBalance";
			definition = "Balance of holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAggregateBalance2.mmObject();
		}

		@Override
		public FinancialInstrumentAggregateBalance2 getValue(FinancialInstrumentAggregateBalance1Choice obj) {
			return obj.getHoldingBalance();
		}

		@Override
		public void setValue(FinancialInstrumentAggregateBalance1Choice obj, FinancialInstrumentAggregateBalance2 value) {
			obj.setHoldingBalance(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice.mmHoldingsIndicator,
						com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice.mmHoldingBalance);
				trace_lazy = () -> AssetHolding.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAggregateBalance1Choice";
				definition = "Choice of holding indicator and aggregated position of holdings.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getHoldingsIndicator() {
		return holdingsIndicator;
	}

	public FinancialInstrumentAggregateBalance1Choice setHoldingsIndicator(YesNoIndicator holdingsIndicator) {
		this.holdingsIndicator = Objects.requireNonNull(holdingsIndicator);
		return this;
	}

	public FinancialInstrumentAggregateBalance2 getHoldingBalance() {
		return holdingBalance;
	}

	public FinancialInstrumentAggregateBalance1Choice setHoldingBalance(FinancialInstrumentAggregateBalance2 holdingBalance) {
		this.holdingBalance = Objects.requireNonNull(holdingBalance);
		return this;
	}
}