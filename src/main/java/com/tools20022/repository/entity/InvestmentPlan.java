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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PlanStatus1Choice;
import com.tools20022.repository.choice.PlanStatus2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.PlanStatusCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentPlan
 * Asset.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvestmentPlan
 * DateTimePeriod.mmRelatedInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmSystematicInvestmentPlan
 * InvestmentAccountService.mmSystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentPlan
 * InvestmentFundOrder.mmInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmInvestmentPlan
 * Instalment.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmRelatedInvestmentPlan
 * InsuranceCertificate.mmRelatedInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmInvestmentPlan
 * Portfolio.mmInvestmentPlan}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmQuantity
 * InvestmentPlan6.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmQuantity
 * InvestmentPlan7.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmQuantity
 * InvestmentPlan9.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmQuantity
 * InvestmentPlan8.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmQuantity
 * InvestmentPlan10.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmQuantity
 * InvestmentPlan11.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmQuantity
 * InvestmentPlan12.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmQuantity
 * InvestmentPlan13.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmQuantity
 * InvestmentPlan14.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmQuantity
 * InvestmentPlan15.mmQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmFrequency
 * InvestmentPlan.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmAmount
 * InvestmentPlan.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmAsset
 * InvestmentPlan.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInstalment
 * InvestmentPlan.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmRelatedService
 * InvestmentPlan.mmRelatedService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInsurance
 * InvestmentPlan.mmInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
 * InvestmentPlan.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmMultiCurrency
 * InvestmentPlan.mmMultiCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmCurrency
 * InvestmentPlan.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmPortfolio
 * InvestmentPlan.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInvestmentPeriod
 * InvestmentPlan.mmInvestmentPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmPlanStatus
 * InvestmentPlan.mmPlanStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected FrequencyCode frequency;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmFrequency
	 * InvestmentPlan2.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmExtendedFrequency
	 * InvestmentPlan2.mmExtendedFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmFrequency
	 * InvestmentPlan4.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmExtendedFrequency
	 * InvestmentPlan4.mmExtendedFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmFrequency
	 * InvestmentPlan6.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmFrequency
	 * InvestmentPlan5.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmExtendedFrequency
	 * InvestmentPlan5.mmExtendedFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmFrequency
	 * InvestmentPlan3.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmExtendedFrequency
	 * InvestmentPlan3.mmExtendedFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmFrequency
	 * InvestmentPlan7.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmFrequency
	 * InvestmentPlan9.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmFrequency
	 * InvestmentPlan8.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmFrequency
	 * InvestmentPlan10.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmFrequency
	 * InvestmentPlan11.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmFrequency
	 * InvestmentPlan12.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmFrequency
	 * InvestmentPlan13.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmFrequency
	 * InvestmentPlan14.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmFrequency
	 * InvestmentPlan15.mmFrequency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmFrequency, InvestmentPlan2.mmExtendedFrequency, InvestmentPlan4.mmFrequency, InvestmentPlan4.mmExtendedFrequency, InvestmentPlan6.mmFrequency, InvestmentPlan5.mmFrequency,
					InvestmentPlan5.mmExtendedFrequency, InvestmentPlan3.mmFrequency, InvestmentPlan3.mmExtendedFrequency, InvestmentPlan7.mmFrequency, InvestmentPlan9.mmFrequency, InvestmentPlan8.mmFrequency, InvestmentPlan10.mmFrequency,
					InvestmentPlan11.mmFrequency, InvestmentPlan12.mmFrequency, InvestmentPlan13.mmFrequency, InvestmentPlan14.mmFrequency, InvestmentPlan15.mmFrequency);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmAmount
	 * InvestmentPlan2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmAmount
	 * InvestmentPlan4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmAmount
	 * InvestmentPlan5.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmAmount
	 * InvestmentPlan3.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmAmount, InvestmentPlan4.mmAmount, InvestmentPlan5.mmAmount, InvestmentPlan3.mmAmount);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Asset asset;
	/**
	 * Security that an investment plan invests in, or from which the investment
	 * plan divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmInvestmentPlan
	 * Asset.mmInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmSecurityDetails
	 * InvestmentPlan2.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmSecurityDetails);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Instalment> instalment;
	/**
	 * Specifies information on the successive payments in an investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmInvestmentPlan
	 * Instalment.mmInvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Instalment
	 * Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInitialAmount
	 * InvestmentPlan12.mmInitialAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmInitialAmount
	 * InvestmentPlan13.mmInitialAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInitialAmount
	 * InvestmentPlan14.mmInitialAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmInitialAmount
	 * InvestmentPlan15.mmInitialAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInstalment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan12.mmInitialAmount, InvestmentPlan13.mmInitialAmount, InvestmentPlan14.mmInitialAmount, InvestmentPlan15.mmInitialAmount);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Specifies information on the successive payments in an investment plan.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Instalment.mmInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
		}
	};
	protected InvestmentAccountService relatedService;
	/**
	 * Service which provides a systematic investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmSystematicInvestmentPlan
	 * InvestmentAccountService.mmSystematicInvestmentPlan}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedService";
			definition = "Service which provides a systematic investment plan.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmSystematicInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InsuranceCertificate> insurance;
	/**
	 * Insurance contract which covers the investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmRelatedInvestmentPlan
	 * InsuranceCertificate.mmRelatedInvestmentPlan}</li>
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
	public static final MMBusinessAssociationEnd mmInsurance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Insurance contract which covers the investment plan.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmRelatedInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundOrder> standingOrder;
	/**
	 * Order generated automatically, according to the terms of the investment
	 * plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentPlan
	 * InvestmentFundOrder.mmInvestmentPlan}</li>
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
	public static final MMBusinessAssociationEnd mmStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Order generated automatically, according to the terms of the investment plan.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected YesNoIndicator multiCurrency;
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
	public static final MMBusinessAttribute mmMultiCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultiCurrency";
			definition = "Specifies whether the investment plan is multi currency or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CurrencyCode currency;
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the investment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Portfolio portfolio;
	/**
	 * Portfolio for which the investment plan invests or divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmInvestmentPlan
	 * Portfolio.mmInvestmentPlan}</li>
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
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which the investment plan invests or divests.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected DateTimePeriod investmentPeriod;
	/**
	 * Period during which an investment plan has to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvestmentPlan
	 * DateTimePeriod.mmRelatedInvestmentPlan}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPeriod";
			definition = "Period during which an investment plan has to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvestmentPlan;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PlanStatusCode planStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmPlanStatus
	 * InvestmentPlan10.mmPlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmPlanStatus
	 * InvestmentPlan11.mmPlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlanStatus1Choice#mmCode
	 * PlanStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmPlanStatus
	 * InvestmentPlan12.mmPlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmPlanStatus
	 * InvestmentPlan13.mmPlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlanStatus2Choice#mmCode
	 * PlanStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmPlanStatus
	 * InvestmentPlan14.mmPlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmPlanStatus
	 * InvestmentPlan15.mmPlanStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPlanStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan10.mmPlanStatus, InvestmentPlan11.mmPlanStatus, PlanStatus1Choice.mmCode, InvestmentPlan12.mmPlanStatus, InvestmentPlan13.mmPlanStatus, PlanStatus2Choice.mmCode,
					InvestmentPlan14.mmPlanStatus, InvestmentPlan15.mmPlanStatus);
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlanStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmInvestmentPlan, com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.mmSystematicInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentPlan,
						com.tools20022.repository.entity.Instalment.mmInvestmentPlan, com.tools20022.repository.entity.InsuranceCertificate.mmRelatedInvestmentPlan, com.tools20022.repository.entity.Portfolio.mmInvestmentPlan);
				derivationElement_lazy = () -> Arrays.asList(InvestmentPlan6.mmQuantity, InvestmentPlan7.mmQuantity, InvestmentPlan9.mmQuantity, InvestmentPlan8.mmQuantity, InvestmentPlan10.mmQuantity, InvestmentPlan11.mmQuantity,
						InvestmentPlan12.mmQuantity, InvestmentPlan13.mmQuantity, InvestmentPlan14.mmQuantity, InvestmentPlan15.mmQuantity);
				element_lazy = () -> Arrays.asList(InvestmentPlan.mmFrequency, InvestmentPlan.mmAmount, InvestmentPlan.mmAsset, InvestmentPlan.mmInstalment, InvestmentPlan.mmRelatedService, InvestmentPlan.mmInsurance,
						InvestmentPlan.mmStandingOrder, InvestmentPlan.mmMultiCurrency, InvestmentPlan.mmCurrency, InvestmentPlan.mmPortfolio, InvestmentPlan.mmInvestmentPeriod, InvestmentPlan.mmPlanStatus);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentPlan2.mmObject(), InvestmentPlan4.mmObject(), InvestmentPlan6.mmObject(), InvestmentPlan5.mmObject(), InvestmentPlan3.mmObject(), InvestmentPlan7.mmObject(),
						InvestmentPlan9.mmObject(), InvestmentPlan8.mmObject(), InvestmentPlan10.mmObject(), InvestmentPlan11.mmObject(), PlanStatus1Choice.mmObject(), InvestmentPlan12.mmObject(), InvestmentPlan13.mmObject(),
						PlanStatus2Choice.mmObject(), InvestmentPlan14.mmObject(), InvestmentPlan15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyCode frequency) {
		this.frequency = frequency;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(com.tools20022.repository.entity.Asset asset) {
		this.asset = asset;
	}

	public List<Instalment> getInstalment() {
		return instalment;
	}

	public void setInstalment(List<com.tools20022.repository.entity.Instalment> instalment) {
		this.instalment = instalment;
	}

	public InvestmentAccountService getRelatedService() {
		return relatedService;
	}

	public void setRelatedService(com.tools20022.repository.entity.InvestmentAccountService relatedService) {
		this.relatedService = relatedService;
	}

	public List<InsuranceCertificate> getInsurance() {
		return insurance;
	}

	public void setInsurance(List<com.tools20022.repository.entity.InsuranceCertificate> insurance) {
		this.insurance = insurance;
	}

	public List<InvestmentFundOrder> getStandingOrder() {
		return standingOrder;
	}

	public void setStandingOrder(List<com.tools20022.repository.entity.InvestmentFundOrder> standingOrder) {
		this.standingOrder = standingOrder;
	}

	public YesNoIndicator getMultiCurrency() {
		return multiCurrency;
	}

	public void setMultiCurrency(YesNoIndicator multiCurrency) {
		this.multiCurrency = multiCurrency;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public DateTimePeriod getInvestmentPeriod() {
		return investmentPeriod;
	}

	public void setInvestmentPeriod(com.tools20022.repository.entity.DateTimePeriod investmentPeriod) {
		this.investmentPeriod = investmentPeriod;
	}

	public PlanStatusCode getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(PlanStatusCode planStatus) {
		this.planStatus = planStatus;
	}
}