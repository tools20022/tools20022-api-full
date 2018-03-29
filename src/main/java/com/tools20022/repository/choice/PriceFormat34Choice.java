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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice3;
import com.tools20022.repository.msg.AmountPricePerAmount2;
import com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3;
import com.tools20022.repository.msg.PercentagePrice1;
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
 * Choice between a percentage price or an amount price or an amount price per
 * amount or an amount price per financial instrument quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmPercentagePrice
 * PriceFormat34Choice.mmPercentagePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmAmountPrice
 * PriceFormat34Choice.mmAmountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmAmountPricePerFinancialInstrumentQuantity
 * PriceFormat34Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmAmountPricePerAmount
 * PriceFormat34Choice.mmAmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmIndexPoints
 * PriceFormat34Choice.mmIndexPoints}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat34Choice
 * ConstraintCoexistenceQuantityRule.forPriceFormat34Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat34Choice
 * ConstraintCoexistenceAmountRule.forPriceFormat34Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceFormat34Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a percentage price or an amount price or an amount price per amount or an amount price per financial instrument quantity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat48Choice
 * PriceFormat48Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice
 * PriceFormat7Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceFormat34Choice", propOrder = {"percentagePrice", "amountPrice", "amountPricePerFinancialInstrumentQuantity", "amountPricePerAmount", "indexPoints"})
