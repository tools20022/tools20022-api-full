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
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode;
import com.tools20022.repository.codeset.IncomePreferenceCode;
import com.tools20022.repository.codeset.TaxWithholdingMethodCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountService"
 * src="doc-files/InvestmentAccountService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#IncomePreference
 * InvestmentAccountService.IncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#TaxWithholdingMethod
 * InvestmentAccountService.TaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#RoundingMethod
 * InvestmentAccountService.RoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#BeneficiaryCertificationIndicator
 * InvestmentAccountService.BeneficiaryCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#BeneficiaryCertificationCompletion
 * InvestmentAccountService.BeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#SystematicInvestmentPlan
 * InvestmentAccountService.SystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#InvestmentAccountContract
 * InvestmentAccountService.InvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#ReportingService
 * InvestmentAccountService.ReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#Reinvestment
 * InvestmentAccountService.Reinvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#RelatedInvestmentAccountService
 * ReportingService.RelatedInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#Services
 * InvestmentAccountContract.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#InvestmentAccountService
 * RoundingParameters.InvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#RelatedService
 * InvestmentPlan.RelatedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#RelatedinvestmentAccountService
 * Reinvestment.RelatedinvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
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
 * "InvestmentAccountService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
 * </li>
 * </ul>
 */
