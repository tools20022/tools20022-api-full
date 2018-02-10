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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of the interest calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmCalculationDate
 * InterestCalculation2.mmCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmCollateralAccountIdentification
 * InterestCalculation2.mmCollateralAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmEffectivePrincipalAmount
 * InterestCalculation2.mmEffectivePrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmPrincipalAmount
 * InterestCalculation2.mmPrincipalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmMovementAmount
 * InterestCalculation2.mmMovementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmNumberOfDays
 * InterestCalculation2.mmNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmEffectiveRate
 * InterestCalculation2.mmEffectiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmInterestRate
 * InterestCalculation2.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation2#mmSpread
 * InterestCalculation2.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmAccruedInterestAmount
 * InterestCalculation2.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmAggregatedInterestAmount
 * InterestCalculation2.mmAggregatedInterestAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InterestCalculation
 * InterestCalculation}</li>
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
 * "InterestCalculation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the interest calculation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation3
 * InterestCalculation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation4
 * InterestCalculation4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestCalculation2", propOrder = {"calculationDate", "collateralAccountIdentification", "effectivePrincipalAmount", "principalAmount", "movementAmount", "numberOfDays", "effectiveRate", "interestRate", "spread",
		"accruedInterestAmount", "aggregatedInterestAmount"})
