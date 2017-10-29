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
import com.tools20022.repository.choice.TaxCalculationBasisType1Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundTax" src="doc-files/InvestmentFundTax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#FiscalExemption
 * InvestmentFundTax.FiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#InvestmentAccount
 * InvestmentFundTax.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#PercentageOfDebtClaim
 * InvestmentFundTax.PercentageOfDebtClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#PercentageGrandfatheredDebt
 * InvestmentFundTax.PercentageGrandfatheredDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#ExemptionIndicator
 * InvestmentFundTax.ExemptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#Transaction
 * InvestmentFundTax.Transaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTax
 * InvestmentAccount.InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionTax
 * InvestmentFundTransaction.TransactionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax8#TaxCalculationDetails
 * Tax8.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17#TaxCalculationDetails
 * Tax17.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation2#TaxDetails
 * DeliverInformation2.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation4#TaxDetails
 * DeliverInformation4.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation7#TaxDetails
 * DeliverInformation7.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation2#TaxDetails
 * ReceiveInformation2.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation4#TaxDetails
 * ReceiveInformation4.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation8#TaxDetails
 * ReceiveInformation8.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation6#TaxDetails
 * ReceiveInformation6.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#TaxDetails
 * ReceiveInformation11.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#TaxDetails
 * DeliverInformation11.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation3#TaxDetails
 * DeliverInformation3.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation8#TaxDetails
 * DeliverInformation8.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation3#TaxDetails
 * ReceiveInformation3.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation7#TaxDetails
 * ReceiveInformation7.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation5#TaxDetails
 * ReceiveInformation5.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceiveInformation9#TaxDetails
 * ReceiveInformation9.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation5#TaxDetails
 * DeliverInformation5.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation9#TaxDetails
 * DeliverInformation9.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation6#TaxDetails
 * DeliverInformation6.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#TaxCalculationDetails
 * Tax6.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax16#TaxCalculationDetails
 * Tax16.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax7#TaxCalculationDetails
 * Tax7.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes2#TaxDetails
 * TotalTaxes2.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax14#TaxCalculationDetails
 * Tax14.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3#TaxDetails
 * TotalTaxes3.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18#EUCapitalGainType
 * Tax18.EUCapitalGainType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18#TaxCalculationDetails
 * Tax18.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes4#TaxDetails
 * TotalTaxes4.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax19#EUCapitalGainType
 * Tax19.EUCapitalGainType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5#TaxDetails
 * TotalTaxes5.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#TaxDetails
 * ReceiveInformation13.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#TaxDetails
 * ReceiveInformation12.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#TaxDetails
 * DeliverInformation12.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#TaxDetails
 * DeliverInformation13.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax21#TaxCalculationDetails
 * Tax21.TaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#TaxDetails
 * DeliverInformation15.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#TaxDetails
 * DeliverInformation14.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#TaxDetails
 * ReceiveInformation15.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#TaxDetails
 * ReceiveInformation14.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax25#TaxCalculationDetails
 * Tax25.TaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#TaxDetails
 * ReceiveInformation17.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#TaxDetails
 * ReceiveInformation16.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#TaxDetails
 * DeliverInformation16.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#TaxDetails
 * DeliverInformation17.TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax28#TaxCalculationDetails
 * Tax28.TaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#TaxExemption
 * InvestmentAccountOwnershipInformation12.TaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#TaxExemption
 * InvestmentAccountOwnershipInformation13.TaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#TransactionOverhead
 * RedemptionOrder14.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#TransactionOverhead
 * SwitchSubscriptionLegOrder6.TransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#IndividualTax
 * FeeAndTax1.IndividualTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InformativeTax1#IndividualTax
 * InformativeTax1.IndividualTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32#TaxCalculationDetails
 * Tax32.TaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#TransactionOverhead
 * SubscriptionExecution13.TransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#TotalTaxes
 * TotalFeesAndTaxes40.TotalTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#IndividualTax
 * TotalFeesAndTaxes40.IndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#TransactionOverhead
 * SubscriptionExecution12.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#TransactionOverhead
 * SubscriptionOrder15.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#TaxExemption
 * InvestmentAccountOwnershipInformation15.TaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#TransactionOverhead
 * SwitchRedemptionLegOrder6.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#TransactionOverhead
 * RedemptionOrder15.TransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#TaxCalculationDetails
 * Tax30.TaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#TaxCalculationDetails
 * Tax31.TaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#TransactionOverhead
 * RedemptionExecution16.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#TaxExemption
 * InvestmentAccountOwnershipInformation14.TaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#TransactionOverhead
 * SubscriptionOrder14.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#TransactionOverhead
 * SwitchSubscriptionLegExecution4.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#TransactionOverhead
 * RedemptionExecution15.TransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#TransactionOverhead
 * SwitchRedemptionLegExecution4.TransactionOverhead}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
 * SecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation2
 * TaxCalculationInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax8 Tax8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
 * TaxCalculationInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15 Tax15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation1
 * TaxCalculationInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation5
 * TaxCalculationInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax16 Tax16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation3
 * TaxCalculationInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax7 Tax7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes2 TotalTaxes2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation6
 * TaxCalculationInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax14 Tax14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxCalculationBasisType1Choice
 * TaxCalculationBasisType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation7
 * TaxCalculationInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18 Tax18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes4 TotalTaxes4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax19 Tax19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax20 Tax20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5 TotalTaxes5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax21 Tax21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation8
 * TaxCalculationInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax25 Tax25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax28 Tax28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1 FeeAndTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32 Tax32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
 * TotalFeesAndTaxes40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30 Tax30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation9
 * TaxCalculationInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31 Tax31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation10
 * TaxCalculationInformation10}</li>
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
 * "InvestmentFundTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * </ul>
 */