public class InvestmentAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreferenceCode
	 * IncomePreferenceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#IncomePreference
	 * InvestmentAccount17.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#IncomePreference
	 * InvestmentPlan2.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#IncomePreference
	 * InvestmentAccount27.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#IncomePreference
	 * InvestmentPlan4.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#IncomePreference
	 * InvestmentAccount35.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#IncomePreference
	 * InvestmentPlan6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#IncomePreference
	 * InvestmentAccount18.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#IncomePreference
	 * InvestmentPlan5.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#IncomePreference
	 * InvestmentPlan3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#IncomePreference
	 * InvestmentAccount28.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#IncomePreference
	 * InvestmentAccount36.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#IncomePreference
	 * InvestmentPlan7.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#IncomePreference
	 * InvestmentAccount16.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#IncomePreference
	 * InvestmentAccount26.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#IncomePreference
	 * InvestmentAccount34.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#IncomePreference
	 * InvestmentAccount10.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#IncomePreference
	 * InvestmentAccount11.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#IncomePreference
	 * InvestmentAccount22.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#IncomePreference
	 * InvestmentAccount24.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#IncomePreference
	 * RedemptionOrder3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#IncomePreference
	 * RedemptionOrder5.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#IncomePreference
	 * RedemptionExecution3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#IncomePreference
	 * RedemptionExecution5.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#IncomePreference
	 * RedemptionOrder7.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#IncomePreference
	 * RedemptionOrder4.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#IncomePreference
	 * RedemptionOrder6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#IncomePreference
	 * RedemptionExecution4.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#IncomePreference
	 * RedemptionExecution6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#IncomePreference
	 * RedemptionOrder8.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#IncomePreference
	 * SubscriptionOrder3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#IncomePreference
	 * SubscriptionOrder5.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#IncomePreference
	 * SubscriptionExecution3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#IncomePreference
	 * SubscriptionExecution5.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#IncomePreference
	 * SubscriptionOrder7.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#IncomePreference
	 * SubscriptionOrder4.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#IncomePreference
	 * SubscriptionOrder6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#IncomePreference
	 * SubscriptionExecution4.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#IncomePreference
	 * SubscriptionExecution6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#IncomePreference
	 * SubscriptionOrder8.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#IncomePreference
	 * SwitchRedemptionLegOrder2.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#IncomePreference
	 * SwitchSubscriptionLegOrder2.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#IncomePreference
	 * SwitchRedemptionLegOrder3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#IncomePreference
	 * SwitchSubscriptionLegOrder3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#IncomePreference
	 * SwitchRedemptionLegExecution2.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#IncomePreference
	 * SwitchSubscriptionLegExecution2.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#IncomePreference
	 * SwitchRedemptionLegExecution3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#IncomePreference
	 * SwitchSubscriptionLegExecution3.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#IncomePreference
	 * RedemptionOrder11.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#IncomePreference
	 * RedemptionExecution12.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#IncomePreference
	 * SubscriptionOrder11.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#IncomePreference
	 * SubscriptionExecution9.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#IncomePreference
	 * InvestmentPlan9.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#IncomePreference
	 * InvestmentAccount38.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#IncomePreference
	 * InvestmentAccount37.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#IncomePreference
	 * InvestmentAccount39.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#IncomePreference
	 * InvestmentPlan8.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#IncomePreference
	 * InvestmentAccount40.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#IncomePreference
	 * InvestmentAccount41.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#IncomePreference
	 * InvestmentPlan10.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#IncomePreference
	 * InvestmentPlan11.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#IncomePreference
	 * InvestmentAccount46.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#IncomePreference
	 * InvestmentAccount47.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#IncomePreference
	 * InvestmentPlan12.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#IncomePreference
	 * InvestmentAccount49.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#IncomePreference
	 * InvestmentAccount54.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#IncomePreference
	 * InvestmentAccount51.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#IncomePreference
	 * InvestmentAccount50.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#IncomePreference
	 * InvestmentAccount56.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#IncomePreference
	 * InvestmentAccount55.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#IncomePreference
	 * InvestmentPlan13.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#IncomePreference
	 * InvestmentAccount57.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#IncomePreference
	 * InvestmentAccount61.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#IncomePreference
	 * InvestmentPlan14.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#IncomePreference
	 * InvestmentAccount63.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#IncomePreference
	 * InvestmentAccount62.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#IncomePreference
	 * RedemptionOrder14.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#IncomePreference
	 * SwitchSubscriptionLegOrder6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#IncomePreference
	 * InvestmentPlan15.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#IncomePreference
	 * SubscriptionExecution13.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#IncomePreference
	 * SubscriptionExecution12.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#IncomePreference
	 * SubscriptionOrder15.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#IncomePreference
	 * SwitchRedemptionLegOrder6.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#IncomePreference
	 * RedemptionOrder15.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#IncomePreference
	 * RedemptionExecution16.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#IncomePreference
	 * SubscriptionOrder14.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#IncomePreference
	 * SwitchSubscriptionLegExecution4.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#IncomePreference
	 * RedemptionExecution15.IncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#IncomePreference
	 * SwitchRedemptionLegExecution4.IncomePreference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncomePreference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.IncomePreference, com.tools20022.repository.msg.InvestmentPlan2.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount27.IncomePreference, com.tools20022.repository.msg.InvestmentPlan4.IncomePreference, com.tools20022.repository.msg.InvestmentAccount35.IncomePreference,
					com.tools20022.repository.msg.InvestmentPlan6.IncomePreference, com.tools20022.repository.msg.InvestmentAccount18.IncomePreference, com.tools20022.repository.msg.InvestmentPlan5.IncomePreference,
					com.tools20022.repository.msg.InvestmentPlan3.IncomePreference, com.tools20022.repository.msg.InvestmentAccount28.IncomePreference, com.tools20022.repository.msg.InvestmentAccount36.IncomePreference,
					com.tools20022.repository.msg.InvestmentPlan7.IncomePreference, com.tools20022.repository.msg.InvestmentAccount16.IncomePreference, com.tools20022.repository.msg.InvestmentAccount26.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount34.IncomePreference, com.tools20022.repository.msg.InvestmentAccount10.IncomePreference, com.tools20022.repository.msg.InvestmentAccount11.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount22.IncomePreference, com.tools20022.repository.msg.InvestmentAccount24.IncomePreference, com.tools20022.repository.msg.RedemptionOrder3.IncomePreference,
					com.tools20022.repository.msg.RedemptionOrder5.IncomePreference, com.tools20022.repository.msg.RedemptionExecution3.IncomePreference, com.tools20022.repository.msg.RedemptionExecution5.IncomePreference,
					com.tools20022.repository.msg.RedemptionOrder7.IncomePreference, com.tools20022.repository.msg.RedemptionOrder4.IncomePreference, com.tools20022.repository.msg.RedemptionOrder6.IncomePreference,
					com.tools20022.repository.msg.RedemptionExecution4.IncomePreference, com.tools20022.repository.msg.RedemptionExecution6.IncomePreference, com.tools20022.repository.msg.RedemptionOrder8.IncomePreference,
					com.tools20022.repository.msg.SubscriptionOrder3.IncomePreference, com.tools20022.repository.msg.SubscriptionOrder5.IncomePreference, com.tools20022.repository.msg.SubscriptionExecution3.IncomePreference,
					com.tools20022.repository.msg.SubscriptionExecution5.IncomePreference, com.tools20022.repository.msg.SubscriptionOrder7.IncomePreference, com.tools20022.repository.msg.SubscriptionOrder4.IncomePreference,
					com.tools20022.repository.msg.SubscriptionOrder6.IncomePreference, com.tools20022.repository.msg.SubscriptionExecution4.IncomePreference, com.tools20022.repository.msg.SubscriptionExecution6.IncomePreference,
					com.tools20022.repository.msg.SubscriptionOrder8.IncomePreference, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.IncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.IncomePreference,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.IncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.IncomePreference,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.IncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.IncomePreference,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.IncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.IncomePreference,
					com.tools20022.repository.msg.RedemptionOrder11.IncomePreference, com.tools20022.repository.msg.RedemptionExecution12.IncomePreference, com.tools20022.repository.msg.SubscriptionOrder11.IncomePreference,
					com.tools20022.repository.msg.SubscriptionExecution9.IncomePreference, com.tools20022.repository.msg.InvestmentPlan9.IncomePreference, com.tools20022.repository.msg.InvestmentAccount38.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount37.IncomePreference, com.tools20022.repository.msg.InvestmentAccount39.IncomePreference, com.tools20022.repository.msg.InvestmentPlan8.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount40.IncomePreference, com.tools20022.repository.msg.InvestmentAccount41.IncomePreference, com.tools20022.repository.msg.InvestmentPlan10.IncomePreference,
					com.tools20022.repository.msg.InvestmentPlan11.IncomePreference, com.tools20022.repository.msg.InvestmentAccount46.IncomePreference, com.tools20022.repository.msg.InvestmentAccount47.IncomePreference,
					com.tools20022.repository.msg.InvestmentPlan12.IncomePreference, com.tools20022.repository.msg.InvestmentAccount49.IncomePreference, com.tools20022.repository.msg.InvestmentAccount54.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount51.IncomePreference, com.tools20022.repository.msg.InvestmentAccount50.IncomePreference, com.tools20022.repository.msg.InvestmentAccount56.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount55.IncomePreference, com.tools20022.repository.msg.InvestmentPlan13.IncomePreference, com.tools20022.repository.msg.InvestmentAccount57.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount61.IncomePreference, com.tools20022.repository.msg.InvestmentPlan14.IncomePreference, com.tools20022.repository.msg.InvestmentAccount63.IncomePreference,
					com.tools20022.repository.msg.InvestmentAccount62.IncomePreference, com.tools20022.repository.msg.RedemptionOrder14.IncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.IncomePreference,
					com.tools20022.repository.msg.InvestmentPlan15.IncomePreference, com.tools20022.repository.msg.SubscriptionExecution13.IncomePreference, com.tools20022.repository.msg.SubscriptionExecution12.IncomePreference,
					com.tools20022.repository.msg.SubscriptionOrder15.IncomePreference, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.IncomePreference, com.tools20022.repository.msg.RedemptionOrder15.IncomePreference,
					com.tools20022.repository.msg.RedemptionExecution16.IncomePreference, com.tools20022.repository.msg.SubscriptionOrder14.IncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.IncomePreference,
					com.tools20022.repository.msg.RedemptionExecution15.IncomePreference, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.IncomePreference);
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}
	};
	/**
	 * Method by which the tax (withholding tax) is to be processed i.e. either
	 * withheld at source or tax information reported to tax authorities or tax
	 * information is reported due to the provision of a tax certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#TaxWithholdingMethod
	 * InvestmentAccount17.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#TaxWithholdingMethod
	 * InvestmentAccount27.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#TaxWithholdingMethod
	 * InvestmentAccount35.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#TaxWithholdingMethod
	 * InvestmentAccount18.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#TaxWithholdingMethod
	 * InvestmentAccount28.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#TaxWithholdingMethod
	 * InvestmentAccount36.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#TaxWithholdingMethod
	 * InvestmentAccount16.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#TaxWithholdingMethod
	 * InvestmentAccount26.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#TaxWithholdingMethod
	 * InvestmentAccount34.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#TaxWithholdingMethod
	 * InvestmentAccount38.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#TaxWithholdingMethod
	 * InvestmentAccount37.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#TaxWithholdingMethod
	 * InvestmentAccount39.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#TaxWithholdingMethod
	 * InvestmentAccount46.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#TaxWithholdingMethod
	 * InvestmentAccount47.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#TaxWithholdingMethod
	 * InvestmentAccount49.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#TaxWithholdingMethod
	 * InvestmentAccount51.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#TaxWithholdingMethod
	 * InvestmentAccount50.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#TaxWithholdingMethod
	 * InvestmentAccount61.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#TaxWithholdingMethod
	 * InvestmentAccount63.TaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#TaxWithholdingMethod
	 * InvestmentAccount62.TaxWithholdingMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxWithholdingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxWithholdingMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount27.TaxWithholdingMethod,
					com.tools20022.repository.msg.InvestmentAccount35.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount18.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount28.TaxWithholdingMethod,
					com.tools20022.repository.msg.InvestmentAccount36.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount16.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount26.TaxWithholdingMethod,
					com.tools20022.repository.msg.InvestmentAccount34.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount38.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount37.TaxWithholdingMethod,
					com.tools20022.repository.msg.InvestmentAccount39.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount46.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount47.TaxWithholdingMethod,
					com.tools20022.repository.msg.InvestmentAccount49.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount51.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount50.TaxWithholdingMethod,
					com.tools20022.repository.msg.InvestmentAccount61.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount63.TaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount62.TaxWithholdingMethod);
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxWithholdingMethodCode.mmObject();
		}
	};
	/**
	 * Rounding method used to determine the quantity of investment fund units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#InvestmentAccountService
	 * RoundingParameters.InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#RoundingDetails
	 * InvestmentAccount17.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#RoundingDetails
	 * InvestmentAccount27.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#RoundingDetails
	 * InvestmentAccount35.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#RoundingDetails
	 * InvestmentAccount18.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#RoundingDetails
	 * InvestmentAccount28.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#RoundingDetails
	 * InvestmentAccount36.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#RoundingDetails
	 * InvestmentAccount16.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#RoundingDetails
	 * InvestmentAccount26.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#RoundingDetails
	 * InvestmentAccount34.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#RoundingDetails
	 * InvestmentAccount38.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#RoundingDetails
	 * InvestmentAccount37.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#RoundingDetails
	 * InvestmentAccount39.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#RoundingDetails
	 * InvestmentAccount46.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#RoundingDetails
	 * InvestmentAccount47.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#RoundingDetails
	 * InvestmentAccount49.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#RoundingDetails
	 * InvestmentAccount51.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#RoundingDetails
	 * InvestmentAccount50.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#RoundingDetails
	 * InvestmentAccount61.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#RoundingDetails
	 * InvestmentAccount63.RoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#RoundingDetails
	 * InvestmentAccount62.RoundingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding method used to determine the quantity of investment fund units."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RoundingMethod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount27.RoundingDetails,
					com.tools20022.repository.msg.InvestmentAccount35.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount18.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount28.RoundingDetails,
					com.tools20022.repository.msg.InvestmentAccount36.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount16.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount26.RoundingDetails,
					com.tools20022.repository.msg.InvestmentAccount34.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount38.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount37.RoundingDetails,
					com.tools20022.repository.msg.InvestmentAccount39.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount46.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount47.RoundingDetails,
					com.tools20022.repository.msg.InvestmentAccount49.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount51.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount50.RoundingDetails,
					com.tools20022.repository.msg.InvestmentAccount61.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount63.RoundingDetails, com.tools20022.repository.msg.InvestmentAccount62.RoundingDetails);
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingMethod";
			definition = "Rounding method used to determine the quantity of investment fund units.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RoundingParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the beneficial ownership certification has been sent,
	 * certifying that the beneficial owner is eligible to own a specific
	 * investment fund or investment fund class.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#BeneficiaryCertificationIndicator
	 * InvestmentAccount10.BeneficiaryCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#BeneficiaryCertificationIndicator
	 * InvestmentAccount11.BeneficiaryCertificationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficiaryCertificationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount10.BeneficiaryCertificationIndicator, com.tools20022.repository.msg.InvestmentAccount11.BeneficiaryCertificationIndicator);
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationIndicator";
			definition = "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Beneficial owner or its designated agent certifies that it complies with
	 * any holding or investment restrictions or requirements of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode
	 * BeneficiaryCertificationCompletionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#BeneficiaryCertificationCompletion
	 * InvestmentAccount22.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#BeneficiaryCertificationCompletion
	 * InvestmentAccount24.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#BeneficiaryCertificationCompletion
	 * IndividualPerson9.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#BeneficiaryCertificationCompletion
	 * IndividualPerson15.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#BeneficiaryCertificationCompletion
	 * InvestmentAccount40.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#BeneficiaryCertificationCompletion
	 * InvestmentAccount41.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#BeneficiaryCertificationCompletion
	 * InvestmentAccount54.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#BeneficiaryCertificationCompletion
	 * InvestmentAccount56.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#BeneficiaryCertificationCompletion
	 * InvestmentAccount55.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#BeneficiaryCertificationCompletion
	 * InvestmentAccount57.BeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#BeneficiaryCertificationCompletion
	 * IndividualPerson31.BeneficiaryCertificationCompletion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficiaryCertificationCompletion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount22.BeneficiaryCertificationCompletion, com.tools20022.repository.msg.InvestmentAccount24.BeneficiaryCertificationCompletion,
					com.tools20022.repository.msg.IndividualPerson9.BeneficiaryCertificationCompletion, com.tools20022.repository.msg.IndividualPerson15.BeneficiaryCertificationCompletion,
					com.tools20022.repository.msg.InvestmentAccount40.BeneficiaryCertificationCompletion, com.tools20022.repository.msg.InvestmentAccount41.BeneficiaryCertificationCompletion,
					com.tools20022.repository.msg.InvestmentAccount54.BeneficiaryCertificationCompletion, com.tools20022.repository.msg.InvestmentAccount56.BeneficiaryCertificationCompletion,
					com.tools20022.repository.msg.InvestmentAccount55.BeneficiaryCertificationCompletion, com.tools20022.repository.msg.InvestmentAccount57.BeneficiaryCertificationCompletion,
					com.tools20022.repository.msg.IndividualPerson31.BeneficiaryCertificationCompletion);
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
		}
	};
	/**
	 * Investment plan associated with an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#RelatedService
	 * InvestmentPlan.RelatedService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan associated with an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystematicInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystematicInvestmentPlan";
			definition = "Investment plan associated with an investment account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.RelatedService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which specifies the services related to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#Services
	 * InvestmentAccountContract.Services}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which specifies the services related to an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract which specifies the services related to an account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reporting services parameters for an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#RelatedInvestmentAccountService
	 * ReportingService.RelatedInvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reporting services parameters for an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportingService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingService";
			definition = "Reporting services parameters for an investment account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reinvestment information included in the investment account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#RelatedinvestmentAccountService
	 * Reinvestment.RelatedinvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reinvestment
	 * Reinvestment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#ReinvestmentDetails
	 * InvestmentAccount38.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#ReinvestmentDetails
	 * InvestmentAccount37.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#ReinvestmentDetails
	 * InvestmentAccount39.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#ReinvestmentDetails
	 * InvestmentAccount46.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#ReinvestmentDetails
	 * InvestmentAccount47.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#ReinvestmentDetails
	 * InvestmentAccount49.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#ReinvestmentDetails
	 * InvestmentAccount51.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#ReinvestmentDetails
	 * InvestmentAccount50.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#ReinvestmentDetails
	 * InvestmentAccount61.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#ReinvestmentDetails
	 * InvestmentAccount63.ReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#ReinvestmentDetails
	 * InvestmentAccount62.ReinvestmentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinvestment information included in the investment account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reinvestment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount38.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount37.ReinvestmentDetails,
					com.tools20022.repository.msg.InvestmentAccount39.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount46.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount47.ReinvestmentDetails,
					com.tools20022.repository.msg.InvestmentAccount49.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount51.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount50.ReinvestmentDetails,
					com.tools20022.repository.msg.InvestmentAccount61.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount63.ReinvestmentDetails, com.tools20022.repository.msg.InvestmentAccount62.ReinvestmentDetails);
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information included in the investment account contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService, com.tools20022.repository.entity.InvestmentAccountContract.Services,
						com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService, com.tools20022.repository.entity.InvestmentPlan.RelatedService,
						com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.IncomePreference, com.tools20022.repository.entity.InvestmentAccountService.TaxWithholdingMethod,
						com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod, com.tools20022.repository.entity.InvestmentAccountService.BeneficiaryCertificationIndicator,
						com.tools20022.repository.entity.InvestmentAccountService.BeneficiaryCertificationCompletion, com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.ReportingService,
						com.tools20022.repository.entity.InvestmentAccountService.Reinvestment);
			}
		});
		return mmObject_lazy.get();
	}
}