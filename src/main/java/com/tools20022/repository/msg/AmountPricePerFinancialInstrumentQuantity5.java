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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PriceRateOrAmountChoice;
import com.tools20022.repository.choice.YieldedOrValueType1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a ratio: amount price and price fixing date per financial
 * instrument quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmAmountPriceType
 * AmountPricePerFinancialInstrumentQuantity5.mmAmountPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmPriceValue
 * AmountPricePerFinancialInstrumentQuantity5.mmPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmFinancialInstrumentQuantity
 * AmountPricePerFinancialInstrumentQuantity5.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmPriceFixingDate
 * AmountPricePerFinancialInstrumentQuantity5.mmPriceFixingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountPricePerFinancialInstrumentQuantity5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a ratio: amount price and price fixing date per financial instrument quantity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forAmountPricePerFinancialInstrumentQuantity5
 * ConstraintCoexistenceQuantityRule.
 * forAmountPricePerFinancialInstrumentQuantity5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8
 * AmountPricePerFinancialInstrumentQuantity8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity5", propOrder = {"amountPriceType", "priceValue", "financialInstrumentQuantity", "priceFixingDate"})
public class AmountPricePerFinancialInstrumentQuantity5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmtPricTp", required = true)
	protected YieldedOrValueType1Choice amountPriceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice
	 * YieldedOrValueType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfAmount
	 * SecuritiesPricing.mmTypeOfAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
	 * AmountPricePerFinancialInstrumentQuantity5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of amount price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90F::4!c//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity8.mmAmountPriceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountPricePerFinancialInstrumentQuantity5, YieldedOrValueType1Choice> mmAmountPriceType = new MMMessageAttribute<AmountPricePerFinancialInstrumentQuantity5, YieldedOrValueType1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmTypeOfAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmObject();
			isDerived = false;
			xmlTag = "AmtPricTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90F::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPriceType";
			definition = "Type of amount price.";
			nextVersions_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity8.mmAmountPriceType);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> YieldedOrValueType1Choice.mmObject();
		}

		@Override
		public YieldedOrValueType1Choice getValue(AmountPricePerFinancialInstrumentQuantity5 obj) {
			return obj.getAmountPriceType();
		}

		@Override
		public void setValue(AmountPricePerFinancialInstrumentQuantity5 obj, YieldedOrValueType1Choice value) {
			obj.setAmountPriceType(value);
		}
	};
	@XmlElement(name = "PricVal", required = true)
	protected PriceRateOrAmountChoice priceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice
	 * PriceRateOrAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
	 * AmountPricePerFinancialInstrumentQuantity5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value given to a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90F::4!c//4!c/3!a15d</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity8.mmPriceValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountPricePerFinancialInstrumentQuantity5, PriceRateOrAmountChoice> mmPriceValue = new MMMessageAttribute<AmountPricePerFinancialInstrumentQuantity5, PriceRateOrAmountChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmObject();
			isDerived = false;
			xmlTag = "PricVal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90F::4!c//4!c/3!a15d"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceValue";
			definition = "Value given to a price.";
			nextVersions_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity8.mmPriceValue);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountChoice.mmObject();
		}

		@Override
		public PriceRateOrAmountChoice getValue(AmountPricePerFinancialInstrumentQuantity5 obj) {
			return obj.getPriceValue();
		}

		@Override
		public void setValue(AmountPricePerFinancialInstrumentQuantity5 obj, PriceRateOrAmountChoice value) {
			obj.setPriceValue(value);
		}
	};
	@XmlElement(name = "FinInstrmQty", required = true)
	protected FinancialInstrumentQuantity1Choice financialInstrumentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
	 * AmountPricePerFinancialInstrumentQuantity5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90F::4!c//4!c/3!a15d/4!c/15d</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmFinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity8.mmFinancialInstrumentQuantity}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmountPricePerFinancialInstrumentQuantity5, FinancialInstrumentQuantity1Choice> mmFinancialInstrumentQuantity = new MMMessageAssociationEnd<AmountPricePerFinancialInstrumentQuantity5, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90F::4!c//4!c/3!a15d/4!c/15d"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Quantity of financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity8.mmFinancialInstrumentQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(AmountPricePerFinancialInstrumentQuantity5 obj) {
			return obj.getFinancialInstrumentQuantity();
		}

		@Override
		public void setValue(AmountPricePerFinancialInstrumentQuantity5 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setFinancialInstrumentQuantity(value);
		}
	};
	@XmlElement(name = "PricFxgDt", required = true)
	protected ISODate priceFixingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDate
	 * SecuritiesPricing.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
	 * AmountPricePerFinancialInstrumentQuantity5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricFxgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the actual price for a financial instrument is fixed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmPriceFixingDate
	 * AmountPricePerFinancialInstrumentQuantity8.mmPriceFixingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountPricePerFinancialInstrumentQuantity5, ISODate> mmPriceFixingDate = new MMMessageAttribute<AmountPricePerFinancialInstrumentQuantity5, ISODate>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmObject();
			isDerived = false;
			xmlTag = "PricFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceFixingDate";
			definition = "Date at which the actual price for a financial instrument is fixed.";
			nextVersions_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity8.mmPriceFixingDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(AmountPricePerFinancialInstrumentQuantity5 obj) {
			return obj.getPriceFixingDate();
		}

		@Override
		public void setValue(AmountPricePerFinancialInstrumentQuantity5 obj, ISODate value) {
			obj.setPriceFixingDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmAmountPriceType, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmPriceValue,
						com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmFinancialInstrumentQuantity, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmPriceFixingDate);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forAmountPricePerFinancialInstrumentQuantity5);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AmountPricePerFinancialInstrumentQuantity5";
				definition = "Specifies a ratio: amount price and price fixing date per financial instrument quantity.";
				nextVersions_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YieldedOrValueType1Choice getAmountPriceType() {
		return amountPriceType;
	}

	public AmountPricePerFinancialInstrumentQuantity5 setAmountPriceType(YieldedOrValueType1Choice amountPriceType) {
		this.amountPriceType = Objects.requireNonNull(amountPriceType);
		return this;
	}

	public PriceRateOrAmountChoice getPriceValue() {
		return priceValue;
	}

	public AmountPricePerFinancialInstrumentQuantity5 setPriceValue(PriceRateOrAmountChoice priceValue) {
		this.priceValue = Objects.requireNonNull(priceValue);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getFinancialInstrumentQuantity() {
		return financialInstrumentQuantity;
	}

	public AmountPricePerFinancialInstrumentQuantity5 setFinancialInstrumentQuantity(FinancialInstrumentQuantity1Choice financialInstrumentQuantity) {
		this.financialInstrumentQuantity = Objects.requireNonNull(financialInstrumentQuantity);
		return this;
	}

	public ISODate getPriceFixingDate() {
		return priceFixingDate;
	}

	public AmountPricePerFinancialInstrumentQuantity5 setPriceFixingDate(ISODate priceFixingDate) {
		this.priceFixingDate = Objects.requireNonNull(priceFixingDate);
		return this;
	}
}