public class InterestCalculation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClctnDt", required = true)
	protected ISODate calculationDate;
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
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationDate
	 * InterestCalculation.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the calculation date of the interest amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmCalculationDate
	 * InterestCalculation3.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmCalculationDate
	 * InterestCalculation4.mmCalculationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmCalculationDate, InterestCalculation4.mmCalculationDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "CollAcctId")
	protected AccountIdentification1 collateralAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1
	 * AccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the collateral account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmCollateralAccountIdentification
	 * InterestCalculation3.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmCollateralAccountIdentification
	 * InterestCalculation4.mmCollateralAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "CollAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountIdentification";
			definition = "Provides the identification of the collateral account.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmCollateralAccountIdentification, InterestCalculation4.mmCollateralAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentification1.mmObject();
		}
	};
	@XmlElement(name = "FctvPrncplAmt", required = true)
	protected AmountAndDirection20 effectivePrincipalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvPrncplAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePrincipalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral amount used to calculate the interest amount and includes debit/short or credit/long positions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmEffectivePrincipalAmount
	 * InterestCalculation3.mmEffectivePrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmEffectivePrincipalAmount
	 * InterestCalculation4.mmEffectivePrincipalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEffectivePrincipalAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "FctvPrncplAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectivePrincipalAmount";
			definition = "Provides the collateral amount used to calculate the interest amount and includes debit/short or credit/long positions.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmEffectivePrincipalAmount, InterestCalculation4.mmEffectivePrincipalAmount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	@XmlElement(name = "PrncplAmt")
	protected AmountAndDirection20 principalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmHeldAmount
	 * CollateralBalance.mmHeldAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral amount posted before taking into account the collateral movement amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmPrincipalAmount
	 * InterestCalculation3.mmPrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmPrincipalAmount
	 * InterestCalculation4.mmPrincipalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrincipalAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmHeldAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "PrncplAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAmount";
			definition = "Provides the collateral amount posted before taking into account the collateral movement amount.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmPrincipalAmount, InterestCalculation4.mmPrincipalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	@XmlElement(name = "MvmntAmt")
	protected AmountAndDirection20 movementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmPriorAgreed
	 * CollateralBalance.mmPriorAgreed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the additional amount of collateral posted between two calculation dates."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmMovementAmount
	 * InterestCalculation3.mmMovementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmMovementAmount
	 * InterestCalculation4.mmMovementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMovementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmPriorAgreed;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "MvmntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementAmount";
			definition = "Provides the additional amount of collateral posted between two calculation dates.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmMovementAmount, InterestCalculation4.mmMovementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	@XmlElement(name = "NbOfDays")
	protected Number numberOfDays;
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
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the number of days for the calculation of the interest."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmNumberOfDays
	 * InterestCalculation3.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmNumberOfDays
	 * InterestCalculation4.mmNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "NbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDays";
			definition = "Indicates the number of days for the calculation of the interest.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmNumberOfDays, InterestCalculation4.mmNumberOfDays);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "FctvRate", required = true)
	protected PercentageRate effectiveRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmEffectiveRate
	 * InterestCalculation3.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmEffectiveRate
	 * InterestCalculation4.mmEffectiveRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "FctvRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveRate";
			definition = "Specifies the percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmEffectiveRate, InterestCalculation4.mmEffectiveRate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "IntrstRate")
	protected PercentageRate interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmInterestRate
	 * InterestCalculation3.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmInterestRate
	 * InterestCalculation4.mmInterestRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Specifies the percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmInterestRate, InterestCalculation4.mmInterestRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "Sprd")
	protected PercentageRate spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmSpreadRate
	 * Spread.mmSpreadRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the differences in interest rates."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmSpread
	 * InterestCalculation3.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmSpread
	 * InterestCalculation4.mmSpread}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Spread.mmSpreadRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Indicates the differences in interest rates.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmSpread, InterestCalculation4.mmSpread);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "AcrdIntrstAmt", required = true)
	protected AmountAndDirection20 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of money representing an interest payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmAccruedInterestAmount
	 * InterestCalculation3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAccruedInterestAmount
	 * InterestCalculation4.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Specifies the amount of money representing an interest payment.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmAccruedInterestAmount, InterestCalculation4.mmAccruedInterestAmount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	@XmlElement(name = "AggtdIntrstAmt")
	protected ActiveCurrencyAndAmount aggregatedInterestAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of money representing an interest payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmAggregatedInterestAmount
	 * InterestCalculation3.mmAggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAggregatedInterestAmount
	 * InterestCalculation4.mmAggregatedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAggregatedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestCalculation2.mmObject();
			isDerived = false;
			xmlTag = "AggtdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatedInterestAmount";
			definition = "Specifies the total amount of money representing an interest payment.";
			nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmAggregatedInterestAmount, InterestCalculation4.mmAggregatedInterestAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestCalculation2.mmCalculationDate, com.tools20022.repository.msg.InterestCalculation2.mmCollateralAccountIdentification,
						com.tools20022.repository.msg.InterestCalculation2.mmEffectivePrincipalAmount, com.tools20022.repository.msg.InterestCalculation2.mmPrincipalAmount,
						com.tools20022.repository.msg.InterestCalculation2.mmMovementAmount, com.tools20022.repository.msg.InterestCalculation2.mmNumberOfDays, com.tools20022.repository.msg.InterestCalculation2.mmEffectiveRate,
						com.tools20022.repository.msg.InterestCalculation2.mmInterestRate, com.tools20022.repository.msg.InterestCalculation2.mmSpread, com.tools20022.repository.msg.InterestCalculation2.mmAccruedInterestAmount,
						com.tools20022.repository.msg.InterestCalculation2.mmAggregatedInterestAmount);
				trace_lazy = () -> InterestCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InterestCalculation2";
				definition = "Provides the details of the interest calculation.";
				nextVersions_lazy = () -> Arrays.asList(InterestCalculation3.mmObject(), InterestCalculation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public InterestCalculation2 setCalculationDate(ISODate calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}

	public Optional<AccountIdentification1> getCollateralAccountIdentification() {
		return collateralAccountIdentification == null ? Optional.empty() : Optional.of(collateralAccountIdentification);
	}

	public InterestCalculation2 setCollateralAccountIdentification(com.tools20022.repository.msg.AccountIdentification1 collateralAccountIdentification) {
		this.collateralAccountIdentification = collateralAccountIdentification;
		return this;
	}

	public AmountAndDirection20 getEffectivePrincipalAmount() {
		return effectivePrincipalAmount;
	}

	public InterestCalculation2 setEffectivePrincipalAmount(com.tools20022.repository.msg.AmountAndDirection20 effectivePrincipalAmount) {
		this.effectivePrincipalAmount = Objects.requireNonNull(effectivePrincipalAmount);
		return this;
	}

	public Optional<AmountAndDirection20> getPrincipalAmount() {
		return principalAmount == null ? Optional.empty() : Optional.of(principalAmount);
	}

	public InterestCalculation2 setPrincipalAmount(com.tools20022.repository.msg.AmountAndDirection20 principalAmount) {
		this.principalAmount = principalAmount;
		return this;
	}

	public Optional<AmountAndDirection20> getMovementAmount() {
		return movementAmount == null ? Optional.empty() : Optional.of(movementAmount);
	}

	public InterestCalculation2 setMovementAmount(com.tools20022.repository.msg.AmountAndDirection20 movementAmount) {
		this.movementAmount = movementAmount;
		return this;
	}

	public Optional<Number> getNumberOfDays() {
		return numberOfDays == null ? Optional.empty() : Optional.of(numberOfDays);
	}

	public InterestCalculation2 setNumberOfDays(Number numberOfDays) {
		this.numberOfDays = numberOfDays;
		return this;
	}

	public PercentageRate getEffectiveRate() {
		return effectiveRate;
	}

	public InterestCalculation2 setEffectiveRate(PercentageRate effectiveRate) {
		this.effectiveRate = Objects.requireNonNull(effectiveRate);
		return this;
	}

	public Optional<PercentageRate> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public InterestCalculation2 setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<PercentageRate> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public InterestCalculation2 setSpread(PercentageRate spread) {
		this.spread = spread;
		return this;
	}

	public AmountAndDirection20 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public InterestCalculation2 setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection20 accruedInterestAmount) {
		this.accruedInterestAmount = Objects.requireNonNull(accruedInterestAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAggregatedInterestAmount() {
		return aggregatedInterestAmount == null ? Optional.empty() : Optional.of(aggregatedInterestAmount);
	}

	public InterestCalculation2 setAggregatedInterestAmount(ActiveCurrencyAndAmount aggregatedInterestAmount) {
		this.aggregatedInterestAmount = aggregatedInterestAmount;
		return this;
	}
}