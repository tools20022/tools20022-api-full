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
 * This message set provides for the specification of the Transactions and
 * Financial Instruments Data Reporting requirements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01
 * FinancialInstrumentReportingInstrumentClassificationReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01
 * FinancialInstrumentReportingEquityTradingActivityResultV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01
 * FinancialInstrumentReportingEquityTransparencyDataReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01
 * FinancialInstrumentReportingReferenceDataReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInvalidReferenceDataReportV01
 * FinancialInstrumentReportingInvalidReferenceDataReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01
 * FinancialInstrumentReportingStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01
 * FinancialInstrumentReportingNonWorkingDayReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTransactionReportV01
 * FinancialInstrumentReportingTransactionReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01
 * FinancialInstrumentReportingEquityTradingActivityReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingCurrencyCodeReportV01
 * FinancialInstrumentReportingCurrencyCodeReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01
 * FinancialInstrumentReportingReferenceDataIndexReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingMarketIdentificationCodeReportV01
 * FinancialInstrumentReportingMarketIdentificationCodeReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01
 * FinancialInstrumentReportingNonEquityTransparencyDataReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01
 * FinancialInstrumentReportingReferenceDataDeltaReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingCountryCodeReportV01
 * FinancialInstrumentReportingCountryCodeReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityReportV01
 * FinancialInstrumentReportingNonEquityTradingActivityReportV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Financial Instruments and Transactions Regulatory Reporting (Transactions and Financial Instruments Data Reporting)"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message set provides for the specification of the Transactions and Financial Instruments Data Reporting requirements."
 * </li>
 * </ul>
 */
public class FinancialInstrumentsandTransactionsRegulatoryReportingTransactionsandFinancialInstrumentsDataReporting {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Financial Instruments and Transactions Regulatory Reporting (Transactions and Financial Instruments Data Reporting)";
				definition = "This message set provides for the specification of the Transactions and Financial Instruments Data Reporting requirements.";
				messageDefinition_lazy = () -> Arrays.asList(FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmObject(), FinancialInstrumentReportingInstrumentClassificationReportV01.mmObject(),
						FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmObject(), FinancialInstrumentReportingEquityTradingActivityResultV01.mmObject(),
						FinancialInstrumentReportingEquityTransparencyDataReportV01.mmObject(), FinancialInstrumentReportingReferenceDataReportV01.mmObject(), FinancialInstrumentReportingInvalidReferenceDataReportV01.mmObject(),
						FinancialInstrumentReportingStatusAdviceV01.mmObject(), FinancialInstrumentReportingNonWorkingDayReportV01.mmObject(), FinancialInstrumentReportingTransactionReportV01.mmObject(),
						FinancialInstrumentReportingEquityTradingActivityReportV01.mmObject(), FinancialInstrumentReportingCurrencyCodeReportV01.mmObject(), FinancialInstrumentReportingReferenceDataIndexReportV01.mmObject(),
						FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmObject(), FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmObject(),
						FinancialInstrumentReportingReferenceDataDeltaReportV01.mmObject(), FinancialInstrumentReportingCountryCodeReportV01.mmObject(), FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}