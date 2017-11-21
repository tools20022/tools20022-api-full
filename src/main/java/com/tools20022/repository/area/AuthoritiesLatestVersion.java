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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the provision of miscellaneous financial information to
 * authorities, such as Regulators, Police, Customs, Tax authorities,
 * Enforcement authorities, Ministries, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "auth"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02
 * RegulatoryTransactionReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02
 * RegulatoryTransactionReportCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01
 * RegulatoryTransactionReportStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01
 * RegulatoryTransactionReportCancellationStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01
 * InformationRequestOpeningV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01
 * InformationRequestResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestStatusChangeNotificationV01
 * InformationRequestStatusChangeNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01
 * ContractRegistrationStatementRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01
 * ContractRegistrationAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01
 * ContractRegistrationConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01
 * ContractRegistrationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01
 * CurrencyControlStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01
 * CurrencyControlSupportingDocumentDeliveryV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01
 * ContractRegistrationClosureRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementV01
 * ContractRegistrationStatementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01
 * PaymentRegulatoryInformationNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01
 * CurrencyControlRequestOrLetterV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01
 * MoneyMarketForeignExchangeSwapsStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01
 * MoneyMarketUnsecuredMarketStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01
 * MoneyMarketSecuredMarketStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01
 * MoneyMarketStatisticalReportStatusAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01
 * InvoiceTaxReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportStatusAdviceV01
 * InvoiceTaxReportStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02
 * MoneyMarketUnsecuredMarketStatisticalReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV02
 * MoneyMarketSecuredMarketStatisticalReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV02
 * MoneyMarketOvernightIndexSwapsStatisticalReportV02}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Authorities - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the provision of miscellaneous financial information to authorities, such as Regulators, Police, Customs, Tax authorities, Enforcement authorities, Ministries, etc."
 * </li>
 * </ul>
 */
public class AuthoritiesLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Authorities - Latest version - master";
				definition = "Messages that support the provision of miscellaneous financial information to authorities, such as Regulators, Police, Customs, Tax authorities, Enforcement authorities, Ministries, etc.";
				messageDefinition_lazy = () -> Arrays.asList(RegulatoryTransactionReportV02.mmObject(), RegulatoryTransactionReportCancellationRequestV02.mmObject(), RegulatoryTransactionReportStatusV01.mmObject(),
						RegulatoryTransactionReportCancellationStatusV01.mmObject(), InformationRequestOpeningV01.mmObject(), InformationRequestResponseV01.mmObject(), InformationRequestStatusChangeNotificationV01.mmObject(),
						ContractRegistrationStatementRequestV01.mmObject(), ContractRegistrationAmendmentRequestV01.mmObject(), ContractRegistrationConfirmationV01.mmObject(), ContractRegistrationRequestV01.mmObject(),
						CurrencyControlStatusAdviceV01.mmObject(), CurrencyControlSupportingDocumentDeliveryV01.mmObject(), ContractRegistrationClosureRequestV01.mmObject(), ContractRegistrationStatementV01.mmObject(),
						PaymentRegulatoryInformationNotificationV01.mmObject(), CurrencyControlRequestOrLetterV01.mmObject(), MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmObject(),
						MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmObject(), MoneyMarketUnsecuredMarketStatisticalReportV01.mmObject(), MoneyMarketSecuredMarketStatisticalReportV01.mmObject(),
						MoneyMarketStatisticalReportStatusAdviceV01.mmObject(), InvoiceTaxReportV01.mmObject(), InvoiceTaxReportStatusAdviceV01.mmObject(), MoneyMarketUnsecuredMarketStatisticalReportV02.mmObject(),
						MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmObject(), MoneyMarketSecuredMarketStatisticalReportV02.mmObject(), MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmObject(),
						FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmObject(), FinancialInstrumentReportingInstrumentClassificationReportV01.mmObject(),
						FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmObject(), FinancialInstrumentReportingEquityTradingActivityResultV01.mmObject(),
						FinancialInstrumentReportingEquityTransparencyDataReportV01.mmObject(), FinancialInstrumentReportingReferenceDataReportV01.mmObject(), FinancialInstrumentReportingInvalidReferenceDataReportV01.mmObject(),
						FinancialInstrumentReportingStatusAdviceV01.mmObject(), FinancialInstrumentReportingNonWorkingDayReportV01.mmObject(), FinancialInstrumentReportingTransactionReportV01.mmObject(),
						FinancialInstrumentReportingEquityTradingActivityReportV01.mmObject(), FinancialInstrumentReportingCurrencyCodeReportV01.mmObject(), FinancialInstrumentReportingReferenceDataIndexReportV01.mmObject(),
						FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmObject(), FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmObject(),
						FinancialInstrumentReportingReferenceDataDeltaReportV01.mmObject(), FinancialInstrumentReportingCountryCodeReportV01.mmObject(), FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmObject());
				code = "auth";
			}
		});
		return mmObject_lazy.get();
	}
}