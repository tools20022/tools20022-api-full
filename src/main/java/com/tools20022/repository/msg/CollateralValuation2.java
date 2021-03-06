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
import com.tools20022.repository.codeset.CollateralType1Code;
import com.tools20022.repository.codeset.InterestComputationMethod2Code;
import com.tools20022.repository.codeset.SettlementStatus2Code;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral4;
import com.tools20022.repository.msg.CollateralAmount1;
import com.tools20022.repository.msg.OtherCollateral3;
import com.tools20022.repository.msg.SecuritiesCollateral2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCollateralIdentification
 * CollateralValuation2.mmCollateralIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCollateralType
 * CollateralValuation2.mmCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmSettlementStatus
 * CollateralValuation2.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmNumberOfDaysAccrued
 * CollateralValuation2.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmValuationAmounts
 * CollateralValuation2.mmValuationAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmDayCountBasis
 * CollateralValuation2.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmExchangeRate
 * CollateralValuation2.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCurrencyHaircut
 * CollateralValuation2.mmCurrencyHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmAdjustedRate
 * CollateralValuation2.mmAdjustedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmSecuritiesCollateral
 * CollateralValuation2.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCashCollateral
 * CollateralValuation2.mmCashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmOtherCollateral
 * CollateralValuation2.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValuation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the valuation of each piece of collateral that is posted."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation5
 * CollateralValuation5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
 * CollateralValuation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValuation2", propOrder = {"collateralIdentification", "collateralType", "settlementStatus", "numberOfDaysAccrued", "valuationAmounts", "dayCountBasis", "exchangeRate", "currencyHaircut", "adjustedRate",
		"securitiesCollateral", "cashCollateral", "otherCollateral"})
