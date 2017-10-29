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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.PlanStatus1Choice;
import com.tools20022.repository.choice.PlanStatus2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.PlanStatusCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Plan that allows investors to schedule periodical investments or divestments,
 * according to pre-defined criteria.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentPlan" src="doc-files/InvestmentPlan.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Frequency
 * InvestmentPlan.Frequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Amount
 * InvestmentPlan.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Asset
 * InvestmentPlan.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Instalment
 * InvestmentPlan.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#RelatedService
 * InvestmentPlan.RelatedService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Insurance
 * InvestmentPlan.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#StandingOrder
 * InvestmentPlan.StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#MultiCurrency
 * InvestmentPlan.MultiCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Currency
 * InvestmentPlan.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Portfolio
 * InvestmentPlan.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#InvestmentPeriod
 * InvestmentPlan.InvestmentPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#PlanStatus
 * InvestmentPlan.PlanStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentPlan
 * Asset.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvestmentPlan
 * DateTimePeriod.RelatedInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#SystematicInvestmentPlan
 * InvestmentAccountService.SystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentPlan
 * InvestmentFundOrder.InvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#InvestmentPlan
 * Instalment.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#RelatedInvestmentPlan
 * InsuranceCertificate.RelatedInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#InvestmentPlan
 * Portfolio.InvestmentPlan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan6#Quantity
 * InvestmentPlan6.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan7#Quantity
 * InvestmentPlan7.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan9#Quantity
 * InvestmentPlan9.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#Quantity
 * InvestmentPlan8.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan10#Quantity
 * InvestmentPlan10.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11#Quantity
 * InvestmentPlan11.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#Quantity
 * InvestmentPlan12.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan13#Quantity
 * InvestmentPlan13.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#Quantity
 * InvestmentPlan14.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#Quantity
 * InvestmentPlan15.Quantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan2
 * InvestmentPlan2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan4
 * InvestmentPlan4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan6
 * InvestmentPlan6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan5
 * InvestmentPlan5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan3
 * InvestmentPlan3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan7
 * InvestmentPlan7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan9
 * InvestmentPlan9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8
 * InvestmentPlan8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan10
 * InvestmentPlan10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11
 * InvestmentPlan11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PlanStatus1Choice
 * PlanStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12
 * InvestmentPlan12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan13
 * InvestmentPlan13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PlanStatus2Choice
 * PlanStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14
 * InvestmentPlan14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15
 * InvestmentPlan15}</li>
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
 * "InvestmentPlan"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria."
 * </li>
 * </ul>
 */