public class PriceFormat34Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PctgPric", required = true)
	protected PercentagePrice1 percentagePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentagePrice1
	 * PercentagePrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentagePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a percentage."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmPercentagePrice
	 * PriceFormat48Choice.mmPercentagePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmPercentagePrice
	 * PriceFormat7Choice.mmPercentagePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat34Choice, PercentagePrice1> mmPercentagePrice = new MMMessageAssociationEnd<PriceFormat34Choice, PercentagePrice1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat34Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentagePrice";
			definition = "Price expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(PriceFormat48Choice.mmPercentagePrice);
			previousVersion_lazy = () -> PriceFormat7Choice.mmPercentagePrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PercentagePrice1.mmObject();
		}

		@Override
		public PercentagePrice1 getValue(PriceFormat34Choice obj) {
			return obj.getPercentagePrice();
		}

		@Override
		public void setValue(PriceFormat34Choice obj, PercentagePrice1 value) {
			obj.setPercentagePrice(value);
		}
	};
	@XmlElement(name = "AmtPric", required = true)
	protected AmountPrice3 amountPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPrice3
	 * AmountPrice3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPrice
	 * PriceFormat48Choice.mmAmountPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmAmountPrice
	 * PriceFormat7Choice.mmAmountPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat34Choice, AmountPrice3> mmAmountPrice = new MMMessageAssociationEnd<PriceFormat34Choice, AmountPrice3>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat34Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPrice";
			definition = "Price expressed as a currency and amount.";
			nextVersions_lazy = () -> Arrays.asList(PriceFormat48Choice.mmAmountPrice);
			previousVersion_lazy = () -> PriceFormat7Choice.mmAmountPrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPrice3.mmObject();
		}

		@Override
		public AmountPrice3 getValue(PriceFormat34Choice obj) {
			return obj.getAmountPrice();
		}

		@Override
		public void setValue(PriceFormat34Choice obj, AmountPrice3 value) {
			obj.setAmountPrice(value);
		}
	};
	@XmlElement(name = "AmtPricPerFinInstrmQty", required = true)
	protected AmountPricePerFinancialInstrumentQuantity3 amountPricePerFinancialInstrumentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
	 * AmountPricePerFinancialInstrumentQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
	 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerFinInstrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90F:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a ratio: amount price per financial instrument quantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat48Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat7Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat34Choice, AmountPricePerFinancialInstrumentQuantity3> mmAmountPricePerFinancialInstrumentQuantity = new MMMessageAssociationEnd<PriceFormat34Choice, AmountPricePerFinancialInstrumentQuantity3>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat34Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPricPerFinInstrmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90F:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as a ratio: amount price per financial instrument quantity.";
			nextVersions_lazy = () -> Arrays.asList(PriceFormat48Choice.mmAmountPricePerFinancialInstrumentQuantity);
			previousVersion_lazy = () -> PriceFormat7Choice.mmAmountPricePerFinancialInstrumentQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPricePerFinancialInstrumentQuantity3.mmObject();
		}

		@Override
		public AmountPricePerFinancialInstrumentQuantity3 getValue(PriceFormat34Choice obj) {
			return obj.getAmountPricePerFinancialInstrumentQuantity();
		}

		@Override
		public void setValue(PriceFormat34Choice obj, AmountPricePerFinancialInstrumentQuantity3 value) {
			obj.setAmountPricePerFinancialInstrumentQuantity(value);
		}
	};
	@XmlElement(name = "AmtPricPerAmt", required = true)
	protected AmountPricePerAmount2 amountPricePerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2
	 * AmountPricePerAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
	 * SecuritiesPricing.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90J:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a ratio: amount price per amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPricePerAmount
	 * PriceFormat48Choice.mmAmountPricePerAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmAmountPricePerAmount
	 * PriceFormat7Choice.mmAmountPricePerAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat34Choice, AmountPricePerAmount2> mmAmountPricePerAmount = new MMMessageAssociationEnd<PriceFormat34Choice, AmountPricePerAmount2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat34Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPricPerAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90J:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as a ratio: amount price per amount.";
			nextVersions_lazy = () -> Arrays.asList(PriceFormat48Choice.mmAmountPricePerAmount);
			previousVersion_lazy = () -> PriceFormat7Choice.mmAmountPricePerAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPricePerAmount2.mmObject();
		}

		@Override
		public AmountPricePerAmount2 getValue(PriceFormat34Choice obj) {
			return obj.getAmountPricePerAmount();
		}

		@Override
		public void setValue(PriceFormat34Choice obj, AmountPricePerAmount2 value) {
			obj.setAmountPricePerAmount(value);
		}
	};
	@XmlElement(name = "IndxPts", required = true)
	protected DecimalNumber indexPoints;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
	 * Index.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed in index points."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmIndexPoints
	 * PriceFormat48Choice.mmIndexPoints}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceFormat34Choice, DecimalNumber> mmIndexPoints = new MMMessageAttribute<PriceFormat34Choice, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexPoints;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat34Choice.mmObject();
			isDerived = false;
			xmlTag = "IndxPts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPoints";
			definition = "Price expressed in index points.";
			nextVersions_lazy = () -> Arrays.asList(PriceFormat48Choice.mmIndexPoints);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(PriceFormat34Choice obj) {
			return obj.getIndexPoints();
		}

		@Override
		public void setValue(PriceFormat34Choice obj, DecimalNumber value) {
			obj.setIndexPoints(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat34Choice.mmPercentagePrice, com.tools20022.repository.choice.PriceFormat34Choice.mmAmountPrice,
						com.tools20022.repository.choice.PriceFormat34Choice.mmAmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat34Choice.mmAmountPricePerAmount,
						com.tools20022.repository.choice.PriceFormat34Choice.mmIndexPoints);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat34Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat34Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PriceFormat34Choice";
				definition = "Choice between a percentage price or an amount price or an amount price per amount or an amount price per financial instrument quantity.";
				nextVersions_lazy = () -> Arrays.asList(PriceFormat48Choice.mmObject());
				previousVersion_lazy = () -> PriceFormat7Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PercentagePrice1 getPercentagePrice() {
		return percentagePrice;
	}

	public PriceFormat34Choice setPercentagePrice(PercentagePrice1 percentagePrice) {
		this.percentagePrice = Objects.requireNonNull(percentagePrice);
		return this;
	}

	public AmountPrice3 getAmountPrice() {
		return amountPrice;
	}

	public PriceFormat34Choice setAmountPrice(AmountPrice3 amountPrice) {
		this.amountPrice = Objects.requireNonNull(amountPrice);
		return this;
	}

	public AmountPricePerFinancialInstrumentQuantity3 getAmountPricePerFinancialInstrumentQuantity() {
		return amountPricePerFinancialInstrumentQuantity;
	}

	public PriceFormat34Choice setAmountPricePerFinancialInstrumentQuantity(AmountPricePerFinancialInstrumentQuantity3 amountPricePerFinancialInstrumentQuantity) {
		this.amountPricePerFinancialInstrumentQuantity = Objects.requireNonNull(amountPricePerFinancialInstrumentQuantity);
		return this;
	}

	public AmountPricePerAmount2 getAmountPricePerAmount() {
		return amountPricePerAmount;
	}

	public PriceFormat34Choice setAmountPricePerAmount(AmountPricePerAmount2 amountPricePerAmount) {
		this.amountPricePerAmount = Objects.requireNonNull(amountPricePerAmount);
		return this;
	}

	public DecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public PriceFormat34Choice setIndexPoints(DecimalNumber indexPoints) {
		this.indexPoints = Objects.requireNonNull(indexPoints);
		return this;
	}
}