public class CollateralValuation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollId")
	protected Max35Text collateralIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the valued collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCollateralIdentification
	 * CollateralValuation5.mmCollateralIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCollateralReference
	 * CollateralValuation1.mmCollateralReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, Optional<Max35Text>> mmCollateralIdentification = new MMMessageAttribute<CollateralValuation2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "CollId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIdentification";
			definition = "Provides the identification of the valued collateral.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmCollateralIdentification);
			previousVersion_lazy = () -> CollateralValuation1.mmCollateralReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CollateralValuation2 obj) {
			return obj.getCollateralIdentification();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<Max35Text> value) {
			obj.setCollateralIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CollTp", required = true)
	protected CollateralType1Code collateralType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType1Code
	 * CollateralType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
	 * Collateral.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateral used."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCollateralType
	 * CollateralValuation5.mmCollateralType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCollateralType
	 * CollateralValuation1.mmCollateralType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, CollateralType1Code> mmCollateralType = new MMMessageAttribute<CollateralValuation2, CollateralType1Code>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "CollTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral used.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmCollateralType);
			previousVersion_lazy = () -> CollateralValuation1.mmCollateralType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralType1Code.mmObject();
		}

		@Override
		public CollateralType1Code getValue(CollateralValuation2 obj) {
			return obj.getCollateralType();
		}

		@Override
		public void setValue(CollateralValuation2 obj, CollateralType1Code value) {
			obj.setCollateralType(value);
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus2Code settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmSettlement
	 * CollateralStatus.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of settlement of an instruction/financial instrument movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSettlementStatus
	 * CollateralValuation5.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmSettlementStatus
	 * CollateralValuation1.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, SettlementStatus2Code> mmSettlementStatus = new MMMessageAttribute<CollateralValuation2, SettlementStatus2Code>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of an instruction/financial instrument movement.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmSettlementStatus);
			previousVersion_lazy = () -> CollateralValuation1.mmSettlementStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatus2Code.mmObject();
		}

		@Override
		public SettlementStatus2Code getValue(CollateralValuation2 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(CollateralValuation2 obj, SettlementStatus2Code value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "NbOfDaysAcrd", required = true)
	protected Number numberOfDaysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for interest calculation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmNumberOfDaysAccrued
	 * CollateralValuation5.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmNumberOfDaysAccrued
	 * CollateralValuation1.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, Number> mmNumberOfDaysAccrued = new MMMessageAttribute<CollateralValuation2, Number>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days used for interest calculation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmNumberOfDaysAccrued);
			previousVersion_lazy = () -> CollateralValuation1.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(CollateralValuation2 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Number value) {
			obj.setNumberOfDaysAccrued(value);
		}
	};
	@XmlElement(name = "ValtnAmts", required = true)
	protected CollateralAmount1 valuationAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
	 * CollateralValuation.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the collateral valuation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmValuationAmounts
	 * CollateralValuation5.mmValuationAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmAmountDetails
	 * CollateralValuation1.mmAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValuation2, CollateralAmount1> mmValuationAmounts = new MMMessageAssociationEnd<CollateralValuation2, CollateralAmount1>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "ValtnAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationAmounts";
			definition = "Provides details on the collateral valuation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmValuationAmounts);
			previousVersion_lazy = () -> CollateralValuation1.mmAmountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralAmount1.mmObject();
		}

		@Override
		public CollateralAmount1 getValue(CollateralValuation2 obj) {
			return obj.getValuationAmounts();
		}

		@Override
		public void setValue(CollateralValuation2 obj, CollateralAmount1 value) {
			obj.setValuationAmounts(value);
		}
	};
	@XmlElement(name = "DayCntBsis", required = true)
	protected InterestComputationMethod2Code dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmDayCountBasis
	 * CollateralValuation5.mmDayCountBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmDayCountBasis
	 * CollateralValuation1.mmDayCountBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, InterestComputationMethod2Code> mmDayCountBasis = new MMMessageAttribute<CollateralValuation2, InterestComputationMethod2Code>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmDayCountBasis);
			previousVersion_lazy = () -> CollateralValuation1.mmDayCountBasis;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethod2Code.mmObject();
		}

		@Override
		public InterestComputationMethod2Code getValue(CollateralValuation2 obj) {
			return obj.getDayCountBasis();
		}

		@Override
		public void setValue(CollateralValuation2 obj, InterestComputationMethod2Code value) {
			obj.setDayCountBasis(value);
		}
	};
	@XmlElement(name = "XchgRate")
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate between the currency of the collateral and the reporting currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmExchangeRate
	 * CollateralValuation5.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmExchangeRate
	 * CollateralValuation1.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, Optional<BaseOneRate>> mmExchangeRate = new MMMessageAttribute<CollateralValuation2, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the collateral and the reporting currency.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmExchangeRate);
			previousVersion_lazy = () -> CollateralValuation1.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(CollateralValuation2 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<BaseOneRate> value) {
			obj.setExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyHrcut")
	protected BaseOneRate currencyHaircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyHrcut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the haircut or valuation factor on the currency of the collateral expressed as a percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCurrencyHaircut
	 * CollateralValuation5.mmCurrencyHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCurrencyHaircut
	 * CollateralValuation1.mmCurrencyHaircut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, Optional<BaseOneRate>> mmCurrencyHaircut = new MMMessageAttribute<CollateralValuation2, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "CcyHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyHaircut";
			definition = "Specifies the haircut or valuation factor on the currency of the collateral expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmCurrencyHaircut);
			previousVersion_lazy = () -> CollateralValuation1.mmCurrencyHaircut;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(CollateralValuation2 obj) {
			return obj.getCurrencyHaircut();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<BaseOneRate> value) {
			obj.setCurrencyHaircut(value.orElse(null));
		}
	};
	@XmlElement(name = "AdjstdRate")
	protected BaseOneRate adjustedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmAdjustedRate
	 * CollateralValuation.mmAdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which the collateral amount needs to be adjusted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmAdjustedRate
	 * CollateralValuation5.mmAdjustedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmAdjustedRate
	 * CollateralValuation1.mmAdjustedRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuation2, Optional<BaseOneRate>> mmAdjustedRate = new MMMessageAttribute<CollateralValuation2, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmAdjustedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "AdjstdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmAdjustedRate);
			previousVersion_lazy = () -> CollateralValuation1.mmAdjustedRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(CollateralValuation2 obj) {
			return obj.getAdjustedRate();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<BaseOneRate> value) {
			obj.setAdjustedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesColl")
	protected SecuritiesCollateral2 securitiesCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2
	 * SecuritiesCollateral2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the securities collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSecuritiesCollateral
	 * CollateralValuation5.mmSecuritiesCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmSecuritiesCollateralDetails
	 * CollateralValuation1.mmSecuritiesCollateralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValuation2, Optional<SecuritiesCollateral2>> mmSecuritiesCollateral = new MMMessageAssociationEnd<CollateralValuation2, Optional<SecuritiesCollateral2>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "SctiesColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateral";
			definition = "Provides details on the securities collateral.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmSecuritiesCollateral);
			previousVersion_lazy = () -> CollateralValuation1.mmSecuritiesCollateralDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCollateral2.mmObject();
		}

		@Override
		public Optional<SecuritiesCollateral2> getValue(CollateralValuation2 obj) {
			return obj.getSecuritiesCollateral();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<SecuritiesCollateral2> value) {
			obj.setSecuritiesCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "CshColl")
	protected CashCollateral4 cashCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the cash collateral valuation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCashCollateral
	 * CollateralValuation5.mmCashCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCashCollateralDetails
	 * CollateralValuation1.mmCashCollateralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValuation2, Optional<CashCollateral4>> mmCashCollateral = new MMMessageAssociationEnd<CollateralValuation2, Optional<CashCollateral4>>() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "CshColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateral";
			definition = "Provides details on the cash collateral valuation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmCashCollateral);
			previousVersion_lazy = () -> CollateralValuation1.mmCashCollateralDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashCollateral4.mmObject();
		}

		@Override
		public Optional<CashCollateral4> getValue(CollateralValuation2 obj) {
			return obj.getCashCollateral();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<CashCollateral4> value) {
			obj.setCashCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrColl")
	protected OtherCollateral3 otherCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on other collateral valuation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmOtherCollateral
	 * CollateralValuation5.mmOtherCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmOtherCollateralDetails
	 * CollateralValuation1.mmOtherCollateralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValuation2, Optional<OtherCollateral3>> mmOtherCollateral = new MMMessageAssociationEnd<CollateralValuation2, Optional<OtherCollateral3>>() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation2.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Provides details on other collateral valuation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmOtherCollateral);
			previousVersion_lazy = () -> CollateralValuation1.mmOtherCollateralDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherCollateral3.mmObject();
		}

		@Override
		public Optional<OtherCollateral3> getValue(CollateralValuation2 obj) {
			return obj.getOtherCollateral();
		}

		@Override
		public void setValue(CollateralValuation2 obj, Optional<OtherCollateral3> value) {
			obj.setOtherCollateral(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation2.mmCollateralIdentification, com.tools20022.repository.msg.CollateralValuation2.mmCollateralType,
						com.tools20022.repository.msg.CollateralValuation2.mmSettlementStatus, com.tools20022.repository.msg.CollateralValuation2.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CollateralValuation2.mmValuationAmounts,
						com.tools20022.repository.msg.CollateralValuation2.mmDayCountBasis, com.tools20022.repository.msg.CollateralValuation2.mmExchangeRate, com.tools20022.repository.msg.CollateralValuation2.mmCurrencyHaircut,
						com.tools20022.repository.msg.CollateralValuation2.mmAdjustedRate, com.tools20022.repository.msg.CollateralValuation2.mmSecuritiesCollateral, com.tools20022.repository.msg.CollateralValuation2.mmCashCollateral,
						com.tools20022.repository.msg.CollateralValuation2.mmOtherCollateral);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation2";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				nextVersions_lazy = () -> Arrays.asList(CollateralValuation5.mmObject());
				previousVersion_lazy = () -> CollateralValuation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCollateralIdentification() {
		return collateralIdentification == null ? Optional.empty() : Optional.of(collateralIdentification);
	}

	public CollateralValuation2 setCollateralIdentification(Max35Text collateralIdentification) {
		this.collateralIdentification = collateralIdentification;
		return this;
	}

	public CollateralType1Code getCollateralType() {
		return collateralType;
	}

	public CollateralValuation2 setCollateralType(CollateralType1Code collateralType) {
		this.collateralType = Objects.requireNonNull(collateralType);
		return this;
	}

	public SettlementStatus2Code getSettlementStatus() {
		return settlementStatus;
	}

	public CollateralValuation2 setSettlementStatus(SettlementStatus2Code settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public CollateralValuation2 setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = Objects.requireNonNull(numberOfDaysAccrued);
		return this;
	}

	public CollateralAmount1 getValuationAmounts() {
		return valuationAmounts;
	}

	public CollateralValuation2 setValuationAmounts(CollateralAmount1 valuationAmounts) {
		this.valuationAmounts = Objects.requireNonNull(valuationAmounts);
		return this;
	}

	public InterestComputationMethod2Code getDayCountBasis() {
		return dayCountBasis;
	}

	public CollateralValuation2 setDayCountBasis(InterestComputationMethod2Code dayCountBasis) {
		this.dayCountBasis = Objects.requireNonNull(dayCountBasis);
		return this;
	}

	public Optional<BaseOneRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public CollateralValuation2 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<BaseOneRate> getCurrencyHaircut() {
		return currencyHaircut == null ? Optional.empty() : Optional.of(currencyHaircut);
	}

	public CollateralValuation2 setCurrencyHaircut(BaseOneRate currencyHaircut) {
		this.currencyHaircut = currencyHaircut;
		return this;
	}

	public Optional<BaseOneRate> getAdjustedRate() {
		return adjustedRate == null ? Optional.empty() : Optional.of(adjustedRate);
	}

	public CollateralValuation2 setAdjustedRate(BaseOneRate adjustedRate) {
		this.adjustedRate = adjustedRate;
		return this;
	}

	public Optional<SecuritiesCollateral2> getSecuritiesCollateral() {
		return securitiesCollateral == null ? Optional.empty() : Optional.of(securitiesCollateral);
	}

	public CollateralValuation2 setSecuritiesCollateral(SecuritiesCollateral2 securitiesCollateral) {
		this.securitiesCollateral = securitiesCollateral;
		return this;
	}

	public Optional<CashCollateral4> getCashCollateral() {
		return cashCollateral == null ? Optional.empty() : Optional.of(cashCollateral);
	}

	public CollateralValuation2 setCashCollateral(CashCollateral4 cashCollateral) {
		this.cashCollateral = cashCollateral;
		return this;
	}

	public Optional<OtherCollateral3> getOtherCollateral() {
		return otherCollateral == null ? Optional.empty() : Optional.of(otherCollateral);
	}

	public CollateralValuation2 setOtherCollateral(OtherCollateral3 otherCollateral) {
		this.otherCollateral = otherCollateral;
		return this;
	}
}