public class InvestmentPlan {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency of the investment or divestment, eg, daily, weekly, or monthly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan2#Frequency
	 * InvestmentPlan2.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#ExtendedFrequency
	 * InvestmentPlan2.ExtendedFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan4#Frequency
	 * InvestmentPlan4.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#ExtendedFrequency
	 * InvestmentPlan4.ExtendedFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan6#Frequency
	 * InvestmentPlan6.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan5#Frequency
	 * InvestmentPlan5.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#ExtendedFrequency
	 * InvestmentPlan5.ExtendedFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan3#Frequency
	 * InvestmentPlan3.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#ExtendedFrequency
	 * InvestmentPlan3.ExtendedFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan7#Frequency
	 * InvestmentPlan7.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan9#Frequency
	 * InvestmentPlan9.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#Frequency
	 * InvestmentPlan8.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan10#Frequency
	 * InvestmentPlan10.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11#Frequency
	 * InvestmentPlan11.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#Frequency
	 * InvestmentPlan12.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan13#Frequency
	 * InvestmentPlan13.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#Frequency
	 * InvestmentPlan14.Frequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#Frequency
	 * InvestmentPlan15.Frequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency of the investment or divestment, eg, daily, weekly, or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.Frequency, com.tools20022.repository.msg.InvestmentPlan2.ExtendedFrequency, com.tools20022.repository.msg.InvestmentPlan4.Frequency,
					com.tools20022.repository.msg.InvestmentPlan4.ExtendedFrequency, com.tools20022.repository.msg.InvestmentPlan6.Frequency, com.tools20022.repository.msg.InvestmentPlan5.Frequency,
					com.tools20022.repository.msg.InvestmentPlan5.ExtendedFrequency, com.tools20022.repository.msg.InvestmentPlan3.Frequency, com.tools20022.repository.msg.InvestmentPlan3.ExtendedFrequency,
					com.tools20022.repository.msg.InvestmentPlan7.Frequency, com.tools20022.repository.msg.InvestmentPlan9.Frequency, com.tools20022.repository.msg.InvestmentPlan8.Frequency,
					com.tools20022.repository.msg.InvestmentPlan10.Frequency, com.tools20022.repository.msg.InvestmentPlan11.Frequency, com.tools20022.repository.msg.InvestmentPlan12.Frequency,
					com.tools20022.repository.msg.InvestmentPlan13.Frequency, com.tools20022.repository.msg.InvestmentPlan14.Frequency, com.tools20022.repository.msg.InvestmentPlan15.Frequency);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Currency and amount of the periodical payments. When the standing order
	 * is related to a fund investment plan, this is the cash part of the
	 * invested amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan2#Amount
	 * InvestmentPlan2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan4#Amount
	 * InvestmentPlan4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan5#Amount
	 * InvestmentPlan5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan3#Amount
	 * InvestmentPlan3.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.Amount, com.tools20022.repository.msg.InvestmentPlan4.Amount, com.tools20022.repository.msg.InvestmentPlan5.Amount,
					com.tools20022.repository.msg.InvestmentPlan3.Amount);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Security that an investment plan invests in, or from which the investment
	 * plan divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#InvestmentPlan
	 * Asset.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#SecurityDetails
	 * InvestmentPlan2.SecurityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security that an investment plan invests in, or from which the investment plan divests."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.SecurityDetails);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies information on the successive payments in an investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#InvestmentPlan
	 * Instalment.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Instalment
	 * Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#InitialAmount
	 * InvestmentPlan12.InitialAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#InitialAmount
	 * InvestmentPlan13.InitialAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#InitialAmount
	 * InvestmentPlan14.InitialAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#InitialAmount
	 * InvestmentPlan15.InitialAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information on the successive payments in an investment plan."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Instalment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan12.InitialAmount, com.tools20022.repository.msg.InvestmentPlan13.InitialAmount, com.tools20022.repository.msg.InvestmentPlan14.InitialAmount,
					com.tools20022.repository.msg.InvestmentPlan15.InitialAmount);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Specifies information on the successive payments in an investment plan.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Instalment.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Service which provides a systematic investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#SystematicInvestmentPlan
	 * InvestmentAccountService.SystematicInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service which provides a systematic investment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedService";
			definition = "Service which provides a systematic investment plan.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Insurance contract which covers the investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#RelatedInvestmentPlan
	 * InsuranceCertificate.RelatedInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insurance contract which covers the investment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Insurance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Insurance contract which covers the investment plan.";
			minOccurs = 0;
			type_lazy = () -> InsuranceCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order generated automatically, according to the terms of the investment
	 * plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentPlan
	 * InvestmentFundOrder.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order generated automatically, according to the terms of the investment plan."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Order generated automatically, according to the terms of the investment plan.";
			minOccurs = 1;
			type_lazy = () -> InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the investment plan is multi currency or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investment plan is multi currency or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MultiCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultiCurrency";
			definition = "Specifies whether the investment plan is multi currency or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency of the investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the investment plan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Portfolio for which the investment plan invests or divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#InvestmentPlan
	 * Portfolio.InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio for which the investment plan invests or divests."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which the investment plan invests or divests.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which an investment plan has to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvestmentPlan
	 * DateTimePeriod.RelatedInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which an investment plan has to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPeriod";
			definition = "Period during which an investment plan has to be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the savings or withdrawal investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PlanStatusCode
	 * PlanStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#PlanStatus
	 * InvestmentPlan10.PlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#PlanStatus
	 * InvestmentPlan11.PlanStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PlanStatus1Choice#Code
	 * PlanStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#PlanStatus
	 * InvestmentPlan12.PlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#PlanStatus
	 * InvestmentPlan13.PlanStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PlanStatus2Choice#Code
	 * PlanStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#PlanStatus
	 * InvestmentPlan14.PlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#PlanStatus
	 * InvestmentPlan15.PlanStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the savings or withdrawal investment plan. "</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PlanStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan10.PlanStatus, com.tools20022.repository.msg.InvestmentPlan11.PlanStatus, com.tools20022.repository.choice.PlanStatus1Choice.Code,
					com.tools20022.repository.msg.InvestmentPlan12.PlanStatus, com.tools20022.repository.msg.InvestmentPlan13.PlanStatus, com.tools20022.repository.choice.PlanStatus2Choice.Code,
					com.tools20022.repository.msg.InvestmentPlan14.PlanStatus, com.tools20022.repository.msg.InvestmentPlan15.PlanStatus);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PlanStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.InvestmentPlan, com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan, com.tools20022.repository.entity.Instalment.InvestmentPlan,
						com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan, com.tools20022.repository.entity.Portfolio.InvestmentPlan);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan6.Quantity, com.tools20022.repository.msg.InvestmentPlan7.Quantity, com.tools20022.repository.msg.InvestmentPlan9.Quantity,
						com.tools20022.repository.msg.InvestmentPlan8.Quantity, com.tools20022.repository.msg.InvestmentPlan10.Quantity, com.tools20022.repository.msg.InvestmentPlan11.Quantity,
						com.tools20022.repository.msg.InvestmentPlan12.Quantity, com.tools20022.repository.msg.InvestmentPlan13.Quantity, com.tools20022.repository.msg.InvestmentPlan14.Quantity,
						com.tools20022.repository.msg.InvestmentPlan15.Quantity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.Frequency, com.tools20022.repository.entity.InvestmentPlan.Amount, com.tools20022.repository.entity.InvestmentPlan.Asset,
						com.tools20022.repository.entity.InvestmentPlan.Instalment, com.tools20022.repository.entity.InvestmentPlan.RelatedService, com.tools20022.repository.entity.InvestmentPlan.Insurance,
						com.tools20022.repository.entity.InvestmentPlan.StandingOrder, com.tools20022.repository.entity.InvestmentPlan.MultiCurrency, com.tools20022.repository.entity.InvestmentPlan.Currency,
						com.tools20022.repository.entity.InvestmentPlan.Portfolio, com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod, com.tools20022.repository.entity.InvestmentPlan.PlanStatus);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentPlan2.mmObject(), InvestmentPlan4.mmObject(), InvestmentPlan6.mmObject(), InvestmentPlan5.mmObject(), InvestmentPlan3.mmObject(), InvestmentPlan7.mmObject(),
						InvestmentPlan9.mmObject(), InvestmentPlan8.mmObject(), InvestmentPlan10.mmObject(), InvestmentPlan11.mmObject(), PlanStatus1Choice.mmObject(), InvestmentPlan12.mmObject(), InvestmentPlan13.mmObject(),
						PlanStatus2Choice.mmObject(), InvestmentPlan14.mmObject(), InvestmentPlan15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}