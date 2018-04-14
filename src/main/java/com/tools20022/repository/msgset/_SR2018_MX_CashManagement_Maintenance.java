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
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * SR2018 MX Maintenance message set for the Cash Management messages
 * registration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelTransactionV07
 * CancelTransactionV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetLimitV06 GetLimitV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnStandingOrderV03
 * ReturnStandingOrderV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyMemberV03
 * ModifyMemberV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DeleteLimitV06
 * DeleteLimitV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetStandingOrderV02
 * GetStandingOrderV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnTransactionV07
 * ReturnTransactionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityDebitTransferV04
 * LiquidityDebitTransferV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyLimitV06
 * ModifyLimitV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnAccountV07
 * ReturnAccountV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03
 * ReturnCurrencyExchangeRateV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03
 * GetGeneralBusinessInformationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetMemberV03
 * GetMemberV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.BackupPaymentV06
 * BackupPaymentV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DeleteReservationV04
 * DeleteReservationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyReservationV04
 * ModifyReservationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04
 * LiquidityCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03
 * GetCurrencyExchangeRateV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnLimitV07
 * ReturnLimitV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetReservationV04
 * GetReservationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnMemberV03
 * ReturnMemberV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnBusinessDayInformationV06
 * ReturnBusinessDayInformationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnGeneralBusinessInformationV05
 * ReturnGeneralBusinessInformationV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnReservationV05
 * ReturnReservationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetBusinessDayInformationV04
 * GetBusinessDayInformationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyTransactionV07
 * ModifyTransactionV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetTransactionV07
 * GetTransactionV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReceiptV04 ReceiptV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05
 * ModifyStandingOrderV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetAccountV06
 * GetAccountV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DeleteStandingOrderV02
 * DeleteStandingOrderV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "_SR2018_MX_CashManagement_Maintenance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SR2018 MX Maintenance message set for the Cash Management messages registration."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class _SR2018_MX_CashManagement_Maintenance {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "_SR2018_MX_CashManagement_Maintenance";
				definition = "SR2018 MX Maintenance message set for the Cash Management messages registration.";
				messageDefinition_lazy = () -> Arrays.asList(CancelTransactionV07.mmObject(), GetLimitV06.mmObject(), ReturnStandingOrderV03.mmObject(), ModifyMemberV03.mmObject(), DeleteLimitV06.mmObject(), GetStandingOrderV02.mmObject(),
						ReturnTransactionV07.mmObject(), LiquidityDebitTransferV04.mmObject(), ModifyLimitV06.mmObject(), ReturnAccountV07.mmObject(), ReturnCurrencyExchangeRateV03.mmObject(), GetGeneralBusinessInformationV03.mmObject(),
						GetMemberV03.mmObject(), BackupPaymentV06.mmObject(), DeleteReservationV04.mmObject(), ModifyReservationV04.mmObject(), LiquidityCreditTransferV04.mmObject(), GetCurrencyExchangeRateV03.mmObject(),
						ReturnLimitV07.mmObject(), GetReservationV04.mmObject(), ReturnMemberV03.mmObject(), ReturnBusinessDayInformationV06.mmObject(), ReturnGeneralBusinessInformationV05.mmObject(), ReturnReservationV05.mmObject(),
						GetBusinessDayInformationV04.mmObject(), ModifyTransactionV07.mmObject(), GetTransactionV07.mmObject(), ReceiptV04.mmObject(), ModifyStandingOrderV05.mmObject(), GetAccountV06.mmObject(),
						DeleteStandingOrderV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}