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
import com.tools20022.repository.codeset.DayCountFraction1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndCurrency2;
import com.tools20022.repository.msg.GenericIdentification169;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Elements characterising a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90#mmNotional
 * FinancialInstrumentAttributes90.mmNotional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90#mmUnitValue
 * FinancialInstrumentAttributes90.mmUnitValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90#mmIndexIdentification
 * FinancialInstrumentAttributes90.mmIndexIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90#mmIndexUnit
 * FinancialInstrumentAttributes90.mmIndexUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90#mmInterestRateTerms
 * FinancialInstrumentAttributes90.mmInterestRateTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "FinancialInstrumentAttributes90"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Elements characterising a financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes90", propOrder = {"notional", "unitValue", "indexIdentification", "indexUnit", "interestRateTerms"})
public class FinancialInstrumentAttributes90 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ntnl")
	protected ActiveCurrencyAndAmount notional;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
	 * Derivative.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90
	 * FinancialInstrumentAttributes90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference notional amount of the contract.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes90, Optional<ActiveCurrencyAndAmount>> mmNotional = new MMMessageAttribute<FinancialInstrumentAttributes90, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmObject();
			isDerived = false;
			xmlTag = "Ntnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notional";
			definition = "Reference notional amount of the contract.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(FinancialInstrumentAttributes90 obj) {
			return obj.getNotional();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes90 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNotional(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitVal", required = true)
	protected AmountAndCurrency2 unitValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndCurrency2
	 * AmountAndCurrency2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90
	 * FinancialInstrumentAttributes90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of unit move in index if fixed in contract terms, and currency of payments relating to changes in the amount of the underlying.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes90, AmountAndCurrency2> mmUnitValue = new MMMessageAssociationEnd<FinancialInstrumentAttributes90, AmountAndCurrency2>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmObject();
			isDerived = false;
			xmlTag = "UnitVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitValue";
			definition = "Value of unit move in index if fixed in contract terms, and currency of payments relating to changes in the amount of the underlying.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndCurrency2.mmObject();
		}

		@Override
		public AmountAndCurrency2 getValue(FinancialInstrumentAttributes90 obj) {
			return obj.getUnitValue();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes90 obj, AmountAndCurrency2 value) {
			obj.setUnitValue(value);
		}
	};
	@XmlElement(name = "IndxId", required = true)
	protected GenericIdentification169 indexIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification169
	 * GenericIdentification169}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestName
	 * Interest.mmInterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90
	 * FinancialInstrumentAttributes90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for underlying index on which final settlement price or periodic payments are calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes90, GenericIdentification169> mmIndexIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributes90, GenericIdentification169>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmObject();
			isDerived = false;
			xmlTag = "IndxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexIdentification";
			definition = "Unique identifier for underlying index on which final settlement price or periodic payments are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification169.mmObject();
		}

		@Override
		public GenericIdentification169 getValue(FinancialInstrumentAttributes90 obj) {
			return obj.getIndexIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes90 obj, GenericIdentification169 value) {
			obj.setIndexIdentification(value);
		}
	};
	@XmlElement(name = "IndxUnit", required = true)
	protected Max35Text indexUnit;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90
	 * FinancialInstrumentAttributes90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit index, typically ‘Points’, or for interest rate and CDS products, ‘Bps’.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes90, Max35Text> mmIndexUnit = new MMMessageAttribute<FinancialInstrumentAttributes90, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmObject();
			isDerived = false;
			xmlTag = "IndxUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexUnit";
			definition = "Unit index, typically ‘Points’, or for interest rate and CDS products, ‘Bps’.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(FinancialInstrumentAttributes90 obj) {
			return obj.getIndexUnit();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes90 obj, Max35Text value) {
			obj.setIndexUnit(value);
		}
	};
	@XmlElement(name = "IntrstRateTerms")
	protected DayCountFraction1Code interestRateTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes90
	 * FinancialInstrumentAttributes90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRateTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Day count convention for interest payments. Interest rate products only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes90, Optional<DayCountFraction1Code>> mmInterestRateTerms = new MMMessageAttribute<FinancialInstrumentAttributes90, Optional<DayCountFraction1Code>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateTerms";
			definition = "Day count convention for interest payments. Interest rate products only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DayCountFraction1Code.mmObject();
		}

		@Override
		public Optional<DayCountFraction1Code> getValue(FinancialInstrumentAttributes90 obj) {
			return obj.getInterestRateTerms();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes90 obj, Optional<DayCountFraction1Code> value) {
			obj.setInterestRateTerms(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmNotional, com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmUnitValue,
						com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmIndexIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmIndexUnit,
						com.tools20022.repository.msg.FinancialInstrumentAttributes90.mmInterestRateTerms);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributes90";
				definition = "Elements characterising a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getNotional() {
		return notional == null ? Optional.empty() : Optional.of(notional);
	}

	public FinancialInstrumentAttributes90 setNotional(ActiveCurrencyAndAmount notional) {
		this.notional = notional;
		return this;
	}

	public AmountAndCurrency2 getUnitValue() {
		return unitValue;
	}

	public FinancialInstrumentAttributes90 setUnitValue(AmountAndCurrency2 unitValue) {
		this.unitValue = Objects.requireNonNull(unitValue);
		return this;
	}

	public GenericIdentification169 getIndexIdentification() {
		return indexIdentification;
	}

	public FinancialInstrumentAttributes90 setIndexIdentification(GenericIdentification169 indexIdentification) {
		this.indexIdentification = Objects.requireNonNull(indexIdentification);
		return this;
	}

	public Max35Text getIndexUnit() {
		return indexUnit;
	}

	public FinancialInstrumentAttributes90 setIndexUnit(Max35Text indexUnit) {
		this.indexUnit = Objects.requireNonNull(indexUnit);
		return this;
	}

	public Optional<DayCountFraction1Code> getInterestRateTerms() {
		return interestRateTerms == null ? Optional.empty() : Optional.of(interestRateTerms);
	}

	public FinancialInstrumentAttributes90 setInterestRateTerms(DayCountFraction1Code interestRateTerms) {
		this.interestRateTerms = interestRateTerms;
		return this;
	}
}