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
import com.tools20022.repository.area.secl.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The clearing messages support all required business flows, including trade
 * management, position management, risk management, collateral management, and
 * settlement management for the equities and fixed-income asset classes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.secl.MarginReportV02
 * MarginReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02
 * DefaultFundContributionReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03
 * TradeLegNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03
 * BuyInNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.secl.NetPositionV03
 * NetPositionV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03
 * BuyInConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.secl.TradeLegStatementV03
 * TradeLegStatementV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.secl.BuyInResponseV03
 * BuyInResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03
 * TradeLegNotificationCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.SettlementObligationReportV03
 * SettlementObligationReportV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Central CounterParty (CCP) Securities Clearing - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The clearing messages support all required business flows, including trade management, position management, risk management, collateral management, and settlement management for the equities and fixed-income asset classes."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class CentralCounterPartyCCPSecuritiesClearingISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Central CounterParty (CCP) Securities Clearing - ISO - Latest version";
				definition = "The clearing messages support all required business flows, including trade management, position management, risk management, collateral management, and settlement management for the equities and fixed-income asset classes.";
				messageDefinition_lazy = () -> Arrays.asList(MarginReportV02.mmObject(), DefaultFundContributionReportV02.mmObject(), TradeLegNotificationV03.mmObject(), BuyInNotificationV03.mmObject(), NetPositionV03.mmObject(),
						BuyInConfirmationV03.mmObject(), TradeLegStatementV03.mmObject(), BuyInResponseV03.mmObject(), TradeLegNotificationCancellationV03.mmObject(), SettlementObligationReportV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}