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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Collateral1;
import com.tools20022.repository.msg.MarginCollateral1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice to provide the collateral balance for the variation margin and the
 * segregated independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice#mmTotalCollateral
 * CollateralBalance1Choice.mmTotalCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice#mmCollateralDetails
 * CollateralBalance1Choice.mmCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice#mmSegregatedIndependentAmount
 * CollateralBalance1Choice.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
 * ExposureCalculation}</li>
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
 * "CollateralBalance1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to provide the collateral balance for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralBalance1Choice", propOrder = {"totalCollateral", "collateralDetails", "segregatedIndependentAmount"})
public class CollateralBalance1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlColl", required = true)
	protected ActiveCurrencyAndAmount totalCollateral;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice
	 * CollateralBalance1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralBalance1Choice, ActiveCurrencyAndAmount> mmTotalCollateral = new MMMessageAttribute<CollateralBalance1Choice, ActiveCurrencyAndAmount>() {
		{
			businessComponentTrace_lazy = () -> ExposureCalculation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralBalance1Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateral";
			definition = "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CollateralBalance1Choice obj) {
			return obj.getTotalCollateral();
		}

		@Override
		public void setValue(CollateralBalance1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setTotalCollateral(value);
		}
	};
	@XmlElement(name = "CollDtls", required = true)
	protected Collateral1 collateralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral1
	 * Collateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice
	 * CollateralBalance1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralBalance1Choice, Collateral1> mmCollateralDetails = new MMMessageAssociationEnd<CollateralBalance1Choice, Collateral1>() {
		{
			businessComponentTrace_lazy = () -> ExposureCalculation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralBalance1Choice.mmObject();
			isDerived = false;
			xmlTag = "CollDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDetails";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, for the variation margin and optionally the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Collateral1.mmObject();
		}

		@Override
		public Collateral1 getValue(CollateralBalance1Choice obj) {
			return obj.getCollateralDetails();
		}

		@Override
		public void setValue(CollateralBalance1Choice obj, Collateral1 value) {
			obj.setCollateralDetails(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmt", required = true)
	protected MarginCollateral1 segregatedIndependentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCollateral1
	 * MarginCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentSegregatedIndependentAmount
	 * ExposureCalculation.mmCurrentSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice
	 * CollateralBalance1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralBalance1Choice, MarginCollateral1> mmSegregatedIndependentAmount = new MMMessageAssociationEnd<CollateralBalance1Choice, MarginCollateral1>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmCurrentSegregatedIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralBalance1Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginCollateral1.mmObject();
		}

		@Override
		public MarginCollateral1 getValue(CollateralBalance1Choice obj) {
			return obj.getSegregatedIndependentAmount();
		}

		@Override
		public void setValue(CollateralBalance1Choice obj, MarginCollateral1 value) {
			obj.setSegregatedIndependentAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralBalance1Choice.mmTotalCollateral, com.tools20022.repository.choice.CollateralBalance1Choice.mmCollateralDetails,
						com.tools20022.repository.choice.CollateralBalance1Choice.mmSegregatedIndependentAmount);
				trace_lazy = () -> ExposureCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralBalance1Choice";
				definition = "Choice to provide the collateral balance for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTotalCollateral() {
		return totalCollateral;
	}

	public CollateralBalance1Choice setTotalCollateral(ActiveCurrencyAndAmount totalCollateral) {
		this.totalCollateral = Objects.requireNonNull(totalCollateral);
		return this;
	}

	public Collateral1 getCollateralDetails() {
		return collateralDetails;
	}

	public CollateralBalance1Choice setCollateralDetails(Collateral1 collateralDetails) {
		this.collateralDetails = Objects.requireNonNull(collateralDetails);
		return this;
	}

	public MarginCollateral1 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public CollateralBalance1Choice setSegregatedIndependentAmount(MarginCollateral1 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = Objects.requireNonNull(segregatedIndependentAmount);
		return this;
	}
}