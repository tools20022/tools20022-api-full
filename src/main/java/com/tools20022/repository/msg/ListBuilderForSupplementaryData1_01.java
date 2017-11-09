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

import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08;
import com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06;
import java.util.List;

class ListBuilderForSupplementaryData1_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) SecuritiesSettlementTransactionGenerationNotification002V07.mmSupplementaryData);
		list.add((T) SecuritiesFinancingModificationInstruction002V06.mmSupplementaryData);
		list.add((T) CorporateActionMovementConfirmation002V08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionConfirmation002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionReversalAdvice002V06.mmSupplementaryData);
		list.add((T) MoneyMarketUnsecuredMarketStatisticalReportV02.mmSupplementaryData);
		list.add((T) MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData);
		list.add((T) MoneyMarketSecuredMarketStatisticalReportV02.mmSupplementaryData);
		list.add((T) MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingInstrumentClassificationReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingEquityTradingActivityResultV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingEquityTransparencyDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingReferenceDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingInvalidReferenceDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonWorkingDayReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingTransactionReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingEquityTradingActivityReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingCurrencyCodeReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingReferenceDataIndexReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingReferenceDataDeltaReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingCountryCodeReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmSupplementaryData);
		return list;
	}
}