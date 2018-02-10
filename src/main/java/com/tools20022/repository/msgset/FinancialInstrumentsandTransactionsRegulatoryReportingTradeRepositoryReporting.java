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
import com.tools20022.repository.area.other.DerivativesTradeReportQueryV01;
import com.tools20022.repository.area.other.DerivativesTradeReportV01;
import com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This message set provides for the specification of the Financial Instrument
 * Reporting (Trade Repository reporting) requirements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01
 * FinancialInstrumentReportingStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportV01
 * DerivativesTradeReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.DerivativesTradeReportQueryV01
 * DerivativesTradeReportQueryV01}</li>
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
 * "Financial Instruments and Transactions Regulatory Reporting (Trade Repository Reporting)"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message set provides for the specification of the Financial Instrument Reporting (Trade Repository reporting) requirements."
 * </li>
 * </ul>
 */
public class FinancialInstrumentsandTransactionsRegulatoryReportingTradeRepositoryReporting {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Financial Instruments and Transactions Regulatory Reporting (Trade Repository Reporting)";
				definition = "This message set provides for the specification of the Financial Instrument Reporting (Trade Repository reporting) requirements.";
				messageDefinition_lazy = () -> Arrays.asList(FinancialInstrumentReportingStatusAdviceV01.mmObject(), DerivativesTradeReportV01.mmObject(), DerivativesTradeReportQueryV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}