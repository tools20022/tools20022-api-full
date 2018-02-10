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
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode;
import com.tools20022.repository.codeset.IncomePreferenceCode;
import com.tools20022.repository.codeset.TaxWithholdingMethodCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
 * InvestmentAccountService.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmTaxWithholdingMethod
 * InvestmentAccountService.mmTaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
 * InvestmentAccountService.mmRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationIndicator
 * InvestmentAccountService.mmBeneficiaryCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationCompletion
 * InvestmentAccountService.mmBeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmSystematicInvestmentPlan
 * InvestmentAccountService.mmSystematicInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmInvestmentAccountContract
 * InvestmentAccountService.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
 * InvestmentAccountService.mmReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReinvestment
 * InvestmentAccountService.mmReinvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
 * ReportingService.mmRelatedInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmServices
 * InvestmentAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmInvestmentAccountService
 * RoundingParameters.mmInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmRelatedService
 * InvestmentPlan.mmRelatedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmRelatedinvestmentAccountService
 * Reinvestment.mmRelatedinvestmentAccountService}</li>
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
 * "InvestmentAccountService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
 * </li>
 * </ul>
 */
public class InvestmentAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected IncomePreferenceCode incomePreference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmIncomePreference
	 * InvestmentAccount17.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmIncomePreference
	 * InvestmentPlan2.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmIncomePreference
	 * InvestmentAccount27.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmIncomePreference
	 * InvestmentPlan4.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmIncomePreference
	 * InvestmentAccount35.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmIncomePreference
	 * InvestmentPlan6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmIncomePreference
	 * InvestmentAccount18.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmIncomePreference
	 * InvestmentPlan5.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmIncomePreference
	 * InvestmentPlan3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmIncomePreference
	 * InvestmentAccount28.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmIncomePreference
	 * InvestmentAccount36.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmIncomePreference
	 * InvestmentPlan7.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmIncomePreference
	 * InvestmentAccount16.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmIncomePreference
	 * InvestmentAccount26.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmIncomePreference
	 * InvestmentAccount34.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmIncomePreference
	 * InvestmentAccount10.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmIncomePreference
	 * InvestmentAccount11.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmIncomePreference
	 * InvestmentAccount22.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmIncomePreference
	 * InvestmentAccount24.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmIncomePreference
	 * RedemptionOrder3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmIncomePreference
	 * RedemptionOrder5.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmIncomePreference
	 * RedemptionExecution3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmIncomePreference
	 * RedemptionExecution5.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmIncomePreference
	 * RedemptionOrder7.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmIncomePreference
	 * RedemptionOrder4.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmIncomePreference
	 * RedemptionOrder6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmIncomePreference
	 * RedemptionExecution4.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmIncomePreference
	 * RedemptionExecution6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmIncomePreference
	 * RedemptionOrder8.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmIncomePreference
	 * SubscriptionOrder3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmIncomePreference
	 * SubscriptionOrder5.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmIncomePreference
	 * SubscriptionExecution3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmIncomePreference
	 * SubscriptionExecution5.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmIncomePreference
	 * SubscriptionOrder7.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmIncomePreference
	 * SubscriptionOrder4.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmIncomePreference
	 * SubscriptionOrder6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmIncomePreference
	 * SubscriptionExecution4.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmIncomePreference
	 * SubscriptionExecution6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmIncomePreference
	 * SubscriptionOrder8.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmIncomePreference
	 * SwitchRedemptionLegOrder2.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmIncomePreference
	 * SwitchSubscriptionLegOrder2.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmIncomePreference
	 * SwitchRedemptionLegOrder3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmIncomePreference
	 * SwitchSubscriptionLegOrder3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmIncomePreference
	 * SwitchRedemptionLegExecution2.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmIncomePreference
	 * SwitchSubscriptionLegExecution2.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmIncomePreference
	 * SwitchRedemptionLegExecution3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmIncomePreference
	 * SwitchSubscriptionLegExecution3.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmIncomePreference
	 * RedemptionOrder11.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmIncomePreference
	 * RedemptionExecution12.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmIncomePreference
	 * SubscriptionOrder11.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmIncomePreference
	 * SubscriptionExecution9.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmIncomePreference
	 * InvestmentPlan9.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmIncomePreference
	 * InvestmentAccount38.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmIncomePreference
	 * InvestmentAccount37.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmIncomePreference
	 * InvestmentAccount39.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmIncomePreference
	 * InvestmentPlan8.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmIncomePreference
	 * InvestmentAccount40.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmIncomePreference
	 * InvestmentAccount41.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmIncomePreference
	 * InvestmentPlan10.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmIncomePreference
	 * InvestmentPlan11.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmIncomePreference
	 * InvestmentAccount46.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmIncomePreference
	 * InvestmentAccount47.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmIncomePreference
	 * InvestmentPlan12.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmIncomePreference
	 * InvestmentAccount49.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmIncomePreference
	 * InvestmentAccount54.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmIncomePreference
	 * InvestmentAccount51.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmIncomePreference
	 * InvestmentAccount50.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmIncomePreference
	 * InvestmentAccount56.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmIncomePreference
	 * InvestmentAccount55.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmIncomePreference
	 * InvestmentPlan13.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmIncomePreference
	 * InvestmentAccount57.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmIncomePreference
	 * InvestmentAccount61.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmIncomePreference
	 * InvestmentPlan14.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmIncomePreference
	 * InvestmentAccount63.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmIncomePreference
	 * InvestmentAccount62.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmIncomePreference
	 * RedemptionOrder14.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmIncomePreference
	 * SwitchSubscriptionLegOrder6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmIncomePreference
	 * InvestmentPlan15.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmIncomePreference
	 * SubscriptionExecution13.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmIncomePreference
	 * SubscriptionExecution12.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmIncomePreference
	 * SubscriptionOrder15.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmIncomePreference
	 * SwitchRedemptionLegOrder6.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmIncomePreference
	 * RedemptionOrder15.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmIncomePreference
	 * RedemptionExecution16.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmIncomePreference
	 * SubscriptionOrder14.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmIncomePreference
	 * SwitchSubscriptionLegExecution4.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmIncomePreference
	 * RedemptionExecution15.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmIncomePreference
	 * SwitchRedemptionLegExecution4.mmIncomePreference}</li>
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
	public static final MMBusinessAttribute mmIncomePreference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount17.mmIncomePreference, InvestmentPlan2.mmIncomePreference, InvestmentAccount27.mmIncomePreference, InvestmentPlan4.mmIncomePreference,
					InvestmentAccount35.mmIncomePreference, InvestmentPlan6.mmIncomePreference, InvestmentAccount18.mmIncomePreference, InvestmentPlan5.mmIncomePreference, InvestmentPlan3.mmIncomePreference,
					InvestmentAccount28.mmIncomePreference, InvestmentAccount36.mmIncomePreference, InvestmentPlan7.mmIncomePreference, InvestmentAccount16.mmIncomePreference, InvestmentAccount26.mmIncomePreference,
					InvestmentAccount34.mmIncomePreference, InvestmentAccount10.mmIncomePreference, InvestmentAccount11.mmIncomePreference, InvestmentAccount22.mmIncomePreference, InvestmentAccount24.mmIncomePreference,
					RedemptionOrder3.mmIncomePreference, RedemptionOrder5.mmIncomePreference, RedemptionExecution3.mmIncomePreference, RedemptionExecution5.mmIncomePreference, RedemptionOrder7.mmIncomePreference,
					RedemptionOrder4.mmIncomePreference, RedemptionOrder6.mmIncomePreference, RedemptionExecution4.mmIncomePreference, RedemptionExecution6.mmIncomePreference, RedemptionOrder8.mmIncomePreference,
					SubscriptionOrder3.mmIncomePreference, SubscriptionOrder5.mmIncomePreference, SubscriptionExecution3.mmIncomePreference, SubscriptionExecution5.mmIncomePreference, SubscriptionOrder7.mmIncomePreference,
					SubscriptionOrder4.mmIncomePreference, SubscriptionOrder6.mmIncomePreference, SubscriptionExecution4.mmIncomePreference, SubscriptionExecution6.mmIncomePreference, SubscriptionOrder8.mmIncomePreference,
					SwitchRedemptionLegOrder2.mmIncomePreference, SwitchSubscriptionLegOrder2.mmIncomePreference, SwitchRedemptionLegOrder3.mmIncomePreference, SwitchSubscriptionLegOrder3.mmIncomePreference,
					SwitchRedemptionLegExecution2.mmIncomePreference, SwitchSubscriptionLegExecution2.mmIncomePreference, SwitchRedemptionLegExecution3.mmIncomePreference, SwitchSubscriptionLegExecution3.mmIncomePreference,
					RedemptionOrder11.mmIncomePreference, RedemptionExecution12.mmIncomePreference, SubscriptionOrder11.mmIncomePreference, SubscriptionExecution9.mmIncomePreference, InvestmentPlan9.mmIncomePreference,
					InvestmentAccount38.mmIncomePreference, InvestmentAccount37.mmIncomePreference, InvestmentAccount39.mmIncomePreference, InvestmentPlan8.mmIncomePreference, InvestmentAccount40.mmIncomePreference,
					InvestmentAccount41.mmIncomePreference, InvestmentPlan10.mmIncomePreference, InvestmentPlan11.mmIncomePreference, InvestmentAccount46.mmIncomePreference, InvestmentAccount47.mmIncomePreference,
					InvestmentPlan12.mmIncomePreference, InvestmentAccount49.mmIncomePreference, InvestmentAccount54.mmIncomePreference, InvestmentAccount51.mmIncomePreference, InvestmentAccount50.mmIncomePreference,
					InvestmentAccount56.mmIncomePreference, InvestmentAccount55.mmIncomePreference, InvestmentPlan13.mmIncomePreference, InvestmentAccount57.mmIncomePreference, InvestmentAccount61.mmIncomePreference,
					InvestmentPlan14.mmIncomePreference, InvestmentAccount63.mmIncomePreference, InvestmentAccount62.mmIncomePreference, RedemptionOrder14.mmIncomePreference, SwitchSubscriptionLegOrder6.mmIncomePreference,
					InvestmentPlan15.mmIncomePreference, SubscriptionExecution13.mmIncomePreference, SubscriptionExecution12.mmIncomePreference, SubscriptionOrder15.mmIncomePreference, SwitchRedemptionLegOrder6.mmIncomePreference,
					RedemptionOrder15.mmIncomePreference, RedemptionExecution16.mmIncomePreference, SubscriptionOrder14.mmIncomePreference, SwitchSubscriptionLegExecution4.mmIncomePreference, RedemptionExecution15.mmIncomePreference,
					SwitchRedemptionLegExecution4.mmIncomePreference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getIncomePreference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxWithholdingMethodCode taxWithholdingMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmTaxWithholdingMethod
	 * InvestmentAccount17.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmTaxWithholdingMethod
	 * InvestmentAccount27.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmTaxWithholdingMethod
	 * InvestmentAccount35.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmTaxWithholdingMethod
	 * InvestmentAccount18.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmTaxWithholdingMethod
	 * InvestmentAccount28.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmTaxWithholdingMethod
	 * InvestmentAccount36.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmTaxWithholdingMethod
	 * InvestmentAccount16.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmTaxWithholdingMethod
	 * InvestmentAccount26.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmTaxWithholdingMethod
	 * InvestmentAccount34.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmTaxWithholdingMethod
	 * InvestmentAccount38.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmTaxWithholdingMethod
	 * InvestmentAccount37.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmTaxWithholdingMethod
	 * InvestmentAccount39.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmTaxWithholdingMethod
	 * InvestmentAccount46.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmTaxWithholdingMethod
	 * InvestmentAccount47.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmTaxWithholdingMethod
	 * InvestmentAccount49.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmTaxWithholdingMethod
	 * InvestmentAccount51.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTaxWithholdingMethod
	 * InvestmentAccount50.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmTaxWithholdingMethod
	 * InvestmentAccount61.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTaxWithholdingMethod
	 * InvestmentAccount63.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTaxWithholdingMethod
	 * InvestmentAccount62.mmTaxWithholdingMethod}</li>
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
	public static final MMBusinessAttribute mmTaxWithholdingMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount17.mmTaxWithholdingMethod, InvestmentAccount27.mmTaxWithholdingMethod, InvestmentAccount35.mmTaxWithholdingMethod, InvestmentAccount18.mmTaxWithholdingMethod,
					InvestmentAccount28.mmTaxWithholdingMethod, InvestmentAccount36.mmTaxWithholdingMethod, InvestmentAccount16.mmTaxWithholdingMethod, InvestmentAccount26.mmTaxWithholdingMethod, InvestmentAccount34.mmTaxWithholdingMethod,
					InvestmentAccount38.mmTaxWithholdingMethod, InvestmentAccount37.mmTaxWithholdingMethod, InvestmentAccount39.mmTaxWithholdingMethod, InvestmentAccount46.mmTaxWithholdingMethod, InvestmentAccount47.mmTaxWithholdingMethod,
					InvestmentAccount49.mmTaxWithholdingMethod, InvestmentAccount51.mmTaxWithholdingMethod, InvestmentAccount50.mmTaxWithholdingMethod, InvestmentAccount61.mmTaxWithholdingMethod, InvestmentAccount63.mmTaxWithholdingMethod,
					InvestmentAccount62.mmTaxWithholdingMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxWithholdingMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getTaxWithholdingMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RoundingParameters roundingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmInvestmentAccountService
	 * RoundingParameters.mmInvestmentAccountService}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmRoundingDetails
	 * InvestmentAccount17.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmRoundingDetails
	 * InvestmentAccount27.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmRoundingDetails
	 * InvestmentAccount35.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmRoundingDetails
	 * InvestmentAccount18.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmRoundingDetails
	 * InvestmentAccount28.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmRoundingDetails
	 * InvestmentAccount36.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmRoundingDetails
	 * InvestmentAccount16.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmRoundingDetails
	 * InvestmentAccount26.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmRoundingDetails
	 * InvestmentAccount34.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmRoundingDetails
	 * InvestmentAccount38.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmRoundingDetails
	 * InvestmentAccount37.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmRoundingDetails
	 * InvestmentAccount39.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmRoundingDetails
	 * InvestmentAccount46.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmRoundingDetails
	 * InvestmentAccount47.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmRoundingDetails
	 * InvestmentAccount49.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmRoundingDetails
	 * InvestmentAccount51.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmRoundingDetails
	 * InvestmentAccount50.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmRoundingDetails
	 * InvestmentAccount61.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmRoundingDetails
	 * InvestmentAccount63.mmRoundingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmRoundingDetails
	 * InvestmentAccount62.mmRoundingDetails}</li>
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
	public static final MMBusinessAssociationEnd mmRoundingMethod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount17.mmRoundingDetails, InvestmentAccount27.mmRoundingDetails, InvestmentAccount35.mmRoundingDetails, InvestmentAccount18.mmRoundingDetails,
					InvestmentAccount28.mmRoundingDetails, InvestmentAccount36.mmRoundingDetails, InvestmentAccount16.mmRoundingDetails, InvestmentAccount26.mmRoundingDetails, InvestmentAccount34.mmRoundingDetails,
					InvestmentAccount38.mmRoundingDetails, InvestmentAccount37.mmRoundingDetails, InvestmentAccount39.mmRoundingDetails, InvestmentAccount46.mmRoundingDetails, InvestmentAccount47.mmRoundingDetails,
					InvestmentAccount49.mmRoundingDetails, InvestmentAccount51.mmRoundingDetails, InvestmentAccount50.mmRoundingDetails, InvestmentAccount61.mmRoundingDetails, InvestmentAccount63.mmRoundingDetails,
					InvestmentAccount62.mmRoundingDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingMethod";
			definition = "Rounding method used to determine the quantity of investment fund units.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmInvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
		}
	};
	protected YesNoIndicator beneficiaryCertificationIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmBeneficiaryCertificationIndicator
	 * InvestmentAccount10.mmBeneficiaryCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmBeneficiaryCertificationIndicator
	 * InvestmentAccount11.mmBeneficiaryCertificationIndicator}</li>
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
	public static final MMBusinessAttribute mmBeneficiaryCertificationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount10.mmBeneficiaryCertificationIndicator, InvestmentAccount11.mmBeneficiaryCertificationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationIndicator";
			definition = "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getBeneficiaryCertificationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BeneficiaryCertificationCompletionCode beneficiaryCertificationCompletion;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount22.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount24.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmBeneficiaryCertificationCompletion
	 * IndividualPerson9.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#mmBeneficiaryCertificationCompletion
	 * IndividualPerson15.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount40.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount41.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount54.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount56.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount55.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount57.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmBeneficiaryCertificationCompletion
	 * IndividualPerson31.mmBeneficiaryCertificationCompletion}</li>
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
	public static final MMBusinessAttribute mmBeneficiaryCertificationCompletion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount22.mmBeneficiaryCertificationCompletion, InvestmentAccount24.mmBeneficiaryCertificationCompletion, IndividualPerson9.mmBeneficiaryCertificationCompletion,
					IndividualPerson15.mmBeneficiaryCertificationCompletion, InvestmentAccount40.mmBeneficiaryCertificationCompletion, InvestmentAccount41.mmBeneficiaryCertificationCompletion,
					InvestmentAccount54.mmBeneficiaryCertificationCompletion, InvestmentAccount56.mmBeneficiaryCertificationCompletion, InvestmentAccount55.mmBeneficiaryCertificationCompletion,
					InvestmentAccount57.mmBeneficiaryCertificationCompletion, IndividualPerson31.mmBeneficiaryCertificationCompletion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentAccountService.class.getMethod("getBeneficiaryCertificationCompletion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan systematicInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmRelatedService
	 * InvestmentPlan.mmRelatedService}</li>
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
	public static final MMBusinessAssociationEnd mmSystematicInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystematicInvestmentPlan";
			definition = "Investment plan associated with an investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmRelatedService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected InvestmentAccountContract investmentAccountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmServices
	 * InvestmentAccountContract.mmServices}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract which specifies the services related to an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};
	protected ReportingService reportingService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
	 * ReportingService.mmRelatedInvestmentAccountService}</li>
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
	public static final MMBusinessAssociationEnd mmReportingService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingService";
			definition = "Reporting services parameters for an investment account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
		}
	};
	protected Reinvestment reinvestment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reinvestment#mmRelatedinvestmentAccountService
	 * Reinvestment.mmRelatedinvestmentAccountService}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmReinvestmentDetails
	 * InvestmentAccount38.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmReinvestmentDetails
	 * InvestmentAccount37.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmReinvestmentDetails
	 * InvestmentAccount39.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmReinvestmentDetails
	 * InvestmentAccount46.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmReinvestmentDetails
	 * InvestmentAccount47.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmReinvestmentDetails
	 * InvestmentAccount49.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmReinvestmentDetails
	 * InvestmentAccount51.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmReinvestmentDetails
	 * InvestmentAccount50.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmReinvestmentDetails
	 * InvestmentAccount61.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmReinvestmentDetails
	 * InvestmentAccount63.mmReinvestmentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmReinvestmentDetails
	 * InvestmentAccount62.mmReinvestmentDetails}</li>
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
	public static final MMBusinessAssociationEnd mmReinvestment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount38.mmReinvestmentDetails, InvestmentAccount37.mmReinvestmentDetails, InvestmentAccount39.mmReinvestmentDetails, InvestmentAccount46.mmReinvestmentDetails,
					InvestmentAccount47.mmReinvestmentDetails, InvestmentAccount49.mmReinvestmentDetails, InvestmentAccount51.mmReinvestmentDetails, InvestmentAccount50.mmReinvestmentDetails, InvestmentAccount61.mmReinvestmentDetails,
					InvestmentAccount63.mmReinvestmentDetails, InvestmentAccount62.mmReinvestmentDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information included in the investment account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmRelatedinvestmentAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService, com.tools20022.repository.entity.InvestmentAccountContract.mmServices,
						com.tools20022.repository.entity.RoundingParameters.mmInvestmentAccountService, com.tools20022.repository.entity.InvestmentPlan.mmRelatedService,
						com.tools20022.repository.entity.Reinvestment.mmRelatedinvestmentAccountService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.mmIncomePreference, com.tools20022.repository.entity.InvestmentAccountService.mmTaxWithholdingMethod,
						com.tools20022.repository.entity.InvestmentAccountService.mmRoundingMethod, com.tools20022.repository.entity.InvestmentAccountService.mmBeneficiaryCertificationIndicator,
						com.tools20022.repository.entity.InvestmentAccountService.mmBeneficiaryCertificationCompletion, com.tools20022.repository.entity.InvestmentAccountService.mmSystematicInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.mmInvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.mmReportingService,
						com.tools20022.repository.entity.InvestmentAccountService.mmReinvestment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentAccountService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IncomePreferenceCode getIncomePreference() {
		return incomePreference;
	}

	public InvestmentAccountService setIncomePreference(IncomePreferenceCode incomePreference) {
		this.incomePreference = Objects.requireNonNull(incomePreference);
		return this;
	}

	public TaxWithholdingMethodCode getTaxWithholdingMethod() {
		return taxWithholdingMethod;
	}

	public InvestmentAccountService setTaxWithholdingMethod(TaxWithholdingMethodCode taxWithholdingMethod) {
		this.taxWithholdingMethod = Objects.requireNonNull(taxWithholdingMethod);
		return this;
	}

	public RoundingParameters getRoundingMethod() {
		return roundingMethod;
	}

	public InvestmentAccountService setRoundingMethod(com.tools20022.repository.entity.RoundingParameters roundingMethod) {
		this.roundingMethod = Objects.requireNonNull(roundingMethod);
		return this;
	}

	public YesNoIndicator getBeneficiaryCertificationIndicator() {
		return beneficiaryCertificationIndicator;
	}

	public InvestmentAccountService setBeneficiaryCertificationIndicator(YesNoIndicator beneficiaryCertificationIndicator) {
		this.beneficiaryCertificationIndicator = Objects.requireNonNull(beneficiaryCertificationIndicator);
		return this;
	}

	public BeneficiaryCertificationCompletionCode getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion;
	}

	public InvestmentAccountService setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletionCode beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = Objects.requireNonNull(beneficiaryCertificationCompletion);
		return this;
	}

	public Optional<InvestmentPlan> getSystematicInvestmentPlan() {
		return systematicInvestmentPlan == null ? Optional.empty() : Optional.of(systematicInvestmentPlan);
	}

	public InvestmentAccountService setSystematicInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan systematicInvestmentPlan) {
		this.systematicInvestmentPlan = systematicInvestmentPlan;
		return this;
	}

	public Optional<InvestmentAccountContract> getInvestmentAccountContract() {
		return investmentAccountContract == null ? Optional.empty() : Optional.of(investmentAccountContract);
	}

	public InvestmentAccountService setInvestmentAccountContract(com.tools20022.repository.entity.InvestmentAccountContract investmentAccountContract) {
		this.investmentAccountContract = investmentAccountContract;
		return this;
	}

	public ReportingService getReportingService() {
		return reportingService;
	}

	public InvestmentAccountService setReportingService(com.tools20022.repository.entity.ReportingService reportingService) {
		this.reportingService = Objects.requireNonNull(reportingService);
		return this;
	}

	public Reinvestment getReinvestment() {
		return reinvestment;
	}

	public InvestmentAccountService setReinvestment(com.tools20022.repository.entity.Reinvestment reinvestment) {
		this.reinvestment = Objects.requireNonNull(reinvestment);
		return this;
	}
}