public class InvestmentFundTax extends SecuritiesTax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an owner of an investment account may benefit from a
	 * fiscal exemption or amnesty for instance for declaring overseas
	 * investments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#FiscalExemption
	 * InvestmentAccountOwnershipInformation5.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#FiscalExemption
	 * InvestmentAccountOwnershipInformation2.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#FiscalExemption
	 * InvestmentAccountOwnershipInformation6.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#FiscalExemption
	 * InvestmentAccountOwnershipInformation3.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#FiscalExemption
	 * InvestmentAccountOwnershipInformation4.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#FiscalExemption
	 * InvestmentAccountOwnershipInformation7.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#FiscalExemption
	 * InvestmentAccountOwnershipInformation8.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#FiscalExemption
	 * InvestmentAccountOwnershipInformation9.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#FiscalExemption
	 * InvestmentAccountOwnershipInformation10.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#FiscalExemption
	 * InvestmentAccountOwnershipInformation11.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#FiscalExemption
	 * InvestmentAccountOwnershipInformation12.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#FiscalExemption
	 * InvestmentAccountOwnershipInformation13.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#FiscalExemption
	 * InvestmentAccountOwnershipInformation15.FiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#FiscalExemption
	 * InvestmentAccountOwnershipInformation14.FiscalExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FiscalExemption = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.FiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.FiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.FiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.FiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.FiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.FiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.FiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.FiscalExemption);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Investment account for which taxes are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTax
	 * InvestmentAccount.InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account for which taxes are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account for which taxes are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Percentage of the underlying assets of the funds that represents a debt
	 * and is in the scope of the European directive on taxation of savings
	 * income in the form of interest payments (Council Directive 2003/48/EC 3
	 * June).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation2#PercentageOfDebtClaim
	 * TaxCalculationInformation2.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#PercentageOfDebtClaim
	 * TaxCalculationInformation4.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#PercentageOfDebtClaim
	 * TotalTaxes3.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#PercentageOfDebtClaim
	 * TotalTaxes4.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes5#PercentageOfDebtClaim
	 * TotalTaxes5.PercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#PercentageOfDebtClaim
	 * InformativeTax1.PercentageOfDebtClaim}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation2.PercentageOfDebtClaim, com.tools20022.repository.msg.TaxCalculationInformation4.PercentageOfDebtClaim,
					com.tools20022.repository.msg.TotalTaxes3.PercentageOfDebtClaim, com.tools20022.repository.msg.TotalTaxes4.PercentageOfDebtClaim, com.tools20022.repository.msg.TotalTaxes5.PercentageOfDebtClaim,
					com.tools20022.repository.msg.InformativeTax1.PercentageOfDebtClaim);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Percentage of grandfathered debt claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation2#PercentageGrandfatheredDebt
	 * TaxCalculationInformation2.PercentageGrandfatheredDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#PercentageGrandfatheredDebt
	 * TaxCalculationInformation4.PercentageGrandfatheredDebt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageGrandfatheredDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of grandfathered debt claim."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageGrandfatheredDebt = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation2.PercentageGrandfatheredDebt, com.tools20022.repository.msg.TaxCalculationInformation4.PercentageGrandfatheredDebt);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageGrandfatheredDebt";
			definition = "Percentage of grandfathered debt claim.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether a tax exemption applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#ExemptionIndicator
	 * Tax3.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#ExemptionIndicator
	 * Tax15.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#ExemptionIndicator
	 * Tax6.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#ExemptionIndicator
	 * Tax16.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#ExemptionIndicator
	 * Tax7.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#ExemptionIndicator
	 * Tax14.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#ExemptionIndicator
	 * Tax18.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#ExemptionIndicator
	 * Tax19.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax20#ExemptionIndicator
	 * Tax20.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#ExemptionIndicator
	 * Tax21.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#ExemptionIndicator
	 * Tax25.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#ExemptionIndicator
	 * Tax28.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#ExemptionIndicator
	 * Tax32.ExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#ExemptionIndicator
	 * Tax30.ExemptionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a tax exemption applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExemptionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax3.ExemptionIndicator, com.tools20022.repository.msg.Tax15.ExemptionIndicator, com.tools20022.repository.msg.Tax6.ExemptionIndicator,
					com.tools20022.repository.msg.Tax16.ExemptionIndicator, com.tools20022.repository.msg.Tax7.ExemptionIndicator, com.tools20022.repository.msg.Tax14.ExemptionIndicator,
					com.tools20022.repository.msg.Tax18.ExemptionIndicator, com.tools20022.repository.msg.Tax19.ExemptionIndicator, com.tools20022.repository.msg.Tax20.ExemptionIndicator,
					com.tools20022.repository.msg.Tax21.ExemptionIndicator, com.tools20022.repository.msg.Tax25.ExemptionIndicator, com.tools20022.repository.msg.Tax28.ExemptionIndicator,
					com.tools20022.repository.msg.Tax32.ExemptionIndicator, com.tools20022.repository.msg.Tax30.ExemptionIndicator);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Transaction for which the tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionTax
	 * InvestmentFundTransaction.TransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction for which the tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Transaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.TransactionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTax";
				definition = "Tax related to an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTax, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionTax);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.TaxCalculationDetails, com.tools20022.repository.msg.Tax17.TaxCalculationDetails, com.tools20022.repository.msg.DeliverInformation2.TaxDetails,
						com.tools20022.repository.msg.DeliverInformation4.TaxDetails, com.tools20022.repository.msg.DeliverInformation7.TaxDetails, com.tools20022.repository.msg.ReceiveInformation2.TaxDetails,
						com.tools20022.repository.msg.ReceiveInformation4.TaxDetails, com.tools20022.repository.msg.ReceiveInformation8.TaxDetails, com.tools20022.repository.msg.ReceiveInformation6.TaxDetails,
						com.tools20022.repository.msg.ReceiveInformation11.TaxDetails, com.tools20022.repository.msg.DeliverInformation11.TaxDetails, com.tools20022.repository.msg.DeliverInformation3.TaxDetails,
						com.tools20022.repository.msg.DeliverInformation8.TaxDetails, com.tools20022.repository.msg.ReceiveInformation3.TaxDetails, com.tools20022.repository.msg.ReceiveInformation7.TaxDetails,
						com.tools20022.repository.msg.ReceiveInformation5.TaxDetails, com.tools20022.repository.msg.ReceiveInformation9.TaxDetails, com.tools20022.repository.msg.DeliverInformation5.TaxDetails,
						com.tools20022.repository.msg.DeliverInformation9.TaxDetails, com.tools20022.repository.msg.DeliverInformation6.TaxDetails, com.tools20022.repository.msg.Tax6.TaxCalculationDetails,
						com.tools20022.repository.msg.Tax16.TaxCalculationDetails, com.tools20022.repository.msg.Tax7.TaxCalculationDetails, com.tools20022.repository.msg.TotalTaxes2.TaxDetails,
						com.tools20022.repository.msg.Tax14.TaxCalculationDetails, com.tools20022.repository.msg.TotalTaxes3.TaxDetails, com.tools20022.repository.msg.Tax18.EUCapitalGainType,
						com.tools20022.repository.msg.Tax18.TaxCalculationDetails, com.tools20022.repository.msg.TotalTaxes4.TaxDetails, com.tools20022.repository.msg.Tax19.EUCapitalGainType,
						com.tools20022.repository.msg.TotalTaxes5.TaxDetails, com.tools20022.repository.msg.ReceiveInformation13.TaxDetails, com.tools20022.repository.msg.ReceiveInformation12.TaxDetails,
						com.tools20022.repository.msg.DeliverInformation12.TaxDetails, com.tools20022.repository.msg.DeliverInformation13.TaxDetails, com.tools20022.repository.msg.Tax21.TaxCalculationDetails,
						com.tools20022.repository.msg.DeliverInformation15.TaxDetails, com.tools20022.repository.msg.DeliverInformation14.TaxDetails, com.tools20022.repository.msg.ReceiveInformation15.TaxDetails,
						com.tools20022.repository.msg.ReceiveInformation14.TaxDetails, com.tools20022.repository.msg.Tax25.TaxCalculationDetails, com.tools20022.repository.msg.ReceiveInformation17.TaxDetails,
						com.tools20022.repository.msg.ReceiveInformation16.TaxDetails, com.tools20022.repository.msg.DeliverInformation16.TaxDetails, com.tools20022.repository.msg.DeliverInformation17.TaxDetails,
						com.tools20022.repository.msg.Tax28.TaxCalculationDetails, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.TaxExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.TaxExemption, com.tools20022.repository.msg.RedemptionOrder14.TransactionOverhead,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.TransactionOverhead, com.tools20022.repository.msg.FeeAndTax1.IndividualTax, com.tools20022.repository.msg.InformativeTax1.IndividualTax,
						com.tools20022.repository.msg.Tax32.TaxCalculationDetails, com.tools20022.repository.msg.SubscriptionExecution13.TransactionOverhead, com.tools20022.repository.msg.TotalFeesAndTaxes40.TotalTaxes,
						com.tools20022.repository.msg.TotalFeesAndTaxes40.IndividualTax, com.tools20022.repository.msg.SubscriptionExecution12.TransactionOverhead, com.tools20022.repository.msg.SubscriptionOrder15.TransactionOverhead,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.TaxExemption, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.TransactionOverhead,
						com.tools20022.repository.msg.RedemptionOrder15.TransactionOverhead, com.tools20022.repository.msg.Tax30.TaxCalculationDetails, com.tools20022.repository.msg.Tax31.TaxCalculationDetails,
						com.tools20022.repository.msg.RedemptionExecution16.TransactionOverhead, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.TaxExemption,
						com.tools20022.repository.msg.SubscriptionOrder14.TransactionOverhead, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.TransactionOverhead,
						com.tools20022.repository.msg.RedemptionExecution15.TransactionOverhead, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.TransactionOverhead);
				superType_lazy = () -> SecuritiesTax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTax.FiscalExemption, com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTax.PercentageOfDebtClaim, com.tools20022.repository.entity.InvestmentFundTax.PercentageGrandfatheredDebt,
						com.tools20022.repository.entity.InvestmentFundTax.ExemptionIndicator, com.tools20022.repository.entity.InvestmentFundTax.Transaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxCalculationInformation2.mmObject(), Tax8.mmObject(), TaxCalculationInformation4.mmObject(), Tax17.mmObject(), Tax15.mmObject(), TaxCalculationInformation1.mmObject(),
						Tax6.mmObject(), TaxCalculationInformation5.mmObject(), Tax16.mmObject(), TaxCalculationInformation3.mmObject(), Tax7.mmObject(), TotalTaxes2.mmObject(), TaxCalculationInformation6.mmObject(), Tax14.mmObject(),
						TotalTaxes3.mmObject(), TaxCalculationBasisType1Choice.mmObject(), TaxCalculationInformation7.mmObject(), Tax18.mmObject(), TotalTaxes4.mmObject(), Tax19.mmObject(), Tax20.mmObject(), TotalTaxes5.mmObject(),
						Tax21.mmObject(), TaxCalculationInformation8.mmObject(), Tax25.mmObject(), Tax28.mmObject(), FeeAndTax1.mmObject(), Tax32.mmObject(), TotalFeesAndTaxes40.mmObject(), Tax30.mmObject(),
						TaxCalculationInformation9.mmObject(), Tax31.mmObject(), TaxCalculationInformation10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}