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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages used to report on risk management, financial position,
 * membership and activities of a central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01
 * CCPIncomeStatementAndCapitalAdequacyReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberObligationsReportV01
 * CCPMemberObligationsReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPClearedProductReportV01
 * CCPClearedProductReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.auth.CCPCollateralReportV01
 * CCPCollateralReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPAvailableFinancialResourcesReportV01
 * CCPAvailableFinancialResourcesReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPDailyCashFlowsReportV01
 * CCPDailyCashFlowsReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01
 * CCPPortfolioStressTestingDefinitionReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.auth.CCPInvestmentsReportV01
 * CCPInvestmentsReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPBackTestingDefinitionReportV01
 * CCPBackTestingDefinitionReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPAccountPositionReportV01
 * CCPAccountPositionReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPPortfolioStressTestingResultReportV01
 * CCPPortfolioStressTestingResultReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPLiquidityStressTestingDefinitionReportV01
 * CCPLiquidityStressTestingDefinitionReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPClearingMemberReportV01
 * CCPClearingMemberReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberRequirementsReportV01
 * CCPMemberRequirementsReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPLiquidityStressTestingResultReportV01
 * CCPLiquidityStressTestingResultReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPBackTestingResultReportV01
 * CCPBackTestingResultReportV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Central CounterParty (CCP) Data Reporting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used to report on risk management, financial position, membership and activities of a central counterparty."
 * </li>
 * </ul>
 */
public class CentralCounterPartyCCPDataReporting {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Central CounterParty (CCP) Data Reporting";
				definition = "Set of messages used to report on risk management, financial position, membership and activities of a central counterparty.";
				messageDefinition_lazy = () -> Arrays.asList(CCPIncomeStatementAndCapitalAdequacyReportV01.mmObject(), CCPMemberObligationsReportV01.mmObject(), CCPClearedProductReportV01.mmObject(), CCPCollateralReportV01.mmObject(),
						CCPAvailableFinancialResourcesReportV01.mmObject(), CCPDailyCashFlowsReportV01.mmObject(), CCPPortfolioStressTestingDefinitionReportV01.mmObject(), CCPInvestmentsReportV01.mmObject(),
						CCPBackTestingDefinitionReportV01.mmObject(), CCPAccountPositionReportV01.mmObject(), CCPPortfolioStressTestingResultReportV01.mmObject(), CCPLiquidityStressTestingDefinitionReportV01.mmObject(),
						CCPClearingMemberReportV01.mmObject(), CCPMemberRequirementsReportV01.mmObject(), CCPLiquidityStressTestingResultReportV01.mmObject(), CCPBackTestingResultReportV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}